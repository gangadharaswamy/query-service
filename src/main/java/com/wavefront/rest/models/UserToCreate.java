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
 * UserToCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class UserToCreate {
  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("groups")
  private List<String> groups = new ArrayList<String>();

  @SerializedName("userGroups")
  private List<String> userGroups = new ArrayList<String>();

  public UserToCreate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The (unique) identifier of the user to create. Must be a valid email address
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The (unique) identifier of the user to create. Must be a valid email address")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserToCreate groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public UserToCreate addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of permission groups to grant to this user. Please note that &#39;host_tag_management&#39; is the equivalent of the &#39;Source Tag Management&#39; permission.  Possible values are agent_management, alerts_management, dashboard_management, embedded_charts, events_management, external_links_management, host_tag_management, metrics_management, user_management
   * @return groups
  **/
  @ApiModelProperty(required = true, value = "List of permission groups to grant to this user. Please note that 'host_tag_management' is the equivalent of the 'Source Tag Management' permission.  Possible values are agent_management, alerts_management, dashboard_management, embedded_charts, events_management, external_links_management, host_tag_management, metrics_management, user_management")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public UserToCreate userGroups(List<String> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public UserToCreate addUserGroupsItem(String userGroupsItem) {
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * List of user groups to this user. 
   * @return userGroups
  **/
  @ApiModelProperty(required = true, value = "List of user groups to this user. ")
  public List<String> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserToCreate userToCreate = (UserToCreate) o;
    return Objects.equals(this.emailAddress, userToCreate.emailAddress) &&
        Objects.equals(this.groups, userToCreate.groups) &&
        Objects.equals(this.userGroups, userToCreate.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, groups, userGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserToCreate {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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

