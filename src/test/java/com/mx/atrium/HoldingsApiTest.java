/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.HoldingResponseBody;
import com.mx.model.HoldingsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HoldingsApi
 */
@Ignore
public class HoldingsApiTest {

    private final HoldingsApi api = new HoldingsApi();

    
    /**
     * List holdings
     *
     * Use this endpoint to read all holdings associated with a specific user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listHoldingsTest() throws ApiException {
        String userGuid = null;
        HoldingsResponseBody response = api.listHoldings(userGuid);

        // TODO: test validations
    }
    
    /**
     * List holdings by account
     *
     * Use this endpoint to read all holdings associated with a specific account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listHoldingsByAccountTest() throws ApiException {
        String accountGuid = null;
        String userGuid = null;
        HoldingsResponseBody response = api.listHoldingsByAccount(accountGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List holdings by member
     *
     * Use this endpoint to read all holdings associated with a specific member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listHoldingsByMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        HoldingsResponseBody response = api.listHoldingsByMember(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Read holding
     *
     * Use this endpoint to read the attributes of a specific holding.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readHoldingTest() throws ApiException {
        String holdingGuid = null;
        String userGuid = null;
        HoldingResponseBody response = api.readHolding(holdingGuid, userGuid);

        // TODO: test validations
    }
    
}
