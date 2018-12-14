# MembersApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateMember**](MembersApi.md#aggregateMember) | **POST** /users/{user_guid}/members/{member_guid}/aggregate | Aggregate member
[**createMember**](MembersApi.md#createMember) | **POST** /users/{user_guid}/members | Create member
[**deleteMember**](MembersApi.md#deleteMember) | **DELETE** /users/{user_guid}/members/{member_guid} | Delete member
[**listMemberAccounts**](MembersApi.md#listMemberAccounts) | **GET** /users/{user_guid}/members/{member_guid}/accounts | List member accounts
[**listMemberCredentials**](MembersApi.md#listMemberCredentials) | **GET** /users/{user_guid}/members/{member_guid}/credentials | List member credentials
[**listMemberMFAChallenges**](MembersApi.md#listMemberMFAChallenges) | **GET** /users/{user_guid}/members/{member_guid}/challenges | List member MFA challenges
[**listMemberTransactions**](MembersApi.md#listMemberTransactions) | **GET** /users/{user_guid}/members/{member_guid}/transactions | List member transactions
[**listMembers**](MembersApi.md#listMembers) | **GET** /users/{user_guid}/members | List members
[**readMember**](MembersApi.md#readMember) | **GET** /users/{user_guid}/members/{member_guid} | Read member
[**readMemberStatus**](MembersApi.md#readMemberStatus) | **GET** /users/{user_guid}/members/{member_guid}/status | Read member connection status
[**resumeMember**](MembersApi.md#resumeMember) | **PUT** /users/{user_guid}/members/{member_guid}/resume | Resume aggregation from MFA
[**updateMember**](MembersApi.md#updateMember) | **PUT** /users/{user_guid}/members/{member_guid} | Update member


<a name="aggregateMember"></a>
# **aggregateMember**
> MemberResponseBody aggregateMember(memberGuid, userGuid)

Aggregate member

Calling this endpoint initiates an aggregation event for the member. This brings in the latest account and transaction data from the connected institution. If this data has recently been updated, MX may not initiate an aggregation event. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    MemberResponseBody result = apiInstance.aggregateMember(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#aggregateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

<a name="createMember"></a>
# **createMember**
> MemberResponseBody createMember(userGuid, body)

Create member

This endpoint allows you to create a new member. Members are created with the required parameters credentials and institution_code, and the optional parameters identifier and metadata.&lt;br&gt; When creating a member, you&#39;ll need to include the correct type of credential required by the financial institution and provided by the user. You can find out which credential type is required with the /institutions/{institution_code}/credentials endpoint.&lt;br&gt; If successful, Atrium will respond with the newly-created member object.&lt;br&gt; Once you successfully create a member, MX will immediately validate the provided credentials and attempt to aggregate data for accounts and transactions. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
MemberCreateRequestBody body = new MemberCreateRequestBody(); // MemberCreateRequestBody | Member object to be created with optional parameters (identifier and metadata) and required parameters (credentials and institution_code)
try {
    MemberResponseBody result = apiInstance.createMember(userGuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#createMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **body** | [**MemberCreateRequestBody**](MemberCreateRequestBody.md)| Member object to be created with optional parameters (identifier and metadata) and required parameters (credentials and institution_code) |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

<a name="deleteMember"></a>
# **deleteMember**
> deleteMember(memberGuid, userGuid)

Delete member

Accessing this endpoint will permanently delete a member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    apiInstance.deleteMember(memberGuid, userGuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#deleteMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

null (empty response body)

<a name="listMemberAccounts"></a>
# **listMemberAccounts**
> AccountsResponseBody listMemberAccounts(memberGuid, userGuid, page, recordsPerPage)

List member accounts

This endpoint returns an array with information about every account associated with a particular member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    AccountsResponseBody result = apiInstance.listMemberAccounts(memberGuid, userGuid, page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#listMemberAccounts");
    e.printStackTrace();
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

[**AccountsResponseBody**](AccountsResponseBody.md)

<a name="listMemberCredentials"></a>
# **listMemberCredentials**
> CredentialsResponseBody listMemberCredentials(memberGuid, userGuid)

List member credentials

This endpoint returns an array which contains information on every non-MFA credential associated with a specific member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    CredentialsResponseBody result = apiInstance.listMemberCredentials(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#listMemberCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**CredentialsResponseBody**](CredentialsResponseBody.md)

<a name="listMemberMFAChallenges"></a>
# **listMemberMFAChallenges**
> ChallengesResponseBody listMemberMFAChallenges(memberGuid, userGuid)

List member MFA challenges

Use this endpoint for information on what multi-factor authentication challenges need to be answered in order to aggregate a member.&lt;br&gt; If the aggregation is not challenged, i.e., the member does not have a connection status of CHALLENGED, then code 204 No Content will be returned.&lt;br&gt; If the aggregation has been challenged, i.e., the member does have a connection status of CHALLENGED, then code 200 OK will be returned — along with the corresponding credentials. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    ChallengesResponseBody result = apiInstance.listMemberMFAChallenges(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#listMemberMFAChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**ChallengesResponseBody**](ChallengesResponseBody.md)

<a name="listMemberTransactions"></a>
# **listMemberTransactions**
> TransactionsResponseBody listMemberTransactions(memberGuid, userGuid, fromDate, toDate, page, recordsPerPage)

List member transactions

Use this endpoint to get all transactions from all accounts associated with a specific member.&lt;br&gt; This endpoint accepts optional URL query parameters — from_date and to_date — which are used to filter transactions according to the date they were posted. If no values are given for the query parameters, from_date will default to 90 days prior to the request and to_date will default to 5 days from the time of the request. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
String fromDate = "fromDate_example"; // String | Filter transactions from this date.
String toDate = "toDate_example"; // String | Filter transactions to this date.
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    TransactionsResponseBody result = apiInstance.listMemberTransactions(memberGuid, userGuid, fromDate, toDate, page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#listMemberTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **fromDate** | **String**| Filter transactions from this date. | [optional]
 **toDate** | **String**| Filter transactions to this date. | [optional]
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**TransactionsResponseBody**](TransactionsResponseBody.md)

<a name="listMembers"></a>
# **listMembers**
> MembersResponseBody listMembers(userGuid, page, recordsPerPage)

List members

This endpoint returns an array which contains information on every member associated with a specific user.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    MembersResponseBody result = apiInstance.listMembers(userGuid, page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#listMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**MembersResponseBody**](MembersResponseBody.md)

<a name="readMember"></a>
# **readMember**
> MemberResponseBody readMember(memberGuid, userGuid)

Read member

Use this endpoint to read the attributes of a specific member.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    MemberResponseBody result = apiInstance.readMember(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#readMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

<a name="readMemberStatus"></a>
# **readMemberStatus**
> MemberConnectionStatusResponseBody readMemberStatus(memberGuid, userGuid)

Read member connection status

This endpoint provides the status of the member&#39;s most recent aggregation event. This is an important step in the aggregation process, and the results returned by this endpoint should determine what you do next in order to successfully aggregate a member.&lt;br&gt; MX has introduced new, more detailed information on the current status of a member&#39;s connection to a financial institution and the state of its aggregation: the connection_status field. These are intended to replace and expand upon the information provided in the status field, which will soon be deprecated; support for the status field remains for the time being. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    MemberConnectionStatusResponseBody result = apiInstance.readMemberStatus(memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#readMemberStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**MemberConnectionStatusResponseBody**](MemberConnectionStatusResponseBody.md)

<a name="resumeMember"></a>
# **resumeMember**
> MemberResponseBody resumeMember(memberGuid, userGuid, body)

Resume aggregation from MFA

This endpoint answers the challenges needed when a member has been challenged by multi-factor authentication.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
MemberResumeRequestBody body = new MemberResumeRequestBody(); // MemberResumeRequestBody | Member object with MFA challenge answers
try {
    MemberResponseBody result = apiInstance.resumeMember(memberGuid, userGuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#resumeMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **body** | [**MemberResumeRequestBody**](MemberResumeRequestBody.md)| Member object with MFA challenge answers |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

<a name="updateMember"></a>
# **updateMember**
> MemberResponseBody updateMember(memberGuid, userGuid, body)

Update member

Use this endpoint to update a member&#39;s attributes. Only the credentials, identifier, and metadata parameters can be updated. To get a list of the required credentials for the member, use the list member credentials endpoint. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.MembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

MembersApi apiInstance = new MembersApi();
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
MemberUpdateRequestBody body = new MemberUpdateRequestBody(); // MemberUpdateRequestBody | Member object to be updated with optional parameters (credentials, identifier, metadata)
try {
    MemberResponseBody result = apiInstance.updateMember(memberGuid, userGuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembersApi#updateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **body** | [**MemberUpdateRequestBody**](MemberUpdateRequestBody.md)| Member object to be updated with optional parameters (credentials, identifier, metadata) | [optional]

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

