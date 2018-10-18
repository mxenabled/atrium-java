import java.util.ArrayList;
import java.util.List;
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

            List<Credential> memberCredentials = new ArrayList<>();
            memberCredentials.add(new Credential("CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1", "test_atrium"));
            memberCredentials.add(new Credential("CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d", "INVALID"));

            Member member = atriumClient.createMember(userGUID, memberCredentials, "mxbank", "", "");
            String memberGUID = member.getGuid();
            System.out.println("Created member: " + memberGUID);

            TimeUnit.SECONDS.sleep(2);

            System.out.println("\n* Retrieving member aggregation status *");
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println(member.getStatus());


            System.out.println("\n* Updating Credentials *");
            Credential[] credentials = atriumClient.readInstitutionCredentials("mxbank", "", "");

            List<Credential> updatedCredentials = new ArrayList<>();
            updatedCredentials.add(new Credential(credentials[0].getGuid(), "test_atrium"));
            updatedCredentials.add(new Credential(credentials[1].getGuid(), "password"));

            atriumClient.updateMember(userGUID, memberGUID, updatedCredentials, "", "");


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
