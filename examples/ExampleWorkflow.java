import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.ZoneOffset;
import org.json.JSONArray;
import org.json.JSONObject;

public class ExampleWorkflow {

  static int counter = 0;

  public static void main(String[] args) {
    if (args.length < 3 || args.length > 3) {
      System.out.println("Incorrect usage. Correct usage is: java -jar Atrium-java YOUR_DESIRED_ENVIRONMENT YOUR_MX_API_KEY YOUR_MX_CLIENT_ID");
      System.exit(0);
    }

    AtriumClient atriumClient = new AtriumClient(args[0], args[1], args[2]);

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
        System.out.println("\n* NEW USER CREATION *");

        System.out.print("\nPlease enter in an unique id: ");
        String id = br.readLine().trim();

        String userResponse = atriumClient.createUser(id, "", "");

        JSONObject base = new JSONObject(userResponse);
        userGUID = base.getJSONObject("user").getString("guid");
      }

      if (!memberGUID.equals("") && endUserPresent.equals("true")) {
        atriumClient.aggregateMember(userGUID, memberGUID);
        checkJobStatus(atriumClient, userGUID, memberGUID);
      }
      else if (!memberGUID.equals("")) {
        readAggregationData(atriumClient, userGUID, memberGUID);
      }
      else if (endUserPresent.equals("true")) {
        System.out.println("\n* NEW MEMBER CREATION *");

        System.out.print("Please enter in a keyword to search for an institution: ");
        String institution = br.readLine().trim();
        String institutions = atriumClient.listInstitutions(institution, "", "");

        JSONObject baseObject = new JSONObject(institutions);
        JSONArray array = baseObject.getJSONArray("institutions");
        for (int i = 0; i < array.length(); i++) {
          System.out.println(array.getJSONObject(i).getString("name") + " : institution code = " + array.getJSONObject(i).getString("code"));
        }

        System.out.print("\nPlease enter in desired institution code: ");
        String institutionCode = br.readLine().trim();

        String requiredCredentials = atriumClient.readInstitutionCredentials(institutionCode, "", "");
        baseObject = new JSONObject(requiredCredentials);
        array = baseObject.getJSONArray("credentials");
        String credentials = "[";
        for (int i = 0; i < array.length(); i++) {
          System.out.println("\nPlease enter in " + array.getJSONObject(i).getString("label") + ":");
          String cred = br.readLine().trim();
          credentials += "{\"guid\":\"" + array.getJSONObject(i).getString("guid") + "\",\"value\":\"" + cred + "\"},";
        }
        credentials = credentials.substring(0, credentials.length() - 1);
        credentials += "]";

        String memberResponse = atriumClient.createMember(userGUID, credentials, institutionCode, "", "");

        JSONObject base = new JSONObject(memberResponse);
        memberGUID = base.getJSONObject("member").getString("guid");
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

      String aggregationResponse = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);

      JSONObject base = new JSONObject(aggregationResponse);
      String code = base.getJSONObject("member").getString("status");

      System.out.println("\nJOB STATUS: " + code);

      switch (code) {
        case "COMPLETED":
          readAggregationData(atriumClient, userGUID, memberGUID);
          break;
        case "HALTED":
        case "FAILED":
          String currentTime = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC).format(Instant.now()) + "+00:00";

          String statusResponse = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
          JSONObject baseObject = new JSONObject(statusResponse);
          String lastSuccessTime = baseObject.getJSONObject("member").getString("successfully_aggregated_at");

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
          String readMemberData = atriumClient.readMember(userGUID, memberGUID);
          JSONObject baseObj = new JSONObject(readMemberData);
          String institutionCode = baseObj.getJSONObject("member").getString("institution_code");

          System.out.println("\nPlease update credentials");
          String requiredCredentials = atriumClient.readInstitutionCredentials(institutionCode, "", "");
          base = new JSONObject(requiredCredentials);
          JSONArray array = base.getJSONArray("credentials");
          String credentials = "[";
          for (int i = 0; i < array.length(); i++) {
              System.out.println("\nPlease enter in " + array.getJSONObject(i).getString("label") + ":");
              String cred = br.readLine().trim();
              credentials += "{\"guid\":\"" + array.getJSONObject(i).getString("guid") + "\",\"value\":\"" + cred + "\"},";
          }
          credentials = credentials.substring(0, credentials.length() - 1);
          credentials += "]";

          atriumClient.updateMember(userGUID, memberGUID, credentials, "", "");

          checkJobStatus(atriumClient, userGUID, memberGUID);
          break;
        case "CHALLENGED":
          System.out.println("\nPlease answer the following challenges:");
          String challengeResponse = atriumClient.listMemberMFAChallenges(userGUID, memberGUID, "", "");
          base = new JSONObject(challengeResponse);
          array = base.getJSONArray("challenges");
          String answer = "{\"member\":{\"challenges\":[";
          for (int i = 0; i < array.length(); i++) {
              System.out.println(array.getJSONObject(i).getString("label") + ":");
              String ans = br.readLine().trim();
              answer += "{\"guid\":\"" + array.getJSONObject(i).getString("guid") + "\",\"value\":\"" + ans + "\"},";
          }
          answer = answer.substring(0, answer.length() - 1);
          answer += "]}}";

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
      atriumClient.readMember(userGUID, memberGUID);

      System.out.println("\n* Listing all Member Accounts *");
      String accountsResponse = atriumClient.listMemberAccounts(userGUID, memberGUID, "", "");
      JSONObject base = new JSONObject(accountsResponse);
      JSONArray array = base.getJSONArray("accounts");
      for (int i = 0; i < array.length(); i++) {
          System.out.println("Type: " + array.getJSONObject(i).getString("type") + "\tName: " + array.getJSONObject(i).getString("name") + "\tAvailable Balance: " + array.getJSONObject(i).get("available_balance") + "\tAvailable Credit: " + array.getJSONObject(i).get("available_credit"));
      }

      System.out.println("\n* Listing all Member Transactions *");
      String transactionsResponse = atriumClient.listMemberTransactions(userGUID, memberGUID, "", "", "", "");
      JSONObject baseObj = new JSONObject(transactionsResponse);
      JSONArray arrayObj = baseObj.getJSONArray("transactions");
      for (int i = 0; i < arrayObj.length(); i++) {
          System.out.println("Date: " + arrayObj.getJSONObject(i).getString("date") + "\tDescription: " + arrayObj.getJSONObject(i).getString("description") + "\tAmount: " + arrayObj.getJSONObject(i).get("amount"));
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
