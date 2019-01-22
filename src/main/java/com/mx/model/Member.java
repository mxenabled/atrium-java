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
 * Member
 */


public class Member {
  @SerializedName("aggregated_at")
  private String aggregatedAt = null;

  @SerializedName("connection_status")
  private String connectionStatus = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("institution_code")
  private String institutionCode = null;

  @SerializedName("is_being_aggregated")
  private Boolean isBeingAggregated = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("successfully_aggregated_at")
  private String successfullyAggregatedAt = null;

  @SerializedName("user_guid")
  private String userGuid = null;

   /**
   * Get aggregatedAt
   * @return aggregatedAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:07:57+00:00", value = "")
  public String getAggregatedAt() {
    return aggregatedAt;
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
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")
  public String getGuid() {
    return guid;
  }

  public Member identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "unique_id", value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Member institutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
    return this;
  }

   /**
   * Get institutionCode
   * @return institutionCode
  **/
  @ApiModelProperty(example = "chase", value = "")
  public String getInstitutionCode() {
    return institutionCode;
  }

  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }

   /**
   * Get isBeingAggregated
   * @return isBeingAggregated
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsBeingAggregated() {
    return isBeingAggregated;
  }

  public Member metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"credentials_last_refreshed_at\": \"2015-10-15\"}", value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Chase Bank", value = "")
  public String getName() {
    return name;
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
    Member member = (Member) o;
    return Objects.equals(this.aggregatedAt, member.aggregatedAt) &&
        Objects.equals(this.connectionStatus, member.connectionStatus) &&
        Objects.equals(this.guid, member.guid) &&
        Objects.equals(this.identifier, member.identifier) &&
        Objects.equals(this.institutionCode, member.institutionCode) &&
        Objects.equals(this.isBeingAggregated, member.isBeingAggregated) &&
        Objects.equals(this.metadata, member.metadata) &&
        Objects.equals(this.name, member.name) &&
        Objects.equals(this.status, member.status) &&
        Objects.equals(this.successfullyAggregatedAt, member.successfullyAggregatedAt) &&
        Objects.equals(this.userGuid, member.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedAt, connectionStatus, guid, identifier, institutionCode, isBeingAggregated, metadata, name, status, successfullyAggregatedAt, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    aggregatedAt: ").append(toIndentedString(aggregatedAt)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    isBeingAggregated: ").append(toIndentedString(isBeingAggregated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successfullyAggregatedAt: ").append(toIndentedString(successfullyAggregatedAt)).append("\n");
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

