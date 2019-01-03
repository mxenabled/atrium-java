# MerchantsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**readMerchant**](MerchantsApi.md#readMerchant) | **GET** /merchants/{merchant_guid} | Read merchant


<a name="readMerchant"></a>
# **readMerchant**
> MerchantResponseBody readMerchant(merchantGuid)

Read merchant

Returns information about a particular merchant, such as a logo, name, and website.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class MerchantsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String merchantGuid = "MCH-123"; // String | The unique identifier for a `merchant`.

        try {
            MerchantResponseBody response = client.merchants.readMerchant(merchantGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantsApi#readMerchant");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantGuid** | **String**| The unique identifier for a &#x60;merchant&#x60;. |

### Return type

[**MerchantResponseBody**](MerchantResponseBody.md)

