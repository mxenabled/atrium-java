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


import com.mx.model.Transaction;
import com.mx.model.Transactions;
import com.mx.model.TransactionsCleanseAndCategorize;
import com.mx.model.TransactionsCleanseAndCategorizeRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cleanseAndCategorizeTransactions
     * @param body User object to be created with optional parameters (amount, type) amd required parameters (description, identifier) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cleanseAndCategorizeTransactionsCall(TransactionsCleanseAndCategorizeRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/cleanse_and_categorize";

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
    private com.squareup.okhttp.Call cleanseAndCategorizeTransactionsValidateBeforeCall(TransactionsCleanseAndCategorizeRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling cleanseAndCategorizeTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = cleanseAndCategorizeTransactionsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Categorize transactions
     * Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.
     * @param body User object to be created with optional parameters (amount, type) amd required parameters (description, identifier) (required)
     * @return TransactionsCleanseAndCategorize
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionsCleanseAndCategorize cleanseAndCategorizeTransactions(TransactionsCleanseAndCategorizeRequestBody body) throws ApiException {
        ApiResponse<TransactionsCleanseAndCategorize> resp = cleanseAndCategorizeTransactionsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Categorize transactions
     * Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.
     * @param body User object to be created with optional parameters (amount, type) amd required parameters (description, identifier) (required)
     * @return ApiResponse&lt;TransactionsCleanseAndCategorize&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionsCleanseAndCategorize> cleanseAndCategorizeTransactionsWithHttpInfo(TransactionsCleanseAndCategorizeRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = cleanseAndCategorizeTransactionsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<TransactionsCleanseAndCategorize>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Categorize transactions (asynchronously)
     * Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.
     * @param body User object to be created with optional parameters (amount, type) amd required parameters (description, identifier) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cleanseAndCategorizeTransactionsAsync(TransactionsCleanseAndCategorizeRequestBody body, final ApiCallback<TransactionsCleanseAndCategorize> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cleanseAndCategorizeTransactionsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionsCleanseAndCategorize>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listUserTransactions
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param fromDate Filter transactions from this date. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param toDate Filter transactions to this date. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listUserTransactionsCall(String userGuid, Integer page, String fromDate, Integer recordsPerPage, String toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/transactions"
            .replaceAll("\\{" + "user_guid" + "\\}", apiClient.escapeString(userGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from_date", fromDate));
        if (recordsPerPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("records_per_page", recordsPerPage));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to_date", toDate));

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
    private com.squareup.okhttp.Call listUserTransactionsValidateBeforeCall(String userGuid, Integer page, String fromDate, Integer recordsPerPage, String toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling listUserTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = listUserTransactionsCall(userGuid, page, fromDate, recordsPerPage, toDate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List transactions for a user
     * Use this endpoint to get all transactions that belong to a specific user, across all the user&#39;s members and accounts.&lt;br&gt; This endpoint accepts optional query parameters, from_date and to_date, which filter transactions according to the date they were posted. If no values are given, from_date will default to 90 days prior to the request, and to_date will default to 5 days from the time of the request. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param fromDate Filter transactions from this date. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param toDate Filter transactions to this date. (optional)
     * @return Transactions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transactions listUserTransactions(String userGuid, Integer page, String fromDate, Integer recordsPerPage, String toDate) throws ApiException {
        ApiResponse<Transactions> resp = listUserTransactionsWithHttpInfo(userGuid, page, fromDate, recordsPerPage, toDate);
        return resp.getData();
    }

    /**
     * List transactions for a user
     * Use this endpoint to get all transactions that belong to a specific user, across all the user&#39;s members and accounts.&lt;br&gt; This endpoint accepts optional query parameters, from_date and to_date, which filter transactions according to the date they were posted. If no values are given, from_date will default to 90 days prior to the request, and to_date will default to 5 days from the time of the request. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param fromDate Filter transactions from this date. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param toDate Filter transactions to this date. (optional)
     * @return ApiResponse&lt;Transactions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transactions> listUserTransactionsWithHttpInfo(String userGuid, Integer page, String fromDate, Integer recordsPerPage, String toDate) throws ApiException {
        com.squareup.okhttp.Call call = listUserTransactionsValidateBeforeCall(userGuid, page, fromDate, recordsPerPage, toDate, null, null);
        Type localVarReturnType = new TypeToken<Transactions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List transactions for a user (asynchronously)
     * Use this endpoint to get all transactions that belong to a specific user, across all the user&#39;s members and accounts.&lt;br&gt; This endpoint accepts optional query parameters, from_date and to_date, which filter transactions according to the date they were posted. If no values are given, from_date will default to 90 days prior to the request, and to_date will default to 5 days from the time of the request. 
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param page Specify current page. (optional)
     * @param fromDate Filter transactions from this date. (optional)
     * @param recordsPerPage Specify records per page. (optional)
     * @param toDate Filter transactions to this date. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listUserTransactionsAsync(String userGuid, Integer page, String fromDate, Integer recordsPerPage, String toDate, final ApiCallback<Transactions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listUserTransactionsValidateBeforeCall(userGuid, page, fromDate, recordsPerPage, toDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transactions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readTransaction
     * @param transactionGuid The unique identifier for a &#x60;transaction&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readTransactionCall(String transactionGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{user_guid}/transactions/{transaction_guid}"
            .replaceAll("\\{" + "transaction_guid" + "\\}", apiClient.escapeString(transactionGuid.toString()))
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
    private com.squareup.okhttp.Call readTransactionValidateBeforeCall(String transactionGuid, String userGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'transactionGuid' is set
        if (transactionGuid == null) {
            throw new ApiException("Missing the required parameter 'transactionGuid' when calling readTransaction(Async)");
        }
        
        // verify the required parameter 'userGuid' is set
        if (userGuid == null) {
            throw new ApiException("Missing the required parameter 'userGuid' when calling readTransaction(Async)");
        }
        

        com.squareup.okhttp.Call call = readTransactionCall(transactionGuid, userGuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read a transaction
     * This endpoint allows you to view information about a specific transaction that belongs to a user.&lt;br&gt;
     * @param transactionGuid The unique identifier for a &#x60;transaction&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transaction readTransaction(String transactionGuid, String userGuid) throws ApiException {
        ApiResponse<Transaction> resp = readTransactionWithHttpInfo(transactionGuid, userGuid);
        return resp.getData();
    }

    /**
     * Read a transaction
     * This endpoint allows you to view information about a specific transaction that belongs to a user.&lt;br&gt;
     * @param transactionGuid The unique identifier for a &#x60;transaction&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transaction> readTransactionWithHttpInfo(String transactionGuid, String userGuid) throws ApiException {
        com.squareup.okhttp.Call call = readTransactionValidateBeforeCall(transactionGuid, userGuid, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read a transaction (asynchronously)
     * This endpoint allows you to view information about a specific transaction that belongs to a user.&lt;br&gt;
     * @param transactionGuid The unique identifier for a &#x60;transaction&#x60;. (required)
     * @param userGuid The unique identifier for a &#x60;user&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readTransactionAsync(String transactionGuid, String userGuid, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readTransactionValidateBeforeCall(transactionGuid, userGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
