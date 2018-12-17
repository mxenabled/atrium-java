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


import com.mx.model.ConnectWidgetRequestBody;
import com.mx.model.ConnectWidgetResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectWidgetApi {
    private ApiClient apiClient;

    public ConnectWidgetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectWidgetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getConnectWidget
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getConnectWidgetCall(String userGuid, ConnectWidgetRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/connect_widget_url"
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
    private com.squareup.okhttp.Call getConnectWidgetValidateBeforeCall(String userGuid, ConnectWidgetRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling getConnectWidget(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getConnectWidget(Async)");
        }
        

        com.squareup.okhttp.Call call = getConnectWidgetCall(userGuid, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Embedding in a website
     * This endpoint will return a URL for an embeddable version of MX Connect.
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) (required)
     * @return ConnectWidgetResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConnectWidgetResponseBody getConnectWidget(String userGuid, ConnectWidgetRequestBody body) throws ApiException {
        ApiResponse<ConnectWidgetResponseBody> resp = getConnectWidgetWithHttpInfo(userGuid, body);
        return resp.getData();
    }

    /**
     * Embedding in a website
     * This endpoint will return a URL for an embeddable version of MX Connect.
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) (required)
     * @return ApiResponse&lt;ConnectWidgetResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConnectWidgetResponseBody> getConnectWidgetWithHttpInfo(String userGuid, ConnectWidgetRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = getConnectWidgetValidateBeforeCall(userGuid, body, null, null);
        Type localVarReturnType = new TypeToken<ConnectWidgetResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Embedding in a website (asynchronously)
     * This endpoint will return a URL for an embeddable version of MX Connect.
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param body Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getConnectWidgetAsync(String userGuid, ConnectWidgetRequestBody body, final ApiCallback<ConnectWidgetResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getConnectWidgetValidateBeforeCall(userGuid, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConnectWidgetResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
