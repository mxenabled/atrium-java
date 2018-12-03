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
 * ChallengeOptionAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T16:35:42.819-07:00")

public class ChallengeOptionAttributes {
  @SerializedName("image_data")
  private String imageData = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("value")
  private String value = null;

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

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeOptionAttributes challengeOptionAttributes = (ChallengeOptionAttributes) o;
    return Objects.equals(this.imageData, challengeOptionAttributes.imageData) &&
        Objects.equals(this.label, challengeOptionAttributes.label) &&
        Objects.equals(this.value, challengeOptionAttributes.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageData, label, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeOptionAttributes {\n");
    
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

