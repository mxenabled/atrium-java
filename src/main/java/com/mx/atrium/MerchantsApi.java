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


import com.mx.model.MerchantLocationResponseBody;
import com.mx.model.MerchantLocationsResponseBody;
import com.mx.model.MerchantResponseBody;
import com.mx.model.MerchantsResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerchantsApi {
    private ApiClient apiClient;

    public MerchantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MerchantsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listMerchantLocations
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMerchantLocationsCall(String merchantGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchants/{merchant_guid}/merchant_locations"
            .replaceAll("\\{" + "merchant_guid" + "\\}", apiClient.escapeString(merchantGuid.toString()));

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
    private com.squareup.okhttp.Call listMerchantLocationsValidateBeforeCall(String merchantGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantGuid' is set
        if (merchantGuid == null) {
            throw new ApiException("Missing the required parameter 'merchantGuid' when calling listMerchantLocations(Async)");
        }
        

        com.squareup.okhttp.Call call = listMerchantLocationsCall(merchantGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List merchant locations
     * Returns a list of all the merchant locations associated with a merchant, including physical location, latitude, longitude, etc.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @return MerchantLocationsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MerchantLocationsResponseBody listMerchantLocations(String merchantGuid) throws ApiException {
        ApiResponse<MerchantLocationsResponseBody> resp = listMerchantLocationsWithHttpInfo(merchantGuid);
        return resp.getData();
    }

    /**
     * List merchant locations
     * Returns a list of all the merchant locations associated with a merchant, including physical location, latitude, longitude, etc.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @return ApiResponse&lt;MerchantLocationsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MerchantLocationsResponseBody> listMerchantLocationsWithHttpInfo(String merchantGuid) throws ApiException {
        com.squareup.okhttp.Call call = listMerchantLocationsValidateBeforeCall(merchantGuid, null, null);
        Type localVarReturnType = new TypeToken<MerchantLocationsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List merchant locations (asynchronously)
     * Returns a list of all the merchant locations associated with a merchant, including physical location, latitude, longitude, etc.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMerchantLocationsAsync(String merchantGuid, final ApiCallback<MerchantLocationsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMerchantLocationsValidateBeforeCall(merchantGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MerchantLocationsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMerchants
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMerchantsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchants";

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
    private com.squareup.okhttp.Call listMerchantsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listMerchantsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * List merchants
     * Returns a list of merchnants.
     * @return MerchantsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MerchantsResponseBody listMerchants() throws ApiException {
        ApiResponse<MerchantsResponseBody> resp = listMerchantsWithHttpInfo();
        return resp.getData();
    }

    /**
     * List merchants
     * Returns a list of merchnants.
     * @return ApiResponse&lt;MerchantsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MerchantsResponseBody> listMerchantsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listMerchantsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MerchantsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List merchants (asynchronously)
     * Returns a list of merchnants.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMerchantsAsync(final ApiCallback<MerchantsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMerchantsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MerchantsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readMerchant
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readMerchantCall(String merchantGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchants/{merchant_guid}"
            .replaceAll("\\{" + "merchant_guid" + "\\}", apiClient.escapeString(merchantGuid.toString()));

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
    private com.squareup.okhttp.Call readMerchantValidateBeforeCall(String merchantGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantGuid' is set
        if (merchantGuid == null) {
            throw new ApiException("Missing the required parameter 'merchantGuid' when calling readMerchant(Async)");
        }
        

        com.squareup.okhttp.Call call = readMerchantCall(merchantGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read merchant
     * Returns information about a particular merchant, such as a logo, name, and website.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @return MerchantResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MerchantResponseBody readMerchant(String merchantGuid) throws ApiException {
        ApiResponse<MerchantResponseBody> resp = readMerchantWithHttpInfo(merchantGuid);
        return resp.getData();
    }

    /**
     * Read merchant
     * Returns information about a particular merchant, such as a logo, name, and website.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @return ApiResponse&lt;MerchantResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MerchantResponseBody> readMerchantWithHttpInfo(String merchantGuid) throws ApiException {
        com.squareup.okhttp.Call call = readMerchantValidateBeforeCall(merchantGuid, null, null);
        Type localVarReturnType = new TypeToken<MerchantResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read merchant (asynchronously)
     * Returns information about a particular merchant, such as a logo, name, and website.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readMerchantAsync(String merchantGuid, final ApiCallback<MerchantResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readMerchantValidateBeforeCall(merchantGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MerchantResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readMerchantLocation
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param merchantLocationGuid The unique identifier for a &#x60;merchant_location&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readMerchantLocationCall(String merchantGuid, String merchantLocationGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchants/{merchant_guid}/merchant_locations/{merchant_location_guid}"
            .replaceAll("\\{" + "merchant_guid" + "\\}", apiClient.escapeString(merchantGuid.toString()))
            .replaceAll("\\{" + "merchant_location_guid" + "\\}", apiClient.escapeString(merchantLocationGuid.toString()));

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
    private com.squareup.okhttp.Call readMerchantLocationValidateBeforeCall(String merchantGuid, String merchantLocationGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantGuid' is set
        if (merchantGuid == null) {
            throw new ApiException("Missing the required parameter 'merchantGuid' when calling readMerchantLocation(Async)");
        }
        
        // verify the required parameter 'merchantLocationGuid' is set
        if (merchantLocationGuid == null) {
            throw new ApiException("Missing the required parameter 'merchantLocationGuid' when calling readMerchantLocation(Async)");
        }
        

        com.squareup.okhttp.Call call = readMerchantLocationCall(merchantGuid, merchantLocationGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read merchant location
     * Retuns a specific location associated with a merchant, including physical location, latitude, longitude, etc.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param merchantLocationGuid The unique identifier for a &#x60;merchant_location&#x60;. (required)
     * @return MerchantLocationResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MerchantLocationResponseBody readMerchantLocation(String merchantGuid, String merchantLocationGuid) throws ApiException {
        ApiResponse<MerchantLocationResponseBody> resp = readMerchantLocationWithHttpInfo(merchantGuid, merchantLocationGuid);
        return resp.getData();
    }

    /**
     * Read merchant location
     * Retuns a specific location associated with a merchant, including physical location, latitude, longitude, etc.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param merchantLocationGuid The unique identifier for a &#x60;merchant_location&#x60;. (required)
     * @return ApiResponse&lt;MerchantLocationResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MerchantLocationResponseBody> readMerchantLocationWithHttpInfo(String merchantGuid, String merchantLocationGuid) throws ApiException {
        com.squareup.okhttp.Call call = readMerchantLocationValidateBeforeCall(merchantGuid, merchantLocationGuid, null, null);
        Type localVarReturnType = new TypeToken<MerchantLocationResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read merchant location (asynchronously)
     * Retuns a specific location associated with a merchant, including physical location, latitude, longitude, etc.
     * @param merchantGuid The unique identifier for a &#x60;merchant&#x60;. (required)
     * @param merchantLocationGuid The unique identifier for a &#x60;merchant_location&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readMerchantLocationAsync(String merchantGuid, String merchantLocationGuid, final ApiCallback<MerchantLocationResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readMerchantLocationValidateBeforeCall(merchantGuid, merchantLocationGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MerchantLocationResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
