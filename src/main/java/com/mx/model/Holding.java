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
 * Holding
 */


public class Holding {
  @SerializedName("account_guid")
  private String accountGuid = null;

  @SerializedName("cost_basis")
  private BigDecimal costBasis = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("cusip")
  private String cusip = null;

  @SerializedName("daily_change")
  private BigDecimal dailyChange = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("holding_type")
  private String holdingType = null;

  @SerializedName("market_value")
  private BigDecimal marketValue = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("purchase_price")
  private BigDecimal purchasePrice = null;

  @SerializedName("shares")
  private BigDecimal shares = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("user_guid")
  private String userGuid = null;

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @ApiModelProperty(example = "HOL-d65683e8-9eab-26bb-bcfd-ced159c9abe2", value = "")
  public String getAccountGuid() {
    return accountGuid;
  }

   /**
   * Get costBasis
   * @return costBasis
  **/
  @ApiModelProperty(example = "827.0", value = "")
  public BigDecimal getCostBasis() {
    return costBasis;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2015-04-13T12:01:23-06:00", value = "")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

   /**
   * Get cusip
   * @return cusip
  **/
  @ApiModelProperty(example = "18383M878", value = "")
  public String getCusip() {
    return cusip;
  }

   /**
   * Get dailyChange
   * @return dailyChange
  **/
  @ApiModelProperty(example = "2.5", value = "")
  public BigDecimal getDailyChange() {
    return dailyChange;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Guggenheim Defensive Equity ETF", value = "")
  public String getDescription() {
    return description;
  }

  public Holding guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "HOL-d65683e8-9eab-26bb-bcfd-ced159c9abe2", value = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

   /**
   * Get holdingType
   * @return holdingType
  **/
  @ApiModelProperty(example = "MONEY_MARKET", value = "")
  public String getHoldingType() {
    return holdingType;
  }

   /**
   * Get marketValue
   * @return marketValue
  **/
  @ApiModelProperty(example = "989.5", value = "")
  public BigDecimal getMarketValue() {
    return marketValue;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @ApiModelProperty(example = "MBR-d65683e8-9eab-26bb-bcfd-ced159c9abe", value = "")
  public String getMemberGuid() {
    return memberGuid;
  }

   /**
   * Get purchasePrice
   * @return purchasePrice
  **/
  @ApiModelProperty(example = "26.3", value = "")
  public BigDecimal getPurchasePrice() {
    return purchasePrice;
  }

   /**
   * Get shares
   * @return shares
  **/
  @ApiModelProperty(example = "6.0", value = "")
  public BigDecimal getShares() {
    return shares;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(example = "DEF", value = "")
  public String getSymbol() {
    return symbol;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2015-04-13T12:01:23-06:00", value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @ApiModelProperty(example = "USR-743e5d7f-1116-28fa-5de1-d3ba02e41d8d", value = "")
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
    Holding holding = (Holding) o;
    return Objects.equals(this.accountGuid, holding.accountGuid) &&
        Objects.equals(this.costBasis, holding.costBasis) &&
        Objects.equals(this.createdAt, holding.createdAt) &&
        Objects.equals(this.currencyCode, holding.currencyCode) &&
        Objects.equals(this.cusip, holding.cusip) &&
        Objects.equals(this.dailyChange, holding.dailyChange) &&
        Objects.equals(this.description, holding.description) &&
        Objects.equals(this.guid, holding.guid) &&
        Objects.equals(this.holdingType, holding.holdingType) &&
        Objects.equals(this.marketValue, holding.marketValue) &&
        Objects.equals(this.memberGuid, holding.memberGuid) &&
        Objects.equals(this.purchasePrice, holding.purchasePrice) &&
        Objects.equals(this.shares, holding.shares) &&
        Objects.equals(this.symbol, holding.symbol) &&
        Objects.equals(this.updatedAt, holding.updatedAt) &&
        Objects.equals(this.userGuid, holding.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, costBasis, createdAt, currencyCode, cusip, dailyChange, description, guid, holdingType, marketValue, memberGuid, purchasePrice, shares, symbol, updatedAt, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holding {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    dailyChange: ").append(toIndentedString(dailyChange)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    holdingType: ").append(toIndentedString(holdingType)).append("\n");
    sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

