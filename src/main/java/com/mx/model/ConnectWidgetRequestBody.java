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
 * ConnectWidgetRequestBody
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-04T10:29:21.360-07:00")

public class ConnectWidgetRequestBody {
  @SerializedName("is_mobile_webview")
  private Boolean isMobileWebview = null;

  @SerializedName("current_institution_code")
  private String currentInstitutionCode = null;

  @SerializedName("current_member_guid")
  private String currentMemberGuid = null;

  @SerializedName("update_credentials")
  private Boolean updateCredentials = null;

  public ConnectWidgetRequestBody isMobileWebview(Boolean isMobileWebview) {
    this.isMobileWebview = isMobileWebview;
    return this;
  }

   /**
   * Get isMobileWebview
   * @return isMobileWebview
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsMobileWebview() {
    return isMobileWebview;
  }

  public void setIsMobileWebview(Boolean isMobileWebview) {
    this.isMobileWebview = isMobileWebview;
  }

  public ConnectWidgetRequestBody currentInstitutionCode(String currentInstitutionCode) {
    this.currentInstitutionCode = currentInstitutionCode;
    return this;
  }

   /**
   * Get currentInstitutionCode
   * @return currentInstitutionCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrentInstitutionCode() {
    return currentInstitutionCode;
  }

  public void setCurrentInstitutionCode(String currentInstitutionCode) {
    this.currentInstitutionCode = currentInstitutionCode;
  }

  public ConnectWidgetRequestBody currentMemberGuid(String currentMemberGuid) {
    this.currentMemberGuid = currentMemberGuid;
    return this;
  }

   /**
   * Get currentMemberGuid
   * @return currentMemberGuid
  **/
  @ApiModelProperty(value = "")
  public String getCurrentMemberGuid() {
    return currentMemberGuid;
  }

  public void setCurrentMemberGuid(String currentMemberGuid) {
    this.currentMemberGuid = currentMemberGuid;
  }

  public ConnectWidgetRequestBody updateCredentials(Boolean updateCredentials) {
    this.updateCredentials = updateCredentials;
    return this;
  }

   /**
   * Get updateCredentials
   * @return updateCredentials
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateCredentials() {
    return updateCredentials;
  }

  public void setUpdateCredentials(Boolean updateCredentials) {
    this.updateCredentials = updateCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectWidgetRequestBody connectWidgetRequestBody = (ConnectWidgetRequestBody) o;
    return Objects.equals(this.isMobileWebview, connectWidgetRequestBody.isMobileWebview) &&
        Objects.equals(this.currentInstitutionCode, connectWidgetRequestBody.currentInstitutionCode) &&
        Objects.equals(this.currentMemberGuid, connectWidgetRequestBody.currentMemberGuid) &&
        Objects.equals(this.updateCredentials, connectWidgetRequestBody.updateCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMobileWebview, currentInstitutionCode, currentMemberGuid, updateCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectWidgetRequestBody {\n");
    
    sb.append("    isMobileWebview: ").append(toIndentedString(isMobileWebview)).append("\n");
    sb.append("    currentInstitutionCode: ").append(toIndentedString(currentInstitutionCode)).append("\n");
    sb.append("    currentMemberGuid: ").append(toIndentedString(currentMemberGuid)).append("\n");
    sb.append("    updateCredentials: ").append(toIndentedString(updateCredentials)).append("\n");
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

