/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.AccountsResponseBody;
import com.mx.model.ChallengesResponseBody;
import com.mx.model.CredentialsResponseBody;
import com.mx.model.MemberConnectionStatusResponseBody;
import com.mx.model.MemberCreateRequestBody;
import com.mx.model.MemberResponseBody;
import com.mx.model.MemberResumeRequestBody;
import com.mx.model.MemberUpdateRequestBody;
import com.mx.model.MembersResponseBody;
import com.mx.model.TransactionsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MembersApi
 */
@Ignore
public class MembersApiTest {

    private final MembersApi api = new MembersApi();

    
    /**
     * Aggregate member
     *
     * Calling this endpoint initiates an aggregation event for the member. This brings in the latest account and transaction data from the connected institution. If this data has recently been updated, MX may not initiate an aggregation event. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aggregateMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.aggregateMember(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Aggregate member account balances
     *
     * This endpoint operates much like the _aggregate member_ endpoint except that it gathers only account balance information; it does not gather any transaction data at all.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aggregateMemberBalancesTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.aggregateMemberBalances(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Create member
     *
     * This endpoint allows you to create a new member. Members are created with the required parameters credentials and institution_code, and the optional parameters identifier and metadata.&lt;br&gt; When creating a member, you&#39;ll need to include the correct type of credential required by the financial institution and provided by the user. You can find out which credential type is required with the /institutions/{institution_code}/credentials endpoint.&lt;br&gt; If successful, Atrium will respond with the newly-created member object.&lt;br&gt; Once you successfully create a member, MX will immediately validate the provided credentials and attempt to aggregate data for accounts and transactions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMemberTest() throws ApiException {
        String userGuid = null;
        MemberCreateRequestBody body = null;
        MemberResponseBody response = api.createMember(userGuid, body);

        // TODO: test validations
    }
    
    /**
     * Delete member
     *
     * Accessing this endpoint will permanently delete a member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        api.deleteMember(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Extend history
     *
     * The extend_history endpoint begins the process of fetching up to 24 months of data associated with a particular &#x60;member&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extendHistoryTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.extendHistory(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List member accounts
     *
     * This endpoint returns an array with information about every account associated with a particular member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMemberAccountsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        AccountsResponseBody response = api.listMemberAccounts(memberGuid, userGuid, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * List member credentials
     *
     * This endpoint returns an array which contains information on every non-MFA credential associated with a specific member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMemberCredentialsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        CredentialsResponseBody response = api.listMemberCredentials(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List member MFA challenges
     *
     * Use this endpoint for information on what multi-factor authentication challenges need to be answered in order to aggregate a member.&lt;br&gt; If the aggregation is not challenged, i.e., the member does not have a connection status of CHALLENGED, then code 204 No Content will be returned.&lt;br&gt; If the aggregation has been challenged, i.e., the member does have a connection status of CHALLENGED, then code 200 OK will be returned — along with the corresponding credentials. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMemberMFAChallengesTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        ChallengesResponseBody response = api.listMemberMFAChallenges(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List member transactions
     *
     * Use this endpoint to get all transactions from all accounts associated with a specific member.&lt;br&gt; This endpoint accepts optional URL query parameters — from_date and to_date — which are used to filter transactions according to the date they were posted. If no values are given for the query parameters, from_date will default to 90 days prior to the request and to_date will default to 5 days from the time of the request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMemberTransactionsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        String fromDate = null;
        String toDate = null;
        Integer page = null;
        Integer recordsPerPage = null;
        TransactionsResponseBody response = api.listMemberTransactions(memberGuid, userGuid, fromDate, toDate, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * List members
     *
     * This endpoint returns an array which contains information on every member associated with a specific user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMembersTest() throws ApiException {
        String userGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        MembersResponseBody response = api.listMembers(userGuid, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * Read member
     *
     * Use this endpoint to read the attributes of a specific member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.readMember(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Read member connection status
     *
     * This endpoint provides the status of the member&#39;s most recent aggregation event. This is an important step in the aggregation process, and the results returned by this endpoint should determine what you do next in order to successfully aggregate a member.&lt;br&gt; MX has introduced new, more detailed information on the current status of a member&#39;s connection to a financial institution and the state of its aggregation: the connection_status field. These are intended to replace and expand upon the information provided in the status field, which will soon be deprecated; support for the status field remains for the time being. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMemberStatusTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberConnectionStatusResponseBody response = api.readMemberStatus(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Read OAuth Window URI
     *
     * This endpoint will generate an &#x60;oauth_window_uri&#x60; for the specified &#x60;member&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOAuthWindowURITest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        String referralSource = null;
        String uiMessageWebviewUrlScheme = null;
        MemberResponseBody response = api.readOAuthWindowURI(memberGuid, userGuid, referralSource, uiMessageWebviewUrlScheme);

        // TODO: test validations
    }
    
    /**
     * Resume aggregation from MFA
     *
     * This endpoint answers the challenges needed when a member has been challenged by multi-factor authentication.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resumeMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResumeRequestBody body = null;
        MemberResponseBody response = api.resumeMember(memberGuid, userGuid, body);

        // TODO: test validations
    }
    
    /**
     * Update member
     *
     * Use this endpoint to update a member&#39;s attributes. Only the credentials, identifier, and metadata parameters can be updated. To get a list of the required credentials for the member, use the list member credentials endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberUpdateRequestBody body = null;
        MemberResponseBody response = api.updateMember(memberGuid, userGuid, body);

        // TODO: test validations
    }
    
}
