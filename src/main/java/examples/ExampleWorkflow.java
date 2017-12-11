import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.ZoneOffset;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class ExampleWorkflow {

  static int counter = 0;

  public static void main(String[] args) {
    AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String userGUID = "";
    String memberGUID = "";
    String endUserPresent = "";

    try {
      System.out.print("Please enter in user GUID. If not yet created just press enter key: ");
      userGUID = br.readLine().trim();

      System.out.print("\nPlease enter in member GUID. If not yet created just press enter key: ");
      memberGUID = br.readLine().trim();

      System.out.print("\nPlease enter in if end user is present (true or false): ");
      endUserPresent = br.readLine().trim();

      if (userGUID.equals("") && !memberGUID.equals("")) {
        System.out.println("\nMust include user GUID when member GUID is entered.");
        System.exit(0);
      }

      if (userGUID.equals("") && endUserPresent.equals("true")) {
        System.out.println("\n* Creating user *");

        System.out.print("\nPlease enter in an unique id for user: ");
        String id = br.readLine().trim();

        User user = atriumClient.createUser(id, "", "");

        userGUID = user.getGuid();
        System.out.println("\nCreated user: " + userGUID);
      }

      if (!memberGUID.equals("") && endUserPresent.equals("true")) {
        atriumClient.aggregateMember(userGUID, memberGUID);
        checkJobStatus(atriumClient, userGUID, memberGUID);
      }
      else if (!memberGUID.equals("")) {
        readAggregationData(atriumClient, userGUID, memberGUID);
      }
      else if (endUserPresent.equals("true")) {
        System.out.println("\n* Creating member *");

        System.out.println("\n* Listing top 15 institutions *");
        Institution[] institutions = atriumClient.listInstitutions("", "", "");

        for (Institution institution1 : institutions) {
          System.out.println(institution1.getName() + " : institution code = " + institution1.getCode());
        }

        System.out.print("\nPlease enter in desired institution code: ");
        String institutionCode = br.readLine().trim();

        Credential[] credentials = atriumClient.readInstitutionCredentials(institutionCode, "", "");
        JsonArray credentialArray = new JsonArray();
        for (Credential credential : credentials) {
          System.out.println("Please enter in " + credential.getLabel() + ":");
          String cred = br.readLine().trim();
          JsonObject temp = new JsonObject();
          temp.addProperty("guid", credential.getGuid());
          temp.addProperty("value", cred);
          credentialArray.add(temp);
        }

        Member member = atriumClient.createMember(userGUID, credentialArray, institutionCode, "", "");

        memberGUID = member.getGuid();
        System.out.println("\nCreated member: " + memberGUID);
        checkJobStatus(atriumClient, userGUID, memberGUID);
      }
      else {
        System.out.println("\nEnd user must be present to create a new member");
        System.exit(0);
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void checkJobStatus(AtriumClient atriumClient, String userGUID, String memberGUID) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("\n2 second delay...");
      TimeUnit.SECONDS.sleep(2);

      Member member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);

      String code = member.getStatus();

      System.out.println("\nJOB STATUS: " + code);

      switch (code) {
        case "COMPLETED":
          readAggregationData(atriumClient, userGUID, memberGUID);
          break;
        case "HALTED":
        case "FAILED":
          String currentTime = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "+00:00";

          Member member1 = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
          String lastSuccessTime = member1.getSuccessfully_Aggregated_At();

          // Check if last successful aggregation over 3 days ago
          if (Math.abs(Integer.parseInt(currentTime.substring(8,10)) - Integer.parseInt(lastSuccessTime.substring(8,10))) > 3 || Math.abs(Integer.parseInt(currentTime.substring(5,7)) - Integer.parseInt(lastSuccessTime.substring(5,7))) > 0 || Math.abs(Integer.parseInt(currentTime.substring(0,4)) - Integer.parseInt(lastSuccessTime.substring(0,4))) > 0) {
            System.out.println("\nClient should contact MX Support to resolve issue.");
          }
          else {
            System.out.println("\nAn update is currently unavailable. Please try again tomorrow");
          }
          break;
        case "CREATED":
        case "UPDATED":
        case "RESUMED":
        case "CONNECTED":
        case "DEGRADED":
        case "DELAYED":
        case "INITIATED":
        case "REQUESTED":
        case "AUTHENTICATED":
        case "RECEIVED":
        case "TRANSFERRED":
          checkJobStatus(atriumClient, userGUID, memberGUID);
          break;
        case "PREVENTED":
        case "DENIED":
        case "IMPAIRED":
          Member member2 = atriumClient.readMember(userGUID, memberGUID);
          String institutionCode = member2.getInstitution_Code();

          System.out.println("\nPlease update credentials");
          Credential[] credentials = atriumClient.readInstitutionCredentials(institutionCode, "", "");
          JsonArray credentialArray = new JsonArray();
          for (Credential credential : credentials) {
            System.out.println("\nPlease enter in " + credential.getLabel() + ":");
            String cred = br.readLine().trim();
            JsonObject temp = new JsonObject();
            temp.addProperty("guid", credential.getGuid());
            temp.addProperty("value", cred);
            credentialArray.add(temp);
          }

          atriumClient.updateMember(userGUID, memberGUID, credentialArray, "", "");

          checkJobStatus(atriumClient, userGUID, memberGUID);
          break;
        case "CHALLENGED":
          System.out.println("\nPlease answer the following challenges:");
          Challenge[] challenges = atriumClient.listMemberMFAChallenges(userGUID, memberGUID, "", "");
          JsonArray answer = new JsonArray();
          for (Challenge challenge : challenges) {
            System.out.println(challenge.getLabel() + ":");
            String ans = br.readLine().trim();
            JsonObject temp = new JsonObject();
            temp.addProperty("guid", challenge.getGuid());
            temp.addProperty("value", ans);
            answer.add(temp);
          }

          atriumClient.resumeMemberAggregation(userGUID, memberGUID, answer);

          checkJobStatus(atriumClient, userGUID, memberGUID);
          break;
        case "REJECTED":
          atriumClient.aggregateMember(userGUID, memberGUID);

          checkJobStatus(atriumClient, userGUID, memberGUID);
          break;
        case "EXPIRED":
          System.out.println("\nUser did not answer MFA in time. Please try again tomorrow.");
          break;
        case "LOCKED":
          System.out.println("\nUser's account is locked at FI");
          break;
        case "IMPEDED":
          System.out.println("\nUser's attention is required at FI website in order for aggregation to complete");
          break;
        case "DISCONTINUED":
          System.out.println("\nConnection to institution is no longer available.");
          break;
        case "CLOSED":
        case "DISABLED":
          System.out.println("\nAggregation is purposely turned off for this user.");
          break;
        case "TERMINATED":
        case "ABORTED":
        case "STOPPED":
        case "THROTTLED":
        case "SUSPENDED":
        case "ERRORED":
          if (counter < 3) {
            counter = counter + 1;
            checkJobStatus(atriumClient, userGUID, memberGUID);
          }
          else {
            System.out.println("\nAn update is currently unavailable. Please try again tomorrow and contact support if unsuccessful after 3 days.");
            counter = 0;
          }
          break;
        default:
          System.out.println(code);
          break;
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void readAggregationData(AtriumClient atriumClient, String userGUID, String memberGUID) {
    try {
      System.out.println("\n* Listing all member accounts and transactions *");
      Account[] accounts = atriumClient.listMemberAccounts(userGUID, memberGUID, "", "");
      for (Account account : accounts) {
        System.out.println("\nType: " + account.getType() + "\tName: " + account.getName() + "\tAvailable Balance: " + account.getAvailable_Balance() + "\tAvailable Credit: " + account.getAvailable_Credit());
        System.out.println("Transactions");
        Transaction[] transactions = atriumClient.listAccountTransactions(userGUID, account.getGuid(), "", "", "", "");
        for (Transaction transaction : transactions) {
          System.out.println("\tDate: " + transaction.getDate() + "\tDescription: " + transaction.getDescription() + "\tAmount: " + transaction.getAmount());
        }
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
