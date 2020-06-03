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


import com.mx.model.MemberResponseBody;
import com.mx.model.RewardResponseBody;
import com.mx.model.RewardsResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RewardsApi {
    private ApiClient apiClient;

    public RewardsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RewardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for fetchRewards
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchRewardsCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/fetch_rewards"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.beta+json"
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
    private com.squareup.okhttp.Call fetchRewardsValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling fetchRewards(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling fetchRewards(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchRewardsCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch rewards
     * The fetch rewards endpoint begins fetching rewards for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return MemberResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MemberResponseBody fetchRewards(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<MemberResponseBody> resp = fetchRewardsWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * Fetch rewards
     * The fetch rewards endpoint begins fetching rewards for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;MemberResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MemberResponseBody> fetchRewardsWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = fetchRewardsValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<MemberResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch rewards (asynchronously)
     * The fetch rewards endpoint begins fetching rewards for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchRewardsAsync(String memberGuid, String userGuid, final ApiCallback<MemberResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchRewardsValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MemberResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listRewards
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listRewardsCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/rewards"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.beta+json"
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
    private com.squareup.okhttp.Call listRewardsValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling listRewards(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling listRewards(Async)");
        }
        

        com.squareup.okhttp.Call call = listRewardsCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List rewards
     * List rewards for a given account.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return RewardsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RewardsResponseBody listRewards(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<RewardsResponseBody> resp = listRewardsWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * List rewards
     * List rewards for a given account.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;RewardsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RewardsResponseBody> listRewardsWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = listRewardsValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<RewardsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List rewards (asynchronously)
     * List rewards for a given account.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listRewardsAsync(String memberGuid, String userGuid, final ApiCallback<RewardsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listRewardsValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RewardsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readReward
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param rewardGuid The unique identifier for a &#x60;reward&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readRewardCall(String memberGuid, String rewardGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/rewards/{reward_guid}"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
            .replaceAll("\\{" + "reward_guid" + "\\}", apiClient.escapeString(rewardGuid.toString()))
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.beta+json"
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
    private com.squareup.okhttp.Call readRewardValidateBeforeCall(String memberGuid, String rewardGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling readReward(Async)");
        }
        
        // verify the required parameter 'rewardGuid' is set
        if (rewardGuid == null) {
            throw new ApiException("Missing the required parameter 'rewardGuid' when calling readReward(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling readReward(Async)");
        }
        

        com.squareup.okhttp.Call call = readRewardCall(memberGuid, rewardGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read reward
     * Read a reward.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param rewardGuid The unique identifier for a &#x60;reward&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return RewardResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RewardResponseBody readReward(String memberGuid, String rewardGuid, String userGuid) throws ApiException {
        ApiResponse<RewardResponseBody> resp = readRewardWithHttpInfo(memberGuid, rewardGuid, userGuid);
        return resp.getData();
    }

    /**
     * Read reward
     * Read a reward.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param rewardGuid The unique identifier for a &#x60;reward&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;RewardResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RewardResponseBody> readRewardWithHttpInfo(String memberGuid, String rewardGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = readRewardValidateBeforeCall(memberGuid, rewardGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<RewardResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read reward (asynchronously)
     * Read a reward.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param rewardGuid The unique identifier for a &#x60;reward&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readRewardAsync(String memberGuid, String rewardGuid, String userGuid, final ApiCallback<RewardResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readRewardValidateBeforeCall(memberGuid, rewardGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RewardResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
