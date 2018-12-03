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
 * AccountOwnerAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T16:35:42.819-07:00")

public class AccountOwnerAttributes {
  @SerializedName("account_guid")
  private String accountGuid = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("user_guid")
  private String userGuid = null;

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @ApiModelProperty(example = "ACT-123", value = "")
  public String getAccountGuid() {
    return accountGuid;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "123 This Way", value = "")
  public String getAddress() {
    return address;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Middlesex", value = "")
  public String getCity() {
    return city;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "")
  public String getCountry() {
    return country;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "donnie@darko.co", value = "")
  public String getEmail() {
    return email;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "ACO-123", value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @ApiModelProperty(example = "MBR-123", value = "")
  public String getMemberGuid() {
    return memberGuid;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(example = "Donnie Darko", value = "")
  public String getOwnerName() {
    return ownerName;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "00000-0000", value = "")
  public String getPostalCode() {
    return postalCode;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "VA", value = "")
  public String getState() {
    return state;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @ApiModelProperty(example = "USR-123", value = "")
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
    AccountOwnerAttributes accountOwnerAttributes = (AccountOwnerAttributes) o;
    return Objects.equals(this.accountGuid, accountOwnerAttributes.accountGuid) &&
        Objects.equals(this.address, accountOwnerAttributes.address) &&
        Objects.equals(this.city, accountOwnerAttributes.city) &&
        Objects.equals(this.country, accountOwnerAttributes.country) &&
        Objects.equals(this.email, accountOwnerAttributes.email) &&
        Objects.equals(this.guid, accountOwnerAttributes.guid) &&
        Objects.equals(this.memberGuid, accountOwnerAttributes.memberGuid) &&
        Objects.equals(this.ownerName, accountOwnerAttributes.ownerName) &&
        Objects.equals(this.postalCode, accountOwnerAttributes.postalCode) &&
        Objects.equals(this.state, accountOwnerAttributes.state) &&
        Objects.equals(this.userGuid, accountOwnerAttributes.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, address, city, country, email, guid, memberGuid, ownerName, postalCode, state, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOwnerAttributes {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

