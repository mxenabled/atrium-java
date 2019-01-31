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


import com.mx.model.CredentialsResponseBody;
import com.mx.model.InstitutionResponseBody;
import com.mx.model.InstitutionsResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstitutionsApi {
    private ApiClient apiClient;

    public InstitutionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstitutionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listInstitutions
     * @param name This will list only institutions in which the appended string appears. (optional)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param supportsAccountIdentification Filter only institutions which support account identification. (optional)
     * @param supportsAccountStatement Filter only institutions which support account statements. (optional)
     * @param supportsAccountVerification Filter only institutions which support account verification. (optional)
     * @param supportsTransactionHistory Filter only institutions which support extended transaction history. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listInstitutionsCall(String name, Integer page, Integer recordsPerPage, Boolean supportsAccountIdentification, Boolean supportsAccountStatement, Boolean supportsAccountVerification, Boolean supportsTransactionHistory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/institutions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (recordsPerPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("records_per_page", recordsPerPage));
        if (supportsAccountIdentification != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("supports_account_identification", supportsAccountIdentification));
        if (supportsAccountStatement != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("supports_account_statement", supportsAccountStatement));
        if (supportsAccountVerification != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("supports_account_verification", supportsAccountVerification));
        if (supportsTransactionHistory != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("supports_transaction_history", supportsTransactionHistory));

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
    private com.squareup.okhttp.Call listInstitutionsValidateBeforeCall(String name, Integer page, Integer recordsPerPage, Boolean supportsAccountIdentification, Boolean supportsAccountStatement, Boolean supportsAccountVerification, Boolean supportsTransactionHistory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listInstitutionsCall(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List institutions
     * This endpoint allows you to see what institutions are available for connection. Information returned will include the institution_code assigned to a particular institution, URLs for the financial institution&#39;s logo, and the URL for its website.&lt;br&gt; This endpoint takes an optional query string, name&#x3D;{string}. This will list only institutions in which the appended string appears. 
     * @param name This will list only institutions in which the appended string appears. (optional)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param supportsAccountIdentification Filter only institutions which support account identification. (optional)
     * @param supportsAccountStatement Filter only institutions which support account statements. (optional)
     * @param supportsAccountVerification Filter only institutions which support account verification. (optional)
     * @param supportsTransactionHistory Filter only institutions which support extended transaction history. (optional)
     * @return InstitutionsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InstitutionsResponseBody listInstitutions(String name, Integer page, Integer recordsPerPage, Boolean supportsAccountIdentification, Boolean supportsAccountStatement, Boolean supportsAccountVerification, Boolean supportsTransactionHistory) throws ApiException {
        ApiResponse<InstitutionsResponseBody> resp = listInstitutionsWithHttpInfo(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory);
        return resp.getData();
    }

    /**
     * List institutions
     * This endpoint allows you to see what institutions are available for connection. Information returned will include the institution_code assigned to a particular institution, URLs for the financial institution&#39;s logo, and the URL for its website.&lt;br&gt; This endpoint takes an optional query string, name&#x3D;{string}. This will list only institutions in which the appended string appears. 
     * @param name This will list only institutions in which the appended string appears. (optional)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param supportsAccountIdentification Filter only institutions which support account identification. (optional)
     * @param supportsAccountStatement Filter only institutions which support account statements. (optional)
     * @param supportsAccountVerification Filter only institutions which support account verification. (optional)
     * @param supportsTransactionHistory Filter only institutions which support extended transaction history. (optional)
     * @return ApiResponse&lt;InstitutionsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InstitutionsResponseBody> listInstitutionsWithHttpInfo(String name, Integer page, Integer recordsPerPage, Boolean supportsAccountIdentification, Boolean supportsAccountStatement, Boolean supportsAccountVerification, Boolean supportsTransactionHistory) throws ApiException {
        com.squareup.okhttp.Call call = listInstitutionsValidateBeforeCall(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory, null, null);
        Type localVarReturnType = new TypeToken<InstitutionsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List institutions (asynchronously)
     * This endpoint allows you to see what institutions are available for connection. Information returned will include the institution_code assigned to a particular institution, URLs for the financial institution&#39;s logo, and the URL for its website.&lt;br&gt; This endpoint takes an optional query string, name&#x3D;{string}. This will list only institutions in which the appended string appears. 
     * @param name This will list only institutions in which the appended string appears. (optional)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param supportsAccountIdentification Filter only institutions which support account identification. (optional)
     * @param supportsAccountStatement Filter only institutions which support account statements. (optional)
     * @param supportsAccountVerification Filter only institutions which support account verification. (optional)
     * @param supportsTransactionHistory Filter only institutions which support extended transaction history. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInstitutionsAsync(String name, Integer page, Integer recordsPerPage, Boolean supportsAccountIdentification, Boolean supportsAccountStatement, Boolean supportsAccountVerification, Boolean supportsTransactionHistory, final ApiCallback<InstitutionsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listInstitutionsValidateBeforeCall(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InstitutionsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readInstitution
     * @param institutionCode The institution_code of the institution. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readInstitutionCall(String institutionCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/institutions/{institution_code}"
            .replaceAll("\\{" + "institution_code" + "\\}", apiClient.escapeString(institutionCode.toString()));

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
    private com.squareup.okhttp.Call readInstitutionValidateBeforeCall(String institutionCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'institutionCode' is set
        if (institutionCode == null) {
            throw new ApiException("Missing the required parameter 'institutionCode' when calling readInstitution(Async)");
        }
        

        com.squareup.okhttp.Call call = readInstitutionCall(institutionCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read institution
     * This endpoint allows you to see information for a specific institution.
     * @param institutionCode The institution_code of the institution. (required)
     * @return InstitutionResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InstitutionResponseBody readInstitution(String institutionCode) throws ApiException {
        ApiResponse<InstitutionResponseBody> resp = readInstitutionWithHttpInfo(institutionCode);
        return resp.getData();
    }

    /**
     * Read institution
     * This endpoint allows you to see information for a specific institution.
     * @param institutionCode The institution_code of the institution. (required)
     * @return ApiResponse&lt;InstitutionResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InstitutionResponseBody> readInstitutionWithHttpInfo(String institutionCode) throws ApiException {
        com.squareup.okhttp.Call call = readInstitutionValidateBeforeCall(institutionCode, null, null);
        Type localVarReturnType = new TypeToken<InstitutionResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read institution (asynchronously)
     * This endpoint allows you to see information for a specific institution.
     * @param institutionCode The institution_code of the institution. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readInstitutionAsync(String institutionCode, final ApiCallback<InstitutionResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readInstitutionValidateBeforeCall(institutionCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InstitutionResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readInstitutionCredentials
     * @param institutionCode The institution_code of the institution. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readInstitutionCredentialsCall(String institutionCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/institutions/{institution_code}/credentials"
            .replaceAll("\\{" + "institution_code" + "\\}", apiClient.escapeString(institutionCode.toString()));

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
    private com.squareup.okhttp.Call readInstitutionCredentialsValidateBeforeCall(String institutionCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'institutionCode' is set
        if (institutionCode == null) {
            throw new ApiException("Missing the required parameter 'institutionCode' when calling readInstitutionCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = readInstitutionCredentialsCall(institutionCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read institution credentials
     * Use this endpoint to see which credentials will be needed to create a member for a specific institution.
     * @param institutionCode The institution_code of the institution. (required)
     * @return CredentialsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsResponseBody readInstitutionCredentials(String institutionCode) throws ApiException {
        ApiResponse<CredentialsResponseBody> resp = readInstitutionCredentialsWithHttpInfo(institutionCode);
        return resp.getData();
    }

    /**
     * Read institution credentials
     * Use this endpoint to see which credentials will be needed to create a member for a specific institution.
     * @param institutionCode The institution_code of the institution. (required)
     * @return ApiResponse&lt;CredentialsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsResponseBody> readInstitutionCredentialsWithHttpInfo(String institutionCode) throws ApiException {
        com.squareup.okhttp.Call call = readInstitutionCredentialsValidateBeforeCall(institutionCode, null, null);
        Type localVarReturnType = new TypeToken<CredentialsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read institution credentials (asynchronously)
     * Use this endpoint to see which credentials will be needed to create a member for a specific institution.
     * @param institutionCode The institution_code of the institution. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readInstitutionCredentialsAsync(String institutionCode, final ApiCallback<CredentialsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readInstitutionCredentialsValidateBeforeCall(institutionCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
