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
import java.math.BigDecimal;

/**
 * Reward
 */


public class Reward {
  @SerializedName("account_guid")
  private String accountGuid = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("balance_type")
  private String balanceType = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expires_on")
  private String expiresOn = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("unit_type")
  private String unitType = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("user_guid")
  private String userGuid = null;

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @ApiModelProperty(example = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1", value = "")
  public String getAccountGuid() {
    return accountGuid;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(example = "102.0", value = "")
  public BigDecimal getBalance() {
    return balance;
  }

   /**
   * Get balanceType
   * @return balanceType
  **/
  @ApiModelProperty(example = "EXPIRING_BALANCE", value = "")
  public String getBalanceType() {
    return balanceType;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-10-06T09:43:42+00:00", value = "")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A description of the reward.", value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get expiresOn
   * @return expiresOn
  **/
  @ApiModelProperty(example = "2020-02-28", value = "")
  public String getExpiresOn() {
    return expiresOn;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "RWD-e461efea-63c0-450d-adc2-1a8a557e9c14", value = "")
  public String getGuid() {
    return guid;
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
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(example = "POINTS", value = "")
  public String getUnitType() {
    return unitType;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-10-07T05:49:12+00:00", value = "")
  public String getUpdatedAt() {
    return updatedAt;
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
    Reward reward = (Reward) o;
    return Objects.equals(this.accountGuid, reward.accountGuid) &&
        Objects.equals(this.balance, reward.balance) &&
        Objects.equals(this.balanceType, reward.balanceType) &&
        Objects.equals(this.createdAt, reward.createdAt) &&
        Objects.equals(this.description, reward.description) &&
        Objects.equals(this.expiresOn, reward.expiresOn) &&
        Objects.equals(this.guid, reward.guid) &&
        Objects.equals(this.memberGuid, reward.memberGuid) &&
        Objects.equals(this.unitType, reward.unitType) &&
        Objects.equals(this.updatedAt, reward.updatedAt) &&
        Objects.equals(this.userGuid, reward.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, balance, balanceType, createdAt, description, expiresOn, guid, memberGuid, unitType, updatedAt, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reward {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

