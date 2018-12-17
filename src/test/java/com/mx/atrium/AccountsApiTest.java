/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.AccountResponseBody;
import com.mx.model.AccountsResponseBody;
import com.mx.model.TransactionsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * List account transactions
     *
     * This endpoint allows you to see every transaction that belongs to a specific account. The default from_date is 90 days prior to the request, and the default to_date is 5 days from the time of the request.&lt;br&gt; The from_date and to_date parameters can optionally be appended to the request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountTransactionsTest() throws ApiException {
        String accountGuid = null;
        String userGuid = null;
        String fromDate = null;
        String toDate = null;
        Integer page = null;
        Integer recordsPerPage = null;
        TransactionsResponseBody response = api.listAccountTransactions(accountGuid, userGuid, fromDate, toDate, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * List accounts for a user
     *
     * Use this endpoint to view information about every account that belongs to a user. You&#39;ll need the user&#39;s GUID to access this list. The information will include the account type — e.g., CHECKING, MONEY_MARKET, or PROPERTY — the account balance, the date the account was started, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserAccountsTest() throws ApiException {
        String userGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        AccountsResponseBody response = api.listUserAccounts(userGuid, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * Read an account
     *
     * Reading an account allows you to get information about a specific account that belongs to a user. That includes the account type — e.g., CHECKING, MONEY_MARKET, or PROPERTY — the balance, the date the account was started, and much more.&lt;br&gt; There are two endpoints for reading an account. Both will return the same information.&lt;br&gt; It&#39;s important to remember that balance and available_balance will normally be positive numbers — for all account types. But this should be interpreted differently for debt accounts and asset accounts.&lt;br&gt; An asset account, e.g., CHECKING, SAVINGS, or INVESTMENT, will have a positive balance unless it is in an overdraft condition, in which case the balance will be negative.&lt;br&gt; On the other hand, a debt account, e.g., CREDIT CARD, LOAN, MORTGAGE, would have a positivebalance when the user owes money on the account. It would have a negative balance if the account has been overpaid. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountTest() throws ApiException {
        String accountGuid = null;
        String userGuid = null;
        AccountResponseBody response = api.readAccount(accountGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Read an account
     *
     * Reading an account allows you to get information about a specific account that belongs to a user. That includes the account type — e.g., CHECKING, MONEY_MARKET, or PROPERTY — the balance, the date the account was started, and much more.&lt;br&gt; There are two endpoints for reading an account. Both will return the same information.&lt;br&gt; It&#39;s important to remember that balance and available_balance will normally be positive numbers — for all account types. But this should be interpreted differently for debt accounts and asset accounts.&lt;br&gt; An asset account, e.g., CHECKING, SAVINGS, or INVESTMENT, will have a positive balance unless it is in an overdraft condition, in which case the balance will be negative.&lt;br&gt; On the other hand, a debt account, e.g., CREDIT CARD, LOAN, MORTGAGE, would have a positivebalance when the user owes money on the account. It would have a negative balance if the account has been overpaid. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountByMemberGUIDTest() throws ApiException {
        String accountGuid = null;
        String memberGuid = null;
        String userGuid = null;
        AccountResponseBody response = api.readAccountByMemberGUID(accountGuid, memberGuid, userGuid);

        // TODO: test validations
    }
    
}
