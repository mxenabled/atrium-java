import java.util.concurrent.TimeUnit;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class UpdateCredentials {
    public static void main(String[] args) {
        try {
            AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

            System.out.println("\n* Creating user and member with \"DENIED\" aggregation status *");
            User user = atriumClient.createUser("", "", "");
            String userGUID = user.getGuid();
            System.out.println("Created user: " + userGUID);

            JsonObject credentialOne = new JsonObject();
            credentialOne.addProperty("guid", "CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1");
            credentialOne.addProperty("value", "test_atrium");

            JsonObject credentialTwo = new JsonObject();
            credentialTwo.addProperty("guid", "CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d");
            credentialTwo.addProperty("value", "INVALID");

            JsonArray credentialArray = new JsonArray();
            credentialArray.add(credentialOne);
            credentialArray.add(credentialTwo);

            Member member = atriumClient.createMember(userGUID, credentialArray, "mxbank", "", "");
            String memberGUID = member.getGuid();
            System.out.println("Created member: " + memberGUID);

            TimeUnit.SECONDS.sleep(2);

            System.out.println("\n* Retrieving member aggregation status *");
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println(member.getStatus());


            System.out.println("\n* Updating Credentials *");
            Credential[] credentials = atriumClient.readInstitutionCredentials("mxbank", "", "");

            // Create a credential JSON object
            JsonObject credOne = new JsonObject();
            credOne.addProperty("guid", credentials[0].getGuid());
            credOne.addProperty("value", "test_atrium");

            // Create another credential JSON object
            JsonObject credTwo = new JsonObject();
            credTwo.addProperty("guid", credentials[1].getGuid());
            credTwo.addProperty("value", "password");

            // Create credential array from credential JSON Objects
            JsonArray credArray = new JsonArray();
            credArray.add(credOne);
            credArray.add(credTwo);

            atriumClient.updateMember(userGUID, memberGUID, credArray, "", "");


            TimeUnit.SECONDS.sleep(2);

            System.out.println("\n* Retrieving member aggregation status *");
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println(member.getStatus());


            System.out.println("\n* Deleting test user *");
            atriumClient.deleteUser(userGUID);
            System.out.println("Deleted user: " + userGUID);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
