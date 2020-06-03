/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.CreditCardProductResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreditCardProductsApi
 */
@Ignore
public class CreditCardProductsApiTest {

    private final CreditCardProductsApi api = new CreditCardProductsApi();

    
    /**
     * Read credit card product
     *
     * Use this endpoint to read the attributes of a credit card product.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCreditCardProductTest() throws ApiException {
        String creditCardProductGuid = null;
        CreditCardProductResponseBody response = api.readCreditCardProduct(creditCardProductGuid);

        // TODO: test validations
    }
    
}
