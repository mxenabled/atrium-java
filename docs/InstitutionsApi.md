# InstitutionsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listInstitutions**](InstitutionsApi.md#listInstitutions) | **GET** /institutions | List institutions
[**readInstitution**](InstitutionsApi.md#readInstitution) | **GET** /institutions/{institution_code} | Read institution
[**readInstitutionCredentials**](InstitutionsApi.md#readInstitutionCredentials) | **GET** /institutions/{institution_code}/credentials | Read institution credentials


<a name="listInstitutions"></a>
# **listInstitutions**
> Institutions listInstitutions(name, page, recordsPerPage)

List institutions

This endpoint allows you to see what institutions are available for connection. Information returned will include the institution_code assigned to a particular institution, URLs for the financial institution&#39;s logo, and the URL for its website.&lt;br&gt; This endpoint takes an optional query string, name&#x3D;{string}. This will list only institutions in which the appended string appears. 

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

InstitutionsApi apiInstance = new InstitutionsApi();
String name = "name_example"; // String | This will list only institutions in which the appended string appears.
Integer page = 12; // Integer | Specify current page.
Integer recordsPerPage = 12; // Integer | Specify records per page.
try {
    Institutions result = apiInstance.listInstitutions(name, page, recordsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#listInstitutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| This will list only institutions in which the appended string appears. | [optional]
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]

### Return type

[**Institutions**](Institutions.md)

<a name="readInstitution"></a>
# **readInstitution**
> Institution readInstitution(institutionCode)

Read institution

This endpoint allows you to see information for a specific institution.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

InstitutionsApi apiInstance = new InstitutionsApi();
String institutionCode = "institutionCode_example"; // String | The institution_code of the institution.
try {
    Institution result = apiInstance.readInstitution(institutionCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#readInstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionCode** | **String**| The institution_code of the institution. |

### Return type

[**Institution**](Institution.md)

<a name="readInstitutionCredentials"></a>
# **readInstitutionCredentials**
> Credentials readInstitutionCredentials(institutionCode)

Read institution credentials

Use this endpoint to see which credentials will be needed to create a member for a specific institution.

### Example
```java
import com.mx.atrium.ApiClient;
import com.mx.atrium.ApiException;
import com.mx.atrium.Configuration;
import com.mx.atrium.auth.*;
import com.mx.atrium.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API Key authorization
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR_API_KEY");

// Configure Client ID authorization
ApiKeyAuth clientID = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
clientID.setApiKey("YOUR_CLIENT_ID");

InstitutionsApi apiInstance = new InstitutionsApi();
String institutionCode = "institutionCode_example"; // String | The institution_code of the institution.
try {
    Credentials result = apiInstance.readInstitutionCredentials(institutionCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#readInstitutionCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionCode** | **String**| The institution_code of the institution. |

### Return type

[**Credentials**](Credentials.md)

