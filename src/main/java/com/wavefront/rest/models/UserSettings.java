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

/**
 * UserSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class UserSettings {
  @SerializedName("preferredTimeZone")
  private String preferredTimeZone = null;

  @SerializedName("chartTitleScalar")
  private Integer chartTitleScalar = null;

  @SerializedName("showQuerybuilderByDefault")
  private Boolean showQuerybuilderByDefault = null;

  @SerializedName("hideTSWhenQuerybuilderShown")
  private Boolean hideTSWhenQuerybuilderShown = null;

  @SerializedName("alwaysHideQuerybuilder")
  private Boolean alwaysHideQuerybuilder = null;

  @SerializedName("use24HourTime")
  private Boolean use24HourTime = null;

  @SerializedName("useDarkTheme")
  private Boolean useDarkTheme = null;

  @SerializedName("landingDashboardSlug")
  private String landingDashboardSlug = null;

  @SerializedName("showOnboarding")
  private Boolean showOnboarding = null;

  public UserSettings preferredTimeZone(String preferredTimeZone) {
    this.preferredTimeZone = preferredTimeZone;
    return this;
  }

   /**
   * Get preferredTimeZone
   * @return preferredTimeZone
  **/
  @ApiModelProperty(value = "")
  public String getPreferredTimeZone() {
    return preferredTimeZone;
  }

  public void setPreferredTimeZone(String preferredTimeZone) {
    this.preferredTimeZone = preferredTimeZone;
  }

  public UserSettings chartTitleScalar(Integer chartTitleScalar) {
    this.chartTitleScalar = chartTitleScalar;
    return this;
  }

   /**
   * Get chartTitleScalar
   * @return chartTitleScalar
  **/
  @ApiModelProperty(value = "")
  public Integer getChartTitleScalar() {
    return chartTitleScalar;
  }

  public void setChartTitleScalar(Integer chartTitleScalar) {
    this.chartTitleScalar = chartTitleScalar;
  }

  public UserSettings showQuerybuilderByDefault(Boolean showQuerybuilderByDefault) {
    this.showQuerybuilderByDefault = showQuerybuilderByDefault;
    return this;
  }

   /**
   * Get showQuerybuilderByDefault
   * @return showQuerybuilderByDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowQuerybuilderByDefault() {
    return showQuerybuilderByDefault;
  }

  public void setShowQuerybuilderByDefault(Boolean showQuerybuilderByDefault) {
    this.showQuerybuilderByDefault = showQuerybuilderByDefault;
  }

  public UserSettings hideTSWhenQuerybuilderShown(Boolean hideTSWhenQuerybuilderShown) {
    this.hideTSWhenQuerybuilderShown = hideTSWhenQuerybuilderShown;
    return this;
  }

   /**
   * Get hideTSWhenQuerybuilderShown
   * @return hideTSWhenQuerybuilderShown
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideTSWhenQuerybuilderShown() {
    return hideTSWhenQuerybuilderShown;
  }

  public void setHideTSWhenQuerybuilderShown(Boolean hideTSWhenQuerybuilderShown) {
    this.hideTSWhenQuerybuilderShown = hideTSWhenQuerybuilderShown;
  }

  public UserSettings alwaysHideQuerybuilder(Boolean alwaysHideQuerybuilder) {
    this.alwaysHideQuerybuilder = alwaysHideQuerybuilder;
    return this;
  }

   /**
   * Get alwaysHideQuerybuilder
   * @return alwaysHideQuerybuilder
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlwaysHideQuerybuilder() {
    return alwaysHideQuerybuilder;
  }

  public void setAlwaysHideQuerybuilder(Boolean alwaysHideQuerybuilder) {
    this.alwaysHideQuerybuilder = alwaysHideQuerybuilder;
  }

  public UserSettings use24HourTime(Boolean use24HourTime) {
    this.use24HourTime = use24HourTime;
    return this;
  }

   /**
   * Get use24HourTime
   * @return use24HourTime
  **/
  @ApiModelProperty(value = "")
  public Boolean isUse24HourTime() {
    return use24HourTime;
  }

  public void setUse24HourTime(Boolean use24HourTime) {
    this.use24HourTime = use24HourTime;
  }

  public UserSettings useDarkTheme(Boolean useDarkTheme) {
    this.useDarkTheme = useDarkTheme;
    return this;
  }

   /**
   * Get useDarkTheme
   * @return useDarkTheme
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseDarkTheme() {
    return useDarkTheme;
  }

  public void setUseDarkTheme(Boolean useDarkTheme) {
    this.useDarkTheme = useDarkTheme;
  }

  public UserSettings landingDashboardSlug(String landingDashboardSlug) {
    this.landingDashboardSlug = landingDashboardSlug;
    return this;
  }

   /**
   * Get landingDashboardSlug
   * @return landingDashboardSlug
  **/
  @ApiModelProperty(value = "")
  public String getLandingDashboardSlug() {
    return landingDashboardSlug;
  }

  public void setLandingDashboardSlug(String landingDashboardSlug) {
    this.landingDashboardSlug = landingDashboardSlug;
  }

  public UserSettings showOnboarding(Boolean showOnboarding) {
    this.showOnboarding = showOnboarding;
    return this;
  }

   /**
   * Get showOnboarding
   * @return showOnboarding
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowOnboarding() {
    return showOnboarding;
  }

  public void setShowOnboarding(Boolean showOnboarding) {
    this.showOnboarding = showOnboarding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettings userSettings = (UserSettings) o;
    return Objects.equals(this.preferredTimeZone, userSettings.preferredTimeZone) &&
        Objects.equals(this.chartTitleScalar, userSettings.chartTitleScalar) &&
        Objects.equals(this.showQuerybuilderByDefault, userSettings.showQuerybuilderByDefault) &&
        Objects.equals(this.hideTSWhenQuerybuilderShown, userSettings.hideTSWhenQuerybuilderShown) &&
        Objects.equals(this.alwaysHideQuerybuilder, userSettings.alwaysHideQuerybuilder) &&
        Objects.equals(this.use24HourTime, userSettings.use24HourTime) &&
        Objects.equals(this.useDarkTheme, userSettings.useDarkTheme) &&
        Objects.equals(this.landingDashboardSlug, userSettings.landingDashboardSlug) &&
        Objects.equals(this.showOnboarding, userSettings.showOnboarding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredTimeZone, chartTitleScalar, showQuerybuilderByDefault, hideTSWhenQuerybuilderShown, alwaysHideQuerybuilder, use24HourTime, useDarkTheme, landingDashboardSlug, showOnboarding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettings {\n");
    
    sb.append("    preferredTimeZone: ").append(toIndentedString(preferredTimeZone)).append("\n");
    sb.append("    chartTitleScalar: ").append(toIndentedString(chartTitleScalar)).append("\n");
    sb.append("    showQuerybuilderByDefault: ").append(toIndentedString(showQuerybuilderByDefault)).append("\n");
    sb.append("    hideTSWhenQuerybuilderShown: ").append(toIndentedString(hideTSWhenQuerybuilderShown)).append("\n");
    sb.append("    alwaysHideQuerybuilder: ").append(toIndentedString(alwaysHideQuerybuilder)).append("\n");
    sb.append("    use24HourTime: ").append(toIndentedString(use24HourTime)).append("\n");
    sb.append("    useDarkTheme: ").append(toIndentedString(useDarkTheme)).append("\n");
    sb.append("    landingDashboardSlug: ").append(toIndentedString(landingDashboardSlug)).append("\n");
    sb.append("    showOnboarding: ").append(toIndentedString(showOnboarding)).append("\n");
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

