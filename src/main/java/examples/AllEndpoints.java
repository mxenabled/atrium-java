import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AllEndpoints {

    public static void main(String[] args) {
        try {
            AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

            System.out.println("\n************************** Create User **************************");
            User user = atriumClient.createUser("", "", "{\"first_name\": \"Steven\"}");
            System.out.println(user.toString());
            String userGUID = user.getGuid();

            System.out.println("\n************************** Read User **************************");
            user = atriumClient.readUser(userGUID);
            System.out.println(user.toString());

            System.out.println("\n************************** Update User **************************");
            user = atriumClient.updateUser(userGUID, "", "", "{\"first_name\": \"Steven\", \"last_name\": \"Universe\"}");
            System.out.println(user.toString());

            System.out.println("\n************************** List Users **************************");
            User[] users = atriumClient.listUsers("", "");
            for(User user1 : users) {
                System.out.println(user1.toString());
            }

            System.out.println("\n************************** List Institutions **************************");
            Institution[] institutions = atriumClient.listInstitutions("bank", "", "");
            for(Institution institution : institutions) {
                System.out.println(institution.toString());
            }

            System.out.println("\n************************** Read Institution **************************");
            Institution institution = atriumClient.readInstitution("mxbank");
            System.out.println(institution.toString());

            System.out.println("\n************************** Read Institution Credentials************************** ");
            Credential[] credentials = atriumClient.readInstitutionCredentials("mxbank", "", "");
            for(Credential credential : credentials) {
                System.out.println(credential.toString());
            }

            System.out.println("\n************************** Create Member **************************");

            List<Credential> memberCredentials = new ArrayList<>();
            memberCredentials.add(new Credential("CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1", "test_atrium"));
            memberCredentials.add(new Credential("CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d", "challenge"));

            Member member = atriumClient.createMember(userGUID, memberCredentials, "mxbank", "", "");
            System.out.println(member.toString());
            String memberGUID = member.getGuid();

            System.out.println("\n************************** Read Member **************************");
            member = atriumClient.readMember(userGUID, memberGUID);
            System.out.println(member.toString());

            System.out.println("\n************************** Update Member **************************");
            List<Credential> updatedCredentials = new ArrayList<>();
            updatedCredentials.add(new Credential("CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1", "test_atrium"));
            updatedCredentials.add(new Credential("CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d", "options"));

            member = atriumClient.updateMember(userGUID, memberGUID, updatedCredentials, "", "{\"credentials_last_refreshed_at\": \"2015-10-16\"}");
            System.out.println(member.toString());

            System.out.println("\n************************** List Members **************************");
            Member[] members = atriumClient.listMembers(userGUID, "", "");
            for(Member member1 : members) {
                System.out.println(member1.toString());
            }

            System.out.println("\n************************** Aggregate Member **************************");
            member = atriumClient.aggregateMember(userGUID, memberGUID);
            System.out.println(member.toString());

            System.out.println("\n************************** Read Member Status **************************");
            TimeUnit.SECONDS.sleep(10);
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println(member.toString());

            System.out.println("\n************************** List Member MFA Challenges **************************");
            Challenge[] challenges = atriumClient.listMemberMFAChallenges(userGUID, memberGUID, "", "");
            String challengeGUID = "";
            for(Challenge challenge : challenges) {
                System.out.println(challenge.toString());
                challengeGUID = challenge.getGuid();
            }

            System.out.println("\n************************** Resume Aggregation **************************");
            List<Challenge> memberChallenges = new ArrayList<>();
            memberChallenges.add(new Challenge(challengeGUID, "correct"));

            member = atriumClient.resumeMemberAggregation(userGUID, memberGUID, memberChallenges);
            System.out.println(member.toString());

            System.out.println("\n************************** List Member Credentials **************************");
            credentials = atriumClient.listMemberCredentials(userGUID, memberGUID, "", "");
            for(Credential credential : credentials) {
                System.out.println(credential.toString());
            }

            System.out.println("\n************************** List Member Accounts **************************");
            TimeUnit.SECONDS.sleep(10);
            Account[] accounts = atriumClient.listMemberAccounts(userGUID, memberGUID, "", "");
            String accountGUID = "";
            for(Account account : accounts) {
                System.out.println(account.toString());
                accountGUID = account.getGuid();
            }

            System.out.println("\n************************** List Member Transactions **************************");
            Transaction[] transactions1 = atriumClient.listMemberTransactions(userGUID, memberGUID, "", "", "", "");
            for(Transaction transaction : transactions1) {
                System.out.println(transaction.toString());
            }

            System.out.println("\n************************** Read Account **************************");
            Account account = atriumClient.readAccount(userGUID, accountGUID);
            System.out.println(account.toString());

            System.out.println("\n************************** List Accounts for User **************************");
            accounts = atriumClient.listAccounts(userGUID, "", "");
            for(Account account1 : accounts) {
                System.out.println(account1.toString());
            }

            System.out.println("\n************************** List Account Transactions **************************");
            Transaction[] transactions2 = atriumClient.listAccountTransactions(userGUID, accountGUID, "", "", "", "");
            String transactionGUID = "";
            for(Transaction transaction : transactions2) {
                System.out.println(transaction.toString());
                transactionGUID = transaction.getGuid();
            }

            System.out.println("\n************************** Read a Transaction **************************");
            Transaction transaction = atriumClient.readTransaction(userGUID, transactionGUID);
            System.out.println(transaction.toString());

            System.out.println("\n************************** List Transactions **************************");
            Transaction[] transactions3 = atriumClient.listTransactions(userGUID, "", "", "", "");
            for(Transaction transaction1 : transactions3) {
                System.out.println(transaction1.toString());
            }

            System.out.println("\n************************** Connect Widget **************************");
            Connect connect = atriumClient.createWidget(userGUID);
            System.out.println(connect.toString());

            System.out.println("\n************************** Delete Member **************************");
            String response = atriumClient.deleteMember(userGUID, memberGUID);
            System.out.println(response);

            System.out.println("\n************************** Delete User **************************");
            response = atriumClient.deleteUser(userGUID);
            System.out.println(response);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
