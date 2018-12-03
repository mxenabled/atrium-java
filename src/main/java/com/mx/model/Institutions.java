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
import com.mx.model.InstitutionAttributes;
import com.mx.model.Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Institutions
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T16:35:42.819-07:00")

public class Institutions {
  @SerializedName("institutions")
  private List<InstitutionAttributes> institutions = null;

  @SerializedName("pagination")
  private Pagination pagination = null;

  public Institutions institutions(List<InstitutionAttributes> institutions) {
    this.institutions = institutions;
    return this;
  }

  public Institutions addInstitutionsItem(InstitutionAttributes institutionsItem) {
    if (this.institutions == null) {
      this.institutions = new ArrayList<InstitutionAttributes>();
    }
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * Get institutions
   * @return institutions
  **/
  @ApiModelProperty(value = "")
  public List<InstitutionAttributes> getInstitutions() {
    return institutions;
  }

  public void setInstitutions(List<InstitutionAttributes> institutions) {
    this.institutions = institutions;
  }

  public Institutions pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institutions institutions = (Institutions) o;
    return Objects.equals(this.institutions, institutions.institutions) &&
        Objects.equals(this.pagination, institutions.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutions, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institutions {\n");
    
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

