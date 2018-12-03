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
import com.mx.model.TransactionsCleanseAndCategorizeRequestBodyAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsCleanseAndCategorizeRequestBody
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T12:53:24.168-07:00")

public class TransactionsCleanseAndCategorizeRequestBody {
  @SerializedName("transactions")
  private List<TransactionsCleanseAndCategorizeRequestBodyAttributes> transactions = null;

  public TransactionsCleanseAndCategorizeRequestBody transactions(List<TransactionsCleanseAndCategorizeRequestBodyAttributes> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionsCleanseAndCategorizeRequestBody addTransactionsItem(TransactionsCleanseAndCategorizeRequestBodyAttributes transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<TransactionsCleanseAndCategorizeRequestBodyAttributes>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")
  public List<TransactionsCleanseAndCategorizeRequestBodyAttributes> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionsCleanseAndCategorizeRequestBodyAttributes> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsCleanseAndCategorizeRequestBody transactionsCleanseAndCategorizeRequestBody = (TransactionsCleanseAndCategorizeRequestBody) o;
    return Objects.equals(this.transactions, transactionsCleanseAndCategorizeRequestBody.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsCleanseAndCategorizeRequestBody {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

