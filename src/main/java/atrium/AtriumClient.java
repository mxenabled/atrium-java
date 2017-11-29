import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import com.google.gson.Gson;

import com.google.gson.JsonParser;
import com.google.gson.JsonElement;

public class AtriumClient {
  private String environment;
  private String mxAPIKEY;
  private String mxCLIENTID;

  /**
   * Constructor method to set up client.
   * @param environment Required. Sets the environment for the user
   * @param mxAPIKEY Required. API Key used to access Atrium API.
   * @param mxCLIENTID Required. API Client ID used to access Atrium API.
   */
  public AtriumClient(String environment, String mxAPIKEY, String mxCLIENTID) {
    this.environment = environment;
    this.mxAPIKEY = mxAPIKEY;
    this.mxCLIENTID = mxCLIENTID;
  }


  // USER


  /**
   * Method used to create a new User.
   * @param identifier Optional. A unique, enforced identifiier for the user, defined by you.
   * @param isDisabled Optional. True if you want the user disabled, false otherwise.
   * @param metadata Optional. Additional information you can store about this user. MX recommends using JSON-structured data.
   * @return User. This returns the newly created User object.
   */
  public User createUser(String identifier, String isDisabled, String metadata) {
    JsonObject inner = new JsonObject();
    if (!identifier.equals("")) {
      inner.addProperty("identifier", identifier);
    }
    isDisabled = isDisabled.toLowerCase();
    if ((isDisabled.equals("")) || (isDisabled.equals("false"))) {
      inner.addProperty("is_disabled", "false");
    }
    else {
      inner.addProperty("is_disabled", true);
    }
    if (!metadata.equals("")) {
      inner.addProperty("metadata", metadata);
    }
    JsonObject outer = new JsonObject();
    outer.add("user", inner);
    String body = outer.toString();

    String response = makeRequest("POST", "/users", body);
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("user").toString(), User.class);
  }

  /**
   * Method used to read a User.
   * @param userGUID Required. The guid of the User to read.
   * @return User. This returns the User object specified by the User guid param.
   */
  public User readUser(String userGUID) {
    String response =  makeRequest("GET", "/users/" + userGUID, "");
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("user").toString(), User.class);
  }

  /**
   * Method used to update a User.
   * @param userGUID Required. The guid of the User to update.
   * @param identifier Optional. Use to update the User's identifier.
   * @param isDisabled Optional. Use to updatd the User's is_disabled status.
   * @param metadata Optional.  Use to update the User's metadata.
   * @return User. This returns the updated User object.
   */
  public User updateUser(String userGUID, String identifier, String isDisabled, String metadata) {
    JsonObject inner = new JsonObject();
    if (!identifier.equals("")) {
      inner.addProperty("identifier", identifier);
    }
    if (!isDisabled.equals("")) {
      inner.addProperty("is_disabled", isDisabled);
    }
    if (!metadata.equals("")) {
      inner.addProperty("metadata", metadata);
    }
    JsonObject outer = new JsonObject();
    outer.add("user", inner);
    String body = outer.toString();

    String response = makeRequest("PUT", "/users/" + userGUID, body);
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("user").toString(), User.class);
  }

  /**
   * Method used to list all Users.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return User array. This returns an array of all User objects.
   */
  public User[] listUsers(String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);
    String response = makeRequest("GET", "/users" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement userList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("users").toString());
    JsonArray jsonArray = userList.getAsJsonArray();
    User[] userArray = new User[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      userArray[i] = new Gson().fromJson(jsonArray.get(i), User.class);
    }
    return userArray;
  }

  /**
   * Method used to delete a User.
   * @param userGUID Required. The guid of the User to delete.
   * @return String. Empty string on success, error message otherwise.
   */
  public String deleteUser(String userGUID) {
    return makeRequest("DELETE", "/users/" + userGUID, "");
  }


  // INSTITUTION


  /**
   * Method used to list all Institutions.
   * @param name Optional. Query string to list only institutions in which the string appears.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Institution array. This returns an array of Institution objects.
   */
  public Institution[] listInstitutions(String name, String pageNumber, String recordsPerPage) {
    String params = optionalParameters(name, "", "", pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/institutions" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement institutionList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("institutions").toString());
    JsonArray jsonArray = institutionList.getAsJsonArray();
    Institution[] institutionArray = new Institution[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      institutionArray[i] = new Gson().fromJson(jsonArray.get(i), Institution.class);
    }
    return institutionArray;
  }

  /**
   * Method used to read an Institution.
   * @param institutionCode Required. The code of the Institution to read.
   * @return Institution. This returns the Institution specified by the institutionCode param.
   */
  public Institution readInstitution(String institutionCode)
  {
    String response =  makeRequest("GET", "/institutions/" + institutionCode, "");
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("institution").toString(), Institution.class);
  }

  /**
   * Method used to read an Institution's credentials.
   * @param institutionCode Required. The code of the Institution to read credentials.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Credential array. This returns an array of the Institution's specific credentials.
   */
  public Credential[] readInstitutionCredentials(String institutionCode, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    String response =  makeRequest("GET", "/institutions/" + institutionCode + "/credentials" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement credentialList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("credentials").toString());
    JsonArray jsonArray = credentialList.getAsJsonArray();
    Credential[] credentialArray = new Credential[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      credentialArray[i] = new Gson().fromJson(jsonArray.get(i), Credential.class);
    }
    return credentialArray;
  }


  // MEMBER


  /**
   * Method used to create a Member.
   * @param userGUID Required. The guid of the associated User.
   * @param credentials Required. An array of required credentials from the readInstitutionCredentials endpoint.
   * @param institutionCode Required. Unique code for the institution to which the member will connect.
   * @param identifier Optional. A unique enforced identifier for the member, enforced by you.
   * @param metadata Optional. Additional information you can store on this member.
   * @return Member. This returns the newly created Member object.
   */
  public Member createMember(String userGUID, JsonArray credentials, String institutionCode, String identifier, String metadata) {
    JsonObject inner = new JsonObject();
    inner.addProperty("institution_code", institutionCode);
    inner.add("credentials", credentials);
    if (!identifier.equals("")) {
      inner.addProperty("identifier", identifier);
    }
    if (!metadata.equals("")) {
      inner.addProperty("metadata", metadata);
    }
    JsonObject outer = new JsonObject();
    outer.add("member", inner);
    String body = outer.toString();

    String response = makeRequest("POST", "/users/" + userGUID + "/members", body);
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  /**
   * Method used to read a Member.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @return Member. This returns the Member object specified by the User guid and Member guid params.
   */
  public Member readMember(String userGUID, String memberGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID, "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  /**
   * Method used to update a Member.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @param credentials Optional. The credentials that you wish to update for this  member.
   * @param identifier Optional. A unique, enforced identifier for the member. Defined by you.
   * @param metadata Optional. Additional information you can store on this member. Defined by you.
   * @return Member. This returns the update Member object.
   */
  public Member updateMember(String userGUID, String memberGUID, JsonArray credentials, String identifier, String metadata) {
    JsonObject inner = new JsonObject();
    if (!credentials.toString().equals("[]")) {
      inner.add("credentials", credentials);
    }
    if (!identifier.equals("")) {
      inner.addProperty("identifier", identifier);
    }
    if (!metadata.equals("")) {
      inner.addProperty("metadata", metadata);
    }

    JsonObject outer = new JsonObject();
    outer.add("member", inner);
    String body = outer.toString();


    String response = makeRequest("PUT", "/users/" + userGUID + "/members/" + memberGUID, body);
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  /**
   * Method used to delete a Member.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @return String. Empty string on success, error message otherwise.
   */
  public String deleteMember(String userGUID, String memberGUID) {
    return makeRequest("DELETE", "/users/" + userGUID + "/members/" + memberGUID, "");
  }

  /**
   * Method used to list all members associated with a User.
   * @param userGUID The User guid who's members you would like to display
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Member array. This returns an array of Members associated with specified User guid param.
   */
  public Member[] listMembers(String userGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/members" + params, "");

    JsonParser parser = new JsonParser();
    JsonElement credentialList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("members").toString());
    JsonArray jsonArray = credentialList.getAsJsonArray();
    Member[] memberArray = new Member[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      memberArray[i] = new Gson().fromJson(jsonArray.get(i), Member.class);
    }
    return memberArray;
  }

  /**
   * Method used to aggregate a Member.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @return Member. This returns the Member object specified by the User guid and Member guid params.
   */
  public Member aggregateMember(String userGUID, String memberGUID) {
    String response = makeRequest("POST", "/users/" + userGUID + "/members/" + memberGUID + "/aggregate", "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  /**
   * Method used to read Member aggregation status.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @return Member. This returns the Member object specified by the User guid and Member guid params.
   */
  public Member readMemberAggregationStatus(String userGUID, String memberGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/status", "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  /**
   * Method used to list Member MFA challenges.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Challenge array. This returns an array of Challenge objects.
   */
  public Challenge[] listMemberMFAChallenges(String userGUID, String memberGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/challenges" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement challengeList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("challenges").toString());
    JsonArray jsonArray = challengeList.getAsJsonArray();
    Challenge[] challengeArray = new Challenge[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      challengeArray[i] = new Gson().fromJson(jsonArray.get(i), Challenge.class);
    }
    return challengeArray;
  }

  /**
   * Method used to resume Member aggregation.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @param answersMFA Required. The array of answered challenges.
   * @return This returns the Member object specified by the User guid and Member guid params.
   */
  public Member resumeMemberAggregation(String userGUID, String memberGUID, JsonArray answersMFA) {
    JsonObject inner = new JsonObject();
    inner.add("challenges", answersMFA);
    JsonObject outer = new JsonObject();
    outer.add("member", inner);
    String body = outer.toString();

    String response = makeRequest("PUT", "/users/" + userGUID + "/members/" + memberGUID + "/resume", body);

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  /**
   * Method used to list Member credentials.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Credential array. This returns an array of Credential objects for the specified Member.
   */
  public Credential[] listMemberCredentials(String userGUID, String memberGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/credentials" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement credentialList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("credentials").toString());
    JsonArray jsonArray = credentialList.getAsJsonArray();
    Credential[] credentialArray = new Credential[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      credentialArray[i] = new Gson().fromJson(jsonArray.get(i), Credential.class);
    }
    return credentialArray;
  }

  /**
   * Method used to list member Accounts.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Account array. This returns an array of Account objects for the specified Member.
   */
  public Account[] listMemberAccounts(String userGUID, String memberGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/accounts" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement accountList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("accounts").toString());
    JsonArray jsonArray = accountList.getAsJsonArray();
    Account[] accountArray = new Account[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      accountArray[i] = new Gson().fromJson(jsonArray.get(i), Account.class);
    }
    return accountArray;
  }

  /**
   * Method used to list member Transactions.
   * @param userGUID Required. The guid of the User associated with the Member.
   * @param memberGUID Required. The guid of the Member.
   * @param fromDate Optional. The date from which to filter transactions from.
   * @param toDate Optional. The date to which to filter transactions from.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Transaction array. This returns an array of Transaction objects for the specified Member.
   */
  public Transaction[] listMemberTransactions(String userGUID, String memberGUID, String fromDate, String toDate, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", fromDate, toDate, pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/transactions" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement transactionList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("transactions").toString());
    JsonArray jsonArray = transactionList.getAsJsonArray();
    Transaction[] transactionArray = new Transaction[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      transactionArray[i] = new Gson().fromJson(jsonArray.get(i), Transaction.class);
    }
    return transactionArray;
  }


  // ACCOUNT


  /**
   * Method used to read an Account.
   * @param userGUID Required. The guid of the User associated with the Account.
   * @param accountGUID Required. The guid of the Account.
   * @return Account. This returns an Account object.
   */
  public Account readAccount(String userGUID, String accountGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/accounts/" + accountGUID, "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("account").toString(), Account.class);
  }

  /**
   * Method used to list Accounts for a User.
   * @param userGUID Required. The User guid of the Account to list.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Account array. This returns an array of Account objects for the specified User.
   */
  public Account[] listAccounts(String userGUID, String pageNumber, String recordsPerPage)
  {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/accounts" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement accountList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("accounts").toString());
    JsonArray jsonArray = accountList.getAsJsonArray();
    Account[] accountArray = new Account[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      accountArray[i] = new Gson().fromJson(jsonArray.get(i), Account.class);
    }
    return accountArray;
  }

  /**
   * Method used to list Account Transactions
   * @param userGUID Required. The guid of the User associated with the Transactions.
   * @param accountGUID Required. The guid of the Account associated with the Account.
   * @param fromDate Optional. The date from which to filter transactions from.
   * @param toDate Optional. The date to which to filter transactions from.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Transaction array. This returns an array of Transaction objects for the specified Account.
   */
  public Transaction[] listAccountTransactions(String userGUID, String accountGUID, String fromDate, String toDate, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", fromDate, toDate, pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/accounts/" + accountGUID + "/transactions" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement transactionList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("transactions").toString());
    JsonArray jsonArray = transactionList.getAsJsonArray();
    Transaction[] transactionArray = new Transaction[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      transactionArray[i] = new Gson().fromJson(jsonArray.get(i), Transaction.class);
    }
    return transactionArray;
  }


  // TRANSACTION

  /**
   * Method used to read a Transaction.
   * @param userGUID Required. The User guid associated with the Transaction.
   * @param transactionGUID Required. The guid of the Transaction.
   * @return Transaction. This returns a Transaction object specified by the User guid and Transaction guid.
   */
  public Transaction readTransaction(String userGUID, String transactionGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/transactions/" + transactionGUID, "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("transaction").toString(), Transaction.class);
  }

  /**
   * Method used to list a User's Transactions
   * @param userGUID Required. The guid of the User.
   * @param fromDate Optional. The date from which to filter transactions from.
   * @param toDate Optional. The date to which to filter transactions from.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return Transaction array. This returns an array of Transaction objects for the specified User.
   */
  public Transaction[] listTransactions(String userGUID, String fromDate, String toDate, String pageNumber, String recordsPerPage)
  {
    String params = optionalParameters("", fromDate, toDate, pageNumber, recordsPerPage);

    String response = makeRequest("GET", "/users/" + userGUID + "/transactions" + params, "");
    JsonParser parser = new JsonParser();
    JsonElement transactionList = parser.parse(new Gson().fromJson(response, JsonObject.class).get("transactions").toString());
    JsonArray jsonArray = transactionList.getAsJsonArray();
    Transaction[] transactionArray = new Transaction[jsonArray.size()];
    for (int i = 0; i < jsonArray.size(); i++) {
      transactionArray[i] = new Gson().fromJson(jsonArray.get(i), Transaction.class);
    }
    return transactionArray;
  }


  // CONNECT WIDGET


  /**
   * Method used to create MX Connect Widget.
   * @param userGUID Required. The guid of the User.
   * @return Connect. This returns a Connect object for the specified User.
   */
  public Connect createWidget(String userGUID) {
    String response = makeRequest("POST", "/users/" + userGUID + "/connect_widget_url", "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("user").toString(), Connect.class);
  }


  // CLIENT


  /**
   * Private utility method to make Atrium API calls.
   * @param mode Required. The HTTP method of the call.
   * @param endpoint Required. The endpoint of the call.
   * @param body Optional. The body of the call.
   * @return String. This returns the String response of the call.
   */
  public String makeRequest(String mode, String endpoint, String body) {
    if (environment.equals("")) {
      System.out.println("Client not yet configured. Please configure with Client.configure(\"YOUR_ENVIRONMENT_URL\",\"YOUR_MX_API_KEY\",\"YOUR_MX_CLIENT_ID\")");
      System.exit(0);
      return "Error";
    }

    int i = 0;
    try {
      String uri = environment + endpoint;
      URL url = new java.net.URL(uri);

      HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
      con.setRequestMethod(mode);
      con.setRequestProperty("Accept", "application/vnd.mx.atrium.v1+json");
      con.setRequestProperty("Content-Type", "application/json");
      con.setRequestProperty("MX-API-Key", mxAPIKEY);
      con.setRequestProperty("MX-Client-ID", mxCLIENTID);

      if (!body.equals("")) {
        con.setDoOutput(true);
        OutputStream out = con.getOutputStream();
        out.write(body.getBytes("UTF-8"));
        out.close();
      }

      httpError(con.getResponseCode());

      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

      StringBuilder response = new StringBuilder();
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();
      con.disconnect();

      return response.toString();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return Integer.toString(i);
  }

  /**
   * Private utility method used to return information about Atrium errors.
   * @param code Required. An HTTP status code.
   */
  private void httpError(int code)
  {
    try
    {
      switch (code) {
      case 400:
        System.out.println(code + " error: Required parameter is missing.");
        break;
      case 401:
        System.out.println(code + " error: Invalid MX-API-Key, MX-Client-ID, or being used in wrong environment.");
        break;
      case 403:
        System.out.println(code + " error: Requests must be HTTPS.");
        break;
      case 404:
        System.out.println(code + " error: GUID / URL path not recognized.");
        break;
      case 405:
        System.out.println(code + " error: Endpoint constraint not met.");
        break;
      case 406:
        System.out.println(code + " error: Specifiy valid API version.");
        break;
      case 409:
        System.out.println(code + " error: Object already exists.");
        break;
      case 422:
        System.out.println(code + " error: Data provided cannot be processed.");
        break;
      case 500:
      case 502:
      case 504:
        System.out.println(code + " error: An unexpected error occurred on MX's systems.");
      case 503:
        System.out.println(code + " error: Please try again later. The MX Platform is currently being updated.");
      }

      if (code / 100 == 4 || code / 100 == 5) {
        System.exit(0);
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Private utility method to build optional URL params.
   * @param name Optional. Specifies a name to append.
   * @param fromDate Optional. Specifies a from date filter.
   * @param toDate Optional. Specifies a to date filter.
   * @param pageNumber Optional. Specifies the page to display. Defaults to 1.
   * @param recordsPerPage Optional. Specifies the records displayed per page. Supports any integer within the range 10-1000. Defaults to 25.
   * @return String. This returns a URL string with specified params.
   */
  private String optionalParameters(String name, String fromDate, String toDate, String pageNumber, String recordsPerPage) {
    StringBuilder params = new StringBuilder("?");
    if (name != null && !name.equals("")) {
      params.append("name=").append(name).append("&");
    }
    if (fromDate != null && !fromDate.equals("")) {
      params.append("from_date=").append(fromDate).append("&");
    }
    if (toDate != null && !toDate.equals("")) {
      params.append("to_date=").append(toDate).append("&");
    }
    if (pageNumber != null && !pageNumber.equals("")) {
      params.append("page=").append(pageNumber).append("&");
    }
    if (recordsPerPage != null && !recordsPerPage.equals("")) {
      params.append("records_per_page=").append(recordsPerPage).append("&");
    }
    params.setLength(params.length() - 1);

    return params.toString();
  }
}
