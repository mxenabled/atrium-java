import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.concurrent.TimeUnit;


public class AllEndpoints {

    public static void main(String[] args) {
        try {
            AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

            System.out.println("\n************************** Create User **************************");
            User user = atriumClient.createUser("unique_id", "", "{\"first_name\": \"Steven\"}");
            System.out.println(user.getGuid());
            String userGUID = user.getGuid();

            System.out.println("\n************************** Read User **************************");
            user = atriumClient.readUser(userGUID);
            System.out.println(user.getGuid());

            System.out.println("\n************************** Update User **************************");
            user = atriumClient.updateUser(userGUID, "", "", "{\"first_name\": \"Steven\", \"last_name\": \"Universe\"}");
            System.out.println(user.getGuid());

            System.out.println("\n************************** List Users **************************");
            User[] users = atriumClient.listUsers("", "");
            for(User user1 : users) {
                System.out.println(user1.getGuid());
            }

            System.out.println("\n************************** List Institutions **************************");
            Institution[] institutions = atriumClient.listInstitutions("bank", "", "");
            for(Institution institution : institutions) {
                System.out.println(institution.getName());
            }

            System.out.println("\n************************** Read Institution **************************");
            Institution institution = atriumClient.readInstitution("mxbank");
            System.out.println(institution.getName());

            System.out.println("\n************************** Read Institution Credentials************************** ");
            Credential[] credentials = atriumClient.readInstitutionCredentials("mxbank", "", "");
            for(Credential credential : credentials) {
                System.out.println(credential.getGuid());
            }

            System.out.println("\n************************** Create Member **************************");

            // Create a credential JSON object
            JsonObject credentialOne = new JsonObject();
            credentialOne.addProperty("guid", "CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1");
            credentialOne.addProperty("value", "test_atrium1");


            // Create another credential JSON object
            JsonObject credentialTwo = new JsonObject();
            credentialTwo.addProperty("guid", "CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d");
            credentialTwo.addProperty("value", "challenge1");

            // Create credential array from credential JSON Objects
            JsonArray credentialArray = new JsonArray();
            credentialArray.add(credentialOne);
            credentialArray.add(credentialTwo);

            Member member = atriumClient.createMember(userGUID, credentialArray, "mxbank", "", "");
            System.out.println(member.getGuid());
            String memberGUID = member.getGuid();

            System.out.println("\n************************** Read Member **************************");
            member = atriumClient.readMember(userGUID, memberGUID);
            System.out.println(member.getGuid());

            System.out.println("\n************************** Update Member **************************");
            // Create a credential JSON object
            JsonObject updatedCredentialOne = new JsonObject();
            updatedCredentialOne.addProperty("guid", "CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1");
            updatedCredentialOne.addProperty("value", "test_atrium");

            // Create another credential JSON object
            JsonObject updatedCredentialTwo = new JsonObject();
            updatedCredentialTwo.addProperty("guid", "CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d");
            updatedCredentialTwo.addProperty("value", "challenge");

            // Create credential array from credential JSON Objects
            JsonArray updatedCredentialArray = new JsonArray();
            updatedCredentialArray.add(updatedCredentialOne);
            updatedCredentialArray.add(updatedCredentialTwo);

            member = atriumClient.updateMember(userGUID, memberGUID, updatedCredentialArray, "", "{\"credentials_last_refreshed_at\": \"2015-10-16\"}");
            System.out.println(member.getGuid());

            System.out.println("\n************************** List Members **************************");
            Member[] members = atriumClient.listMembers(userGUID, "", "");
            for(Member member1 : members) {
                System.out.println(member1.getGuid());
            }

            System.out.println("\n************************** Aggregate Member **************************");
            member = atriumClient.aggregateMember(userGUID, memberGUID);
            System.out.println(member.getAggregated_At());

            System.out.println("\n************************** Read Member Status **************************");
            TimeUnit.SECONDS.sleep(10);
            member = atriumClient.readMemberAggregationStatus(userGUID, memberGUID);
            System.out.println(member.getStatus());

            System.out.println("\n************************** List Member MFA Challenges **************************");
            Challenge[] challenges = atriumClient.listMemberMFAChallenges(userGUID, memberGUID, "", "");
            String challengeGUID = "";
            for(Challenge challenge : challenges) {
                System.out.println(challenge.getGuid());
                challengeGUID = challenge.getGuid();
            }

            System.out.println("\n************************** Resume Aggregation **************************");
            // Create a credential JSON object
            credentialOne = new JsonObject();
            credentialOne.addProperty("guid", challengeGUID);
            credentialOne.addProperty("value", "correct");

            // Create credential array from credential JSON Objects
            updatedCredentialArray = new JsonArray();
            updatedCredentialArray.add(credentialOne);

            member = atriumClient.resumeMemberAggregation(userGUID, memberGUID, updatedCredentialArray);
            System.out.println(member.getStatus());

            System.out.println("\n************************** List Member Credentials **************************");
            credentials = atriumClient.listMemberCredentials(userGUID, memberGUID, "", "");
            for(Credential credential : credentials) {
                System.out.println(credential.getGuid());
            }

            System.out.println("\n************************** List Member Accounts **************************");
            TimeUnit.SECONDS.sleep(10);
            Account[] accounts = atriumClient.listMemberAccounts(userGUID, memberGUID, "", "");
            String accountGUID = "";
            for(Account account : accounts) {
                System.out.println(account.getGuid());
                accountGUID = account.getGuid();
            }

            System.out.println("\n************************** List Member Transactions **************************");
            Transaction[] transactions1 = atriumClient.listMemberTransactions(userGUID, memberGUID, "", "", "", "");
            for(Transaction transaction : transactions1) {
                System.out.println(transaction.getGuid());
            }

            System.out.println("\n************************** Read Account **************************");
            Account account = atriumClient.readAccount(userGUID, accountGUID);
            System.out.println(account.getGuid());

            System.out.println("\n************************** List Accounts for User **************************");
            accounts = atriumClient.listAccounts(userGUID, "", "");
            for(Account account1 : accounts) {
                System.out.println(account1.getGuid());
            }

            System.out.println("\n************************** List Account Transactions **************************");
            Transaction[] transactions2 = atriumClient.listAccountTransactions(userGUID, accountGUID, "", "", "", "");
            String transactionGUID = "";
            for(Transaction transaction : transactions2) {
                System.out.println(transaction.getGuid());
                transactionGUID = transaction.getGuid();
            }

            System.out.println("\n************************** Read a Transaction **************************");
            Transaction transaction = atriumClient.readTransaction(userGUID, transactionGUID);
            System.out.println(transaction.getGuid());

            System.out.println("\n************************** List Transactions **************************");
            Transaction[] transactions3 = atriumClient.listTransactions(userGUID, "", "", "", "");
            for(Transaction transaction1 : transactions3) {
                System.out.println(transaction1.getGuid());
            }

            System.out.println("\n************************** Connect Widget **************************");
            Connect connect = atriumClient.createWidget(userGUID);
            System.out.println(connect.getConnect_Widget_Url());

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
