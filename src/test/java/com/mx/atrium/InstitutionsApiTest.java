/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.CredentialsResponseBody;
import com.mx.model.InstitutionResponseBody;
import com.mx.model.InstitutionsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstitutionsApi
 */
@Ignore
public class InstitutionsApiTest {

    private final InstitutionsApi api = new InstitutionsApi();

    
    /**
     * List institutions
     *
     * This endpoint allows you to see what institutions are available for connection. Information returned will include the institution_code assigned to a particular institution, URLs for the financial institution&#39;s logo, and the URL for its website.&lt;br&gt; This endpoint takes an optional query string, name&#x3D;{string}. This will list only institutions in which the appended string appears. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInstitutionsTest() throws ApiException {
        String name = null;
        Integer page = null;
        Integer recordsPerPage = null;
        InstitutionsResponseBody response = api.listInstitutions(name, page, recordsPerPage);

        // TODO: test validations
    }
    
    /**
     * Read institution
     *
     * This endpoint allows you to see information for a specific institution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readInstitutionTest() throws ApiException {
        String institutionCode = null;
        InstitutionResponseBody response = api.readInstitution(institutionCode);

        // TODO: test validations
    }
    
    /**
     * Read institution credentials
     *
     * Use this endpoint to see which credentials will be needed to create a member for a specific institution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readInstitutionCredentialsTest() throws ApiException {
        String institutionCode = null;
        CredentialsResponseBody response = api.readInstitutionCredentials(institutionCode);

        // TODO: test validations
    }
    
}
