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
 * CreditCardProduct
 */


public class CreditCardProduct {
  @SerializedName("guid")
  private String guid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("annual_fee")
  private BigDecimal annualFee = null;

  @SerializedName("has_cashback_rewards")
  private Boolean hasCashbackRewards = null;

  @SerializedName("has_travel_rewards")
  private Boolean hasTravelRewards = null;

  @SerializedName("is_small_business_card")
  private Boolean isSmallBusinessCard = null;

  @SerializedName("has_zero_percent_introductory_rate")
  private Boolean hasZeroPercentIntroductoryRate = null;

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "CCA-b5bcd822-6d01-4e23-b8d6-846a225e714a", value = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Wells Fargo Rewards", value = "")
  public String getName() {
    return name;
  }

   /**
   * Get annualFee
   * @return annualFee
  **/
  @ApiModelProperty(example = "15.0", value = "")
  public BigDecimal getAnnualFee() {
    return annualFee;
  }

   /**
   * Get hasCashbackRewards
   * @return hasCashbackRewards
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isHasCashbackRewards() {
    return hasCashbackRewards;
  }

   /**
   * Get hasTravelRewards
   * @return hasTravelRewards
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isHasTravelRewards() {
    return hasTravelRewards;
  }

   /**
   * Get isSmallBusinessCard
   * @return isSmallBusinessCard
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsSmallBusinessCard() {
    return isSmallBusinessCard;
  }

   /**
   * Get hasZeroPercentIntroductoryRate
   * @return hasZeroPercentIntroductoryRate
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isHasZeroPercentIntroductoryRate() {
    return hasZeroPercentIntroductoryRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardProduct creditCardProduct = (CreditCardProduct) o;
    return Objects.equals(this.guid, creditCardProduct.guid) &&
        Objects.equals(this.name, creditCardProduct.name) &&
        Objects.equals(this.annualFee, creditCardProduct.annualFee) &&
        Objects.equals(this.hasCashbackRewards, creditCardProduct.hasCashbackRewards) &&
        Objects.equals(this.hasTravelRewards, creditCardProduct.hasTravelRewards) &&
        Objects.equals(this.isSmallBusinessCard, creditCardProduct.isSmallBusinessCard) &&
        Objects.equals(this.hasZeroPercentIntroductoryRate, creditCardProduct.hasZeroPercentIntroductoryRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, name, annualFee, hasCashbackRewards, hasTravelRewards, isSmallBusinessCard, hasZeroPercentIntroductoryRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardProduct {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    annualFee: ").append(toIndentedString(annualFee)).append("\n");
    sb.append("    hasCashbackRewards: ").append(toIndentedString(hasCashbackRewards)).append("\n");
    sb.append("    hasTravelRewards: ").append(toIndentedString(hasTravelRewards)).append("\n");
    sb.append("    isSmallBusinessCard: ").append(toIndentedString(isSmallBusinessCard)).append("\n");
    sb.append("    hasZeroPercentIntroductoryRate: ").append(toIndentedString(hasZeroPercentIntroductoryRate)).append("\n");
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

