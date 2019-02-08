# StatementsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchStatements**](StatementsApi.md#fetchStatements) | **POST** /users/{user_guid}/members/{member_guid}/fetch_statements | Fetch statements
[**listMemberStatements**](StatementsApi.md#listMemberStatements) | **GET** /users/{user_guid}/members/{member_guid}/statements | List member statements


<a name="fetchStatements"></a>
# **fetchStatements**
> MemberResponseBody fetchStatements(memberGuid, userGuid)

Fetch statements

The fetch statements endpoint begins fetching statements for a member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class StatementsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            MemberResponseBody response = client.statements.fetchStatements(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatementsApi#fetchStatements");
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

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

<a name="listMemberStatements"></a>
# **listMemberStatements**
> StatementsResponseBody listMemberStatements(memberGuid, userGuid, page, recordsPerPage)

List member statements

Certain institutions in Atrium allow developers to access account statements associated with a particular &#x60;member&#x60;. Use this endpoint to get an array of available statements.  Before this endpoint can be used, &#x60;fetch_statements&#x60; should be performed on the relevant &#x60;member&#x60;. 

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class StatementsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        Integer page = 1; // Integer | Specify current page.
        Integer recordsPerPage = 12; // Integer | Specify records per page.

        try {
            StatementsResponseBody response = client.statements.listMemberStatements(memberGuid, userGuid, page, recordsPerPage);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatementsApi#listMemberStatements");
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

[**StatementsResponseBody**](StatementsResponseBody.md)

