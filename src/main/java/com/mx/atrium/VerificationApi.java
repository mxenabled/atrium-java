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


import com.mx.model.AccountNumbers;
import com.mx.model.Member;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerificationApi {
    private ApiClient apiClient;

    public VerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VerificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listAccountNumbers
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAccountNumbersCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/account_numbers"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
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
    private com.squareup.okhttp.Call listAccountNumbersValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling listAccountNumbers(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling listAccountNumbers(Async)");
        }
        

        com.squareup.okhttp.Call call = listAccountNumbersCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read account numbers
     * Use this endpoint to check whether account and routing numbers are available for accounts associated with a particular member. It returns the account_numbers object, which contains account and routing number data for each account associated with the member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return AccountNumbers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountNumbers listAccountNumbers(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<AccountNumbers> resp = listAccountNumbersWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * Read account numbers
     * Use this endpoint to check whether account and routing numbers are available for accounts associated with a particular member. It returns the account_numbers object, which contains account and routing number data for each account associated with the member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;AccountNumbers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountNumbers> listAccountNumbersWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = listAccountNumbersValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<AccountNumbers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read account numbers (asynchronously)
     * Use this endpoint to check whether account and routing numbers are available for accounts associated with a particular member. It returns the account_numbers object, which contains account and routing number data for each account associated with the member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountNumbersAsync(String memberGuid, String userGuid, final ApiCallback<AccountNumbers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountNumbersValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountNumbers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAccountNumbersByAccount
     * @param accountGuid The unique identifier for an &#x60;account&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAccountNumbersByAccountCall(String accountGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/accounts/{account_guid}/account_numbers"
            .replaceAll("\\{" + "account_guid" + "\\}", apiClient.escapeString(accountGuid.toString()))
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
    private com.squareup.okhttp.Call listAccountNumbersByAccountValidateBeforeCall(String accountGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountGuid' is set
        if (accountGuid == null) {
            throw new ApiException("Missing the required parameter 'accountGuid' when calling listAccountNumbersByAccount(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling listAccountNumbersByAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = listAccountNumbersByAccountCall(accountGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read account numbers by account GUID
     * Use this endpoint to check whether account and routing numbers are available for a specific account. It returns the account_numbers object, which contains account and routing number data.
     * @param accountGuid The unique identifier for an &#x60;account&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return AccountNumbers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountNumbers listAccountNumbersByAccount(String accountGuid, String userGuid) throws ApiException {
        ApiResponse<AccountNumbers> resp = listAccountNumbersByAccountWithHttpInfo(accountGuid, userGuid);
        return resp.getData();
    }

    /**
     * Read account numbers by account GUID
     * Use this endpoint to check whether account and routing numbers are available for a specific account. It returns the account_numbers object, which contains account and routing number data.
     * @param accountGuid The unique identifier for an &#x60;account&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;AccountNumbers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountNumbers> listAccountNumbersByAccountWithHttpInfo(String accountGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = listAccountNumbersByAccountValidateBeforeCall(accountGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<AccountNumbers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read account numbers by account GUID (asynchronously)
     * Use this endpoint to check whether account and routing numbers are available for a specific account. It returns the account_numbers object, which contains account and routing number data.
     * @param accountGuid The unique identifier for an &#x60;account&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountNumbersByAccountAsync(String accountGuid, String userGuid, final ApiCallback<AccountNumbers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountNumbersByAccountValidateBeforeCall(accountGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountNumbers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for verifyMember
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call verifyMemberCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/verify"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call verifyMemberValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling verifyMember(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling verifyMember(Async)");
        }
        

        com.squareup.okhttp.Call call = verifyMemberCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify
     * The verify endpoint begins a verification process for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return Member
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Member verifyMember(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<Member> resp = verifyMemberWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * Verify
     * The verify endpoint begins a verification process for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;Member&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Member> verifyMemberWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = verifyMemberValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify (asynchronously)
     * The verify endpoint begins a verification process for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call verifyMemberAsync(String memberGuid, String userGuid, final ApiCallback<Member> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = verifyMemberValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
