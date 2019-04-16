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
 * Refinement of time range over which to search (for events).  Operates on the *start* time of the event.
 */
@ApiModel(description = "Refinement of time range over which to search (for events).  Operates on the *start* time of the event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class EventTimeRange {
  @SerializedName("earliestStartTimeEpochMillis")
  private Long earliestStartTimeEpochMillis = null;

  @SerializedName("latestStartTimeEpochMillis")
  private Long latestStartTimeEpochMillis = null;

  public EventTimeRange earliestStartTimeEpochMillis(Long earliestStartTimeEpochMillis) {
    this.earliestStartTimeEpochMillis = earliestStartTimeEpochMillis;
    return this;
  }

   /**
   * Start of search time window, in milliseconds since the Unix Epoch.  Events whose start time occurs after this value will be returned.  If no value is supplied, defaults to 2 hours prior the present time.
   * @return earliestStartTimeEpochMillis
  **/
  @ApiModelProperty(value = "Start of search time window, in milliseconds since the Unix Epoch.  Events whose start time occurs after this value will be returned.  If no value is supplied, defaults to 2 hours prior the present time.")
  public Long getEarliestStartTimeEpochMillis() {
    return earliestStartTimeEpochMillis;
  }

  public void setEarliestStartTimeEpochMillis(Long earliestStartTimeEpochMillis) {
    this.earliestStartTimeEpochMillis = earliestStartTimeEpochMillis;
  }

  public EventTimeRange latestStartTimeEpochMillis(Long latestStartTimeEpochMillis) {
    this.latestStartTimeEpochMillis = latestStartTimeEpochMillis;
    return this;
  }

   /**
   * End of the search time window, in milliseconds since the Unix Epoch.  Events whose start time occurs before this value will be returned.   If no value is supplied, defaults to now.
   * @return latestStartTimeEpochMillis
  **/
  @ApiModelProperty(value = "End of the search time window, in milliseconds since the Unix Epoch.  Events whose start time occurs before this value will be returned.   If no value is supplied, defaults to now.")
  public Long getLatestStartTimeEpochMillis() {
    return latestStartTimeEpochMillis;
  }

  public void setLatestStartTimeEpochMillis(Long latestStartTimeEpochMillis) {
    this.latestStartTimeEpochMillis = latestStartTimeEpochMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTimeRange eventTimeRange = (EventTimeRange) o;
    return Objects.equals(this.earliestStartTimeEpochMillis, eventTimeRange.earliestStartTimeEpochMillis) &&
        Objects.equals(this.latestStartTimeEpochMillis, eventTimeRange.latestStartTimeEpochMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestStartTimeEpochMillis, latestStartTimeEpochMillis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTimeRange {\n");
    
    sb.append("    earliestStartTimeEpochMillis: ").append(toIndentedString(earliestStartTimeEpochMillis)).append("\n");
    sb.append("    latestStartTimeEpochMillis: ").append(toIndentedString(latestStartTimeEpochMillis)).append("\n");
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

