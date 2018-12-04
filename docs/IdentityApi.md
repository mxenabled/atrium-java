# IdentityApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**identifyMember**](IdentityApi.md#identifyMember) | **POST** /users/{user_guid}/members/{member_guid}/identify | Identify
[**listAccountOwners**](IdentityApi.md#listAccountOwners) | **GET** /users/{user_guid}/members/{member_guid}/account_owners | List member account owners


<a name="identifyMember"></a>
# **identifyMember**
> Member identifyMember(memberGuid, userGuid)

Identify

The identify endpoint begins an identification process for an already-existing member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

IdentityApi apiInstance = new IdentityApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    Member result = apiInstance.identifyMember(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identifyMember");
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

<a name="listAccountOwners"></a>
# **listAccountOwners**
> AccountOwners listAccountOwners(memberGuid, userGuid)

List member account owners

This endpoint returns an array with information about every account associated with a particular member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

IdentityApi apiInstance = new IdentityApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    AccountOwners result = apiInstance.listAccountOwners(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#listAccountOwners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**AccountOwners**](AccountOwners.md)

