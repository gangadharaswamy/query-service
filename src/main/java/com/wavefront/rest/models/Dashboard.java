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

import com.wavefront.rest.models.AccessControlListSimple;
import com.wavefront.rest.models.DashboardParameterValue;
import com.wavefront.rest.models.DashboardSection;
import com.wavefront.rest.models.WFTags;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wavefront dashboard entity
 */
@ApiModel(description = "Wavefront dashboard entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class Dashboard {
  @SerializedName("canUserModify")
  private Boolean canUserModify = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("tags")
  private WFTags tags = null;

  @SerializedName("customer")
  private String customer = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("systemOwned")
  private Boolean systemOwned = null;

  @SerializedName("creatorId")
  private String creatorId = null;

  @SerializedName("updaterId")
  private String updaterId = null;

  @SerializedName("id")
  private String id = null;

  /**
   * How charts belonging to this dashboard should display events.  BYCHART is default if unspecified
   */
  @JsonAdapter(EventFilterTypeEnum.Adapter.class)
  public enum EventFilterTypeEnum {
    BYCHART("BYCHART"),

    AUTOMATIC("AUTOMATIC"),

    ALL("ALL"),

    NONE("NONE"),

    BYDASHBOARD("BYDASHBOARD"),

    BYCHARTANDDASHBOARD("BYCHARTANDDASHBOARD");

    private String value;

    EventFilterTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventFilterTypeEnum fromValue(String text) {
      for (EventFilterTypeEnum b : EventFilterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventFilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventFilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventFilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventFilterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("eventFilterType")
  private EventFilterTypeEnum eventFilterType = null;

  @SerializedName("sections")
  private List<DashboardSection> sections = new ArrayList<DashboardSection>();

  @SerializedName("parameterDetails")
  private Map<String, DashboardParameterValue> parameterDetails = null;

  @SerializedName("displayDescription")
  private Boolean displayDescription = null;

  @SerializedName("displaySectionTableOfContents")
  private Boolean displaySectionTableOfContents = null;

  @SerializedName("displayQueryParameters")
  private Boolean displayQueryParameters = null;

  @SerializedName("chartTitleScalar")
  private Integer chartTitleScalar = null;

  @SerializedName("eventQuery")
  private String eventQuery = null;

  @SerializedName("defaultTimeWindow")
  private String defaultTimeWindow = null;

  @SerializedName("defaultStartTime")
  private Long defaultStartTime = null;

  @SerializedName("defaultEndTime")
  private Long defaultEndTime = null;

  @SerializedName("chartTitleColor")
  private String chartTitleColor = null;

  @SerializedName("chartTitleBgColor")
  private String chartTitleBgColor = null;

  @SerializedName("viewsLastDay")
  private Integer viewsLastDay = null;

  @SerializedName("viewsLastWeek")
  private Integer viewsLastWeek = null;

  @SerializedName("viewsLastMonth")
  private Integer viewsLastMonth = null;

  @SerializedName("acl")
  private AccessControlListSimple acl = null;

  @SerializedName("createdEpochMillis")
  private Long createdEpochMillis = null;

  @SerializedName("updatedEpochMillis")
  private Long updatedEpochMillis = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("numCharts")
  private Integer numCharts = null;

  @SerializedName("numFavorites")
  private Integer numFavorites = null;

  @SerializedName("favorite")
  private Boolean favorite = null;

  @SerializedName("orphan")
  private Boolean orphan = null;

  @SerializedName("name")
  private String name = null;

  public Dashboard canUserModify(Boolean canUserModify) {
    this.canUserModify = canUserModify;
    return this;
  }

  /**
   * Get canUserModify
   *
   * @return canUserModify
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanUserModify() {
    return canUserModify;
  }

  public void setCanUserModify(Boolean canUserModify) {
    this.canUserModify = canUserModify;
  }

  public Dashboard description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the dashboard
   *
   * @return description
   **/
  @ApiModelProperty(value = "Human-readable description of the dashboard")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Get hidden
   *
   * @return hidden
   **/
  @ApiModelProperty(value = "")
  public Boolean isHidden() {
    return hidden;
  }

  public Dashboard parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Dashboard putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Deprecated.  An obsolete representation of dashboard parameters
   *
   * @return parameters
   **/
  @ApiModelProperty(value = "Deprecated.  An obsolete representation of dashboard parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public Dashboard tags(WFTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   *
   * @return tags
   **/
  @ApiModelProperty(value = "")
  public WFTags getTags() {
    return tags;
  }

  public void setTags(WFTags tags) {
    this.tags = tags;
  }

  /**
   * id of the customer to which this dashboard belongs
   *
   * @return customer
   **/
  @ApiModelProperty(value = "id of the customer to which this dashboard belongs")
  public String getCustomer() {
    return customer;
  }

  public Dashboard url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Unique identifier, also URL slug, of the dashboard
   *
   * @return url
   **/
  @ApiModelProperty(required = true, value = "Unique identifier, also URL slug, of the dashboard")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Whether this dashboard is system-owned and not writeable
   *
   * @return systemOwned
   **/
  @ApiModelProperty(value = "Whether this dashboard is system-owned and not writeable")
  public Boolean isSystemOwned() {
    return systemOwned;
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

  /**
   * Get updaterId
   *
   * @return updaterId
   **/
  @ApiModelProperty(value = "")
  public String getUpdaterId() {
    return updaterId;
  }

  public Dashboard id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier, also URL slug, of the dashboard
   *
   * @return id
   **/
  @ApiModelProperty(required = true, value = "Unique identifier, also URL slug, of the dashboard")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dashboard eventFilterType(EventFilterTypeEnum eventFilterType) {
    this.eventFilterType = eventFilterType;
    return this;
  }

  /**
   * How charts belonging to this dashboard should display events.  BYCHART is default if unspecified
   *
   * @return eventFilterType
   **/
  @ApiModelProperty(value = "How charts belonging to this dashboard should display events.  BYCHART is default if unspecified")
  public EventFilterTypeEnum getEventFilterType() {
    return eventFilterType;
  }

  public void setEventFilterType(EventFilterTypeEnum eventFilterType) {
    this.eventFilterType = eventFilterType;
  }

  public Dashboard sections(List<DashboardSection> sections) {
    this.sections = sections;
    return this;
  }

  public Dashboard addSectionsItem(DashboardSection sectionsItem) {
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Dashboard chart sections
   *
   * @return sections
   **/
  @ApiModelProperty(required = true, value = "Dashboard chart sections")
  public List<DashboardSection> getSections() {
    return sections;
  }

  public void setSections(List<DashboardSection> sections) {
    this.sections = sections;
  }

  public Dashboard parameterDetails(Map<String, DashboardParameterValue> parameterDetails) {
    this.parameterDetails = parameterDetails;
    return this;
  }

  public Dashboard putParameterDetailsItem(String key, DashboardParameterValue parameterDetailsItem) {
    if (this.parameterDetails == null) {
      this.parameterDetails = new HashMap<String, DashboardParameterValue>();
    }
    this.parameterDetails.put(key, parameterDetailsItem);
    return this;
  }

  /**
   * The current (as of Wavefront 4.0) JSON representation of dashboard parameters.  This is a map from a parameter name to its representation
   *
   * @return parameterDetails
   **/
  @ApiModelProperty(value = "The current (as of Wavefront 4.0) JSON representation of dashboard parameters.  This is a map from a parameter name to its representation")
  public Map<String, DashboardParameterValue> getParameterDetails() {
    return parameterDetails;
  }

  public void setParameterDetails(Map<String, DashboardParameterValue> parameterDetails) {
    this.parameterDetails = parameterDetails;
  }

  public Dashboard displayDescription(Boolean displayDescription) {
    this.displayDescription = displayDescription;
    return this;
  }

  /**
   * Whether the dashboard description section is opened by default when the dashboard is shown
   *
   * @return displayDescription
   **/
  @ApiModelProperty(value = "Whether the dashboard description section is opened by default when the dashboard is shown")
  public Boolean isDisplayDescription() {
    return displayDescription;
  }

  public void setDisplayDescription(Boolean displayDescription) {
    this.displayDescription = displayDescription;
  }

  public Dashboard displaySectionTableOfContents(Boolean displaySectionTableOfContents) {
    this.displaySectionTableOfContents = displaySectionTableOfContents;
    return this;
  }

  /**
   * Whether the \&quot;pills\&quot; quick-linked the sections of the dashboard are displayed by default when the dashboard is shown
   *
   * @return displaySectionTableOfContents
   **/
  @ApiModelProperty(value = "Whether the \"pills\" quick-linked the sections of the dashboard are displayed by default when the dashboard is shown")
  public Boolean isDisplaySectionTableOfContents() {
    return displaySectionTableOfContents;
  }

  public void setDisplaySectionTableOfContents(Boolean displaySectionTableOfContents) {
    this.displaySectionTableOfContents = displaySectionTableOfContents;
  }

  public Dashboard displayQueryParameters(Boolean displayQueryParameters) {
    this.displayQueryParameters = displayQueryParameters;
    return this;
  }

  /**
   * Whether the dashboard parameters section is opened by default when the dashboard is shown
   *
   * @return displayQueryParameters
   **/
  @ApiModelProperty(value = "Whether the dashboard parameters section is opened by default when the dashboard is shown")
  public Boolean isDisplayQueryParameters() {
    return displayQueryParameters;
  }

  public void setDisplayQueryParameters(Boolean displayQueryParameters) {
    this.displayQueryParameters = displayQueryParameters;
  }

  public Dashboard chartTitleScalar(Integer chartTitleScalar) {
    this.chartTitleScalar = chartTitleScalar;
    return this;
  }

  /**
   * Scale (normally 100) of chart title text size
   *
   * @return chartTitleScalar
   **/
  @ApiModelProperty(value = "Scale (normally 100) of chart title text size")
  public Integer getChartTitleScalar() {
    return chartTitleScalar;
  }

  public void setChartTitleScalar(Integer chartTitleScalar) {
    this.chartTitleScalar = chartTitleScalar;
  }

  public Dashboard eventQuery(String eventQuery) {
    this.eventQuery = eventQuery;
    return this;
  }

  /**
   * Event query to run on dashboard charts
   *
   * @return eventQuery
   **/
  @ApiModelProperty(value = "Event query to run on dashboard charts")
  public String getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(String eventQuery) {
    this.eventQuery = eventQuery;
  }

  public Dashboard defaultTimeWindow(String defaultTimeWindow) {
    this.defaultTimeWindow = defaultTimeWindow;
    return this;
  }

  /**
   * Default time window to query charts
   *
   * @return defaultTimeWindow
   **/
  @ApiModelProperty(value = "Default time window to query charts")
  public String getDefaultTimeWindow() {
    return defaultTimeWindow;
  }

  public void setDefaultTimeWindow(String defaultTimeWindow) {
    this.defaultTimeWindow = defaultTimeWindow;
  }

  public Dashboard defaultStartTime(Long defaultStartTime) {
    this.defaultStartTime = defaultStartTime;
    return this;
  }

  /**
   * Default start time in milliseconds to query charts
   *
   * @return defaultStartTime
   **/
  @ApiModelProperty(value = "Default start time in milliseconds to query charts")
  public Long getDefaultStartTime() {
    return defaultStartTime;
  }

  public void setDefaultStartTime(Long defaultStartTime) {
    this.defaultStartTime = defaultStartTime;
  }

  public Dashboard defaultEndTime(Long defaultEndTime) {
    this.defaultEndTime = defaultEndTime;
    return this;
  }

  /**
   * Default end time in milliseconds to query charts
   *
   * @return defaultEndTime
   **/
  @ApiModelProperty(value = "Default end time in milliseconds to query charts")
  public Long getDefaultEndTime() {
    return defaultEndTime;
  }

  public void setDefaultEndTime(Long defaultEndTime) {
    this.defaultEndTime = defaultEndTime;
  }

  public Dashboard chartTitleColor(String chartTitleColor) {
    this.chartTitleColor = chartTitleColor;
    return this;
  }

  /**
   * Text color of the chart title text are, in rgba(rvalue,gvalue,bvalue,avalue)
   *
   * @return chartTitleColor
   **/
  @ApiModelProperty(value = "Text color of the chart title text are, in rgba(rvalue,gvalue,bvalue,avalue)")
  public String getChartTitleColor() {
    return chartTitleColor;
  }

  public void setChartTitleColor(String chartTitleColor) {
    this.chartTitleColor = chartTitleColor;
  }

  public Dashboard chartTitleBgColor(String chartTitleBgColor) {
    this.chartTitleBgColor = chartTitleBgColor;
    return this;
  }

  /**
   * Background color of the chart title text area, in rgba(rvalue,gvalue,bvalue,avalue)
   *
   * @return chartTitleBgColor
   **/
  @ApiModelProperty(value = "Background color of the chart title text area, in rgba(rvalue,gvalue,bvalue,avalue)")
  public String getChartTitleBgColor() {
    return chartTitleBgColor;
  }

  public void setChartTitleBgColor(String chartTitleBgColor) {
    this.chartTitleBgColor = chartTitleBgColor;
  }

  /**
   * Get viewsLastDay
   *
   * @return viewsLastDay
   **/
  @ApiModelProperty(value = "")
  public Integer getViewsLastDay() {
    return viewsLastDay;
  }

  /**
   * Get viewsLastWeek
   *
   * @return viewsLastWeek
   **/
  @ApiModelProperty(value = "")
  public Integer getViewsLastWeek() {
    return viewsLastWeek;
  }

  /**
   * Get viewsLastMonth
   *
   * @return viewsLastMonth
   **/
  @ApiModelProperty(value = "")
  public Integer getViewsLastMonth() {
    return viewsLastMonth;
  }

  public Dashboard acl(AccessControlListSimple acl) {
    this.acl = acl;
    return this;
  }

  /**
   * Get acl
   *
   * @return acl
   **/
  @ApiModelProperty(value = "")
  public AccessControlListSimple getAcl() {
    return acl;
  }

  public void setAcl(AccessControlListSimple acl) {
    this.acl = acl;
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

  /**
   * Get updatedEpochMillis
   *
   * @return updatedEpochMillis
   **/
  @ApiModelProperty(value = "")
  public Long getUpdatedEpochMillis() {
    return updatedEpochMillis;
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

  /**
   * Get numCharts
   *
   * @return numCharts
   **/
  @ApiModelProperty(value = "")
  public Integer getNumCharts() {
    return numCharts;
  }

  /**
   * Get numFavorites
   *
   * @return numFavorites
   **/
  @ApiModelProperty(value = "")
  public Integer getNumFavorites() {
    return numFavorites;
  }

  /**
   * Get favorite
   *
   * @return favorite
   **/
  @ApiModelProperty(value = "")
  public Boolean isFavorite() {
    return favorite;
  }

  /**
   * Get orphan
   *
   * @return orphan
   **/
  @ApiModelProperty(value = "")
  public Boolean isOrphan() {
    return orphan;
  }

  public Dashboard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the dashboard
   *
   * @return name
   **/
  @ApiModelProperty(required = true, value = "Name of the dashboard")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.canUserModify, dashboard.canUserModify) &&
        Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.hidden, dashboard.hidden) &&
        Objects.equals(this.parameters, dashboard.parameters) &&
        Objects.equals(this.tags, dashboard.tags) &&
        Objects.equals(this.customer, dashboard.customer) &&
        Objects.equals(this.url, dashboard.url) &&
        Objects.equals(this.systemOwned, dashboard.systemOwned) &&
        Objects.equals(this.creatorId, dashboard.creatorId) &&
        Objects.equals(this.updaterId, dashboard.updaterId) &&
        Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.eventFilterType, dashboard.eventFilterType) &&
        Objects.equals(this.sections, dashboard.sections) &&
        Objects.equals(this.parameterDetails, dashboard.parameterDetails) &&
        Objects.equals(this.displayDescription, dashboard.displayDescription) &&
        Objects.equals(this.displaySectionTableOfContents, dashboard.displaySectionTableOfContents) &&
        Objects.equals(this.displayQueryParameters, dashboard.displayQueryParameters) &&
        Objects.equals(this.chartTitleScalar, dashboard.chartTitleScalar) &&
        Objects.equals(this.eventQuery, dashboard.eventQuery) &&
        Objects.equals(this.defaultTimeWindow, dashboard.defaultTimeWindow) &&
        Objects.equals(this.defaultStartTime, dashboard.defaultStartTime) &&
        Objects.equals(this.defaultEndTime, dashboard.defaultEndTime) &&
        Objects.equals(this.chartTitleColor, dashboard.chartTitleColor) &&
        Objects.equals(this.chartTitleBgColor, dashboard.chartTitleBgColor) &&
        Objects.equals(this.viewsLastDay, dashboard.viewsLastDay) &&
        Objects.equals(this.viewsLastWeek, dashboard.viewsLastWeek) &&
        Objects.equals(this.viewsLastMonth, dashboard.viewsLastMonth) &&
        Objects.equals(this.acl, dashboard.acl) &&
        Objects.equals(this.createdEpochMillis, dashboard.createdEpochMillis) &&
        Objects.equals(this.updatedEpochMillis, dashboard.updatedEpochMillis) &&
        Objects.equals(this.deleted, dashboard.deleted) &&
        Objects.equals(this.numCharts, dashboard.numCharts) &&
        Objects.equals(this.numFavorites, dashboard.numFavorites) &&
        Objects.equals(this.favorite, dashboard.favorite) &&
        Objects.equals(this.orphan, dashboard.orphan) &&
        Objects.equals(this.name, dashboard.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canUserModify, description, hidden, parameters, tags, customer, url, systemOwned, creatorId, updaterId, id, eventFilterType, sections, parameterDetails, displayDescription, displaySectionTableOfContents, displayQueryParameters, chartTitleScalar, eventQuery, defaultTimeWindow, defaultStartTime, defaultEndTime, chartTitleColor, chartTitleBgColor, viewsLastDay, viewsLastWeek, viewsLastMonth, acl, createdEpochMillis, updatedEpochMillis, deleted, numCharts, numFavorites, favorite, orphan, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");

    sb.append("    canUserModify: ").append(toIndentedString(canUserModify)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    systemOwned: ").append(toIndentedString(systemOwned)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventFilterType: ").append(toIndentedString(eventFilterType)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    parameterDetails: ").append(toIndentedString(parameterDetails)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    displaySectionTableOfContents: ").append(toIndentedString(displaySectionTableOfContents)).append("\n");
    sb.append("    displayQueryParameters: ").append(toIndentedString(displayQueryParameters)).append("\n");
    sb.append("    chartTitleScalar: ").append(toIndentedString(chartTitleScalar)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    defaultTimeWindow: ").append(toIndentedString(defaultTimeWindow)).append("\n");
    sb.append("    defaultStartTime: ").append(toIndentedString(defaultStartTime)).append("\n");
    sb.append("    defaultEndTime: ").append(toIndentedString(defaultEndTime)).append("\n");
    sb.append("    chartTitleColor: ").append(toIndentedString(chartTitleColor)).append("\n");
    sb.append("    chartTitleBgColor: ").append(toIndentedString(chartTitleBgColor)).append("\n");
    sb.append("    viewsLastDay: ").append(toIndentedString(viewsLastDay)).append("\n");
    sb.append("    viewsLastWeek: ").append(toIndentedString(viewsLastWeek)).append("\n");
    sb.append("    viewsLastMonth: ").append(toIndentedString(viewsLastMonth)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    createdEpochMillis: ").append(toIndentedString(createdEpochMillis)).append("\n");
    sb.append("    updatedEpochMillis: ").append(toIndentedString(updatedEpochMillis)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    numCharts: ").append(toIndentedString(numCharts)).append("\n");
    sb.append("    numFavorites: ").append(toIndentedString(numFavorites)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    orphan: ").append(toIndentedString(orphan)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

