import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultiFactorAuthentication {
    public static void main(String[] args) {
        try {
            AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

            System.out.println("\n* Creating user and member with \"CHALLENGED\" aggregation status *");
            User user = atriumClient.createUser("", "", "");
            String userGUID = user.getGuid();
            System.out.println("Created user: " + userGUID);

            List<Credential> memberCredentials = new ArrayList<>();
            memberCredentials.add(new Credential("CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1", "test_atrium"));
            memberCredentials.add(new Credential("CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d", "challenge"));

            Member member = atriumClient.createMember(userGUID, memberCredentials, "mxbank", "", "");
            String memberGUID = member.getGuid();
            System.out.println("Created member: " + memberGUID);

            TimeUnit.SECONDS.sleep(2);

            System.out.println("\n* Retrieving member aggregation status *");
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println("Member aggregation status: " + member.getStatus());


            System.out.println("\n* MFA Challenge *");
            Challenge[] challenges = atriumClient.listMemberMFAChallenges(userGUID, memberGUID, "", "");
            for (Challenge challenge : challenges) {
                System.out.println(challenge.getGuid());
                System.out.println(challenge.getLabel());
            }

            List<Challenge> memberChallenges = new ArrayList<>();
            memberChallenges.add(new Challenge(challenges[0].getGuid(), "correct"));

            System.out.println("\n* MFA answered correctly, resuming aggregation *");
            atriumClient.resumeMemberAggregation(userGUID, memberGUID, memberChallenges);


            TimeUnit.SECONDS.sleep(2);

            System.out.println("\n* Retrieving member aggregation status *");
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println("Member aggregation status: " + member.getStatus());

            System.out.println("\n* Deleting test user *");
            atriumClient.deleteUser(userGUID);
            System.out.println("Deleted user: " + userGUID);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
