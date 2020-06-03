# VerificationApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAccountNumbers**](VerificationApi.md#listAccountNumbers) | **GET** /users/{user_guid}/members/{member_guid}/account_numbers | Read account numbers
[**listAccountNumbersByAccount**](VerificationApi.md#listAccountNumbersByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/account_numbers | Read account numbers by account GUID
[**verifyMember**](VerificationApi.md#verifyMember) | **POST** /users/{user_guid}/members/{member_guid}/verify | Verify


<a name="listAccountNumbers"></a>
# **listAccountNumbers**
> AccountNumbersResponseBody listAccountNumbers(memberGuid, userGuid)

Read account numbers

Use this endpoint to check whether account and routing numbers are available for accounts associated with a particular member. It returns the account_numbers object, which contains account and routing number data for each account associated with the member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class VerificationApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            AccountNumbersResponseBody response = client.verification.listAccountNumbers(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationApi#listAccountNumbers");
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

[**AccountNumbersResponseBody**](AccountNumbersResponseBody.md)

<a name="listAccountNumbersByAccount"></a>
# **listAccountNumbersByAccount**
> AccountNumbersResponseBody listAccountNumbersByAccount(accountGuid, userGuid)

Read account numbers by account GUID

Use this endpoint to check whether account and routing numbers are available for a specific account. It returns the account_numbers object, which contains account and routing number data.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class VerificationApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String accountGuid = "ACT-123"; // String | The unique identifier for an `account`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            AccountNumbersResponseBody response = client.verification.listAccountNumbersByAccount(accountGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationApi#listAccountNumbersByAccount");
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

### Return type

[**AccountNumbersResponseBody**](AccountNumbersResponseBody.md)

<a name="verifyMember"></a>
# **verifyMember**
> MemberResponseBody verifyMember(memberGuid, userGuid)

Verify

The verify endpoint begins a verification process for a member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class VerificationApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            MemberResponseBody response = client.verification.verifyMember(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationApi#verifyMember");
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

