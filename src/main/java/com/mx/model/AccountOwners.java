/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mx.model.AccountOwnerAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountOwners
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T12:53:24.168-07:00")

public class AccountOwners {
  @SerializedName("account_owners")
  private List<AccountOwnerAttributes> accountOwners = null;

  public AccountOwners accountOwners(List<AccountOwnerAttributes> accountOwners) {
    this.accountOwners = accountOwners;
    return this;
  }

  public AccountOwners addAccountOwnersItem(AccountOwnerAttributes accountOwnersItem) {
    if (this.accountOwners == null) {
      this.accountOwners = new ArrayList<AccountOwnerAttributes>();
    }
    this.accountOwners.add(accountOwnersItem);
    return this;
  }

   /**
   * Get accountOwners
   * @return accountOwners
  **/
  @ApiModelProperty(value = "")
  public List<AccountOwnerAttributes> getAccountOwners() {
    return accountOwners;
  }

  public void setAccountOwners(List<AccountOwnerAttributes> accountOwners) {
    this.accountOwners = accountOwners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountOwners accountOwners = (AccountOwners) o;
    return Objects.equals(this.accountOwners, accountOwners.accountOwners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountOwners);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOwners {\n");
    
    sb.append("    accountOwners: ").append(toIndentedString(accountOwners)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

