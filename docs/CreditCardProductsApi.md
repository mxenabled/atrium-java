# CreditCardProductsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**readCreditCardProduct**](CreditCardProductsApi.md#readCreditCardProduct) | **GET** /credit_card_products/{credit_card_product_guid} | Read credit card product


<a name="readCreditCardProduct"></a>
# **readCreditCardProduct**
> CreditCardProductResponseBody readCreditCardProduct(creditCardProductGuid)

Read credit card product

Use this endpoint to read the attributes of a credit card product.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class CreditCardProductsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String creditCardProductGuid = "CCA-123"; // String | The unique identifier for a `credit card product`.

        try {
            CreditCardProductResponseBody response = client.creditCardProducts.readCreditCardProduct(creditCardProductGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreditCardProductsApi#readCreditCardProduct");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditCardProductGuid** | **String**| The unique identifier for a &#x60;credit card product&#x60;. |

### Return type

[**CreditCardProductResponseBody**](CreditCardProductResponseBody.md)

