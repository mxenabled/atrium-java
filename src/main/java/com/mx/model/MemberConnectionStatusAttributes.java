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
import java.util.ArrayList;
import java.util.List;

/**
 * MemberConnectionStatusAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-11-29T15:45:20.941-07:00")

public class MemberConnectionStatusAttributes {
  @SerializedName("aggregated_at")
  private String aggregatedAt = null;

  @SerializedName("challenges")
  private List<Object> challenges = null;

  @SerializedName("connection_status")
  private String connectionStatus = null;

  @SerializedName("guid")
  private Boolean guid = null;

  @SerializedName("has_processed_accounts")
  private Boolean hasProcessedAccounts = null;

  @SerializedName("has_processed_transactions")
  private Boolean hasProcessedTransactions = null;

  @SerializedName("is_being_aggregated")
  private Boolean isBeingAggregated = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("successfully_aggregated_at")
  private String successfullyAggregatedAt = null;

   /**
   * Get aggregatedAt
   * @return aggregatedAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:07:57+00:00", value = "")
  public String getAggregatedAt() {
    return aggregatedAt;
  }

  public MemberConnectionStatusAttributes challenges(List<Object> challenges) {
    this.challenges = challenges;
    return this;
  }

  public MemberConnectionStatusAttributes addChallengesItem(Object challengesItem) {
    if (this.challenges == null) {
      this.challenges = new ArrayList<Object>();
    }
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * Get challenges
   * @return challenges
  **/
  @ApiModelProperty(value = "")
  public List<Object> getChallenges() {
    return challenges;
  }

  public void setChallenges(List<Object> challenges) {
    this.challenges = challenges;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @ApiModelProperty(example = "CONNECTED", value = "")
  public String getConnectionStatus() {
    return connectionStatus;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isGuid() {
    return guid;
  }

   /**
   * Get hasProcessedAccounts
   * @return hasProcessedAccounts
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isHasProcessedAccounts() {
    return hasProcessedAccounts;
  }

   /**
   * Get hasProcessedTransactions
   * @return hasProcessedTransactions
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isHasProcessedTransactions() {
    return hasProcessedTransactions;
  }

   /**
   * Get isBeingAggregated
   * @return isBeingAggregated
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsBeingAggregated() {
    return isBeingAggregated;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "COMPLETED", value = "")
  public String getStatus() {
    return status;
  }

   /**
   * Get successfullyAggregatedAt
   * @return successfullyAggregatedAt
  **/
  @ApiModelProperty(example = "2016-10-13T17:57:38+00:00", value = "")
  public String getSuccessfullyAggregatedAt() {
    return successfullyAggregatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberConnectionStatusAttributes memberConnectionStatusAttributes = (MemberConnectionStatusAttributes) o;
    return Objects.equals(this.aggregatedAt, memberConnectionStatusAttributes.aggregatedAt) &&
        Objects.equals(this.challenges, memberConnectionStatusAttributes.challenges) &&
        Objects.equals(this.connectionStatus, memberConnectionStatusAttributes.connectionStatus) &&
        Objects.equals(this.guid, memberConnectionStatusAttributes.guid) &&
        Objects.equals(this.hasProcessedAccounts, memberConnectionStatusAttributes.hasProcessedAccounts) &&
        Objects.equals(this.hasProcessedTransactions, memberConnectionStatusAttributes.hasProcessedTransactions) &&
        Objects.equals(this.isBeingAggregated, memberConnectionStatusAttributes.isBeingAggregated) &&
        Objects.equals(this.status, memberConnectionStatusAttributes.status) &&
        Objects.equals(this.successfullyAggregatedAt, memberConnectionStatusAttributes.successfullyAggregatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedAt, challenges, connectionStatus, guid, hasProcessedAccounts, hasProcessedTransactions, isBeingAggregated, status, successfullyAggregatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberConnectionStatusAttributes {\n");
    
    sb.append("    aggregatedAt: ").append(toIndentedString(aggregatedAt)).append("\n");
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hasProcessedAccounts: ").append(toIndentedString(hasProcessedAccounts)).append("\n");
    sb.append("    hasProcessedTransactions: ").append(toIndentedString(hasProcessedTransactions)).append("\n");
    sb.append("    isBeingAggregated: ").append(toIndentedString(isBeingAggregated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successfullyAggregatedAt: ").append(toIndentedString(successfullyAggregatedAt)).append("\n");
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
