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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A representation of events as returned by the querying api, rather than the event api
 */
@ApiModel(description = "A representation of events as returned by the querying api, rather than the event api")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class QueryEvent {
  @SerializedName("name")
  private String name = null;

  @SerializedName("start")
  private Long start = null;

  @SerializedName("end")
  private Long end = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("hosts")
  private List<String> hosts = null;

  @SerializedName("summarized")
  private Long summarized = null;

  @SerializedName("isEphemeral")
  private Boolean isEphemeral = null;

  public QueryEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Event name
   * @return name
  **/
  @ApiModelProperty(value = "Event name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryEvent start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Start time of event, in epoch millis
   * @return start
  **/
  @ApiModelProperty(value = "Start time of event, in epoch millis")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public QueryEvent end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * End time of event, in epoch millis
   * @return end
  **/
  @ApiModelProperty(value = "End time of event, in epoch millis")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public QueryEvent tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public QueryEvent putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags (annotations) on the event
   * @return tags
  **/
  @ApiModelProperty(value = "Tags (annotations) on the event")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public QueryEvent hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public QueryEvent addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Sources (hosts) to which the event pertains
   * @return hosts
  **/
  @ApiModelProperty(value = "Sources (hosts) to which the event pertains")
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public QueryEvent summarized(Long summarized) {
    this.summarized = summarized;
    return this;
  }

   /**
   * In some event queries, multiple events that occur nearly simultaneously are summarized under a single event.  This value specifies the number of events summarized under this one
   * @return summarized
  **/
  @ApiModelProperty(value = "In some event queries, multiple events that occur nearly simultaneously are summarized under a single event.  This value specifies the number of events summarized under this one")
  public Long getSummarized() {
    return summarized;
  }

  public void setSummarized(Long summarized) {
    this.summarized = summarized;
  }

  public QueryEvent isEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
    return this;
  }

   /**
   * Whether the event is an artificial event generated by a literal expression or alert backtesting, i.e. not stored in the Wavefront backend
   * @return isEphemeral
  **/
  @ApiModelProperty(value = "Whether the event is an artificial event generated by a literal expression or alert backtesting, i.e. not stored in the Wavefront backend")
  public Boolean isIsEphemeral() {
    return isEphemeral;
  }

  public void setIsEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEvent queryEvent = (QueryEvent) o;
    return Objects.equals(this.name, queryEvent.name) &&
        Objects.equals(this.start, queryEvent.start) &&
        Objects.equals(this.end, queryEvent.end) &&
        Objects.equals(this.tags, queryEvent.tags) &&
        Objects.equals(this.hosts, queryEvent.hosts) &&
        Objects.equals(this.summarized, queryEvent.summarized) &&
        Objects.equals(this.isEphemeral, queryEvent.isEphemeral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, start, end, tags, hosts, summarized, isEphemeral);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEvent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    summarized: ").append(toIndentedString(summarized)).append("\n");
    sb.append("    isEphemeral: ").append(toIndentedString(isEphemeral)).append("\n");
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
