# AccountsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAccountTransactions**](AccountsApi.md#listAccountTransactions) | **GET** /users/{user_guid}/accounts/{account_guid}/transactions | List account transactions
[**listUserAccounts**](AccountsApi.md#listUserAccounts) | **GET** /users/{user_guid}/accounts | List accounts for a user
[**readAccount**](AccountsApi.md#readAccount) | **GET** /users/{user_guid}/accounts/{account_guid} | Read an account
[**readAccountByMemberGUID**](AccountsApi.md#readAccountByMemberGUID) | **GET** /users/{user_guid}/members/{member_guid}/accounts/{account_guid} | Read an account


<a name="listAccountTransactions"></a>
# **listAccountTransactions**
> Transactions listAccountTransactions(accountGuid, userGuid, fromDate, toDate, page, recordsPerPage)

List account transactions

This endpoint allows you to see every transaction that belongs to a specific account. The default from_date is 90 days prior to the request, and the default to_date is 5 days from the time of the request.&lt;br&gt; The from_date and to_date parameters can optionally be appended to the request. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

AccountsApi apiInstance = new AccountsApi();
String accountGuid = "accountGuid_example"; // String | The unique identifier for an `account`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
String fromDate = "fromDate_example"; // String | Filter transactions from this date.
String toDate = "toDate_example"; // String | Filter transactions to this date.
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    Transactions result = apiInstance.listAccountTransactions(accountGuid, userGuid, fromDate, toDate, page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGuid** | **String**| The unique identifier for an &#x60;account&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **fromDate** | **String**| Filter transactions from this date. | [optional]
 **toDate** | **String**| Filter transactions to this date. | [optional]
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**Transactions**](Transactions.md)

<a name="listUserAccounts"></a>
# **listUserAccounts**
> Accounts listUserAccounts(userGuid, page, recordsPerPage)

List accounts for a user

Use this endpoint to view information about every account that belongs to a user. You&#39;ll need the user&#39;s GUID to access this list. The information will include the account type — e.g., CHECKING, MONEY_MARKET, or PROPERTY — the account balance, the date the account was started, etc.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

AccountsApi apiInstance = new AccountsApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    Accounts result = apiInstance.listUserAccounts(userGuid, page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listUserAccounts");
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

[**Accounts**](Accounts.md)

<a name="readAccount"></a>
# **readAccount**
> Account readAccount(accountGuid, userGuid)

Read an account

Reading an account allows you to get information about a specific account that belongs to a user. That includes the account type — e.g., CHECKING, MONEY_MARKET, or PROPERTY — the balance, the date the account was started, and much more.&lt;br&gt; There are two endpoints for reading an account. Both will return the same information.&lt;br&gt; It&#39;s important to remember that balance and available_balance will normally be positive numbers — for all account types. But this should be interpreted differently for debt accounts and asset accounts.&lt;br&gt; An asset account, e.g., CHECKING, SAVINGS, or INVESTMENT, will have a positive balance unless it is in an overdraft condition, in which case the balance will be negative.&lt;br&gt; On the other hand, a debt account, e.g., CREDIT CARD, LOAN, MORTGAGE, would have a positivebalance when the user owes money on the account. It would have a negative balance if the account has been overpaid. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

AccountsApi apiInstance = new AccountsApi();
String accountGuid = "accountGuid_example"; // String | The unique identifier for an `account`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    Account result = apiInstance.readAccount(accountGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#readAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGuid** | **String**| The unique identifier for an &#x60;account&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**Account**](Account.md)

<a name="readAccountByMemberGUID"></a>
# **readAccountByMemberGUID**
> Account readAccountByMemberGUID(accountGuid, memberGuid, userGuid)

Read an account

Reading an account allows you to get information about a specific account that belongs to a user. That includes the account type — e.g., CHECKING, MONEY_MARKET, or PROPERTY — the balance, the date the account was started, and much more.&lt;br&gt; There are two endpoints for reading an account. Both will return the same information.&lt;br&gt; It&#39;s important to remember that balance and available_balance will normally be positive numbers — for all account types. But this should be interpreted differently for debt accounts and asset accounts.&lt;br&gt; An asset account, e.g., CHECKING, SAVINGS, or INVESTMENT, will have a positive balance unless it is in an overdraft condition, in which case the balance will be negative.&lt;br&gt; On the other hand, a debt account, e.g., CREDIT CARD, LOAN, MORTGAGE, would have a positivebalance when the user owes money on the account. It would have a negative balance if the account has been overpaid. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

AccountsApi apiInstance = new AccountsApi();
String accountGuid = "accountGuid_example"; // String | The unique identifier for an `account`.
String memberGuid = "memberGuid_example"; // String | The unique identifier for a `member`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    Account result = apiInstance.readAccountByMemberGUID(accountGuid, memberGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#readAccountByMemberGUID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGuid** | **String**| The unique identifier for an &#x60;account&#x60;. |
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**Account**](Account.md)

