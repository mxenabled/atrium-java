package examples;

import com.mx.atrium.AtriumClient;
import com.mx.atrium.models.Account;
import com.mx.atrium.models.Member;
import com.mx.atrium.models.Transaction;
import com.mx.atrium.models.User;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.concurrent.TimeUnit;

public class AccountsAndTransactions {
    public static void main(String[] args) {
        try {
            AtriumClient atriumClient = new AtriumClient("https://vestibule.mx.com", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

            System.out.println("\n* Creating user and member *");
            User user = atriumClient.createUser("", "", "");
            String userGUID = user.getGuid();
            System.out.println("Created user: " + userGUID);

            JsonObject credentialOne = new JsonObject();
            credentialOne.addProperty("guid", "CRD-9f61fb4c-912c-bd1e-b175-ccc7f0275cc1");
            credentialOne.addProperty("value", "test_atrium");

            JsonObject credentialTwo = new JsonObject();
            credentialTwo.addProperty("guid", "CRD-e3d7ea81-aac7-05e9-fbdd-4b493c6e474d");
            credentialTwo.addProperty("value", "password");

            JsonArray credentialArray = new JsonArray();
            credentialArray.add(credentialOne);
            credentialArray.add(credentialTwo);

            Member member = atriumClient.createMember(userGUID, credentialArray, "mxbank", "", "");
            String memberGUID = member.getGuid();
            System.out.println("Created member: " + memberGUID);

            TimeUnit.SECONDS.sleep(2);


            System.out.println("\n* Aggregating member *");
            member = atriumClient.aggregateMember(userGUID, memberGUID);

            TimeUnit.SECONDS.sleep(5);
            System.out.println("Member aggregation status: " + member.getStatus());


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

            System.out.println("\n* Deleting test user *");
            atriumClient.deleteUser(userGUID);
            System.out.println("Deleted user: " + userGUID);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
