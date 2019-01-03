package com.mx.atrium;

import com.mx.atrium.*;
import com.mx.atrium.auth.*;
import com.mx.model.*;

import java.io.File;
import java.util.*;


import com.mx.atrium.AccountsApi;
import com.mx.atrium.ConnectWidgetApi;
import com.mx.atrium.HoldingsApi;
import com.mx.atrium.IdentityApi;
import com.mx.atrium.InstitutionsApi;
import com.mx.atrium.MembersApi;
import com.mx.atrium.MerchantsApi;
import com.mx.atrium.TransactionsApi;
import com.mx.atrium.UsersApi;
import com.mx.atrium.VerificationApi;

public class AtriumClient {
  
  public AccountsApi accounts;
  public ConnectWidgetApi connectWidget;
  public HoldingsApi holdings;
  public IdentityApi identity;
  public InstitutionsApi institutions;
  public MembersApi members;
  public MerchantsApi merchants;
  public TransactionsApi transactions;
  public UsersApi users;
  public VerificationApi verification;

  public AtriumClient(String apiKey, String clientID) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth api = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    api.setApiKey(apiKey);
    ApiKeyAuth client = (ApiKeyAuth) defaultClient.getAuthentication("clientID");
    client.setApiKey(clientID);

    
    this.accounts = new AccountsApi();
    this.connectWidget = new ConnectWidgetApi();
    this.holdings = new HoldingsApi();
    this.identity = new IdentityApi();
    this.institutions = new InstitutionsApi();
    this.members = new MembersApi();
    this.merchants = new MerchantsApi();
    this.transactions = new TransactionsApi();
    this.users = new UsersApi();
    this.verification = new VerificationApi();
  }
}
