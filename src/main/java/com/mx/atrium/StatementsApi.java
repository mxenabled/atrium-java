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


import java.io.File;
import com.mx.model.MemberResponseBody;
import com.mx.model.StatementResponseBody;
import com.mx.model.StatementsResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatementsApi {
    private ApiClient apiClient;

    public StatementsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for downloadStatementPdf
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadStatementPdfCall(String memberGuid, String userGuid, String statementGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/statements/{statement_guid}.pdf"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()))
            .replaceAll("\\{" + "statement_guid" + "\\}", apiClient.escapeString(statementGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mx.atrium.v1+pdf"
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
    private com.squareup.okhttp.Call downloadStatementPdfValidateBeforeCall(String memberGuid, String userGuid, String statementGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling downloadStatementPdf(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling downloadStatementPdf(Async)");
        }
        
        // verify the required parameter 'statementGuid' is set
        if (statementGuid == null) {
            throw new ApiException("Missing the required parameter 'statementGuid' when calling downloadStatementPdf(Async)");
        }
        

        com.squareup.okhttp.Call call = downloadStatementPdfCall(memberGuid, userGuid, statementGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download statement PDF
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File downloadStatementPdf(String memberGuid, String userGuid, String statementGuid) throws ApiException {
        ApiResponse<File> resp = downloadStatementPdfWithHttpInfo(memberGuid, userGuid, statementGuid);
        return resp.getData();
    }

    /**
     * Download statement PDF
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> downloadStatementPdfWithHttpInfo(String memberGuid, String userGuid, String statementGuid) throws ApiException {
        com.squareup.okhttp.Call call = downloadStatementPdfValidateBeforeCall(memberGuid, userGuid, statementGuid, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download statement PDF (asynchronously)
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadStatementPdfAsync(String memberGuid, String userGuid, String statementGuid, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadStatementPdfValidateBeforeCall(memberGuid, userGuid, statementGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchStatements
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchStatementsCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/fetch_statements"
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
    private com.squareup.okhttp.Call fetchStatementsValidateBeforeCall(String memberGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling fetchStatements(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling fetchStatements(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchStatementsCall(memberGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch statements
     * The fetch statements endpoint begins fetching statements for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return MemberResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MemberResponseBody fetchStatements(String memberGuid, String userGuid) throws ApiException {
        ApiResponse<MemberResponseBody> resp = fetchStatementsWithHttpInfo(memberGuid, userGuid);
        return resp.getData();
    }

    /**
     * Fetch statements
     * The fetch statements endpoint begins fetching statements for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;MemberResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MemberResponseBody> fetchStatementsWithHttpInfo(String memberGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = fetchStatementsValidateBeforeCall(memberGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<MemberResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch statements (asynchronously)
     * The fetch statements endpoint begins fetching statements for a member.
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchStatementsAsync(String memberGuid, String userGuid, final ApiCallback<MemberResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchStatementsValidateBeforeCall(memberGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MemberResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMemberStatements
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMemberStatementsCall(String memberGuid, String userGuid, Integer page, Integer recordsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/statements"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

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
    private com.squareup.okhttp.Call listMemberStatementsValidateBeforeCall(String memberGuid, String userGuid, Integer page, Integer recordsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling listMemberStatements(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling listMemberStatements(Async)");
        }
        

        com.squareup.okhttp.Call call = listMemberStatementsCall(memberGuid, userGuid, page, recordsPerPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List member statements
     * Certain institutions in Atrium allow developers to access account statements associated with a particular &#x60;member&#x60;. Use this endpoint to get an array of available statements.  Before this endpoint can be used, &#x60;fetch_statements&#x60; should be performed on the relevant &#x60;member&#x60;. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @return StatementsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StatementsResponseBody listMemberStatements(String memberGuid, String userGuid, Integer page, Integer recordsPerPage) throws ApiException {
        ApiResponse<StatementsResponseBody> resp = listMemberStatementsWithHttpInfo(memberGuid, userGuid, page, recordsPerPage);
        return resp.getData();
    }

    /**
     * List member statements
     * Certain institutions in Atrium allow developers to access account statements associated with a particular &#x60;member&#x60;. Use this endpoint to get an array of available statements.  Before this endpoint can be used, &#x60;fetch_statements&#x60; should be performed on the relevant &#x60;member&#x60;. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @return ApiResponse&lt;StatementsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StatementsResponseBody> listMemberStatementsWithHttpInfo(String memberGuid, String userGuid, Integer page, Integer recordsPerPage) throws ApiException {
        com.squareup.okhttp.Call call = listMemberStatementsValidateBeforeCall(memberGuid, userGuid, page, recordsPerPage, null, null);
        Type localVarReturnType = new TypeToken<StatementsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List member statements (asynchronously)
     * Certain institutions in Atrium allow developers to access account statements associated with a particular &#x60;member&#x60;. Use this endpoint to get an array of available statements.  Before this endpoint can be used, &#x60;fetch_statements&#x60; should be performed on the relevant &#x60;member&#x60;. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMemberStatementsAsync(String memberGuid, String userGuid, Integer page, Integer recordsPerPage, final ApiCallback<StatementsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMemberStatementsValidateBeforeCall(memberGuid, userGuid, page, recordsPerPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StatementsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readMemberStatement
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readMemberStatementCall(String memberGuid, String userGuid, String statementGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/members/{member_guid}/statements/{statement_guid}"
            .replaceAll("\\{" + "member_guid" + "\\}", apiClient.escapeString(memberGuid.toString()))
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()))
            .replaceAll("\\{" + "statement_guid" + "\\}", apiClient.escapeString(statementGuid.toString()));

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
    private com.squareup.okhttp.Call readMemberStatementValidateBeforeCall(String memberGuid, String userGuid, String statementGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'memberGuid' is set
        if (memberGuid == null) {
            throw new ApiException("Missing the required parameter 'memberGuid' when calling readMemberStatement(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling readMemberStatement(Async)");
        }
        
        // verify the required parameter 'statementGuid' is set
        if (statementGuid == null) {
            throw new ApiException("Missing the required parameter 'statementGuid' when calling readMemberStatement(Async)");
        }
        

        com.squareup.okhttp.Call call = readMemberStatementCall(memberGuid, userGuid, statementGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read statement JSON
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @return StatementResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StatementResponseBody readMemberStatement(String memberGuid, String userGuid, String statementGuid) throws ApiException {
        ApiResponse<StatementResponseBody> resp = readMemberStatementWithHttpInfo(memberGuid, userGuid, statementGuid);
        return resp.getData();
    }

    /**
     * Read statement JSON
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @return ApiResponse&lt;StatementResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StatementResponseBody> readMemberStatementWithHttpInfo(String memberGuid, String userGuid, String statementGuid) throws ApiException {
        com.squareup.okhttp.Call call = readMemberStatementValidateBeforeCall(memberGuid, userGuid, statementGuid, null, null);
        Type localVarReturnType = new TypeToken<StatementResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read statement JSON (asynchronously)
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     * @param memberGuid The unique identifier for a &#x60;member&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param statementGuid The unique identifier for an &#x60;statement&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readMemberStatementAsync(String memberGuid, String userGuid, String statementGuid, final ApiCallback<StatementResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readMemberStatementValidateBeforeCall(memberGuid, userGuid, statementGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StatementResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
