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
 * AccountAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-11-29T15:45:20.941-07:00")

public class AccountAttributes {
  @SerializedName("apr")
  private BigDecimal apr = null;

  @SerializedName("apy")
  private BigDecimal apy = null;

  @SerializedName("available_balance")
  private BigDecimal availableBalance = null;

  @SerializedName("available_credit")
  private BigDecimal availableCredit = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("credit_limit")
  private BigDecimal creditLimit = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("day_payment_is_due")
  private Integer dayPaymentIsDue = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("institution_code")
  private String institutionCode = null;

  @SerializedName("interest_rate")
  private BigDecimal interestRate = null;

  @SerializedName("is_closed")
  private Boolean isClosed = null;

  @SerializedName("last_payment")
  private BigDecimal lastPayment = null;

  @SerializedName("matures_on")
  private String maturesOn = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("minimum_balance")
  private BigDecimal minimumBalance = null;

  @SerializedName("minimum_payment")
  private BigDecimal minimumPayment = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("original_balance")
  private BigDecimal originalBalance = null;

  @SerializedName("payment_due_at")
  private String paymentDueAt = null;

  @SerializedName("payoff_balance")
  private BigDecimal payoffBalance = null;

  @SerializedName("started_on")
  private String startedOn = null;

  @SerializedName("subtype")
  private String subtype = null;

  @SerializedName("total_account_value")
  private BigDecimal totalAccountValue = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("user_guid")
  private String userGuid = null;

   /**
   * Get apr
   * @return apr
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public BigDecimal getApr() {
    return apr;
  }

   /**
   * Get apy
   * @return apy
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public BigDecimal getApy() {
    return apy;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }

   /**
   * Get availableCredit
   * @return availableCredit
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getAvailableCredit() {
    return availableCredit;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getBalance() {
    return balance;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-10-13T17:57:37+00:00", value = "")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(example = "100.0", value = "")
  public BigDecimal getCreditLimit() {
    return creditLimit;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

   /**
   * Get dayPaymentIsDue
   * @return dayPaymentIsDue
  **/
  @ApiModelProperty(example = "20", value = "")
  public Integer getDayPaymentIsDue() {
    return dayPaymentIsDue;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1", value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get institutionCode
   * @return institutionCode
  **/
  @ApiModelProperty(example = "chase", value = "")
  public String getInstitutionCode() {
    return institutionCode;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInterestRate() {
    return interestRate;
  }

   /**
   * Get isClosed
   * @return isClosed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsClosed() {
    return isClosed;
  }

   /**
   * Get lastPayment
   * @return lastPayment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLastPayment() {
    return lastPayment;
  }

   /**
   * Get maturesOn
   * @return maturesOn
  **/
  @ApiModelProperty(value = "")
  public String getMaturesOn() {
    return maturesOn;
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
   * Get minimumBalance
   * @return minimumBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinimumBalance() {
    return minimumBalance;
  }

   /**
   * Get minimumPayment
   * @return minimumPayment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinimumPayment() {
    return minimumPayment;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Test account 2", value = "")
  public String getName() {
    return name;
  }

   /**
   * Get originalBalance
   * @return originalBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOriginalBalance() {
    return originalBalance;
  }

   /**
   * Get paymentDueAt
   * @return paymentDueAt
  **/
  @ApiModelProperty(value = "")
  public String getPaymentDueAt() {
    return paymentDueAt;
  }

   /**
   * Get payoffBalance
   * @return payoffBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPayoffBalance() {
    return payoffBalance;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @ApiModelProperty(value = "")
  public String getStartedOn() {
    return startedOn;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(value = "")
  public String getSubtype() {
    return subtype;
  }

   /**
   * Get totalAccountValue
   * @return totalAccountValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalAccountValue() {
    return totalAccountValue;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "SAVINGS", value = "")
  public String getType() {
    return type;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:08:00+00:00", value = "")
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
    AccountAttributes accountAttributes = (AccountAttributes) o;
    return Objects.equals(this.apr, accountAttributes.apr) &&
        Objects.equals(this.apy, accountAttributes.apy) &&
        Objects.equals(this.availableBalance, accountAttributes.availableBalance) &&
        Objects.equals(this.availableCredit, accountAttributes.availableCredit) &&
        Objects.equals(this.balance, accountAttributes.balance) &&
        Objects.equals(this.createdAt, accountAttributes.createdAt) &&
        Objects.equals(this.creditLimit, accountAttributes.creditLimit) &&
        Objects.equals(this.currencyCode, accountAttributes.currencyCode) &&
        Objects.equals(this.dayPaymentIsDue, accountAttributes.dayPaymentIsDue) &&
        Objects.equals(this.guid, accountAttributes.guid) &&
        Objects.equals(this.institutionCode, accountAttributes.institutionCode) &&
        Objects.equals(this.interestRate, accountAttributes.interestRate) &&
        Objects.equals(this.isClosed, accountAttributes.isClosed) &&
        Objects.equals(this.lastPayment, accountAttributes.lastPayment) &&
        Objects.equals(this.maturesOn, accountAttributes.maturesOn) &&
        Objects.equals(this.memberGuid, accountAttributes.memberGuid) &&
        Objects.equals(this.minimumBalance, accountAttributes.minimumBalance) &&
        Objects.equals(this.minimumPayment, accountAttributes.minimumPayment) &&
        Objects.equals(this.name, accountAttributes.name) &&
        Objects.equals(this.originalBalance, accountAttributes.originalBalance) &&
        Objects.equals(this.paymentDueAt, accountAttributes.paymentDueAt) &&
        Objects.equals(this.payoffBalance, accountAttributes.payoffBalance) &&
        Objects.equals(this.startedOn, accountAttributes.startedOn) &&
        Objects.equals(this.subtype, accountAttributes.subtype) &&
        Objects.equals(this.totalAccountValue, accountAttributes.totalAccountValue) &&
        Objects.equals(this.type, accountAttributes.type) &&
        Objects.equals(this.updatedAt, accountAttributes.updatedAt) &&
        Objects.equals(this.userGuid, accountAttributes.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apr, apy, availableBalance, availableCredit, balance, createdAt, creditLimit, currencyCode, dayPaymentIsDue, guid, institutionCode, interestRate, isClosed, lastPayment, maturesOn, memberGuid, minimumBalance, minimumPayment, name, originalBalance, paymentDueAt, payoffBalance, startedOn, subtype, totalAccountValue, type, updatedAt, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAttributes {\n");
    
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    apy: ").append(toIndentedString(apy)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dayPaymentIsDue: ").append(toIndentedString(dayPaymentIsDue)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    lastPayment: ").append(toIndentedString(lastPayment)).append("\n");
    sb.append("    maturesOn: ").append(toIndentedString(maturesOn)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    minimumBalance: ").append(toIndentedString(minimumBalance)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalBalance: ").append(toIndentedString(originalBalance)).append("\n");
    sb.append("    paymentDueAt: ").append(toIndentedString(paymentDueAt)).append("\n");
    sb.append("    payoffBalance: ").append(toIndentedString(payoffBalance)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    totalAccountValue: ").append(toIndentedString(totalAccountValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

