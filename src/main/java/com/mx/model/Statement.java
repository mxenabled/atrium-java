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

  @SerializedName("content_hash")
  private String contentHash = null;

  @SerializedName("deleted_at")
  private String deletedAt = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("user_guid")
  private String userGuid = null;

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
   * An SHA-256 hash value of the statement&#39;s byte payload, used as a unique identifier.
   * @return contentHash
  **/
  @ApiModelProperty(example = "", value = "An SHA-256 hash value of the statement's byte payload, used as a unique identifier.")
  public String getContentHash() {
    return contentHash;
  }

   /**
   * The date and time the &#x60;statement&#x60; was deleted. Statements are automatically deleted when an &#x60;account&#x60; is deleted.
   * @return deletedAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:10:00+00:00", value = "The date and time the `statement` was deleted. Statements are automatically deleted when an `account` is deleted.")
  public String getDeletedAt() {
    return deletedAt;
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
   * This indicates whether the &#x60;statement&#x60; has been deleted. Statements are automatically deleted when an &#x60;account&#x60; is deleted.
   * @return isDeleted
  **/
  @ApiModelProperty(example = "false", value = "This indicates whether the `statement` has been deleted. Statements are automatically deleted when an `account` is deleted.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

   /**
   * The date and time at which the &#x60;statement&#x60; was last updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-10-13T18:09:00+00:00", value = "The date and time at which the `statement` was last updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }

   /**
   * A URI for accessing the byte payload of the &#x60;statement&#x60;.
   * @return uri
  **/
  @ApiModelProperty(example = "", value = "A URI for accessing the byte payload of the `statement`.")
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
        Objects.equals(this.contentHash, statement.contentHash) &&
        Objects.equals(this.deletedAt, statement.deletedAt) &&
        Objects.equals(this.guid, statement.guid) &&
        Objects.equals(this.isDeleted, statement.isDeleted) &&
        Objects.equals(this.updatedAt, statement.updatedAt) &&
        Objects.equals(this.uri, statement.uri) &&
        Objects.equals(this.userGuid, statement.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, createdAt, contentHash, deletedAt, guid, isDeleted, updatedAt, uri, userGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    contentHash: ").append(toIndentedString(contentHash)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

