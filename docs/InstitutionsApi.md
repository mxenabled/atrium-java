# InstitutionsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**listInstitutions**](InstitutionsApi.md#listInstitutions) | **GET** /institutions | List institutions
[**readInstitution**](InstitutionsApi.md#readInstitution) | **GET** /institutions/{institution_code} | Read institution
[**readInstitutionCredentials**](InstitutionsApi.md#readInstitutionCredentials) | **GET** /institutions/{institution_code}/credentials | Read institution credentials


<a name="listInstitutions"></a>
# **listInstitutions**
> InstitutionsResponseBody listInstitutions(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory)

List institutions

This endpoint allows you to see what institutions are available for connection. Information returned will include the institution_code assigned to a particular institution, URLs for the financial institution&#39;s logo, and the URL for its website.&lt;br&gt; This endpoint takes an optional query string, name&#x3D;{string}. This will list only institutions in which the appended string appears. 

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class InstitutionsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String name = name_example; // String | This will list only institutions in which the appended string appears.
        Integer page = 1; // Integer | Specify current page.
        Integer recordsPerPage = 12; // Integer | Specify records per page.
        Boolean supportsAccountIdentification = true; // Boolean | Filter only institutions which support account identification.
        Boolean supportsAccountStatement = true; // Boolean | Filter only institutions which support account statements.
        Boolean supportsAccountVerification = true; // Boolean | Filter only institutions which support account verification.
        Boolean supportsTransactionHistory = true; // Boolean | Filter only institutions which support extended transaction history.

        try {
            InstitutionsResponseBody response = client.institutions.listInstitutions(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#listInstitutions");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| This will list only institutions in which the appended string appears. | [optional]
 **page** | **Integer**| Specify current page. | [optional]
 **recordsPerPage** | **Integer**| Specify records per page. | [optional]
 **supportsAccountIdentification** | **Boolean**| Filter only institutions which support account identification. | [optional]
 **supportsAccountStatement** | **Boolean**| Filter only institutions which support account statements. | [optional]
 **supportsAccountVerification** | **Boolean**| Filter only institutions which support account verification. | [optional]
 **supportsTransactionHistory** | **Boolean**| Filter only institutions which support extended transaction history. | [optional]

### Return type

[**InstitutionsResponseBody**](InstitutionsResponseBody.md)

<a name="readInstitution"></a>
# **readInstitution**
> InstitutionResponseBody readInstitution(institutionCode)

Read institution

This endpoint allows you to see information for a specific institution.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class InstitutionsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String institutionCode = "example_institution_code"; // String | The institution_code of the institution.

        try {
            InstitutionResponseBody response = client.institutions.readInstitution(institutionCode);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#readInstitution");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionCode** | **String**| The institution_code of the institution. |

### Return type

[**InstitutionResponseBody**](InstitutionResponseBody.md)

<a name="readInstitutionCredentials"></a>
# **readInstitutionCredentials**
> CredentialsResponseBody readInstitutionCredentials(institutionCode)

Read institution credentials

Use this endpoint to see which credentials will be needed to create a member for a specific institution.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class InstitutionsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID");

        String institutionCode = "example_institution_code"; // String | The institution_code of the institution.

        try {
            CredentialsResponseBody response = client.institutions.readInstitutionCredentials(institutionCode);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#readInstitutionCredentials");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionCode** | **String**| The institution_code of the institution. |

### Return type

[**CredentialsResponseBody**](CredentialsResponseBody.md)

