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
import com.mx.model.MemberResumeRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MemberResumeRequestBody
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-16T18:26:56.880-07:00")

public class MemberResumeRequestBody {
  @SerializedName("member")
  private MemberResumeRequest member = null;

  public MemberResumeRequestBody member(MemberResumeRequest member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public MemberResumeRequest getMember() {
    return member;
  }

  public void setMember(MemberResumeRequest member) {
    this.member = member;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberResumeRequestBody memberResumeRequestBody = (MemberResumeRequestBody) o;
    return Objects.equals(this.member, memberResumeRequestBody.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(member);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberResumeRequestBody {\n");
    
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

