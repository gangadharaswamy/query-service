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
import com.wavefront.rest.models.UserSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class User {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("customer")
  private String customer = null;

  @SerializedName("credential")
  private String credential = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("userGroups")
  private List<String> userGroups = null;

  @SerializedName("resetToken")
  private String resetToken = null;

  @SerializedName("apiToken")
  private String apiToken = null;

  @SerializedName("apiToken2")
  private String apiToken2 = null;

  @SerializedName("resetTokenCreationMillis")
  private Long resetTokenCreationMillis = null;

  @SerializedName("invalidPasswordAttempts")
  private Long invalidPasswordAttempts = null;

  @SerializedName("lastSuccessfulLogin")
  private Long lastSuccessfulLogin = null;

  @SerializedName("settings")
  private UserSettings settings = null;

  @SerializedName("onboardingState")
  private String onboardingState = null;

  @SerializedName("lastLogout")
  private Long lastLogout = null;

  @SerializedName("ssoId")
  private String ssoId = null;

  @SerializedName("superAdmin")
  private Boolean superAdmin = null;

  public User identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public User customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public User credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @ApiModelProperty(value = "")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public User provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public User groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public User addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public User userGroups(List<String> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public User addUserGroupsItem(String userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<String>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }

  public User resetToken(String resetToken) {
    this.resetToken = resetToken;
    return this;
  }

   /**
   * Get resetToken
   * @return resetToken
  **/
  @ApiModelProperty(value = "")
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  public User apiToken(String apiToken) {
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Get apiToken
   * @return apiToken
  **/
  @ApiModelProperty(value = "")
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }

  public User apiToken2(String apiToken2) {
    this.apiToken2 = apiToken2;
    return this;
  }

   /**
   * Get apiToken2
   * @return apiToken2
  **/
  @ApiModelProperty(value = "")
  public String getApiToken2() {
    return apiToken2;
  }

  public void setApiToken2(String apiToken2) {
    this.apiToken2 = apiToken2;
  }

  public User resetTokenCreationMillis(Long resetTokenCreationMillis) {
    this.resetTokenCreationMillis = resetTokenCreationMillis;
    return this;
  }

   /**
   * Get resetTokenCreationMillis
   * @return resetTokenCreationMillis
  **/
  @ApiModelProperty(value = "")
  public Long getResetTokenCreationMillis() {
    return resetTokenCreationMillis;
  }

  public void setResetTokenCreationMillis(Long resetTokenCreationMillis) {
    this.resetTokenCreationMillis = resetTokenCreationMillis;
  }

  public User invalidPasswordAttempts(Long invalidPasswordAttempts) {
    this.invalidPasswordAttempts = invalidPasswordAttempts;
    return this;
  }

   /**
   * Get invalidPasswordAttempts
   * @return invalidPasswordAttempts
  **/
  @ApiModelProperty(value = "")
  public Long getInvalidPasswordAttempts() {
    return invalidPasswordAttempts;
  }

  public void setInvalidPasswordAttempts(Long invalidPasswordAttempts) {
    this.invalidPasswordAttempts = invalidPasswordAttempts;
  }

  public User lastSuccessfulLogin(Long lastSuccessfulLogin) {
    this.lastSuccessfulLogin = lastSuccessfulLogin;
    return this;
  }

   /**
   * Get lastSuccessfulLogin
   * @return lastSuccessfulLogin
  **/
  @ApiModelProperty(value = "")
  public Long getLastSuccessfulLogin() {
    return lastSuccessfulLogin;
  }

  public void setLastSuccessfulLogin(Long lastSuccessfulLogin) {
    this.lastSuccessfulLogin = lastSuccessfulLogin;
  }

  public User settings(UserSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public UserSettings getSettings() {
    return settings;
  }

  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }

  public User onboardingState(String onboardingState) {
    this.onboardingState = onboardingState;
    return this;
  }

   /**
   * Get onboardingState
   * @return onboardingState
  **/
  @ApiModelProperty(value = "")
  public String getOnboardingState() {
    return onboardingState;
  }

  public void setOnboardingState(String onboardingState) {
    this.onboardingState = onboardingState;
  }

  public User lastLogout(Long lastLogout) {
    this.lastLogout = lastLogout;
    return this;
  }

   /**
   * Get lastLogout
   * @return lastLogout
  **/
  @ApiModelProperty(value = "")
  public Long getLastLogout() {
    return lastLogout;
  }

  public void setLastLogout(Long lastLogout) {
    this.lastLogout = lastLogout;
  }

  public User ssoId(String ssoId) {
    this.ssoId = ssoId;
    return this;
  }

   /**
   * Get ssoId
   * @return ssoId
  **/
  @ApiModelProperty(value = "")
  public String getSsoId() {
    return ssoId;
  }

  public void setSsoId(String ssoId) {
    this.ssoId = ssoId;
  }

  public User superAdmin(Boolean superAdmin) {
    this.superAdmin = superAdmin;
    return this;
  }

   /**
   * Get superAdmin
   * @return superAdmin
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuperAdmin() {
    return superAdmin;
  }

  public void setSuperAdmin(Boolean superAdmin) {
    this.superAdmin = superAdmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.identifier, user.identifier) &&
        Objects.equals(this.customer, user.customer) &&
        Objects.equals(this.credential, user.credential) &&
        Objects.equals(this.provider, user.provider) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.userGroups, user.userGroups) &&
        Objects.equals(this.resetToken, user.resetToken) &&
        Objects.equals(this.apiToken, user.apiToken) &&
        Objects.equals(this.apiToken2, user.apiToken2) &&
        Objects.equals(this.resetTokenCreationMillis, user.resetTokenCreationMillis) &&
        Objects.equals(this.invalidPasswordAttempts, user.invalidPasswordAttempts) &&
        Objects.equals(this.lastSuccessfulLogin, user.lastSuccessfulLogin) &&
        Objects.equals(this.settings, user.settings) &&
        Objects.equals(this.onboardingState, user.onboardingState) &&
        Objects.equals(this.lastLogout, user.lastLogout) &&
        Objects.equals(this.ssoId, user.ssoId) &&
        Objects.equals(this.superAdmin, user.superAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, customer, credential, provider, groups, userGroups, resetToken, apiToken, apiToken2, resetTokenCreationMillis, invalidPasswordAttempts, lastSuccessfulLogin, settings, onboardingState, lastLogout, ssoId, superAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    apiToken2: ").append(toIndentedString(apiToken2)).append("\n");
    sb.append("    resetTokenCreationMillis: ").append(toIndentedString(resetTokenCreationMillis)).append("\n");
    sb.append("    invalidPasswordAttempts: ").append(toIndentedString(invalidPasswordAttempts)).append("\n");
    sb.append("    lastSuccessfulLogin: ").append(toIndentedString(lastSuccessfulLogin)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    onboardingState: ").append(toIndentedString(onboardingState)).append("\n");
    sb.append("    lastLogout: ").append(toIndentedString(lastLogout)).append("\n");
    sb.append("    ssoId: ").append(toIndentedString(ssoId)).append("\n");
    sb.append("    superAdmin: ").append(toIndentedString(superAdmin)).append("\n");
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

