# atrium-java

MX API

The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mx.atrium</groupId>
  <artifactId>atrium-java</artifactId>
  <version>2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mx.atrium:atrium-java:2.0"
```

### Others

First generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/atrium-java-2.0.jar`
* `target/lib/*.jar`

## Example Usage

Please see `docs` directory for additional endpoint examples

```java

import com.mx.atrium.*;
import com.mx.atrium.auth.*;
import com.mx.model.*;
import com.mx.atrium.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**listAccountTransactions**](docs/AccountsApi.md#listAccountTransactions) | **GET** /users/{user_guid}/accounts/{account_guid}/transactions | List account transactions
*AccountsApi* | [**listUserAccounts**](docs/AccountsApi.md#listUserAccounts) | **GET** /users/{user_guid}/accounts | List accounts for a user
*AccountsApi* | [**readAccount**](docs/AccountsApi.md#readAccount) | **GET** /users/{user_guid}/accounts/{account_guid} | Read an account
*AccountsApi* | [**readAccountByMemberGUID**](docs/AccountsApi.md#readAccountByMemberGUID) | **GET** /users/{user_guid}/members/{member_guid}/accounts/{account_guid} | Read an account
*ConnectWidgetApi* | [**getConnectWidget**](docs/ConnectWidgetApi.md#getConnectWidget) | **POST** /users/{user_guid}/connect_widget_url | Embedding in a website
*IdentityApi* | [**identifyMember**](docs/IdentityApi.md#identifyMember) | **POST** /users/{user_guid}/members/{member_guid}/identify | Identify
*IdentityApi* | [**listAccountOwners**](docs/IdentityApi.md#listAccountOwners) | **GET** /users/{user_guid}/members/{member_guid}/account_owners | List member account owners
*InstitutionsApi* | [**listInstitutions**](docs/InstitutionsApi.md#listInstitutions) | **GET** /institutions | List institutions
*InstitutionsApi* | [**readInstitution**](docs/InstitutionsApi.md#readInstitution) | **GET** /institutions/{institution_code} | Read institution
*InstitutionsApi* | [**readInstitutionCredentials**](docs/InstitutionsApi.md#readInstitutionCredentials) | **GET** /institutions/{institution_code}/credentials | Read institution credentials
*MembersApi* | [**aggregateMember**](docs/MembersApi.md#aggregateMember) | **POST** /users/{user_guid}/members/{member_guid}/aggregate | Aggregate member
*MembersApi* | [**createMember**](docs/MembersApi.md#createMember) | **POST** /users/{user_guid}/members | Create member
*MembersApi* | [**deleteMember**](docs/MembersApi.md#deleteMember) | **DELETE** /users/{user_guid}/members/{member_guid} | Delete member
*MembersApi* | [**listMemberAccounts**](docs/MembersApi.md#listMemberAccounts) | **GET** /users/{user_guid}/members/{member_guid}/accounts | List member accounts
*MembersApi* | [**listMemberCredentials**](docs/MembersApi.md#listMemberCredentials) | **GET** /users/{user_guid}/members/{member_guid}/credentials | List member credentials
*MembersApi* | [**listMemberMFAChallenges**](docs/MembersApi.md#listMemberMFAChallenges) | **GET** /users/{user_guid}/members/{member_guid}/challenges | List member MFA challenges
*MembersApi* | [**listMemberTransactions**](docs/MembersApi.md#listMemberTransactions) | **GET** /users/{user_guid}/members/{member_guid}/transactions | List member transactions
*MembersApi* | [**listMembers**](docs/MembersApi.md#listMembers) | **GET** /users/{user_guid}/members | List members
*MembersApi* | [**readMember**](docs/MembersApi.md#readMember) | **GET** /users/{user_guid}/members/{member_guid} | Read member
*MembersApi* | [**readMemberStatus**](docs/MembersApi.md#readMemberStatus) | **GET** /users/{user_guid}/members/{member_guid}/status | Read member connection status
*MembersApi* | [**resumeMember**](docs/MembersApi.md#resumeMember) | **PUT** /users/{user_guid}/members/{member_guid}/resume | Resume aggregation from MFA
*MembersApi* | [**updateMember**](docs/MembersApi.md#updateMember) | **PUT** /users/{user_guid}/members/{member_guid} | Update member
*TransactionsApi* | [**cleanseAndCategorizeTransactions**](docs/TransactionsApi.md#cleanseAndCategorizeTransactions) | **POST** /cleanse_and_categorize | Categorize transactions
*TransactionsApi* | [**listUserTransactions**](docs/TransactionsApi.md#listUserTransactions) | **GET** /users/{user_guid}/transactions | List transactions for a user
*TransactionsApi* | [**readTransaction**](docs/TransactionsApi.md#readTransaction) | **GET** /users/{user_guid}/transactions/{transaction_guid} | Read a transaction
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /users | Create user
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /users/{user_guid} | Delete user
*UsersApi* | [**listUsers**](docs/UsersApi.md#listUsers) | **GET** /users | List users
*UsersApi* | [**readUser**](docs/UsersApi.md#readUser) | **GET** /users/{user_guid} | Read user
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /users/{user_guid} | Update user
*VerificationApi* | [**listAccountNumbers**](docs/VerificationApi.md#listAccountNumbers) | **GET** /users/{user_guid}/members/{member_guid}/account_numbers | Read account numbers
*VerificationApi* | [**listAccountNumbersByAccount**](docs/VerificationApi.md#listAccountNumbersByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/account_numbers | Read account numbers by account GUID
*VerificationApi* | [**verifyMember**](docs/VerificationApi.md#verifyMember) | **POST** /users/{user_guid}/members/{member_guid}/verify | Verify


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountAttributes](docs/AccountAttributes.md)
 - [AccountNumberAttributes](docs/AccountNumberAttributes.md)
 - [AccountNumbers](docs/AccountNumbers.md)
 - [AccountOwnerAttributes](docs/AccountOwnerAttributes.md)
 - [AccountOwners](docs/AccountOwners.md)
 - [Accounts](docs/Accounts.md)
 - [ChallengeAttributes](docs/ChallengeAttributes.md)
 - [ChallengeOptionAttributes](docs/ChallengeOptionAttributes.md)
 - [Challenges](docs/Challenges.md)
 - [ConnectWidget](docs/ConnectWidget.md)
 - [ConnectWidgetAttributes](docs/ConnectWidgetAttributes.md)
 - [ConnectWidgetRequestBody](docs/ConnectWidgetRequestBody.md)
 - [CredentialAttributes](docs/CredentialAttributes.md)
 - [CredentialOptionAttributes](docs/CredentialOptionAttributes.md)
 - [CredentialResponseAttributes](docs/CredentialResponseAttributes.md)
 - [Credentials](docs/Credentials.md)
 - [Institution](docs/Institution.md)
 - [InstitutionAttributes](docs/InstitutionAttributes.md)
 - [Institutions](docs/Institutions.md)
 - [Member](docs/Member.md)
 - [MemberAttributes](docs/MemberAttributes.md)
 - [MemberConnectionStatus](docs/MemberConnectionStatus.md)
 - [MemberConnectionStatusAttributes](docs/MemberConnectionStatusAttributes.md)
 - [MemberCreateRequestBody](docs/MemberCreateRequestBody.md)
 - [MemberCreateRequestBodyAttributes](docs/MemberCreateRequestBodyAttributes.md)
 - [MemberResumeRequestBody](docs/MemberResumeRequestBody.md)
 - [MemberResumeRequestBodyAttributes](docs/MemberResumeRequestBodyAttributes.md)
 - [MemberUpdateRequestBody](docs/MemberUpdateRequestBody.md)
 - [MemberUpdateRequestBodyAttributes](docs/MemberUpdateRequestBodyAttributes.md)
 - [Members](docs/Members.md)
 - [Pagination](docs/Pagination.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionAttributes](docs/TransactionAttributes.md)
 - [Transactions](docs/Transactions.md)
 - [TransactionsCleanseAndCategorize](docs/TransactionsCleanseAndCategorize.md)
 - [TransactionsCleanseAndCategorizeAttributes](docs/TransactionsCleanseAndCategorizeAttributes.md)
 - [TransactionsCleanseAndCategorizeRequestBody](docs/TransactionsCleanseAndCategorizeRequestBody.md)
 - [TransactionsCleanseAndCategorizeRequestBodyAttributes](docs/TransactionsCleanseAndCategorizeRequestBodyAttributes.md)
 - [User](docs/User.md)
 - [UserAttributes](docs/UserAttributes.md)
 - [UserCreateRequestBody](docs/UserCreateRequestBody.md)
 - [UserUpdateRequestBody](docs/UserUpdateRequestBody.md)
 - [Users](docs/Users.md)

