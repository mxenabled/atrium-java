# ConnectWidgetApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectWidget**](ConnectWidgetApi.md#getConnectWidget) | **POST** /users/{user_guid}/connect_widget_url | Embedding in a website


<a name="getConnectWidget"></a>
# **getConnectWidget**
> ConnectWidgetResponseBody getConnectWidget(userGuid, body)

Embedding in a website

This endpoint will return a URL for an embeddable version of MX Connect.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class ConnectWidgetApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        ConnectWidgetRequestBody body = new ConnectWidgetRequestBody(); // ConnectWidgetRequestBody | Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials)

        try {
            ConnectWidgetResponseBody response = client.connectWidget.getConnectWidget(userGuid, body);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectWidgetApi#getConnectWidget");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |
 **body** | [**ConnectWidgetRequestBody**](ConnectWidgetRequestBody.md)| Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) |

### Return type

[**ConnectWidgetResponseBody**](ConnectWidgetResponseBody.md)

