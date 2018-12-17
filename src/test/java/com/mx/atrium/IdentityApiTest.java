/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.AccountOwnersResponseBody;
import com.mx.model.MemberResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentityApi
 */
@Ignore
public class IdentityApiTest {

    private final IdentityApi api = new IdentityApi();

    
    /**
     * Identify
     *
     * The identify endpoint begins an identification process for an already-existing member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void identifyMemberTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.identifyMember(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List member account owners
     *
     * This endpoint returns an array with information about every account associated with a particular member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountOwnersTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        AccountOwnersResponseBody response = api.listAccountOwners(memberGuid, userGuid);

        // TODO: test validations
    }
    
}
