/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import java.io.File;
import com.mx.model.MemberResponseBody;
import com.mx.model.StatementResponseBody;
import com.mx.model.StatementsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatementsApi
 */
@Ignore
public class StatementsApiTest {

    private final StatementsApi api = new StatementsApi();

    
    /**
     * Download statement PDF
     *
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadStatementPdfTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        String statementGuid = null;
        File response = api.downloadStatementPdf(memberGuid, userGuid, statementGuid);

        // TODO: test validations
    }
    
    /**
     * Fetch statements
     *
     * The fetch statements endpoint begins fetching statements for a member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchStatementsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.fetchStatements(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List member statements
     *
     * Certain institutions in Atrium allow developers to access account statements associated with a particular &#x60;member&#x60;. Use this endpoint to get an array of available statements.  Before this endpoint can be used, &#x60;fetch_statements&#x60; should be performed on the relevant &#x60;member&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMemberStatementsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        StatementsResponseBody response = api.listMemberStatements(memberGuid, userGuid, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * Read statement JSON
     *
     * Use this endpoint to download a specified statement. The endpoint URL is the same as the URI given in each &#x60;statement&#x60; object. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMemberStatementTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        String statementGuid = null;
        StatementResponseBody response = api.readMemberStatement(memberGuid, userGuid, statementGuid);

        // TODO: test validations
    }
    
}
