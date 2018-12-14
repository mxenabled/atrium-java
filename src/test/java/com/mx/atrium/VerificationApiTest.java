/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.AccountNumbersResponseBody;
import com.mx.model.MemberResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationApi
 */
@Ignore
public class VerificationApiTest {

    private final VerificationApi api = new VerificationApi();

    
    /**
     * Read account numbers
     *
     * Use this endpoint to check whether account and routing numbers are available for accounts associated with a particular member. It returns the account_numbers object, which contains account and routing number data for each account associated with the member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountNumbersTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        AccountNumbersResponseBody response = api.listAccountNumbers(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Read account numbers by account GUID
     *
     * Use this endpoint to check whether account and routing numbers are available for a specific account. It returns the account_numbers object, which contains account and routing number data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountNumbersByAccountTest() throws ApiException {
        String accountGuid = null;
        String userGuid = null;
        AccountNumbersResponseBody response = api.listAccountNumbersByAccount(accountGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Verify
     *
     * The verify endpoint begins a verification process for a member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.verifyMember(memberGuid, userGuid);

        // TODO: test validations
    }
    
}
