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
 * MerchantLocation
 */


public class MerchantLocation {
  @SerializedName("city")
  private String city = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("merchant_guid")
  private String merchantGuid = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("store_number")
  private String storeNumber = null;

  @SerializedName("street_address")
  private String streetAddress = null;

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Los Angeles", value = "")
  public String getCity() {
    return city;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "MCL-00024e59-18b5-4d79-b879-2a7896726fea", value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "39.5963005", value = "")
  public BigDecimal getLatitude() {
    return latitude;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "-104.89158799999998", value = "")
  public BigDecimal getLongitude() {
    return longitude;
  }

   /**
   * Get merchantGuid
   * @return merchantGuid
  **/
  @ApiModelProperty(example = "MCH-09466f0a-fb58-9d1a-bae2-2af0afbea621", value = "")
  public String getMerchantGuid() {
    return merchantGuid;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "(303) 689-0728", value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "801121436", value = "")
  public String getPostalCode() {
    return postalCode;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "CO", value = "")
  public String getState() {
    return state;
  }

   /**
   * Get storeNumber
   * @return storeNumber
  **/
  @ApiModelProperty(example = "249", value = "")
  public String getStoreNumber() {
    return storeNumber;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @ApiModelProperty(example = "8547 E Arapahoe Rd, Ste 1", value = "")
  public String getStreetAddress() {
    return streetAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLocation merchantLocation = (MerchantLocation) o;
    return Objects.equals(this.city, merchantLocation.city) &&
        Objects.equals(this.guid, merchantLocation.guid) &&
        Objects.equals(this.latitude, merchantLocation.latitude) &&
        Objects.equals(this.longitude, merchantLocation.longitude) &&
        Objects.equals(this.merchantGuid, merchantLocation.merchantGuid) &&
        Objects.equals(this.phoneNumber, merchantLocation.phoneNumber) &&
        Objects.equals(this.postalCode, merchantLocation.postalCode) &&
        Objects.equals(this.state, merchantLocation.state) &&
        Objects.equals(this.storeNumber, merchantLocation.storeNumber) &&
        Objects.equals(this.streetAddress, merchantLocation.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, guid, latitude, longitude, merchantGuid, phoneNumber, postalCode, state, storeNumber, streetAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLocation {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeNumber: ").append(toIndentedString(storeNumber)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
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

