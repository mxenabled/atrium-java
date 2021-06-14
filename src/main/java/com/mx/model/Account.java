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
 * Account
 */


public class Account {
  @SerializedName("account_number")
  private String accountNumber = null;

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

  @SerializedName("cash_balance")
  private BigDecimal cashBalance = null;

  @SerializedName("cash_surrender_value")
  private BigDecimal cashSurrenderValue = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("credit_card_product_guid")
  private String creditCardProductGuid = null;

  @SerializedName("credit_limit")
  private BigDecimal creditLimit = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("current_reward_level")
  private String currentRewardLevel = null;

  @SerializedName("day_payment_is_due")
  private Integer dayPaymentIsDue = null;

  @SerializedName("death_benefit")
  private BigDecimal deathBenefit = null;

  @SerializedName("enrolled_in_rewards_on")
  private String enrolledInRewardsOn = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("holdings_value")
  private BigDecimal holdingsValue = null;

  @SerializedName("insured_name")
  private String insuredName = null;

  @SerializedName("institution_code")
  private String institutionCode = null;

  @SerializedName("interest_rate")
  private BigDecimal interestRate = null;

  @SerializedName("is_closed")
  private Boolean isClosed = null;

  @SerializedName("last_payment")
  private BigDecimal lastPayment = null;

  @SerializedName("last_payment_at")
  private String lastPaymentAt = null;

  @SerializedName("loan_amount")
  private BigDecimal loanAmount = null;

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

  @SerializedName("next_reward_level")
  private String nextRewardLevel = null;

  @SerializedName("original_balance")
  private BigDecimal originalBalance = null;

  @SerializedName("payment_due_at")
  private String paymentDueAt = null;

  @SerializedName("payoff_balance")
  private BigDecimal payoffBalance = null;

  @SerializedName("pay_out_amount")
  private BigDecimal payOutAmount = null;

  @SerializedName("premium_amount")
  private BigDecimal premiumAmount = null;

  @SerializedName("primary_reward_unit")
  private String primaryRewardUnit = null;

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
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "123456789", value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

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

