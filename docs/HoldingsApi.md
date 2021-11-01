# HoldingsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listHoldings**](HoldingsApi.md#listHoldings) | **GET** /users/{user_guid}/holdings | List holdings
[**listHoldingsByAccount**](HoldingsApi.md#listHoldingsByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/holdings | List holdings by account
[**listHoldingsByMember**](HoldingsApi.md#listHoldingsByMember) | **GET** /users/{user_guid}/members/{member_guid}/holdings | List holdings by member
[**readHolding**](HoldingsApi.md#readHolding) | **GET** /users/{user_guid}/holdings/{holding_guid} | Read holding


<a name="listHoldings"></a>
# **listHoldings**
> HoldingsResponseBody listHoldings(userGuid, page, recordsPerPage)

List holdings

Use this endpoint to read all holdings associated with a specific user.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class HoldingsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        Integer page = 1; // Integer | Specify current page.
        Integer recordsPerPage = 12; // Integer | Specify records per page.

        try {
            HoldingsResponseBody response = client.holdings.listHoldings(userGuid, page, recordsPerPage);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling HoldingsApi#listHoldings");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**HoldingsResponseBody**](HoldingsResponseBody.md)

<a name="listHoldingsByAccount"></a>
# **listHoldingsByAccount**
> HoldingsResponseBody listHoldingsByAccount(accountGuid, userGuid, page, recordsPerPage)

List holdings by account

Use this endpoint to read all holdings associated with a specific account.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class HoldingsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String accountGuid = "ACT-123"; // String | The unique identifier for an `account`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        Integer page = 1; // Integer | Specify current page.
        Integer recordsPerPage = 12; // Integer | Specify records per page.

        try {
            HoldingsResponseBody response = client.holdings.listHoldingsByAccount(accountGuid, userGuid, page, recordsPerPage);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling HoldingsApi#listHoldingsByAccount");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGuid** | **String**| The unique identifier for an &#x60;account&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**HoldingsResponseBody**](HoldingsResponseBody.md)

<a name="listHoldingsByMember"></a>
# **listHoldingsByMember**
> HoldingsResponseBody listHoldingsByMember(memberGuid, userGuid, page, recordsPerPage)

List holdings by member

Use this endpoint to read all holdings associated with a specific member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class HoldingsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        Integer page = 1; // Integer | Specify current page.
        Integer recordsPerPage = 12; // Integer | Specify records per page.

        try {
            HoldingsResponseBody response = client.holdings.listHoldingsByMember(memberGuid, userGuid, page, recordsPerPage);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling HoldingsApi#listHoldingsByMember");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**HoldingsResponseBody**](HoldingsResponseBody.md)

<a name="readHolding"></a>
# **readHolding**
> HoldingResponseBody readHolding(holdingGuid, userGuid)

Read holding

Use this endpoint to read the attributes of a specific holding.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class HoldingsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String holdingGuid = "HOL-123"; // String | The unique identifier for a `holding`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            HoldingResponseBody response = client.holdings.readHolding(holdingGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling HoldingsApi#readHolding");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holdingGuid** | **String**| The unique identifier for a &#x60;holding&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**HoldingResponseBody**](HoldingResponseBody.md)

