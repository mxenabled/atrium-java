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
 * Pagination
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T12:53:24.168-07:00")

public class Pagination {
  @SerializedName("current_page")
  private Integer currentPage = null;

  @SerializedName("per_page")
  private Integer perPage = null;

  @SerializedName("total_entries")
  private Integer totalEntries = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

   /**
   * Get currentPage
   * @return currentPage
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @ApiModelProperty(example = "25", value = "")
  public Integer getPerPage() {
    return perPage;
  }

   /**
   * Get totalEntries
   * @return totalEntries
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getTotalEntries() {
    return totalEntries;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getTotalPages() {
    return totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.currentPage, pagination.currentPage) &&
        Objects.equals(this.perPage, pagination.perPage) &&
        Objects.equals(this.totalEntries, pagination.totalEntries) &&
        Objects.equals(this.totalPages, pagination.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, perPage, totalEntries, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

