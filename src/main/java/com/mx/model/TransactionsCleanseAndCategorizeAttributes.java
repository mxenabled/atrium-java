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
 * TransactionsCleanseAndCategorizeAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-11-29T15:45:20.941-07:00")

public class TransactionsCleanseAndCategorizeAttributes {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("type")
  private String type = null;

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

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "21.33", value = "")
  public BigDecimal getAmount() {
    return amount;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "Fast Food", value = "")
  public String getCategory() {
    return category;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "In N Out Burger", value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "13", value = "")
  public String getIdentifier() {
    return identifier;
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
  @ApiModelProperty(value = "")
  public Boolean isIsExpense() {
    return isExpense;
  }

   /**
   * Get isFee
   * @return isFee
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFee() {
    return isFee;
  }

   /**
   * Get isIncome
   * @return isIncome
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsIncome() {
    return isIncome;
  }

   /**
   * Get isInternational
   * @return isInternational
  **/
  @ApiModelProperty(value = "")
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsCleanseAndCategorizeAttributes transactionsCleanseAndCategorizeAttributes = (TransactionsCleanseAndCategorizeAttributes) o;
    return Objects.equals(this.amount, transactionsCleanseAndCategorizeAttributes.amount) &&
        Objects.equals(this.category, transactionsCleanseAndCategorizeAttributes.category) &&
        Objects.equals(this.description, transactionsCleanseAndCategorizeAttributes.description) &&
        Objects.equals(this.identifier, transactionsCleanseAndCategorizeAttributes.identifier) &&
        Objects.equals(this.type, transactionsCleanseAndCategorizeAttributes.type) &&
        Objects.equals(this.isBillPay, transactionsCleanseAndCategorizeAttributes.isBillPay) &&
        Objects.equals(this.isDirectDeposit, transactionsCleanseAndCategorizeAttributes.isDirectDeposit) &&
        Objects.equals(this.isExpense, transactionsCleanseAndCategorizeAttributes.isExpense) &&
        Objects.equals(this.isFee, transactionsCleanseAndCategorizeAttributes.isFee) &&
        Objects.equals(this.isIncome, transactionsCleanseAndCategorizeAttributes.isIncome) &&
        Objects.equals(this.isInternational, transactionsCleanseAndCategorizeAttributes.isInternational) &&
        Objects.equals(this.isOverdraftFee, transactionsCleanseAndCategorizeAttributes.isOverdraftFee) &&
        Objects.equals(this.isPayrollAdvance, transactionsCleanseAndCategorizeAttributes.isPayrollAdvance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, category, description, identifier, type, isBillPay, isDirectDeposit, isExpense, isFee, isIncome, isInternational, isOverdraftFee, isPayrollAdvance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsCleanseAndCategorizeAttributes {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isBillPay: ").append(toIndentedString(isBillPay)).append("\n");
    sb.append("    isDirectDeposit: ").append(toIndentedString(isDirectDeposit)).append("\n");
    sb.append("    isExpense: ").append(toIndentedString(isExpense)).append("\n");
    sb.append("    isFee: ").append(toIndentedString(isFee)).append("\n");
    sb.append("    isIncome: ").append(toIndentedString(isIncome)).append("\n");
    sb.append("    isInternational: ").append(toIndentedString(isInternational)).append("\n");
    sb.append("    isOverdraftFee: ").append(toIndentedString(isOverdraftFee)).append("\n");
    sb.append("    isPayrollAdvance: ").append(toIndentedString(isPayrollAdvance)).append("\n");
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

