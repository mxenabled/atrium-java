import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;


public class AtriumClient {
  String environment;
  String mxAPIKEY;
  String mxCLIENTID;

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
  public String createUser(String identifier, String isDisabled, String metadata) {
    JSONObject inner = new JSONObject();
    if (!identifier.equals("")) {
      inner.put("identifier", identifier);
    }
    isDisabled = isDisabled.toLowerCase();
    if ((isDisabled.equals("")) || (isDisabled.equals("false"))) {
      inner.put("is_disabled", "false");
    }
    else {
      inner.put("is_disabled", true);
    }
    if (!metadata.equals("")) {
      inner.put("metadata", metadata);
    }
    JSONObject outer = new JSONObject();
    outer.put("user", inner);
    String body = outer.toString();

    return makeRequest("POST", "/users", body);
  }

  // Required Parameters: userGUID
  // Optional Parameters: None
  public String readUser(String userGUID) {
    return makeRequest("GET", "/users/" + userGUID, "");
  }

  // Required Parameters: None
  // Optional Parameters: userGUID, identifier, isDisabled, metadata
  public String updateUser(String userGUID, String identifier, String isDisabled, String metadata) {
    JSONObject inner = new JSONObject();
    if (!identifier.equals("")) {
      inner.put("identifier", identifier);
    }
    if (!isDisabled.equals("")) {
      inner.put("is_disabled", isDisabled);
    }
    if (!metadata.equals("")) {
      inner.put("metadata", metadata);
    }
    JSONObject outer = new JSONObject();
    outer.put("user", inner);
    String body = outer.toString();


    return makeRequest("PUT", "/users/" + userGUID, body);
  }

  // Required Parameters: None
  // Optional Parameters: pageNumber, recordsPerPage
  public String listUsers(String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/users" + params, "");
  }

  // Required Parameters: userGUID
  // Optional Parameters: None
  public String deleteUser(String userGUID) {
    return makeRequest("DELETE", "/users/" + userGUID, "");
  }


  // INSTITUTION


  // Required Parameters: None
  // Optional Parameters: name, pageNumber, recordsPerPage
  public String listInstitutions(String name, String pageNumber, String recordsPerPage) {
    String params = optionalParameters(name, "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/institutions" + params, "");
  }

  // Required Parameters: institutionCode
  // Optional Parameters: None
  public String readInstitution(String institutionCode)
  {
    return makeRequest("GET", "/institutions/" + institutionCode, "");
  }

  // Required Parameters: institutionCode
  // Optional Parameters: pageNumber, recordsPerPage
  public String readInstitutionCredentials(String institutionCode, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/institutions/" + institutionCode + "/credentials" + params, "");
  }


  // MEMBER


