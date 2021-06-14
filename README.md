# atrium-java

MX API

The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 


## Requirements

Building the API client library requires: Java 1.7+

## Releases

[Download](https://github.com/mxenabled/atrium-java/releases) the latest release .jar files and add them to your project

### Build your own .jar files

First generate the .jars by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/atrium-java-2.10.6-beta.0.jar`
* `target/lib/*.jar`

## Example Usage

Please see `docs` directory for additional endpoint examples

```java

import com.mx.atrium.*;
import com.mx.model.*;

public class AccountsApiExample {

    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String accountGuid = "ACT-123"; // String | The unique identifier for an `account`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.
        String fromDate = "2016-09-20"; // String | Filter transactions from this date.
        String toDate = "2016-10-20"; // String | Filter transactions to this date.
        Integer page = 1; // Integer | Specify current page.
        Integer recordsPerPage = 12; // Integer | Specify records per page.

        try {
            TransactionsResponseBody response = client.accounts.listAccountTransactions(accountGuid, userGuid, fromDate, toDate, page, recordsPerPage);
            System.out.println(response);
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
*CreditCardProductsApi* | [**readCreditCardProduct**](docs/CreditCardProductsApi.md#readCreditCardProduct) | **GET** /credit_card_products/{credit_card_product_guid} | Read credit card product
*HoldingsApi* | [**listHoldings**](docs/HoldingsApi.md#listHoldings) | **GET** /users/{user_guid}/holdings | List holdings
*HoldingsApi* | [**listHoldingsByAccount**](docs/HoldingsApi.md#listHoldingsByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/holdings | List holdings by account
*HoldingsApi* | [**listHoldingsByMember**](docs/HoldingsApi.md#listHoldingsByMember) | **GET** /users/{user_guid}/members/{member_guid}/holdings | List holdings by member
*HoldingsApi* | [**readHolding**](docs/HoldingsApi.md#readHolding) | **GET** /users/{user_guid}/holdings/{holding_guid} | Read holding
*IdentityApi* | [**identifyMember**](docs/IdentityApi.md#identifyMember) | **POST** /users/{user_guid}/members/{member_guid}/identify | Identify
*IdentityApi* | [**listAccountOwners**](docs/IdentityApi.md#listAccountOwners) | **GET** /users/{user_guid}/members/{member_guid}/account_owners | List member account owners
*InstitutionsApi* | [**listInstitutions**](docs/InstitutionsApi.md#listInstitutions) | **GET** /institutions | List institutions
*InstitutionsApi* | [**readInstitution**](docs/InstitutionsApi.md#readInstitution) | **GET** /institutions/{institution_code} | Read institution
*InstitutionsApi* | [**readInstitutionCredentials**](docs/InstitutionsApi.md#readInstitutionCredentials) | **GET** /institutions/{institution_code}/credentials | Read institution credentials
*MembersApi* | [**aggregateMember**](docs/MembersApi.md#aggregateMember) | **POST** /users/{user_guid}/members/{member_guid}/aggregate | Aggregate member
*MembersApi* | [**aggregateMemberBalances**](docs/MembersApi.md#aggregateMemberBalances) | **POST** /users/{user_guid}/members/{member_guid}/balance | Aggregate member account balances
*MembersApi* | [**createMember**](docs/MembersApi.md#createMember) | **POST** /users/{user_guid}/members | Create member
*MembersApi* | [**deleteMember**](docs/MembersApi.md#deleteMember) | **DELETE** /users/{user_guid}/members/{member_guid} | Delete member
*MembersApi* | [**extendHistory**](docs/MembersApi.md#extendHistory) | **POST** /users/{user_guid}/members/{member_guid}/extend_history | Extend history
*MembersApi* | [**listMemberAccounts**](docs/MembersApi.md#listMemberAccounts) | **GET** /users/{user_guid}/members/{member_guid}/accounts | List member accounts
*MembersApi* | [**listMemberCredentials**](docs/MembersApi.md#listMemberCredentials) | **GET** /users/{user_guid}/members/{member_guid}/credentials | List member credentials
*MembersApi* | [**listMemberMFAChallenges**](docs/MembersApi.md#listMemberMFAChallenges) | **GET** /users/{user_guid}/members/{member_guid}/challenges | List member MFA challenges
*MembersApi* | [**listMemberTransactions**](docs/MembersApi.md#listMemberTransactions) | **GET** /users/{user_guid}/members/{member_guid}/transactions | List member transactions
*MembersApi* | [**listMembers**](docs/MembersApi.md#listMembers) | **GET** /users/{user_guid}/members | List members
*MembersApi* | [**readMember**](docs/MembersApi.md#readMember) | **GET** /users/{user_guid}/members/{member_guid} | Read member
*MembersApi* | [**readMemberStatus**](docs/MembersApi.md#readMemberStatus) | **GET** /users/{user_guid}/members/{member_guid}/status | Read member connection status
*MembersApi* | [**readOAuthWindowURI**](docs/MembersApi.md#readOAuthWindowURI) | **GET** /users/{user_guid}/members/{member_guid}/oauth_window_uri | Read OAuth Window URI
*MembersApi* | [**resumeMember**](docs/MembersApi.md#resumeMember) | **PUT** /users/{user_guid}/members/{member_guid}/resume | Resume aggregation from MFA
*MembersApi* | [**updateMember**](docs/MembersApi.md#updateMember) | **PUT** /users/{user_guid}/members/{member_guid} | Update member
*MerchantsApi* | [**listMerchantLocations**](docs/MerchantsApi.md#listMerchantLocations) | **GET** /merchants/{merchant_guid}/merchant_locations | List merchant locations
*MerchantsApi* | [**listMerchants**](docs/MerchantsApi.md#listMerchants) | **GET** /merchants | List merchants
*MerchantsApi* | [**readMerchant**](docs/MerchantsApi.md#readMerchant) | **GET** /merchants/{merchant_guid} | Read merchant
*MerchantsApi* | [**readMerchantLocation**](docs/MerchantsApi.md#readMerchantLocation) | **GET** /merchants/{merchant_guid}/merchant_locations/{merchant_location_guid} | Read merchant location
*RewardsApi* | [**fetchRewards**](docs/RewardsApi.md#fetchRewards) | **POST** /users/{user_guid}/members/{member_guid}/fetch_rewards | Fetch rewards
*RewardsApi* | [**listRewards**](docs/RewardsApi.md#listRewards) | **GET** /users/{user_guid}/members/{member_guid}/rewards | List rewards
*RewardsApi* | [**readReward**](docs/RewardsApi.md#readReward) | **GET** /users/{user_guid}/members/{member_guid}/rewards/{reward_guid} | Read reward
*StatementsApi* | [**downloadStatementPdf**](docs/StatementsApi.md#downloadStatementPdf) | **GET** /users/{user_guid}/members/{member_guid}/statements/{statement_guid}.pdf | Download statement PDF
*StatementsApi* | [**fetchStatements**](docs/StatementsApi.md#fetchStatements) | **POST** /users/{user_guid}/members/{member_guid}/fetch_statements | Fetch statements
*StatementsApi* | [**listMemberStatements**](docs/StatementsApi.md#listMemberStatements) | **GET** /users/{user_guid}/members/{member_guid}/statements | List member statements
*StatementsApi* | [**readMemberStatement**](docs/StatementsApi.md#readMemberStatement) | **GET** /users/{user_guid}/members/{member_guid}/statements/{statement_guid} | Read statement JSON
*TransactionsApi* | [**cleanseAndCategorizeTransactions**](docs/TransactionsApi.md#cleanseAndCategorizeTransactions) | **POST** /transactions/cleanse_and_categorize | Categorize transactions
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
 - [AccountNumber](docs/AccountNumber.md)
 - [AccountNumbersResponseBody](docs/AccountNumbersResponseBody.md)
 - [AccountOwner](docs/AccountOwner.md)
 - [AccountOwnersResponseBody](docs/AccountOwnersResponseBody.md)
 - [AccountResponseBody](docs/AccountResponseBody.md)
 - [AccountsResponseBody](docs/AccountsResponseBody.md)
 - [Challenge](docs/Challenge.md)
 - [ChallengeImageOption](docs/ChallengeImageOption.md)
 - [ChallengeOption](docs/ChallengeOption.md)
 - [ChallengesResponseBody](docs/ChallengesResponseBody.md)
 - [ConnectWidget](docs/ConnectWidget.md)
 - [ConnectWidgetRequestBody](docs/ConnectWidgetRequestBody.md)
 - [ConnectWidgetResponseBody](docs/ConnectWidgetResponseBody.md)
 - [CredentialOption](docs/CredentialOption.md)
 - [CredentialRequest](docs/CredentialRequest.md)
 - [CredentialResponse](docs/CredentialResponse.md)
 - [CredentialsResponseBody](docs/CredentialsResponseBody.md)
 - [CreditCardProduct](docs/CreditCardProduct.md)
 - [CreditCardProductResponseBody](docs/CreditCardProductResponseBody.md)
 - [Holding](docs/Holding.md)
 - [HoldingResponseBody](docs/HoldingResponseBody.md)
 - [HoldingsResponseBody](docs/HoldingsResponseBody.md)
 - [Institution](docs/Institution.md)
 - [InstitutionResponseBody](docs/InstitutionResponseBody.md)
 - [InstitutionsResponseBody](docs/InstitutionsResponseBody.md)
 - [Member](docs/Member.md)
 - [MemberConnectionStatus](docs/MemberConnectionStatus.md)
 - [MemberConnectionStatusResponseBody](docs/MemberConnectionStatusResponseBody.md)
 - [MemberCreateRequest](docs/MemberCreateRequest.md)
 - [MemberCreateRequestBody](docs/MemberCreateRequestBody.md)
 - [MemberResponseBody](docs/MemberResponseBody.md)
 - [MemberResumeRequest](docs/MemberResumeRequest.md)
 - [MemberResumeRequestBody](docs/MemberResumeRequestBody.md)
 - [MemberUpdateRequest](docs/MemberUpdateRequest.md)
 - [MemberUpdateRequestBody](docs/MemberUpdateRequestBody.md)
 - [MembersResponseBody](docs/MembersResponseBody.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantLocation](docs/MerchantLocation.md)
 - [MerchantLocationResponseBody](docs/MerchantLocationResponseBody.md)
 - [MerchantLocationsResponseBody](docs/MerchantLocationsResponseBody.md)
 - [MerchantResponseBody](docs/MerchantResponseBody.md)
 - [MerchantsResponseBody](docs/MerchantsResponseBody.md)
 - [Pagination](docs/Pagination.md)
 - [Reward](docs/Reward.md)
 - [RewardResponseBody](docs/RewardResponseBody.md)
 - [RewardsResponseBody](docs/RewardsResponseBody.md)
 - [Statement](docs/Statement.md)
 - [StatementResponseBody](docs/StatementResponseBody.md)
 - [StatementsResponseBody](docs/StatementsResponseBody.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionCleanseAndCategorizeRequest](docs/TransactionCleanseAndCategorizeRequest.md)
 - [TransactionCleanseAndCategorizeResponse](docs/TransactionCleanseAndCategorizeResponse.md)
 - [TransactionResponseBody](docs/TransactionResponseBody.md)
 - [TransactionsCleanseAndCategorizeRequestBody](docs/TransactionsCleanseAndCategorizeRequestBody.md)
 - [TransactionsCleanseAndCategorizeResponseBody](docs/TransactionsCleanseAndCategorizeResponseBody.md)
 - [TransactionsResponseBody](docs/TransactionsResponseBody.md)
 - [User](docs/User.md)
 - [UserCreateRequestBody](docs/UserCreateRequestBody.md)
 - [UserResponseBody](docs/UserResponseBody.md)
 - [UserUpdateRequestBody](docs/UserUpdateRequestBody.md)
 - [UsersResponseBody](docs/UsersResponseBody.md)

