/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.UserCreateRequestBody;
import com.mx.model.UserResponseBody;
import com.mx.model.UserUpdateRequestBody;
import com.mx.model.UsersResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create user
     *
     * Call this endpoint to create a new user. Atrium will respond with the newly-created user object if successful. This endpoint accepts several parameters: identifier, metadata, and is_disabled.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserCreateRequestBody body = null;
        UserResponseBody response = api.createUser(body);

        // TODO: test validations
    }
    
    /**
     * Delete user
     *
     * Calling this endpoint will permanently delete a user from Atrium. If successful, the API will respond with Status: 204 No Content. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userGuid = null;
        api.deleteUser(userGuid);

        // TODO: test validations
    }
    
    /**
     * List users
     *
     * Use this endpoint to list every user you&#39;ve created in Atrium.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsersTest() throws ApiException {
        Integer page = null;
        Integer recordsPerPage = null;
        UsersResponseBody response = api.listUsers(page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * Read user
     *
     * Use this endpoint to read the attributes of a specific user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readUserTest() throws ApiException {
        String userGuid = null;
        UserResponseBody response = api.readUser(userGuid);

        // TODO: test validations
    }
    
    /**
     * Update user
     *
     * Use this endpoint to update the attributes of a specific user. Atrium will respond with the updated user object.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill.&lt;br&gt; To disable a user, update it and set the is_disabled parameter to true. Set it to false to re-enable the user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userGuid = null;
        UserUpdateRequestBody body = null;
        UserResponseBody response = api.updateUser(userGuid, body);

        // TODO: test validations
    }
    
}
