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
import com.mx.model.Holding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HoldingResponseBody
 */


public class HoldingResponseBody {
  @SerializedName("holding")
  private Holding holding = null;

  public HoldingResponseBody holding(Holding holding) {
    this.holding = holding;
    return this;
  }

   /**
   * Get holding
   * @return holding
  **/
  @ApiModelProperty(value = "")
  public Holding getHolding() {
    return holding;
  }

  public void setHolding(Holding holding) {
    this.holding = holding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingResponseBody holdingResponseBody = (HoldingResponseBody) o;
    return Objects.equals(this.holding, holdingResponseBody.holding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingResponseBody {\n");
    
    sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
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

