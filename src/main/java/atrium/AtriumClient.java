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

  // Required Parameters: environment, mxAPIKEY, mxCLIENTID
  // Optional Parameters: None
  public AtriumClient(String environment, String mxAPIKEY, String mxCLIENTID) {
    this.environment = environment;
    this.mxAPIKEY = mxAPIKEY;
    this.mxCLIENTID = mxCLIENTID;
  }


  // USER


  // Required Parameters: None
  // Optional Parameters: identifier, isDisabled, metadata
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

  // Required Parameters: userGUID
  // Optional Parameters: None
  public User readUser(String userGUID) {
    String response =  makeRequest("GET", "/users/" + userGUID, "");
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("user").toString(), User.class);
  }

  // Required Parameters: None
  // Optional Parameters: userGUID, identifier, isDisabled, metadata
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

  // Required Parameters: None
  // Optional Parameters: pageNumber, recordsPerPage
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

  // Required Parameters: userGUID
  // Optional Parameters: None
  public String deleteUser(String userGUID) {
    return makeRequest("DELETE", "/users/" + userGUID, "");
  }


  // INSTITUTION


  // Required Parameters: None
  // Optional Parameters: name, pageNumber, recordsPerPage
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

  // Required Parameters: institutionCode
  // Optional Parameters: None
  public Institution readInstitution(String institutionCode)
  {
    String response =  makeRequest("GET", "/institutions/" + institutionCode, "");
    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("institution").toString(), Institution.class);
  }

  // Required Parameters: institutionCode
  // Optional Parameters: pageNumber, recordsPerPage
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


  // Required Parameters: userGUID, credentials, institutionCode
  // Optional Parameters: identifier, metadata
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

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: None
  public Member readMember(String userGUID, String memberGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID, "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: credentials, identifier, metadata
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

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: None
  public String deleteMember(String userGUID, String memberGUID) {
    return makeRequest("DELETE", "/users/" + userGUID + "/members/" + memberGUID, "");
  }

  // Required Parameters: userGUID
  // Optional Parameters: pageNumber, recordsPerPage
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

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: None
  public Member aggregateMember(String userGUID, String memberGUID) {
    String response = makeRequest("POST", "/users/" + userGUID + "/members/" + memberGUID + "/aggregate", "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  // Required Parameters:  userGUID, memberGUID
  // Optional Parameters: None
  public Member readMemberAggregationStatus(String userGUID, String memberGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/status", "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: pageNumber, recordsPerPage
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

  // Required Parameters: userGUID, memberGUID, answersMFA
  // Optional Parameters: None
  public Member resumeMemberAggregation(String userGUID, String memberGUID, JsonArray answersMFA) {
    JsonObject inner = new JsonObject();
    inner.add("challenges", answersMFA);
    JsonObject outer = new JsonObject();
    outer.add("member", inner);
    String body = outer.toString();

    String response = makeRequest("PUT", "/users/" + userGUID + "/members/" + memberGUID + "/resume", body);

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("member").toString(), Member.class);
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: pageNumber, recordsPerPage
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

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: pageNumber, recordsPerPage
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

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: fromDate, toDate, pageNumber, recordsPerPage
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


  // Required Parameters: userGUID, accountGUID
  // Optional Parameters: None
  public Account readAccount(String userGUID, String accountGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/accounts/" + accountGUID, "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("account").toString(), Account.class);
  }

  // Required Parameters: userGUID
  // Optional Parameters: pageNumber, recordsPerPage
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

  // Required Parameters: userGUID, accountGUID
  // Optional Parameters: fromDate, toDate, pageNumber, recordsPerPage
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

  // Required Parameters: userGUID, transactionGUID
  // Optional Parameters: None
  public Transaction readTransaction(String userGUID, String transactionGUID) {
    String response = makeRequest("GET", "/users/" + userGUID + "/transactions/" + transactionGUID, "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("transaction").toString(), Transaction.class);
  }

  // Required Parameters: userGUID
  // Optional Parameters: fromDate, toDate, pageNumber, recordsPerPage
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


  // Required Parameters: userGUID
  // Optional Parameters: None
  public Connect createWidget(String userGUID) {
    String response = makeRequest("POST", "/users/" + userGUID + "/connect_widget_url", "");

    return new Gson().fromJson(new Gson().fromJson(response, JsonObject.class).get("user").toString(), Connect.class);
  }


  // CLIENT


  // Required Parameters: mode, endpoint, body
  // Optional Parameters: None
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

  // Print and exit on http error
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

  private String optionalParameters(String name, String fromDate, String toDate, String pageNumber, String recordsPerPage) {
    String params = "?";
    if (!name.equals("")) {
      params += "name=" + name + "&";
    }
    if (!fromDate.equals("")) {
      params += "from_date=" + fromDate + "&";
    }
    if (!toDate.equals("")) {
      params += "to_date=" + toDate + "&";
    }
    if (!pageNumber.equals("")) {
      params += "page=" + pageNumber + "&";
    }
    if (!recordsPerPage.equals("")) {
      params += "records_per_page=" + recordsPerPage + "&";
    }
    params = params.substring(0, params.length() - 1);

    return params;
  }
}
