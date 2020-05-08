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
import com.mx.model.CredentialRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MemberCreateRequest
 */


public class MemberCreateRequest {
  @SerializedName("credentials")
  private List<CredentialRequest> credentials = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("is_oauth")
  private Boolean isOauth = null;

  @SerializedName("institution_code")
  private String institutionCode = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("referral_source")
  private String referralSource = null;

  @SerializedName("skip_aggregation")
  private Boolean skipAggregation = null;

  @SerializedName("ui_message_webview_url_scheme")
  private String uiMessageWebviewUrlScheme = null;

  public MemberCreateRequest credentials(List<CredentialRequest> credentials) {
    this.credentials = credentials;
    return this;
  }

  public MemberCreateRequest addCredentialsItem(CredentialRequest credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<CredentialRequest>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public List<CredentialRequest> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<CredentialRequest> credentials) {
    this.credentials = credentials;
  }

  public MemberCreateRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "unique_id", value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public MemberCreateRequest isOauth(Boolean isOauth) {
    this.isOauth = isOauth;
    return this;
  }

   /**
   * Get isOauth
   * @return isOauth
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsOauth() {
    return isOauth;
  }

  public void setIsOauth(Boolean isOauth) {
    this.isOauth = isOauth;
  }

  public MemberCreateRequest institutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
    return this;
  }

   /**
   * Get institutionCode
   * @return institutionCode
  **/
  @ApiModelProperty(example = "chase", required = true, value = "")
  public String getInstitutionCode() {
    return institutionCode;
  }

  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }

  public MemberCreateRequest metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"credentials_last_refreshed_at\": \"2015-10-15\"}", value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public MemberCreateRequest referralSource(String referralSource) {
    this.referralSource = referralSource;
    return this;
  }

   /**
   * Get referralSource
   * @return referralSource
  **/
  @ApiModelProperty(example = "BROWSER", value = "")
  public String getReferralSource() {
    return referralSource;
  }

  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }

  public MemberCreateRequest skipAggregation(Boolean skipAggregation) {
    this.skipAggregation = skipAggregation;
    return this;
  }

   /**
   * Get skipAggregation
   * @return skipAggregation
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isSkipAggregation() {
    return skipAggregation;
  }

  public void setSkipAggregation(Boolean skipAggregation) {
    this.skipAggregation = skipAggregation;
  }

  public MemberCreateRequest uiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    this.uiMessageWebviewUrlScheme = uiMessageWebviewUrlScheme;
    return this;
  }

   /**
   * Get uiMessageWebviewUrlScheme
   * @return uiMessageWebviewUrlScheme
  **/
  @ApiModelProperty(example = "example_ui_message_webview_url_scheme", value = "")
  public String getUiMessageWebviewUrlScheme() {
    return uiMessageWebviewUrlScheme;
  }

  public void setUiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    this.uiMessageWebviewUrlScheme = uiMessageWebviewUrlScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberCreateRequest memberCreateRequest = (MemberCreateRequest) o;
    return Objects.equals(this.credentials, memberCreateRequest.credentials) &&
        Objects.equals(this.identifier, memberCreateRequest.identifier) &&
        Objects.equals(this.isOauth, memberCreateRequest.isOauth) &&
        Objects.equals(this.institutionCode, memberCreateRequest.institutionCode) &&
        Objects.equals(this.metadata, memberCreateRequest.metadata) &&
        Objects.equals(this.referralSource, memberCreateRequest.referralSource) &&
        Objects.equals(this.skipAggregation, memberCreateRequest.skipAggregation) &&
        Objects.equals(this.uiMessageWebviewUrlScheme, memberCreateRequest.uiMessageWebviewUrlScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, identifier, isOauth, institutionCode, metadata, referralSource, skipAggregation, uiMessageWebviewUrlScheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCreateRequest {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isOauth: ").append(toIndentedString(isOauth)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    referralSource: ").append(toIndentedString(referralSource)).append("\n");
    sb.append("    skipAggregation: ").append(toIndentedString(skipAggregation)).append("\n");
    sb.append("    uiMessageWebviewUrlScheme: ").append(toIndentedString(uiMessageWebviewUrlScheme)).append("\n");
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

