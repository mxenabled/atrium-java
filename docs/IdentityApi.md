# IdentityApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**identifyMember**](IdentityApi.md#identifyMember) | **POST** /users/{user_guid}/members/{member_guid}/identify | Identify
[**listAccountOwners**](IdentityApi.md#listAccountOwners) | **GET** /users/{user_guid}/members/{member_guid}/account_owners | List member account owners


<a name="identifyMember"></a>
# **identifyMember**
> MemberResponseBody identifyMember(memberGuid, userGuid)

Identify

The identify endpoint begins an identification process for an already-existing member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class IdentityApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            MemberResponseBody response = client.identity.identifyMember(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityApi#identifyMember");
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

<a name="listAccountOwners"></a>
# **listAccountOwners**
> AccountOwnersResponseBody listAccountOwners(memberGuid, userGuid)

List member account owners

This endpoint returns an array with information about every account associated with a particular member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class IdentityApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            AccountOwnersResponseBody response = client.identity.listAccountOwners(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityApi#listAccountOwners");
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

[**AccountOwnersResponseBody**](AccountOwnersResponseBody.md)

