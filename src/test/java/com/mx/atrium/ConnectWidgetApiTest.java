/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.ConnectWidgetRequestBody;
import com.mx.model.ConnectWidgetResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectWidgetApi
 */
@Ignore
public class ConnectWidgetApiTest {

    private final ConnectWidgetApi api = new ConnectWidgetApi();

    
    /**
     * Embedding in a website
     *
     * This endpoint will return a URL for an embeddable version of MX Connect.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectWidgetTest() throws ApiException {
        String userGuid = null;
        ConnectWidgetRequestBody body = null;
        ConnectWidgetResponseBody response = api.getConnectWidget(userGuid, body);

        // TODO: test validations
    }
    
}
