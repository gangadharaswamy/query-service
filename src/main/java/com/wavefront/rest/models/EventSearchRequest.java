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

import com.wavefront.rest.models.EventTimeRange;
import com.wavefront.rest.models.SearchQuery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventSearchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class EventSearchRequest {
  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("query")
  private List<SearchQuery> query = null;

  @SerializedName("timeRange")
  private EventTimeRange timeRange = null;

  @SerializedName("sortTimeAscending")
  private Boolean sortTimeAscending = null;

  public EventSearchRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * The id (exclusive) from which search results resume returning.  Users should supply an entity &#39;id&#39; to this property.  Its main purpose is to resume where a previous search left off because of the &#39;limit&#39; parameter.  If a user supplies the last id in a set of results to cursor, while keeping the query the same, the system will return the next page of results
   *
   * @return cursor
   **/
  @ApiModelProperty(value = "The id (exclusive) from which search results resume returning.  Users should supply an entity 'id' to this property.  Its main purpose is to resume where a previous search left off because of the 'limit' parameter.  If a user supplies the last id in a set of results to cursor, while keeping the query the same, the system will return the next page of results")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public EventSearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The number of results to return.  Default: 100
   *
   * @return limit
   **/
  @ApiModelProperty(example = "100", value = "The number of results to return.  Default: 100")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public EventSearchRequest query(List<SearchQuery> query) {
    this.query = query;
    return this;
  }

  public EventSearchRequest addQueryItem(SearchQuery queryItem) {
    if (this.query == null) {
      this.query = new ArrayList<SearchQuery>();
    }
    this.query.add(queryItem);
    return this;
  }

  /**
   * A list of queries by which to limit the search results
   *
   * @return query
   **/
  @ApiModelProperty(value = "A list of queries by which to limit the search results")
  public List<SearchQuery> getQuery() {
    return query;
  }

  public void setQuery(List<SearchQuery> query) {
    this.query = query;
  }

  public EventSearchRequest timeRange(EventTimeRange timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * Get timeRange
   *
   * @return timeRange
   **/
  @ApiModelProperty(value = "")
  public EventTimeRange getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(EventTimeRange timeRange) {
    this.timeRange = timeRange;
  }

  public EventSearchRequest sortTimeAscending(Boolean sortTimeAscending) {
    this.sortTimeAscending = sortTimeAscending;
    return this;
  }

  /**
   * Whether to sort event results ascending in start time.  Default: false
   *
   * @return sortTimeAscending
   **/
  @ApiModelProperty(value = "Whether to sort event results ascending in start time.  Default: false")
  public Boolean isSortTimeAscending() {
    return sortTimeAscending;
  }

  public void setSortTimeAscending(Boolean sortTimeAscending) {
    this.sortTimeAscending = sortTimeAscending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSearchRequest eventSearchRequest = (EventSearchRequest) o;
    return Objects.equals(this.cursor, eventSearchRequest.cursor) &&
        Objects.equals(this.limit, eventSearchRequest.limit) &&
        Objects.equals(this.query, eventSearchRequest.query) &&
        Objects.equals(this.timeRange, eventSearchRequest.timeRange) &&
        Objects.equals(this.sortTimeAscending, eventSearchRequest.sortTimeAscending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit, query, timeRange, sortTimeAscending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSearchRequest {\n");

    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    sortTimeAscending: ").append(toIndentedString(sortTimeAscending)).append("\n");
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

