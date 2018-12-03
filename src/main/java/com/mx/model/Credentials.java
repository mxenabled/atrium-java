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
import com.mx.model.CredentialAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Credentials
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T16:35:42.819-07:00")

public class Credentials {
  @SerializedName("credentials")
  private List<CredentialAttributes> credentials = null;

  public Credentials credentials(List<CredentialAttributes> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Credentials addCredentialsItem(CredentialAttributes credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<CredentialAttributes>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public List<CredentialAttributes> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<CredentialAttributes> credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credentials credentials = (Credentials) o;
    return Objects.equals(this.credentials, credentials.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credentials {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

