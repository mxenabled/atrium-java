# ConnectWidgetApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectWidget**](ConnectWidgetApi.md#getConnectWidget) | **POST** /users/{user_guid}/connect_widget_url | Embedding in a website


<a name="getConnectWidget"></a>
# **getConnectWidget**
> ConnectWidget getConnectWidget(userGuid, body)

Embedding in a website

This endpoint will return a URL for an embeddable version of MX Connect.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.ConnectWidgetApi;

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

ConnectWidgetApi apiInstance = new ConnectWidgetApi();
String userGuid = "userGuid_example"; // String | The unique identifier for a `user`.
ConnectWidgetRequestBody body = new ConnectWidgetRequestBody(); // ConnectWidgetRequestBody | Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials)
try {
    ConnectWidget result = apiInstance.getConnectWidget(userGuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectWidgetApi#getConnectWidget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **body** | [**ConnectWidgetRequestBody**](ConnectWidgetRequestBody.md)| Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) |

### Return type

[**ConnectWidget**](ConnectWidget.md)

