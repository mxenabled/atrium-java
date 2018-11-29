# TransactionsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**cleanseAndCategorizeTransactions**](TransactionsApi.md#cleanseAndCategorizeTransactions) | **POST** /cleanse_and_categorize | Categorize transactions
[**listUserTransactions**](TransactionsApi.md#listUserTransactions) | **GET** /users/{user_guid}/transactions | List transactions for a user
[**readTransaction**](TransactionsApi.md#readTransaction) | **GET** /users/{user_guid}/transactions/{transaction_guid} | Read a transaction


<a name="cleanseAndCategorizeTransactions"></a>
# **cleanseAndCategorizeTransactions**
> TransactionsCleanseAndCategorize cleanseAndCategorizeTransactions(body)

Categorize transactions

Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.TransactionsApi;

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

TransactionsApi apiInstance = new TransactionsApi();
TransactionsCleanseAndCategorizeRequestBody body = new TransactionsCleanseAndCategorizeRequestBody(); // TransactionsCleanseAndCategorizeRequestBody | User object to be created with optional parameters (amount, type) amd required parameters (description, identifier)
try {
    TransactionsCleanseAndCategorize result = apiInstance.cleanseAndCategorizeTransactions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#cleanseAndCategorizeTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionsCleanseAndCategorizeRequestBody**](TransactionsCleanseAndCategorizeRequestBody.md)| User object to be created with optional parameters (amount, type) amd required parameters (description, identifier) |

### Return type

[**TransactionsCleanseAndCategorize**](TransactionsCleanseAndCategorize.md)

<a name="listUserTransactions"></a>
# **listUserTransactions**
> Transactions listUserTransactions(userGuid, page, fromDate, recordsPerPage, toDate)

List transactions for a user

Use this endpoint to get all transactions that belong to a specific user, across all the user&#39;s members and accounts.&lt;br&gt; This endpoint accepts optional query parameters, from_date and to_date, which filter transactions according to the date they were posted. If no values are given, from_date will default to 90 days prior to the request, and to_date will default to 5 days from the time of the request. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.TransactionsApi;

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

TransactionsApi apiInstance = new TransactionsApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
Integer page = 12; // Integer | Specify current page.
String fromDate = "fromDate_example"; // String | Filter transactions from this date.
Integer recordsPerPage = 12; // Integer | Specify records per page.
String toDate = "toDate_example"; // String | Filter transactions to this date.
try {
    Transactions result = apiInstance.listUserTransactions(userGuid, page, fromDate, recordsPerPage, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#listUserTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **page** | **Integer**| Specify current page. | [optional]
 **fromDate** | **String**| Filter transactions from this date. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]
 **toDate** | **String**| Filter transactions to this date. | [optional]

### Return type

[**Transactions**](Transactions.md)

<a name="readTransaction"></a>
# **readTransaction**
> Transaction readTransaction(transactionGuid, userGuid)

Read a transaction

This endpoint allows you to view information about a specific transaction that belongs to a user.&lt;br&gt;

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.TransactionsApi;

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

TransactionsApi apiInstance = new TransactionsApi();
String transactionGuid = "transactionGuid_example"; // String | The unique identifier for a `transaction`.
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
try {
    Transaction result = apiInstance.readTransaction(transactionGuid, userGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#readTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionGuid** | **String**| The unique identifier for a &#x60;transaction&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**Transaction**](Transaction.md)

