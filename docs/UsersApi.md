# UsersApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /users | Create user
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{user_guid} | Delete user
[**listUsers**](UsersApi.md#listUsers) | **GET** /users | List users
[**readUser**](UsersApi.md#readUser) | **GET** /users/{user_guid} | Read user
[**updateUser**](UsersApi.md#updateUser) | **PUT** /users/{user_guid} | Update user


<a name="createUser"></a>
# **createUser**
> UserResponseBody createUser(body)

Create user

Call this endpoint to create a new user. Atrium will respond with the newly-created user object if successful. This endpoint accepts several parameters: identifier, metadata, and is_disabled.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

UsersApi apiInstance = new UsersApi();
UserCreateRequestBody body = new UserCreateRequestBody(); // UserCreateRequestBody | User object to be created with optional parameters (identifier, is_disabled, metadata)
try {
    UserResponseBody result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserCreateRequestBody**](UserCreateRequestBody.md)| User object to be created with optional parameters (identifier, is_disabled, metadata) |

### Return type

[**UserResponseBody**](UserResponseBody.md)

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userGuid)

Delete user

Calling this endpoint will permanently delete a user from Atrium. If successful, the API will respond with Status: 204 No Content. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

UsersApi apiInstance = new UsersApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    apiInstance.deleteUser(userGuid);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

null (empty response body)

<a name="listUsers"></a>
# **listUsers**
> UsersResponseBody listUsers(page, recordsPerPage)

List users

Use this endpoint to list every user you&#39;ve created in Atrium.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

UsersApi apiInstance = new UsersApi();
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    UsersResponseBody result = apiInstance.listUsers(page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**UsersResponseBody**](UsersResponseBody.md)

<a name="readUser"></a>
# **readUser**
> UserResponseBody readUser(userGuid)

Read user

Use this endpoint to read the attributes of a specific user.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

UsersApi apiInstance = new UsersApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    UserResponseBody result = apiInstance.readUser(userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#readUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**UserResponseBody**](UserResponseBody.md)

<a name="updateUser"></a>
# **updateUser**
> UserResponseBody updateUser(userGuid, body)

Update user

Use this endpoint to update the attributes of a specific user. Atrium will respond with the updated user object.&lt;br&gt; Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user&#39;s data until they are no longer disabled. Users who are disabled for the entirety of an Atrium billing period will not be factored into that month&#39;s bill.&lt;br&gt; To disable a user, update it and set the is_disabled parameter to true. Set it to false to re-enable the user. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

UsersApi apiInstance = new UsersApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
UserUpdateRequestBody body = new UserUpdateRequestBody(); // UserUpdateRequestBody | User object to be updated with optional parameters (identifier, is_disabled, metadata)
try {
    UserResponseBody result = apiInstance.updateUser(userGuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **body** | [**UserUpdateRequestBody**](UserUpdateRequestBody.md)| User object to be updated with optional parameters (identifier, is_disabled, metadata) | [optional]

### Return type

[**UserResponseBody**](UserResponseBody.md)

