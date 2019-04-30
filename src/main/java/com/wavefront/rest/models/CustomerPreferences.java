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

import com.wavefront.rest.models.UserGroup;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wavefront customer preferences entity
 */
@ApiModel(description = "Wavefront customer preferences entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class CustomerPreferences {
  @SerializedName("defaultUserGroups")
  private List<UserGroup> defaultUserGroups = null;

  @SerializedName("showQuerybuilderByDefault")
  private Boolean showQuerybuilderByDefault = null;

  @SerializedName("hideTSWhenQuerybuilderShown")
  private Boolean hideTSWhenQuerybuilderShown = null;

  @SerializedName("showOnboarding")
  private Boolean showOnboarding = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("creatorId")
  private String creatorId = null;

  @SerializedName("updaterId")
  private String updaterId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("invitePermissions")
  private List<String> invitePermissions = null;

  @SerializedName("blacklistedEmails")
  private Map<String, Integer> blacklistedEmails = null;

  @SerializedName("hiddenMetricPrefixes")
  private Map<String, Integer> hiddenMetricPrefixes = null;

  @SerializedName("landingDashboardSlug")
  private String landingDashboardSlug = null;

  @SerializedName("grantModifyAccessToEveryone")
  private Boolean grantModifyAccessToEveryone = null;

  @SerializedName("createdEpochMillis")
  private Long createdEpochMillis = null;

  @SerializedName("updatedEpochMillis")
  private Long updatedEpochMillis = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public CustomerPreferences defaultUserGroups(List<UserGroup> defaultUserGroups) {
    this.defaultUserGroups = defaultUserGroups;
    return this;
  }

  public CustomerPreferences addDefaultUserGroupsItem(UserGroup defaultUserGroupsItem) {
    if (this.defaultUserGroups == null) {
      this.defaultUserGroups = new ArrayList<UserGroup>();
    }
    this.defaultUserGroups.add(defaultUserGroupsItem);
    return this;
  }

  /**
   * List of default user groups of the customer
   *
   * @return defaultUserGroups
   **/
  @ApiModelProperty(value = "List of default user groups of the customer")
  public List<UserGroup> getDefaultUserGroups() {
    return defaultUserGroups;
  }

  public void setDefaultUserGroups(List<UserGroup> defaultUserGroups) {
    this.defaultUserGroups = defaultUserGroups;
  }

  public CustomerPreferences showQuerybuilderByDefault(Boolean showQuerybuilderByDefault) {
    this.showQuerybuilderByDefault = showQuerybuilderByDefault;
    return this;
  }

  /**
   * Whether the Querybuilder is shown by default
   *
   * @return showQuerybuilderByDefault
   **/
  @ApiModelProperty(required = true, value = "Whether the Querybuilder is shown by default")
  public Boolean isShowQuerybuilderByDefault() {
    return showQuerybuilderByDefault;
  }

  public void setShowQuerybuilderByDefault(Boolean showQuerybuilderByDefault) {
    this.showQuerybuilderByDefault = showQuerybuilderByDefault;
  }

  public CustomerPreferences hideTSWhenQuerybuilderShown(Boolean hideTSWhenQuerybuilderShown) {
    this.hideTSWhenQuerybuilderShown = hideTSWhenQuerybuilderShown;
    return this;
  }

  /**
   * Whether to hide TS source input when Querybuilder is shown
   *
   * @return hideTSWhenQuerybuilderShown
   **/
  @ApiModelProperty(required = true, value = "Whether to hide TS source input when Querybuilder is shown")
  public Boolean isHideTSWhenQuerybuilderShown() {
    return hideTSWhenQuerybuilderShown;
  }

  public void setHideTSWhenQuerybuilderShown(Boolean hideTSWhenQuerybuilderShown) {
    this.hideTSWhenQuerybuilderShown = hideTSWhenQuerybuilderShown;
  }

  public CustomerPreferences showOnboarding(Boolean showOnboarding) {
    this.showOnboarding = showOnboarding;
    return this;
  }

  /**
   * Whether to show onboarding for any new user without an override
   *
   * @return showOnboarding
   **/
  @ApiModelProperty(required = true, value = "Whether to show onboarding for any new user without an override")
  public Boolean isShowOnboarding() {
    return showOnboarding;
  }

  public void setShowOnboarding(Boolean showOnboarding) {
    this.showOnboarding = showOnboarding;
  }

  public CustomerPreferences customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * The id of the customer preferences are attached to
   *
   * @return customerId
   **/
  @ApiModelProperty(required = true, value = "The id of the customer preferences are attached to")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CustomerPreferences creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   *
   * @return creatorId
   **/
  @ApiModelProperty(value = "")
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public CustomerPreferences updaterId(String updaterId) {
    this.updaterId = updaterId;
    return this;
  }

  /**
   * Get updaterId
   *
   * @return updaterId
   **/
  @ApiModelProperty(value = "")
  public String getUpdaterId() {
    return updaterId;
  }

  public void setUpdaterId(String updaterId) {
    this.updaterId = updaterId;
  }

  public CustomerPreferences id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerPreferences invitePermissions(List<String> invitePermissions) {
    this.invitePermissions = invitePermissions;
    return this;
  }

  public CustomerPreferences addInvitePermissionsItem(String invitePermissionsItem) {
    if (this.invitePermissions == null) {
      this.invitePermissions = new ArrayList<String>();
    }
    this.invitePermissions.add(invitePermissionsItem);
    return this;
  }

  /**
   * List of permissions that are assigned to newly invited users
   *
   * @return invitePermissions
   **/
  @ApiModelProperty(value = "List of permissions that are assigned to newly invited users")
  public List<String> getInvitePermissions() {
    return invitePermissions;
  }

  public void setInvitePermissions(List<String> invitePermissions) {
    this.invitePermissions = invitePermissions;
  }

  public CustomerPreferences blacklistedEmails(Map<String, Integer> blacklistedEmails) {
    this.blacklistedEmails = blacklistedEmails;
    return this;
  }

  public CustomerPreferences putBlacklistedEmailsItem(String key, Integer blacklistedEmailsItem) {
    if (this.blacklistedEmails == null) {
      this.blacklistedEmails = new HashMap<String, Integer>();
    }
    this.blacklistedEmails.put(key, blacklistedEmailsItem);
    return this;
  }

  /**
   * List of blacklisted emails of the customer
   *
   * @return blacklistedEmails
   **/
  @ApiModelProperty(value = "List of blacklisted emails of the customer")
  public Map<String, Integer> getBlacklistedEmails() {
    return blacklistedEmails;
  }

  public void setBlacklistedEmails(Map<String, Integer> blacklistedEmails) {
    this.blacklistedEmails = blacklistedEmails;
  }

  public CustomerPreferences hiddenMetricPrefixes(Map<String, Integer> hiddenMetricPrefixes) {
    this.hiddenMetricPrefixes = hiddenMetricPrefixes;
    return this;
  }

  public CustomerPreferences putHiddenMetricPrefixesItem(String key, Integer hiddenMetricPrefixesItem) {
    if (this.hiddenMetricPrefixes == null) {
      this.hiddenMetricPrefixes = new HashMap<String, Integer>();
    }
    this.hiddenMetricPrefixes.put(key, hiddenMetricPrefixesItem);
    return this;
  }

  /**
   * Metric prefixes which should be hidden from user
   *
   * @return hiddenMetricPrefixes
   **/
  @ApiModelProperty(value = "Metric prefixes which should be hidden from user")
  public Map<String, Integer> getHiddenMetricPrefixes() {
    return hiddenMetricPrefixes;
  }

  public void setHiddenMetricPrefixes(Map<String, Integer> hiddenMetricPrefixes) {
    this.hiddenMetricPrefixes = hiddenMetricPrefixes;
  }

  public CustomerPreferences landingDashboardSlug(String landingDashboardSlug) {
    this.landingDashboardSlug = landingDashboardSlug;
    return this;
  }

  /**
   * Dashboard where user will be redirected from landing page
   *
   * @return landingDashboardSlug
   **/
  @ApiModelProperty(value = "Dashboard where user will be redirected from landing page")
  public String getLandingDashboardSlug() {
    return landingDashboardSlug;
  }

  public void setLandingDashboardSlug(String landingDashboardSlug) {
    this.landingDashboardSlug = landingDashboardSlug;
  }

  public CustomerPreferences grantModifyAccessToEveryone(Boolean grantModifyAccessToEveryone) {
    this.grantModifyAccessToEveryone = grantModifyAccessToEveryone;
    return this;
  }

  /**
   * Whether modify access of new entites is granted to Everyone or to the Creator
   *
   * @return grantModifyAccessToEveryone
   **/
  @ApiModelProperty(required = true, value = "Whether modify access of new entites is granted to Everyone or to the Creator")
  public Boolean isGrantModifyAccessToEveryone() {
    return grantModifyAccessToEveryone;
  }

  public void setGrantModifyAccessToEveryone(Boolean grantModifyAccessToEveryone) {
    this.grantModifyAccessToEveryone = grantModifyAccessToEveryone;
  }

  public CustomerPreferences createdEpochMillis(Long createdEpochMillis) {
    this.createdEpochMillis = createdEpochMillis;
    return this;
  }

  /**
   * Get createdEpochMillis
   *
   * @return createdEpochMillis
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedEpochMillis() {
    return createdEpochMillis;
  }

  public void setCreatedEpochMillis(Long createdEpochMillis) {
    this.createdEpochMillis = createdEpochMillis;
  }

  public CustomerPreferences updatedEpochMillis(Long updatedEpochMillis) {
    this.updatedEpochMillis = updatedEpochMillis;
    return this;
  }

  /**
   * Get updatedEpochMillis
   *
   * @return updatedEpochMillis
   **/
  @ApiModelProperty(value = "")
  public Long getUpdatedEpochMillis() {
    return updatedEpochMillis;
  }

  public void setUpdatedEpochMillis(Long updatedEpochMillis) {
    this.updatedEpochMillis = updatedEpochMillis;
  }

  public CustomerPreferences deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   *
   * @return deleted
   **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPreferences customerPreferences = (CustomerPreferences) o;
    return Objects.equals(this.defaultUserGroups, customerPreferences.defaultUserGroups) &&
        Objects.equals(this.showQuerybuilderByDefault, customerPreferences.showQuerybuilderByDefault) &&
        Objects.equals(this.hideTSWhenQuerybuilderShown, customerPreferences.hideTSWhenQuerybuilderShown) &&
        Objects.equals(this.showOnboarding, customerPreferences.showOnboarding) &&
        Objects.equals(this.customerId, customerPreferences.customerId) &&
        Objects.equals(this.creatorId, customerPreferences.creatorId) &&
        Objects.equals(this.updaterId, customerPreferences.updaterId) &&
        Objects.equals(this.id, customerPreferences.id) &&
        Objects.equals(this.invitePermissions, customerPreferences.invitePermissions) &&
        Objects.equals(this.blacklistedEmails, customerPreferences.blacklistedEmails) &&
        Objects.equals(this.hiddenMetricPrefixes, customerPreferences.hiddenMetricPrefixes) &&
        Objects.equals(this.landingDashboardSlug, customerPreferences.landingDashboardSlug) &&
        Objects.equals(this.grantModifyAccessToEveryone, customerPreferences.grantModifyAccessToEveryone) &&
        Objects.equals(this.createdEpochMillis, customerPreferences.createdEpochMillis) &&
        Objects.equals(this.updatedEpochMillis, customerPreferences.updatedEpochMillis) &&
        Objects.equals(this.deleted, customerPreferences.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUserGroups, showQuerybuilderByDefault, hideTSWhenQuerybuilderShown, showOnboarding, customerId, creatorId, updaterId, id, invitePermissions, blacklistedEmails, hiddenMetricPrefixes, landingDashboardSlug, grantModifyAccessToEveryone, createdEpochMillis, updatedEpochMillis, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPreferences {\n");

    sb.append("    defaultUserGroups: ").append(toIndentedString(defaultUserGroups)).append("\n");
    sb.append("    showQuerybuilderByDefault: ").append(toIndentedString(showQuerybuilderByDefault)).append("\n");
    sb.append("    hideTSWhenQuerybuilderShown: ").append(toIndentedString(hideTSWhenQuerybuilderShown)).append("\n");
    sb.append("    showOnboarding: ").append(toIndentedString(showOnboarding)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitePermissions: ").append(toIndentedString(invitePermissions)).append("\n");
    sb.append("    blacklistedEmails: ").append(toIndentedString(blacklistedEmails)).append("\n");
    sb.append("    hiddenMetricPrefixes: ").append(toIndentedString(hiddenMetricPrefixes)).append("\n");
    sb.append("    landingDashboardSlug: ").append(toIndentedString(landingDashboardSlug)).append("\n");
    sb.append("    grantModifyAccessToEveryone: ").append(toIndentedString(grantModifyAccessToEveryone)).append("\n");
    sb.append("    createdEpochMillis: ").append(toIndentedString(createdEpochMillis)).append("\n");
    sb.append("    updatedEpochMillis: ").append(toIndentedString(updatedEpochMillis)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