  public Account cashBalance(BigDecimal cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

   /**
   * Get cashBalance
   * @return cashBalance
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getCashBalance() {
    return cashBalance;
  }

  public void setCashBalance(BigDecimal cashBalance) {
    this.cashBalance = cashBalance;
  }

  public Account cashSurrenderValue(BigDecimal cashSurrenderValue) {
    this.cashSurrenderValue = cashSurrenderValue;
    return this;
  }

   /**
   * Get cashSurrenderValue
   * @return cashSurrenderValue
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getCashSurrenderValue() {
    return cashSurrenderValue;
  }

  public void setCashSurrenderValue(BigDecimal cashSurrenderValue) {
    this.cashSurrenderValue = cashSurrenderValue;
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
   * Get creditCardProductGuid
   * @return creditCardProductGuid
  **/
  @ApiModelProperty(example = "CCA-b5bcd822-6d01-4e23-b8d6-846a225e714a", value = "")
  public String getCreditCardProductGuid() {
    return creditCardProductGuid;
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
   * Get currentRewardLevel
   * @return currentRewardLevel
  **/
  @ApiModelProperty(example = "", value = "")
  public String getCurrentRewardLevel() {
    return currentRewardLevel;
  }

   /**
   * Get dayPaymentIsDue
   * @return dayPaymentIsDue
  **/
  @ApiModelProperty(example = "20", value = "")
  public Integer getDayPaymentIsDue() {
    return dayPaymentIsDue;
  }

  public Account deathBenefit(BigDecimal deathBenefit) {
    this.deathBenefit = deathBenefit;
    return this;
  }

   /**
   * Get deathBenefit
   * @return deathBenefit
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getDeathBenefit() {
    return deathBenefit;
  }

  public void setDeathBenefit(BigDecimal deathBenefit) {
    this.deathBenefit = deathBenefit;
  }

   /**
   * Get enrolledInRewardsOn
   * @return enrolledInRewardsOn
  **/
  @ApiModelProperty(example = "", value = "")
  public String getEnrolledInRewardsOn() {
    return enrolledInRewardsOn;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1", value = "")
  public String getGuid() {
    return guid;
  }

  public Account holdingsValue(BigDecimal holdingsValue) {
    this.holdingsValue = holdingsValue;
    return this;
  }

   /**
   * Get holdingsValue
   * @return holdingsValue
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getHoldingsValue() {
    return holdingsValue;
  }

  public void setHoldingsValue(BigDecimal holdingsValue) {
    this.holdingsValue = holdingsValue;
  }

   /**
   * Get insuredName
   * @return insuredName
  **/
  @ApiModelProperty(example = "John Doe", value = "")
  public String getInsuredName() {
    return insuredName;
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
   * Get lastPaymentAt
   * @return lastPaymentAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:08:00+00:00", value = "")
  public String getLastPaymentAt() {
    return lastPaymentAt;
  }

  public Account loanAmount(BigDecimal loanAmount) {
    this.loanAmount = loanAmount;
    return this;
  }

   /**
   * Get loanAmount
   * @return loanAmount
  **/
  @ApiModelProperty(example = "1000.0", value = "")
  public BigDecimal getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(BigDecimal loanAmount) {
    this.loanAmount = loanAmount;
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
   * Get nextRewardLevel
   * @return nextRewardLevel
  **/
  @ApiModelProperty(example = "", value = "")
  public String getNextRewardLevel() {
    return nextRewardLevel;
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
   * Get payOutAmount
   * @return payOutAmount
  **/
  @ApiModelProperty(example = "2756.85", value = "")
  public BigDecimal getPayOutAmount() {
    return payOutAmount;
  }

   /**
   * Get premiumAmount
   * @return premiumAmount
  **/
  @ApiModelProperty(example = "300.65", value = "")
  public BigDecimal getPremiumAmount() {
    return premiumAmount;
  }

   /**
   * Get primaryRewardUnit
   * @return primaryRewardUnit
  **/
  @ApiModelProperty(example = "", value = "")
  public String getPrimaryRewardUnit() {
    return primaryRewardUnit;
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
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.apr, account.apr) &&
        Objects.equals(this.apy, account.apy) &&
        Objects.equals(this.availableBalance, account.availableBalance) &&
        Objects.equals(this.availableCredit, account.availableCredit) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.cashBalance, account.cashBalance) &&
        Objects.equals(this.cashSurrenderValue, account.cashSurrenderValue) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.creditCardProductGuid, account.creditCardProductGuid) &&
        Objects.equals(this.creditLimit, account.creditLimit) &&
        Objects.equals(this.currencyCode, account.currencyCode) &&
        Objects.equals(this.currentRewardLevel, account.currentRewardLevel) &&
        Objects.equals(this.dayPaymentIsDue, account.dayPaymentIsDue) &&
        Objects.equals(this.deathBenefit, account.deathBenefit) &&
        Objects.equals(this.enrolledInRewardsOn, account.enrolledInRewardsOn) &&
        Objects.equals(this.guid, account.guid) &&
        Objects.equals(this.holdingsValue, account.holdingsValue) &&
        Objects.equals(this.insuredName, account.insuredName) &&
        Objects.equals(this.institutionCode, account.institutionCode) &&
        Objects.equals(this.interestRate, account.interestRate) &&
        Objects.equals(this.isClosed, account.isClosed) &&
        Objects.equals(this.lastPayment, account.lastPayment) &&
        Objects.equals(this.lastPaymentAt, account.lastPaymentAt) &&
        Objects.equals(this.loanAmount, account.loanAmount) &&
        Objects.equals(this.maturesOn, account.maturesOn) &&
        Objects.equals(this.memberGuid, account.memberGuid) &&
        Objects.equals(this.minimumBalance, account.minimumBalance) &&
        Objects.equals(this.minimumPayment, account.minimumPayment) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.nextRewardLevel, account.nextRewardLevel) &&
        Objects.equals(this.originalBalance, account.originalBalance) &&
        Objects.equals(this.paymentDueAt, account.paymentDueAt) &&
        Objects.equals(this.payoffBalance, account.payoffBalance) &&
        Objects.equals(this.payOutAmount, account.payOutAmount) &&
        Objects.equals(this.premiumAmount, account.premiumAmount) &&
        Objects.equals(this.primaryRewardUnit, account.primaryRewardUnit) &&
        Objects.equals(this.startedOn, account.startedOn) &&
        Objects.equals(this.subtype, account.subtype) &&
        Objects.equals(this.totalAccountValue, account.totalAccountValue) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.updatedAt, account.updatedAt) &&
        Objects.equals(this.userGuid, account.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, apr, apy, availableBalance, availableCredit, balance, cashBalance, cashSurrenderValue, createdAt, creditCardProductGuid, creditLimit, currencyCode, currentRewardLevel, dayPaymentIsDue, deathBenefit, enrolledInRewardsOn, guid, holdingsValue, insuredName, institutionCode, interestRate, isClosed, lastPayment, lastPaymentAt, loanAmount, maturesOn, memberGuid, minimumBalance, minimumPayment, name, nextRewardLevel, originalBalance, paymentDueAt, payoffBalance, payOutAmount, premiumAmount, primaryRewardUnit, startedOn, subtype, totalAccountValue, type, updatedAt, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    apy: ").append(toIndentedString(apy)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    cashSurrenderValue: ").append(toIndentedString(cashSurrenderValue)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creditCardProductGuid: ").append(toIndentedString(creditCardProductGuid)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currentRewardLevel: ").append(toIndentedString(currentRewardLevel)).append("\n");
    sb.append("    dayPaymentIsDue: ").append(toIndentedString(dayPaymentIsDue)).append("\n");
    sb.append("    deathBenefit: ").append(toIndentedString(deathBenefit)).append("\n");
    sb.append("    enrolledInRewardsOn: ").append(toIndentedString(enrolledInRewardsOn)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    holdingsValue: ").append(toIndentedString(holdingsValue)).append("\n");
    sb.append("    insuredName: ").append(toIndentedString(insuredName)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    lastPayment: ").append(toIndentedString(lastPayment)).append("\n");
    sb.append("    lastPaymentAt: ").append(toIndentedString(lastPaymentAt)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    maturesOn: ").append(toIndentedString(maturesOn)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    minimumBalance: ").append(toIndentedString(minimumBalance)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextRewardLevel: ").append(toIndentedString(nextRewardLevel)).append("\n");
    sb.append("    originalBalance: ").append(toIndentedString(originalBalance)).append("\n");
    sb.append("    paymentDueAt: ").append(toIndentedString(paymentDueAt)).append("\n");
    sb.append("    payoffBalance: ").append(toIndentedString(payoffBalance)).append("\n");
    sb.append("    payOutAmount: ").append(toIndentedString(payOutAmount)).append("\n");
    sb.append("    premiumAmount: ").append(toIndentedString(premiumAmount)).append("\n");
    sb.append("    primaryRewardUnit: ").append(toIndentedString(primaryRewardUnit)).append("\n");
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

