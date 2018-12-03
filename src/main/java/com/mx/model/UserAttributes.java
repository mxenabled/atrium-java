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
 * UserAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T16:35:42.819-07:00")

public class UserAttributes {
  @SerializedName("guid")
  private String guid = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("is_disabled")
  private Boolean isDisabled = null;

  @SerializedName("metadata")
  private String metadata = null;

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "USR-d74cb14f-fd0a-449f-991b-e0362a63d9c6", value = "")
  public String getGuid() {
    return guid;
  }

  public UserAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "My-Unique-ID", value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public UserAttributes isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public UserAttributes metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"first_name\": \"Steven\", \"last_name\": \"Universe\"}", value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAttributes userAttributes = (UserAttributes) o;
    return Objects.equals(this.guid, userAttributes.guid) &&
        Objects.equals(this.identifier, userAttributes.identifier) &&
        Objects.equals(this.isDisabled, userAttributes.isDisabled) &&
        Objects.equals(this.metadata, userAttributes.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, identifier, isDisabled, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAttributes {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

