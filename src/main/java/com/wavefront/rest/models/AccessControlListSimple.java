/*
 * Wavefront REST API
 * <p>The Wavefront REST API enables you to interact with Wavefront servers using standard REST API tools. You can use the REST API to automate commonly executed operations such as automatically tagging sources.</p><p>When you make REST API calls outside the Wavefront REST API documentation you must add the header \"Authorization: Bearer &lt;&lt;API-TOKEN&gt;&gt;\" to your HTTP requests.</p>
 *
 * OpenAPI spec version: v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wavefront.rest.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessControlListSimple
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class AccessControlListSimple {
  @SerializedName("canView")
  private List<String> canView = null;

  @SerializedName("canModify")
  private List<String> canModify = null;

  public AccessControlListSimple canView(List<String> canView) {
    this.canView = canView;
    return this;
  }

  public AccessControlListSimple addCanViewItem(String canViewItem) {
    if (this.canView == null) {
      this.canView = new ArrayList<String>();
    }
    this.canView.add(canViewItem);
    return this;
  }

   /**
   * Get canView
   * @return canView
  **/
  @ApiModelProperty(value = "")
  public List<String> getCanView() {
    return canView;
  }

  public void setCanView(List<String> canView) {
    this.canView = canView;
  }

  public AccessControlListSimple canModify(List<String> canModify) {
    this.canModify = canModify;
    return this;
  }

  public AccessControlListSimple addCanModifyItem(String canModifyItem) {
    if (this.canModify == null) {
      this.canModify = new ArrayList<String>();
    }
    this.canModify.add(canModifyItem);
    return this;
  }

   /**
   * Get canModify
   * @return canModify
  **/
  @ApiModelProperty(value = "")
  public List<String> getCanModify() {
    return canModify;
  }

  public void setCanModify(List<String> canModify) {
    this.canModify = canModify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControlListSimple accessControlListSimple = (AccessControlListSimple) o;
    return Objects.equals(this.canView, accessControlListSimple.canView) &&
        Objects.equals(this.canModify, accessControlListSimple.canModify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canView, canModify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControlListSimple {\n");
    
    sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
    sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
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

