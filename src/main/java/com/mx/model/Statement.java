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
 * Statement
 */


public class Statement {
  @SerializedName("account_guid")
  private String accountGuid = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("member_guid")
  private String memberGuid = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("user_guid")
  private String userGuid = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

   /**
   * The unique identifier for the &#x60;account&#x60; associated with the &#x60;statement&#x60;. Defined by MX.
   * @return accountGuid
  **/
  @ApiModelProperty(example = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1", value = "The unique identifier for the `account` associated with the `statement`. Defined by MX.")
  public String getAccountGuid() {
    return accountGuid;
  }

   /**
   * The date and time the &#x60;statement&#x60; was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-10-06T09:43:42+00:00", value = "The date and time the `statement` was created.")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * The unique identifier for the &#x60;statement&#x60;. Defined by MX.
   * @return guid
  **/
  @ApiModelProperty(example = "STA-737a344b-caae-0f6e-1384-01f52e75dcb1", value = "The unique identifier for the `statement`. Defined by MX.")
  public String getGuid() {
    return guid;
  }

   /**
   * The unique identifier for the &#x60;member&#x60; associated with the &#x60;statement&#x60;.  Defined by MX.
   * @return memberGuid
  **/
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "The unique identifier for the `member` associated with the `statement`.  Defined by MX.")
  public String getMemberGuid() {
    return memberGuid;
  }

   /**
   * A URI for accessing the byte payload of the &#x60;statement&#x60;.
   * @return uri
  **/
  @ApiModelProperty(example = "uri/to/statement", value = "A URI for accessing the byte payload of the `statement`.")
  public String getUri() {
    return uri;
  }

   /**
   * The unique identifier for the &#x60;user&#x60; associated with the &#x60;statement&#x60;.  Defined by MX.
   * @return userGuid
  **/
  @ApiModelProperty(example = "USR-fa7537f3-48aa-a683-a02a-b18940482f54", value = "The unique identifier for the `user` associated with the `statement`.  Defined by MX.")
  public String getUserGuid() {
    return userGuid;
  }

   /**
   * The date and time at which the &#x60;statement&#x60; was last updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:09:00+00:00", value = "The date and time at which the `statement` was last updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.accountGuid, statement.accountGuid) &&
        Objects.equals(this.createdAt, statement.createdAt) &&
        Objects.equals(this.guid, statement.guid) &&
        Objects.equals(this.memberGuid, statement.memberGuid) &&
        Objects.equals(this.uri, statement.uri) &&
        Objects.equals(this.userGuid, statement.userGuid) &&
        Objects.equals(this.updatedAt, statement.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, createdAt, guid, memberGuid, uri, userGuid, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

