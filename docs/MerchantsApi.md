# MerchantsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMerchantLocations**](MerchantsApi.md#listMerchantLocations) | **GET** /merchants/{merchant_guid}/merchant_locations | List merchant locations
[**listMerchants**](MerchantsApi.md#listMerchants) | **GET** /merchants | List merchants
[**readMerchant**](MerchantsApi.md#readMerchant) | **GET** /merchants/{merchant_guid} | Read merchant
[**readMerchantLocation**](MerchantsApi.md#readMerchantLocation) | **GET** /merchants/{merchant_guid}/merchant_locations/{merchant_location_guid} | Read merchant location


<a name="listMerchantLocations"></a>
# **listMerchantLocations**
> MerchantLocationsResponseBody listMerchantLocations(merchantGuid)

List merchant locations

Returns a list of all the merchant locations associated with a merchant, including physical location, latitude, longitude, etc.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class MerchantsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String merchantGuid = "MCH-123"; // String | The unique identifier for a `merchant`.

        try {
            MerchantLocationsResponseBody response = client.merchants.listMerchantLocations(merchantGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantsApi#listMerchantLocations");
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

[**MerchantLocationsResponseBody**](MerchantLocationsResponseBody.md)

<a name="listMerchants"></a>
# **listMerchants**
> MerchantsResponseBody listMerchants()

List merchants

Returns a list of merchnants.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class MerchantsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");


        try {
            MerchantsResponseBody response = client.merchants.listMerchants();
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantsApi#listMerchants");
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MerchantsResponseBody**](MerchantsResponseBody.md)

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
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

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

<a name="readMerchantLocation"></a>
# **readMerchantLocation**
> MerchantLocationResponseBody readMerchantLocation(merchantGuid, merchantLocationGuid)

Read merchant location

Retuns a specific location associated with a merchant, including physical location, latitude, longitude, etc.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class MerchantsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String merchantGuid = "MCH-123"; // String | The unique identifier for a `merchant`.
        String merchantLocationGuid = "MCL-123"; // String | The unique identifier for a `merchant_location`.

        try {
            MerchantLocationResponseBody response = client.merchants.readMerchantLocation(merchantGuid, merchantLocationGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantsApi#readMerchantLocation");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantGuid** | **String**| The unique identifier for a &#x60;merchant&#x60;. |
 **merchantLocationGuid** | **String**| The unique identifier for a &#x60;merchant_location&#x60;. |

### Return type

[**MerchantLocationResponseBody**](MerchantLocationResponseBody.md)

