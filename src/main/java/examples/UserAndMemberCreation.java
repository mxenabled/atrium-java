package examples;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mx.atrium.AtriumClient;
import com.mx.atrium.models.Credential;
import com.mx.atrium.models.Institution;
import com.mx.atrium.models.Member;
import com.mx.atrium.models.User;

public class UserAndMemberCreation {
    public static void main(String[] args) {
        AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

        System.out.println("\n* Creating user *");
        User user = atriumClient.createUser("", "", "");
        String userGUID = user.getGuid();
        System.out.println("Created user: " + user.getGuid());


        System.out.println("\n* Listing institutions with query string \"bank\" *");
        Institution[] institutions = atriumClient.listInstitutions("bank", "", "");

        for (Institution institution : institutions) {
            System.out.println(institution.getName() + " : institution code = " + institution.getCode());
        }

        System.out.println("\n* Reading institution \"mxbank\" *");
        Institution institution = atriumClient.readInstitution("mxbank");
        System.out.println(institution.getName());


        System.out.println("\n* Reading institution credentials \"mxbank\" *");
        Credential[] credentials = atriumClient.readInstitutionCredentials("mxbank", "", "");
        for (Credential credential : credentials) {
            System.out.println(credential.getGuid());
        }

        System.out.println("\n* Creating member *");
        // Create a credential JSON object
        JsonObject credentialOne = new JsonObject();
        credentialOne.addProperty("guid", "CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1");
        credentialOne.addProperty("value", "test_atrium");

        // Create another credential JSON object
        JsonObject credentialTwo = new JsonObject();
        credentialTwo.addProperty("guid", "CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d");
        credentialTwo.addProperty("value", "password");

        // Create credential array from credential JSON Objects
        JsonArray credentialArray = new JsonArray();
        credentialArray.add(credentialOne);
        credentialArray.add(credentialTwo);

        Member member = atriumClient.createMember(userGUID, credentialArray, "mxbank", "", "");
        System.out.println("Created member: " + member.getGuid());


        System.out.println("\n* Deleting test user *");
        atriumClient.deleteUser(userGUID);
        System.out.println("Deleted user: " + userGUID);
    }
}
