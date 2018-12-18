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
 * Institution
 */


public class Institution {
  @SerializedName("code")
  private String code = null;

  @SerializedName("medium_logo_url")
  private String mediumLogoUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("small_logo_url")
  private String smallLogoUrl = null;

  @SerializedName("supports_account_identification")
  private Boolean supportsAccountIdentification = null;

  @SerializedName("supports_account_verification")
  private Boolean supportsAccountVerification = null;

  @SerializedName("url")
  private String url = null;

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "chase", value = "")
  public String getCode() {
    return code;
  }

   /**
   * Get mediumLogoUrl
   * @return mediumLogoUrl
  **/
  @ApiModelProperty(example = "https://content.moneydesktop.com/storage/MD_Assets/Ipad%20Logos/100x100/default_100x100.png", value = "")
  public String getMediumLogoUrl() {
    return mediumLogoUrl;
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
   * Get smallLogoUrl
   * @return smallLogoUrl
  **/
  @ApiModelProperty(example = "https://content.moneydesktop.com/storage/MD_Assets/Ipad%20Logos/50x50/default_50x50.png", value = "")
  public String getSmallLogoUrl() {
    return smallLogoUrl;
  }

   /**
   * Get supportsAccountIdentification
   * @return supportsAccountIdentification
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isSupportsAccountIdentification() {
    return supportsAccountIdentification;
  }

   /**
   * Get supportsAccountVerification
   * @return supportsAccountVerification
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isSupportsAccountVerification() {
    return supportsAccountVerification;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "https://www.chase.com", value = "")
  public String getUrl() {
    return url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institution institution = (Institution) o;
    return Objects.equals(this.code, institution.code) &&
        Objects.equals(this.mediumLogoUrl, institution.mediumLogoUrl) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.smallLogoUrl, institution.smallLogoUrl) &&
        Objects.equals(this.supportsAccountIdentification, institution.supportsAccountIdentification) &&
        Objects.equals(this.supportsAccountVerification, institution.supportsAccountVerification) &&
        Objects.equals(this.url, institution.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, mediumLogoUrl, name, smallLogoUrl, supportsAccountIdentification, supportsAccountVerification, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    mediumLogoUrl: ").append(toIndentedString(mediumLogoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smallLogoUrl: ").append(toIndentedString(smallLogoUrl)).append("\n");
    sb.append("    supportsAccountIdentification: ").append(toIndentedString(supportsAccountIdentification)).append("\n");
    sb.append("    supportsAccountVerification: ").append(toIndentedString(supportsAccountVerification)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

