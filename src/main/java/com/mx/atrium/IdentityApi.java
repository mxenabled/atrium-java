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


import com.mx.model.AccountOwners;
import com.mx.model.Member;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdentityApi {
    private ApiClient apiClient;

    public IdentityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IdentityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for identifyMember
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call identifyMemberCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/identify"
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
    private com.squareup.okhttp.Call identifyMemberValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling identifyMember(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling identifyMember(Async)");
        }
        

        com.squareup.okhttp.Call call = identifyMemberCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Identify
     * The identify endpoint begins an identification process for an already-existing member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return Member
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Member identifyMember(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<Member> resp = identifyMemberWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * Identify
     * The identify endpoint begins an identification process for an already-existing member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;Member&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Member> identifyMemberWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = identifyMemberValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Identify (asynchronously)
     * The identify endpoint begins an identification process for an already-existing member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call identifyMemberAsync(String memberGuid, String userGuid, final ApiCallback<Member> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = identifyMemberValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Member>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAccountOwners
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAccountOwnersCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/account_owners"
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
    private com.squareup.okhttp.Call listAccountOwnersValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling listAccountOwners(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling listAccountOwners(Async)");
        }
        

        com.squareup.okhttp.Call call = listAccountOwnersCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List member account owners
     * This endpoint returns an array with information about every account associated with a particular member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return AccountOwners
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountOwners listAccountOwners(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<AccountOwners> resp = listAccountOwnersWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * List member account owners
     * This endpoint returns an array with information about every account associated with a particular member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;AccountOwners&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountOwners> listAccountOwnersWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = listAccountOwnersValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<AccountOwners>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List member account owners (asynchronously)
     * This endpoint returns an array with information about every account associated with a particular member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountOwnersAsync(String memberGuid, String userGuid, final ApiCallback<AccountOwners> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountOwnersValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountOwners>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
