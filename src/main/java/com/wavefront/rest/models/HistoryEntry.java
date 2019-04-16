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
 * An entry in the edit-history of an entity such as alert or dashboard
 */
@ApiModel(description = "An entry in the edit-history of an entity such as alert or dashboard")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class HistoryEntry {
  @SerializedName("id")
  private String id = null;

  @SerializedName("inTrash")
  private Boolean inTrash = null;

  @SerializedName("version")
  private Long version = null;

  @SerializedName("updateUser")
  private String updateUser = null;

  @SerializedName("updateTime")
  private Long updateTime = null;

  @SerializedName("changeDescription")
  private List<String> changeDescription = null;

  public HistoryEntry id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoryEntry inTrash(Boolean inTrash) {
    this.inTrash = inTrash;
    return this;
  }

   /**
   * Get inTrash
   * @return inTrash
  **/
  @ApiModelProperty(value = "")
  public Boolean isInTrash() {
    return inTrash;
  }

  public void setInTrash(Boolean inTrash) {
    this.inTrash = inTrash;
  }

  public HistoryEntry version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public HistoryEntry updateUser(String updateUser) {
    this.updateUser = updateUser;
    return this;
  }

   /**
   * Get updateUser
   * @return updateUser
  **/
  @ApiModelProperty(value = "")
  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public HistoryEntry updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }

  public HistoryEntry changeDescription(List<String> changeDescription) {
    this.changeDescription = changeDescription;
    return this;
  }

  public HistoryEntry addChangeDescriptionItem(String changeDescriptionItem) {
    if (this.changeDescription == null) {
      this.changeDescription = new ArrayList<String>();
    }
    this.changeDescription.add(changeDescriptionItem);
    return this;
  }

   /**
   * Get changeDescription
   * @return changeDescription
  **/
  @ApiModelProperty(value = "")
  public List<String> getChangeDescription() {
    return changeDescription;
  }

  public void setChangeDescription(List<String> changeDescription) {
    this.changeDescription = changeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryEntry historyEntry = (HistoryEntry) o;
    return Objects.equals(this.id, historyEntry.id) &&
        Objects.equals(this.inTrash, historyEntry.inTrash) &&
        Objects.equals(this.version, historyEntry.version) &&
        Objects.equals(this.updateUser, historyEntry.updateUser) &&
        Objects.equals(this.updateTime, historyEntry.updateTime) &&
        Objects.equals(this.changeDescription, historyEntry.changeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inTrash, version, updateUser, updateTime, changeDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inTrash: ").append(toIndentedString(inTrash)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    changeDescription: ").append(toIndentedString(changeDescription)).append("\n");
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
