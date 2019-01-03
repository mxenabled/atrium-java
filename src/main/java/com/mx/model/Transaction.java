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
 * Transaction
 */


public class Transaction {
  @SerializedName("account_guid")
  private String accountGuid = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("check_number")
  private Integer checkNumber = null;

  @SerializedName("check_number_string")
  private String checkNumberString = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("is_bill_pay")
  private Boolean isBillPay = null;

  @SerializedName("is_direct_deposit")
  private Boolean isDirectDeposit = null;

  @SerializedName("is_expense")
  private Boolean isExpense = null;

  @SerializedName("is_fee")
  private Boolean isFee = null;

  @SerializedName("is_income")
  private Boolean isIncome = null;

  @SerializedName("is_international")
  private Boolean isInternational = null;

  @SerializedName("is_overdraft_fee")
  private Boolean isOverdraftFee = null;

  @SerializedName("is_payroll_advance")
  private Boolean isPayrollAdvance = null;

  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("merchant_category_code")
  private Integer merchantCategoryCode = null;

  @SerializedName("original_description")
  private String originalDescription = null;

  @SerializedName("posted_at")
  private String postedAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("top_level_category")
  private String topLevelCategory = null;

  @SerializedName("transacted_at")
  private String transactedAt = null;

  @SerializedName("type")
  private String type = null;

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
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "61.11", value = "")
  public BigDecimal getAmount() {
    return amount;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "Groceries", value = "")
  public String getCategory() {
    return category;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @ApiModelProperty(example = "15234", value = "")
  public Integer getCheckNumber() {
    return checkNumber;
  }

   /**
   * Get checkNumberString
   * @return checkNumberString
  **/
  @ApiModelProperty(example = "00015234", value = "")
  public String getCheckNumberString() {
    return checkNumberString;
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
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2013-09-23", value = "")
  public String getDate() {
    return date;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Whole foods", value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "TRN-265abee9-889b-af6a-c69b-25157db2bdd9", value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get isBillPay
   * @return isBillPay
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsBillPay() {
    return isBillPay;
  }

   /**
   * Get isDirectDeposit
   * @return isDirectDeposit
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsDirectDeposit() {
    return isDirectDeposit;
  }

   /**
   * Get isExpense
   * @return isExpense
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsExpense() {
    return isExpense;
  }

   /**
   * Get isFee
   * @return isFee
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsFee() {
    return isFee;
  }

   /**
   * Get isIncome
   * @return isIncome
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsIncome() {
    return isIncome;
  }

   /**
   * Get isInternational
   * @return isInternational
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsInternational() {
    return isInternational;
  }

   /**
   * Get isOverdraftFee
   * @return isOverdraftFee
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsOverdraftFee() {
    return isOverdraftFee;
  }

   /**
   * Get isPayrollAdvance
   * @return isPayrollAdvance
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsPayrollAdvance() {
    return isPayrollAdvance;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "-43.2075", value = "")
  public BigDecimal getLatitude() {
    return latitude;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "139.691706", value = "")
  public BigDecimal getLongitude() {
    return longitude;
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
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

   /**
   * Get merchantCategoryCode
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(example = "5411", value = "")
  public Integer getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

   /**
   * Get originalDescription
   * @return originalDescription
  **/
  @ApiModelProperty(example = "WHOLEFDS TSQ 102", value = "")
  public String getOriginalDescription() {
    return originalDescription;
  }

   /**
   * Get postedAt
   * @return postedAt
  **/
  @ApiModelProperty(example = "2016-10-07T06:00:00+00:00", value = "")
  public String getPostedAt() {
    return postedAt;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "POSTED", value = "")
  public String getStatus() {
    return status;
  }

   /**
   * Get topLevelCategory
   * @return topLevelCategory
  **/
  @ApiModelProperty(example = "Food & Dining", value = "")
  public String getTopLevelCategory() {
    return topLevelCategory;
  }

   /**
   * Get transactedAt
   * @return transactedAt
  **/
  @ApiModelProperty(example = "2016-10-06T13:00:00+00:00", value = "")
  public String getTransactedAt() {
    return transactedAt;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "DEBIT", value = "")
  public String getType() {
    return type;
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.accountGuid, transaction.accountGuid) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.category, transaction.category) &&
        Objects.equals(this.checkNumber, transaction.checkNumber) &&
        Objects.equals(this.checkNumberString, transaction.checkNumberString) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.currencyCode, transaction.currencyCode) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.guid, transaction.guid) &&
        Objects.equals(this.isBillPay, transaction.isBillPay) &&
        Objects.equals(this.isDirectDeposit, transaction.isDirectDeposit) &&
        Objects.equals(this.isExpense, transaction.isExpense) &&
        Objects.equals(this.isFee, transaction.isFee) &&
        Objects.equals(this.isIncome, transaction.isIncome) &&
        Objects.equals(this.isInternational, transaction.isInternational) &&
        Objects.equals(this.isOverdraftFee, transaction.isOverdraftFee) &&
        Objects.equals(this.isPayrollAdvance, transaction.isPayrollAdvance) &&
        Objects.equals(this.latitude, transaction.latitude) &&
        Objects.equals(this.longitude, transaction.longitude) &&
        Objects.equals(this.memberGuid, transaction.memberGuid) &&
        Objects.equals(this.memo, transaction.memo) &&
        Objects.equals(this.merchantCategoryCode, transaction.merchantCategoryCode) &&
        Objects.equals(this.originalDescription, transaction.originalDescription) &&
        Objects.equals(this.postedAt, transaction.postedAt) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.topLevelCategory, transaction.topLevelCategory) &&
        Objects.equals(this.transactedAt, transaction.transactedAt) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.updatedAt, transaction.updatedAt) &&
        Objects.equals(this.userGuid, transaction.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, amount, category, checkNumber, checkNumberString, createdAt, currencyCode, date, description, guid, isBillPay, isDirectDeposit, isExpense, isFee, isIncome, isInternational, isOverdraftFee, isPayrollAdvance, latitude, longitude, memberGuid, memo, merchantCategoryCode, originalDescription, postedAt, status, topLevelCategory, transactedAt, type, updatedAt, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    checkNumberString: ").append(toIndentedString(checkNumberString)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    isBillPay: ").append(toIndentedString(isBillPay)).append("\n");
    sb.append("    isDirectDeposit: ").append(toIndentedString(isDirectDeposit)).append("\n");
    sb.append("    isExpense: ").append(toIndentedString(isExpense)).append("\n");
    sb.append("    isFee: ").append(toIndentedString(isFee)).append("\n");
    sb.append("    isIncome: ").append(toIndentedString(isIncome)).append("\n");
    sb.append("    isInternational: ").append(toIndentedString(isInternational)).append("\n");
    sb.append("    isOverdraftFee: ").append(toIndentedString(isOverdraftFee)).append("\n");
    sb.append("    isPayrollAdvance: ").append(toIndentedString(isPayrollAdvance)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
    sb.append("    postedAt: ").append(toIndentedString(postedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    topLevelCategory: ").append(toIndentedString(topLevelCategory)).append("\n");
    sb.append("    transactedAt: ").append(toIndentedString(transactedAt)).append("\n");
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

