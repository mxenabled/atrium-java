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
 * Merchant
 */


public class Merchant {
  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("logo_url")
  private String logoUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("website_url")
  private String websiteUrl = null;

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-04-20T19:30:12Z", value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public Merchant guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "MCH-7ed79542-884d-2b1b-dd74-501c5cc9d25b", value = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @ApiModelProperty(example = "https://s3.amazonaws.com/MD_Assets/merchant_logos/comcast.png", value = "")
  public String getLogoUrl() {
    return logoUrl;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Comcast", value = "")
  public String getName() {
    return name;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2018-09-28T21:13:53Z", value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @ApiModelProperty(example = "https://www.xfinity.com", value = "")
  public String getWebsiteUrl() {
    return websiteUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.createdAt, merchant.createdAt) &&
        Objects.equals(this.guid, merchant.guid) &&
        Objects.equals(this.logoUrl, merchant.logoUrl) &&
        Objects.equals(this.name, merchant.name) &&
        Objects.equals(this.updatedAt, merchant.updatedAt) &&
        Objects.equals(this.websiteUrl, merchant.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, guid, logoUrl, name, updatedAt, websiteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

