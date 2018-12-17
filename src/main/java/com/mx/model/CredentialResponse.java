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
import com.mx.model.CredentialOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CredentialResponse
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-16T18:26:56.880-07:00")

public class CredentialResponse {
  @SerializedName("field_name")
  private String fieldName = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("options")
  private List<CredentialOption> options = null;

  @SerializedName("type")
  private String type = null;

   /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(example = "LOGIN", value = "")
  public String getFieldName() {
    return fieldName;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "CRD-1ec152cd-e628-e81a-e852-d1e7104624da", value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "Username", value = "")
  public String getLabel() {
    return label;
  }

  public CredentialResponse options(List<CredentialOption> options) {
    this.options = options;
    return this;
  }

  public CredentialResponse addOptionsItem(CredentialOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<CredentialOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<CredentialOption> getOptions() {
    return options;
  }

  public void setOptions(List<CredentialOption> options) {
    this.options = options;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "LOGIN", value = "")
  public String getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialResponse credentialResponse = (CredentialResponse) o;
    return Objects.equals(this.fieldName, credentialResponse.fieldName) &&
        Objects.equals(this.guid, credentialResponse.guid) &&
        Objects.equals(this.label, credentialResponse.label) &&
        Objects.equals(this.options, credentialResponse.options) &&
        Objects.equals(this.type, credentialResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, guid, label, options, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialResponse {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

