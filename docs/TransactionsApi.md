# TransactionsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**cleanseAndCategorizeTransactions**](TransactionsApi.md#cleanseAndCategorizeTransactions) | **POST** /cleanse_and_categorize | Categorize transactions
[**listUserTransactions**](TransactionsApi.md#listUserTransactions) | **GET** /users/{user_guid}/transactions | List transactions for a user
[**readTransaction**](TransactionsApi.md#readTransaction) | **GET** /users/{user_guid}/transactions/{transaction_guid} | Read a transaction


<a name="cleanseAndCategorizeTransactions"></a>
# **cleanseAndCategorizeTransactions**
> TransactionsCleanseAndCategorizeResponseBody cleanseAndCategorizeTransactions(body)

Categorize transactions

Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class TransactionsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        TransactionsCleanseAndCategorizeRequestBody body = new TransactionsCleanseAndCategorizeRequestBody(); // TransactionsCleanseAndCategorizeRequestBody | User object to be created with optional parameters (amount, type) amd required parameters (description, identifier)

        try {
            TransactionsCleanseAndCategorizeResponseBody response = client.transactions.cleanseAndCategorizeTransactions(body);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#cleanseAndCategorizeTransactions");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionsCleanseAndCategorizeRequestBody**](TransactionsCleanseAndCategorizeRequestBody.md)| User object to be created with optional parameters (amount, type) amd required parameters (description, identifier) |

### Return type

[**TransactionsCleanseAndCategorizeResponseBody**](TransactionsCleanseAndCategorizeResponseBody.md)

<a name="listUserTransactions"></a>
# **listUserTransactions**
> TransactionsResponseBody listUserTransactions(userGuid, page, fromDate, recordsPerPage, toDate)

List transactions for a user

Use this endpoint to get all transactions that belong to a specific user, across all the user&#39;s members and accounts.&lt;br&gt; This endpoint accepts optional query parameters, from_date and to_date, which filter transactions according to the date they were posted. If no values are given, from_date will default to 90 days prior to the request, and to_date will default to 5 days from the time of the request. 

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class TransactionsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        Integer page = 1; // Integer | Specify current page.
        String fromDate = "2016-09-20"; // String | Filter transactions from this date.
        Integer recordsPerPage = 12; // Integer | Specify records per page.
        String toDate = "2016-10-20"; // String | Filter transactions to this date.

        try {
            TransactionsResponseBody response = client.transactions.listUserTransactions(userGuid, page, fromDate, recordsPerPage, toDate);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#listUserTransactions");
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
 **fromDate** | **String**| Filter transactions from this date. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]
 **toDate** | **String**| Filter transactions to this date. | [optional]

### Return type

[**TransactionsResponseBody**](TransactionsResponseBody.md)

<a name="readTransaction"></a>
# **readTransaction**
> TransactionResponseBody readTransaction(transactionGuid, userGuid)

Read a transaction

This endpoint allows you to view information about a specific transaction that belongs to a user.&lt;br&gt;

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class TransactionsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String transactionGuid = "TRN-123"; // String | The unique identifier for a `transaction`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            TransactionResponseBody response = client.transactions.readTransaction(transactionGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#readTransaction");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionGuid** | **String**| The unique identifier for a &#x60;transaction&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**TransactionResponseBody**](TransactionResponseBody.md)

