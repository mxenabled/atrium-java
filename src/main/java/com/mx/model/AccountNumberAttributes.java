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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountNumberAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T16:35:42.819-07:00")

public class AccountNumberAttributes {
  @SerializedName("account_guid")
  private String accountGuid = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("routing_number")
  private String routingNumber = null;

  @SerializedName("user_guid")
  private String userGuid = null;

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @ApiModelProperty(example = "ACT-123", value = "")
  public String getAccountGuid() {
    return accountGuid;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "10001", value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")
  public String getMemberGuid() {
    return memberGuid;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @ApiModelProperty(example = "68899990000000", value = "")
  public String getRoutingNumber() {
    return routingNumber;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @ApiModelProperty(example = "USR-fa7537f3-48aa-a683-a02a-b18940482f54", value = "")
  public String getUserGuid() {
    return userGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountNumberAttributes accountNumberAttributes = (AccountNumberAttributes) o;
    return Objects.equals(this.accountGuid, accountNumberAttributes.accountGuid) &&
        Objects.equals(this.accountNumber, accountNumberAttributes.accountNumber) &&
        Objects.equals(this.memberGuid, accountNumberAttributes.memberGuid) &&
        Objects.equals(this.routingNumber, accountNumberAttributes.routingNumber) &&
        Objects.equals(this.userGuid, accountNumberAttributes.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, accountNumber, memberGuid, routingNumber, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountNumberAttributes {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
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

