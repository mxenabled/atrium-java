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
import com.mx.model.AccountNumberAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountNumbers
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-04T10:29:21.360-07:00")

public class AccountNumbers {
  @SerializedName("account_numbers")
  private List<AccountNumberAttributes> accountNumbers = null;

  public AccountNumbers accountNumbers(List<AccountNumberAttributes> accountNumbers) {
    this.accountNumbers = accountNumbers;
    return this;
  }

  public AccountNumbers addAccountNumbersItem(AccountNumberAttributes accountNumbersItem) {
    if (this.accountNumbers == null) {
      this.accountNumbers = new ArrayList<AccountNumberAttributes>();
    }
    this.accountNumbers.add(accountNumbersItem);
    return this;
  }

   /**
   * Get accountNumbers
   * @return accountNumbers
  **/
  @ApiModelProperty(value = "")
  public List<AccountNumberAttributes> getAccountNumbers() {
    return accountNumbers;
  }

  public void setAccountNumbers(List<AccountNumberAttributes> accountNumbers) {
    this.accountNumbers = accountNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountNumbers accountNumbers = (AccountNumbers) o;
    return Objects.equals(this.accountNumbers, accountNumbers.accountNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountNumbers {\n");
    
    sb.append("    accountNumbers: ").append(toIndentedString(accountNumbers)).append("\n");
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