  // Required Parameters: userGUID, credentials, institutionCode
  // Optional Parameters: identifier, metadata
  public String createMember(String userGUID, JSONArray credentials, String institutionCode, String identifier, String metadata) {
    JSONObject inner = new JSONObject();
    inner.put("institution_code", institutionCode);
    inner.put("credentials", credentials);
    if (!identifier.equals("")) {
      inner.put("identifier", identifier);
    }
    if (!metadata.equals("")) {
      inner.put("metadata", metadata);
    }
    JSONObject outer = new JSONObject();
    outer.put("member", inner);
    String body = outer.toString();

    return makeRequest("POST", "/users/" + userGUID + "/members", body);
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: None
  public String readMember(String userGUID, String memberGUID) {
    return makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID, "");
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: credentials, identifier, metadata
  public String updateMember(String userGUID, String memberGUID, JSONArray credentials, String identifier, String metadata) {
    JSONObject inner = new JSONObject();
    if (!credentials.toString().equals("[]")) {
      inner.put("credentials", credentials);
    }
    if (!identifier.equals("")) {
      inner.put("identifier", identifier);
    }
    if (!metadata.equals("")) {
      inner.put("metadata", metadata);
    }

    JSONObject outer = new JSONObject();
    outer.put("member", inner);
    String body = outer.toString();


    return makeRequest("PUT", "/users/" + userGUID + "/members/" + memberGUID, body);
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: None
  public String deleteMember(String userGUID, String memberGUID) {
    return makeRequest("DELETE", "/users/" + userGUID + "/members/" + memberGUID, "");
  }

  // Required Parameters: userGUID
  // Optional Parameters: pageNumber, recordsPerPage
  public String listMembers(String userGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/members" + params, "");
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: None
  public String aggregateMember(String userGUID, String memberGUID) {
    return makeRequest("POST", "/users/" + userGUID + "/members/" + memberGUID + "/aggregate", "");
  }

  // Required Parameters:  userGUID, memberGUID
  // Optional Parameters: None
  public String readMemberAggregationStatus(String userGUID, String memberGUID) {
    return makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/status", "");
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: pageNumber, recordsPerPage
  public String listMemberMFAChallenges(String userGUID, String memberGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/challenges" + params, "");
  }

  // Required Parameters: userGUID, memberGUID, answersMFA
  // Optional Parameters: None
  public String resumeMemberAggregation(String userGUID, String memberGUID, JSONArray answersMFA) {
    JSONObject inner = new JSONObject();
    inner.put("challenges", answersMFA);
    JSONObject outer = new JSONObject();
    outer.put("member", inner);
    String body = outer.toString();

    return makeRequest("PUT", "/users/" + userGUID + "/members/" + memberGUID + "/resume", body);
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: pageNumber, recordsPerPage
  public String listMemberCredentials(String userGUID, String memberGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/credentials" + params, "");
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: pageNumber, recordsPerPage
  public String listMemberAccounts(String userGUID, String memberGUID, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/accounts" + params, "");
  }

  // Required Parameters: userGUID, memberGUID
  // Optional Parameters: fromDate, toDate, pageNumber, recordsPerPage
  public String listMemberTransactions(String userGUID, String memberGUID, String fromDate, String toDate, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", fromDate, toDate, pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/members/" + memberGUID + "/transactions" + params, "");
  }


  // ACCOUNT


  // Required Parameters: userGUID, accountGUID
  // Optional Parameters: None
  public String readAccount(String userGUID, String accountGUID) {
    return makeRequest("GET", "/users/" + userGUID + "/accounts/" + accountGUID, "");
  }

  // Required Parameters: userGUID
  // Optional Parameters: pageNumber, recordsPerPage
  public String listAccounts(String userGUID, String pageNumber, String recordsPerPage)
  {
    String params = optionalParameters("", "", "", pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/accounts" + params, "");
  }

  // Required Parameters: userGUID, accountGUID
  // Optional Parameters: fromDate, toDate, pageNumber, recordsPerPage
  public String listAccountTransactions(String userGUID, String accountGUID, String fromDate, String toDate, String pageNumber, String recordsPerPage) {
    String params = optionalParameters("", fromDate, toDate, pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "/accounts/" + accountGUID + "/transactions" + params, "");
  }

  // TRANSACTION

  // Required Parameters: userGUID, transactionGUID
  // Optional Parameters: None
  public String readTransaction(String userGUID, String transactionGUID) {
    return makeRequest("GET", "/users/" + userGUID + "/transactions/" + transactionGUID, "");
  }

  // Required Parameters: userGUID
  // Optional Parameters: fromDate, toDate, pageNumber, recordsPerPage
  public String listTransactions(String userGUID, String fromDate, String toDate, String pageNumber, String recordsPerPage)
  {
    String params = optionalParameters("", fromDate, toDate, pageNumber, recordsPerPage);

    return makeRequest("GET", "/users/" + userGUID + "transactions" + params, "");
  }


  // CONNECT WIDGET


  // Required Parameters: userGUID
  // Optional Parameters: None
  public String createWidget(String userGUID) {
    return makeRequest("POST", "/users/" + userGUID + "/connect_widget_url", "");
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
    if (fromDate != "") {
      params += "name=" + name + "&";
    }
    if (fromDate != "") {
      params += "from_date=" + fromDate + "&";
    }
    if (toDate != "") {
      params += "to_date=" + toDate + "&";
    }
    if (pageNumber != "") {
      params += "page=" + pageNumber + "&";
    }
    if (recordsPerPage != "") {
      params += "records_per_page=" + recordsPerPage + "&";
    }
    params = params.substring(0, params.length() - 1);

    return params;
  }

}
