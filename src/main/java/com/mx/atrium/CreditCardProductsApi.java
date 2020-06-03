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


import com.mx.model.CreditCardProductResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreditCardProductsApi {
    private ApiClient apiClient;

    public CreditCardProductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CreditCardProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for readCreditCardProduct
     * @param creditCardProductGuid The unique identifier for a &#x60;credit card product&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readCreditCardProductCall(String creditCardProductGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/credit_card_products/{credit_card_product_guid}"
            .replaceAll("\\{" + "credit_card_product_guid" + "\\}", apiClient.escapeString(creditCardProductGuid.toString()));

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
    private com.squareup.okhttp.Call readCreditCardProductValidateBeforeCall(String creditCardProductGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'creditCardProductGuid' is set
        if (creditCardProductGuid == null) {
            throw new ApiException("Missing the required parameter 'creditCardProductGuid' when calling readCreditCardProduct(Async)");
        }
        

        com.squareup.okhttp.Call call = readCreditCardProductCall(creditCardProductGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read credit card product
     * Use this endpoint to read the attributes of a credit card product.
     * @param creditCardProductGuid The unique identifier for a &#x60;credit card product&#x60;. (required)
     * @return CreditCardProductResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreditCardProductResponseBody readCreditCardProduct(String creditCardProductGuid) throws ApiException {
        ApiResponse<CreditCardProductResponseBody> resp = readCreditCardProductWithHttpInfo(creditCardProductGuid);
        return resp.getData();
    }

    /**
     * Read credit card product
     * Use this endpoint to read the attributes of a credit card product.
     * @param creditCardProductGuid The unique identifier for a &#x60;credit card product&#x60;. (required)
     * @return ApiResponse&lt;CreditCardProductResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreditCardProductResponseBody> readCreditCardProductWithHttpInfo(String creditCardProductGuid) throws ApiException {
        com.squareup.okhttp.Call call = readCreditCardProductValidateBeforeCall(creditCardProductGuid, null, null);
        Type localVarReturnType = new TypeToken<CreditCardProductResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read credit card product (asynchronously)
     * Use this endpoint to read the attributes of a credit card product.
     * @param creditCardProductGuid The unique identifier for a &#x60;credit card product&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readCreditCardProductAsync(String creditCardProductGuid, final ApiCallback<CreditCardProductResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readCreditCardProductValidateBeforeCall(creditCardProductGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreditCardProductResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
