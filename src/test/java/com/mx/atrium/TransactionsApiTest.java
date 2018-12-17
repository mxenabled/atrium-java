/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.TransactionResponseBody;
import com.mx.model.TransactionsCleanseAndCategorizeRequestBody;
import com.mx.model.TransactionsCleanseAndCategorizeResponseBody;
import com.mx.model.TransactionsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
@Ignore
public class TransactionsApiTest {

    private final TransactionsApi api = new TransactionsApi();

    
    /**
     * Categorize transactions
     *
     * Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cleanseAndCategorizeTransactionsTest() throws ApiException {
        TransactionsCleanseAndCategorizeRequestBody body = null;
        TransactionsCleanseAndCategorizeResponseBody response = api.cleanseAndCategorizeTransactions(body);

        // TODO: test validations
    }
    
    /**
     * List transactions for a user
     *
     * Use this endpoint to get all transactions that belong to a specific user, across all the user&#39;s members and accounts.&lt;br&gt; This endpoint accepts optional query parameters, from_date and to_date, which filter transactions according to the date they were posted. If no values are given, from_date will default to 90 days prior to the request, and to_date will default to 5 days from the time of the request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserTransactionsTest() throws ApiException {
        String userGuid = null;
        Integer page = null;
        String fromDate = null;
        Integer recordsPerPage = null;
        String toDate = null;
        TransactionsResponseBody response = api.listUserTransactions(userGuid, page, fromDate, recordsPerPage, toDate);

        // TODO: test validations
    }
    
    /**
     * Read a transaction
     *
     * This endpoint allows you to view information about a specific transaction that belongs to a user.&lt;br&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTransactionTest() throws ApiException {
        String transactionGuid = null;
        String userGuid = null;
        TransactionResponseBody response = api.readTransaction(transactionGuid, userGuid);

        // TODO: test validations
    }
    
}
