/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiCallback;
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.ApiResponse;
import com.mx.atrium.Configuration;
import com.mx.atrium.Pair;
import com.mx.atrium.ProgressRequestBody;
import com.mx.atrium.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mx.model.UserCreateRequestBody;
import com.mx.model.UserResponseBody;
import com.mx.model.UserUpdateRequestBody;
import com.mx.model.UsersResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUser
     * @param body User object to be created with optional parameters (identifier, is_disabled, metadata) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUserCall(UserCreateRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.v1+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "clientID" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createUserValidateBeforeCall(UserCreateRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createUser(Async)");
        }
        

        com.squareup.okhttp.Call call = createUserCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create user
     * Call this endpoint to create a new user. Atrium will respond with the newly-created user object if successful. This endpoint accepts several parameters: identifier, metadata, and is_disabled.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill. 
     * @param body User object to be created with optional parameters (identifier, is_disabled, metadata) (required)
     * @return UserResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserResponseBody createUser(UserCreateRequestBody body) throws ApiException {
        ApiResponse<UserResponseBody> resp = createUserWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create user
     * Call this endpoint to create a new user. Atrium will respond with the newly-created user object if successful. This endpoint accepts several parameters: identifier, metadata, and is_disabled.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill. 
     * @param body User object to be created with optional parameters (identifier, is_disabled, metadata) (required)
     * @return ApiResponse&lt;UserResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserResponseBody> createUserWithHttpInfo(UserCreateRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = createUserValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<UserResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create user (asynchronously)
     * Call this endpoint to create a new user. Atrium will respond with the newly-created user object if successful. This endpoint accepts several parameters: identifier, metadata, and is_disabled.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill. 
     * @param body User object to be created with optional parameters (identifier, is_disabled, metadata) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUserAsync(UserCreateRequestBody body, final ApiCallback<UserResponseBody> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createUserValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUser
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUserCall(String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}"
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.v1+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "clientID" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUserValidateBeforeCall(String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling deleteUser(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteUserCall(userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete user
     * Calling this endpoint will permanently delete a user from Atrium. If successful, the API will respond with Status: 204 No Content. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUser(String userGuid) throws ApiException {
        deleteUserWithHttpInfo(userGuid);
    }

    /**
     * Delete user
     * Calling this endpoint will permanently delete a user from Atrium. If successful, the API will respond with Status: 204 No Content. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUserWithHttpInfo(String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(userGuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete user (asynchronously)
     * Calling this endpoint will permanently delete a user from Atrium. If successful, the API will respond with Status: 204 No Content. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUserAsync(String userGuid, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(userGuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listUsers
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listUsersCall(Integer page, Integer recordsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (recordsPerPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("records_per_page", recordsPerPage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.v1+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "clientID" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listUsersValidateBeforeCall(Integer page, Integer recordsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listUsersCall(page, recordsPerPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List users
     * Use this endpoint to list every user you&#39;ve created in Atrium.
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @return UsersResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsersResponseBody listUsers(Integer page, Integer recordsPerPage) throws ApiException {
        ApiResponse<UsersResponseBody> resp = listUsersWithHttpInfo(page, recordsPerPage);
        return resp.getData();
    }

    /**
     * List users
     * Use this endpoint to list every user you&#39;ve created in Atrium.
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @return ApiResponse&lt;UsersResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsersResponseBody> listUsersWithHttpInfo(Integer page, Integer recordsPerPage) throws ApiException {
        com.squareup.okhttp.Call call = listUsersValidateBeforeCall(page, recordsPerPage, null, null);
        Type localVarReturnType = new TypeToken<UsersResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List users (asynchronously)
     * Use this endpoint to list every user you&#39;ve created in Atrium.
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listUsersAsync(Integer page, Integer recordsPerPage, final ApiCallback<UsersResponseBody> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listUsersValidateBeforeCall(page, recordsPerPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UsersResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readUser
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readUserCall(String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}"
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.v1+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "clientID" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readUserValidateBeforeCall(String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling readUser(Async)");
        }
        

        com.squareup.okhttp.Call call = readUserCall(userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read user
     * Use this endpoint to read the attributes of a specific user.
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return UserResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserResponseBody readUser(String userGuid) throws ApiException {
        ApiResponse<UserResponseBody> resp = readUserWithHttpInfo(userGuid);
        return resp.getData();
    }

    /**
     * Read user
     * Use this endpoint to read the attributes of a specific user.
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;UserResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserResponseBody> readUserWithHttpInfo(String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = readUserValidateBeforeCall(userGuid, null, null);
        Type localVarReturnType = new TypeToken<UserResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read user (asynchronously)
     * Use this endpoint to read the attributes of a specific user.
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readUserAsync(String userGuid, final ApiCallback<UserResponseBody> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = readUserValidateBeforeCall(userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUser
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body User object to be updated with optional parameters (identifier, is_disabled, metadata) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUserCall(String userGuid, UserUpdateRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/users/{user_guid}"
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.v1+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "clientID" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUserValidateBeforeCall(String userGuid, UserUpdateRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling updateUser(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUserCall(userGuid, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update user
     * Use this endpoint to update the attributes of a specific user. Atrium will respond with the updated user object.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill.&lt;br&gt; To disable a user, update it and set the is_disabled parameter to true. Set it to false to re-enable the user. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body User object to be updated with optional parameters (identifier, is_disabled, metadata) (optional)
     * @return UserResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserResponseBody updateUser(String userGuid, UserUpdateRequestBody body) throws ApiException {
        ApiResponse<UserResponseBody> resp = updateUserWithHttpInfo(userGuid, body);
        return resp.getData();
    }

    /**
     * Update user
     * Use this endpoint to update the attributes of a specific user. Atrium will respond with the updated user object.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill.&lt;br&gt; To disable a user, update it and set the is_disabled parameter to true. Set it to false to re-enable the user. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body User object to be updated with optional parameters (identifier, is_disabled, metadata) (optional)
     * @return ApiResponse&lt;UserResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserResponseBody> updateUserWithHttpInfo(String userGuid, UserUpdateRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = updateUserValidateBeforeCall(userGuid, body, null, null);
        Type localVarReturnType = new TypeToken<UserResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update user (asynchronously)
     * Use this endpoint to update the attributes of a specific user. Atrium will respond with the updated user object.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill.&lt;br&gt; To disable a user, update it and set the is_disabled parameter to true. Set it to false to re-enable the user. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body User object to be updated with optional parameters (identifier, is_disabled, metadata) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUserAsync(String userGuid, UserUpdateRequestBody body, final ApiCallback<UserResponseBody> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateUserValidateBeforeCall(userGuid, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
