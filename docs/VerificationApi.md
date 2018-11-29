# VerificationApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAccountNumbers**](VerificationApi.md#listAccountNumbers) | **GET** /users/{user_guid}/members/{member_guid}/account_numbers | Read account numbers
[**listAccountNumbersByAccount**](VerificationApi.md#listAccountNumbersByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/account_numbers | Read account numbers by account GUID
[**verifyMember**](VerificationApi.md#verifyMember) | **POST** /users/{user_guid}/members/{member_guid}/verify | Verify


<a name="listAccountNumbers"></a>
# **listAccountNumbers**
> AccountNumbers listAccountNumbers(memberGuid, userGuid)

Read account numbers

Use this endpoint to check whether account and routing numbers are available for accounts associated with a particular member. It returns the account_numbers object, which contains account and routing number data for each account associated with the member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: clientID
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//clientID.setApiKeyPrefix("Token");

VerificationApi apiInstance = new VerificationApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    AccountNumbers result = apiInstance.listAccountNumbers(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#listAccountNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**AccountNumbers**](AccountNumbers.md)

<a name="listAccountNumbersByAccount"></a>
# **listAccountNumbersByAccount**
> AccountNumbers listAccountNumbersByAccount(accountGuid, userGuid)

Read account numbers by account GUID

Use this endpoint to check whether account and routing numbers are available for a specific account. It returns the account_numbers object, which contains account and routing number data.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: clientID
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//clientID.setApiKeyPrefix("Token");

VerificationApi apiInstance = new VerificationApi();
String accountGuid = "accountGuid_example"; // String | The unique identifier for an `account`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    AccountNumbers result = apiInstance.listAccountNumbersByAccount(accountGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#listAccountNumbersByAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGuid** | **String**| The unique identifier for an &#x60;account&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**AccountNumbers**](AccountNumbers.md)

<a name="verifyMember"></a>
# **verifyMember**
> Member verifyMember(memberGuid, userGuid)

Verify

The verify endpoint begins a verification process for a member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure API key authorization: clientID
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//clientID.setApiKeyPrefix("Token");

VerificationApi apiInstance = new VerificationApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    Member result = apiInstance.verifyMember(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**Member**](Member.md)

