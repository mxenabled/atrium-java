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
 * ConnectWidgetAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-03T12:53:24.168-07:00")

public class ConnectWidgetAttributes {
  @SerializedName("connect_widget_url")
  private String connectWidgetUrl = null;

  @SerializedName("guid")
  private String guid = null;

   /**
   * Get connectWidgetUrl
   * @return connectWidgetUrl
  **/
  @ApiModelProperty(example = "https://int-widgets.moneydesktop.com/md/connect/jb1rA14m85tw2lyvpgfx4gc6d3Z8z8Ayb8", value = "")
  public String getConnectWidgetUrl() {
    return connectWidgetUrl;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "USR-fa7537f3-48aa-a683-a02a-b18940482f54", value = "")
  public String getGuid() {
    return guid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectWidgetAttributes connectWidgetAttributes = (ConnectWidgetAttributes) o;
    return Objects.equals(this.connectWidgetUrl, connectWidgetAttributes.connectWidgetUrl) &&
        Objects.equals(this.guid, connectWidgetAttributes.guid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectWidgetUrl, guid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectWidgetAttributes {\n");
    
    sb.append("    connectWidgetUrl: ").append(toIndentedString(connectWidgetUrl)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
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

