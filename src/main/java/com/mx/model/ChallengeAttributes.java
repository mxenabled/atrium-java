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
import com.mx.model.ChallengeOptionAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChallengeAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-04T10:29:21.360-07:00")

public class ChallengeAttributes {
  @SerializedName("field_name")
  private String fieldName = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("image_data")
  private String imageData = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("options")
  private List<ChallengeOptionAttributes> options = null;

   /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(value = "")
  public String getFieldName() {
    return fieldName;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get imageData
   * @return imageData
  **/
  @ApiModelProperty(value = "")
  public String getImageData() {
    return imageData;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public ChallengeAttributes options(List<ChallengeOptionAttributes> options) {
    this.options = options;
    return this;
  }

  public ChallengeAttributes addOptionsItem(ChallengeOptionAttributes optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<ChallengeOptionAttributes>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<ChallengeOptionAttributes> getOptions() {
    return options;
  }

  public void setOptions(List<ChallengeOptionAttributes> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeAttributes challengeAttributes = (ChallengeAttributes) o;
    return Objects.equals(this.fieldName, challengeAttributes.fieldName) &&
        Objects.equals(this.guid, challengeAttributes.guid) &&
        Objects.equals(this.imageData, challengeAttributes.imageData) &&
        Objects.equals(this.label, challengeAttributes.label) &&
        Objects.equals(this.options, challengeAttributes.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, guid, imageData, label, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeAttributes {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

