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
 * Configurations specific to the Google Cloud Platform integration.  Only applicable when the containing Credential has service&#x3D;GCP
 */
@ApiModel(description = "Configurations specific to the Google Cloud Platform integration.  Only applicable when the containing Credential has service=GCP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class GCPConfiguration {
  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("metricFilterRegex")
  private String metricFilterRegex = null;

  @SerializedName("gcpJsonKey")
  private String gcpJsonKey = null;

  /**
   * Gets or Sets categoriesToFetch
   */
  @JsonAdapter(CategoriesToFetchEnum.Adapter.class)
  public enum CategoriesToFetchEnum {
    APPENGINE("APPENGINE"),
    
    BIGQUERY("BIGQUERY"),
    
    BIGTABLE("BIGTABLE"),
    
    CLOUDFUNCTIONS("CLOUDFUNCTIONS"),
    
    CLOUDIOT("CLOUDIOT"),
    
    CLOUDSQL("CLOUDSQL"),
    
    CLOUDTASKS("CLOUDTASKS"),
    
    COMPUTE("COMPUTE"),
    
    CONTAINER("CONTAINER"),
    
    DATAFLOW("DATAFLOW"),
    
    DATAPROC("DATAPROC"),
    
    DATASTORE("DATASTORE"),
    
    FIREBASEDATABASE("FIREBASEDATABASE"),
    
    FIREBASEHOSTING("FIREBASEHOSTING"),
    
    INTERCONNECT("INTERCONNECT"),
    
    LOADBALANCING("LOADBALANCING"),
    
    LOGGING("LOGGING"),
    
    ML("ML"),
    
    MONITORING("MONITORING"),
    
    PUBSUB("PUBSUB"),
    
    REDIS("REDIS"),
    
    ROUTER("ROUTER"),
    
    SERVICERUNTIME("SERVICERUNTIME"),
    
    SPANNER("SPANNER"),
    
    STORAGE("STORAGE"),
    
    TPU("TPU"),
    
    VPN("VPN");

    private String value;

    CategoriesToFetchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoriesToFetchEnum fromValue(String text) {
      for (CategoriesToFetchEnum b : CategoriesToFetchEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoriesToFetchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoriesToFetchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoriesToFetchEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoriesToFetchEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("categoriesToFetch")
  private List<CategoriesToFetchEnum> categoriesToFetch = null;

  public GCPConfiguration projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The Google Cloud Platform (GCP) project id.
   * @return projectId
  **/
  @ApiModelProperty(required = true, value = "The Google Cloud Platform (GCP) project id.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GCPConfiguration metricFilterRegex(String metricFilterRegex) {
    this.metricFilterRegex = metricFilterRegex;
    return this;
  }

   /**
   * A regular expression that a metric name must match (case-insensitively) in order to be ingested
   * @return metricFilterRegex
  **/
  @ApiModelProperty(example = "^gcp.(compute|container|pubsub).*$", value = "A regular expression that a metric name must match (case-insensitively) in order to be ingested")
  public String getMetricFilterRegex() {
    return metricFilterRegex;
  }

  public void setMetricFilterRegex(String metricFilterRegex) {
    this.metricFilterRegex = metricFilterRegex;
  }

  public GCPConfiguration gcpJsonKey(String gcpJsonKey) {
    this.gcpJsonKey = gcpJsonKey;
    return this;
  }

   /**
   * Private key for a Google Cloud Platform (GCP) service account within your project.  The account must at least be granted Monitoring Viewer permissions.  This key must be in the JSON format generated by GCP. Use &#39;{\&quot;project_id\&quot;: \&quot;%s\&quot;}&#39; to retain the existing key when updating.
   * @return gcpJsonKey
  **/
  @ApiModelProperty(required = true, value = "Private key for a Google Cloud Platform (GCP) service account within your project.  The account must at least be granted Monitoring Viewer permissions.  This key must be in the JSON format generated by GCP. Use '{\"project_id\": \"%s\"}' to retain the existing key when updating.")
  public String getGcpJsonKey() {
    return gcpJsonKey;
  }

  public void setGcpJsonKey(String gcpJsonKey) {
    this.gcpJsonKey = gcpJsonKey;
  }

  public GCPConfiguration categoriesToFetch(List<CategoriesToFetchEnum> categoriesToFetch) {
    this.categoriesToFetch = categoriesToFetch;
    return this;
  }

  public GCPConfiguration addCategoriesToFetchItem(CategoriesToFetchEnum categoriesToFetchItem) {
    if (this.categoriesToFetch == null) {
      this.categoriesToFetch = new ArrayList<CategoriesToFetchEnum>();
    }
    this.categoriesToFetch.add(categoriesToFetchItem);
    return this;
  }

   /**
   * A list of Google Cloud Platform (GCP) services (such as ComputeEngine, PubSub, etc) from which to pull metrics.  Allowable values are APPENGINE, BIGQUERY, BIGTABLE, CLOUDFUNCTIONS, CLOUDIOT, CLOUDSQL, CLOUDTASKS, COMPUTE, CONTAINER, DATAFLOW, DATASTORE, FIREBASEDATABASE, FIREBASEHOSTING, LOGGING, ML, PUBSUB, ROUTER, SPANNER, STORAGE, VPN
   * @return categoriesToFetch
  **/
  @ApiModelProperty(value = "A list of Google Cloud Platform (GCP) services (such as ComputeEngine, PubSub, etc) from which to pull metrics.  Allowable values are APPENGINE, BIGQUERY, BIGTABLE, CLOUDFUNCTIONS, CLOUDIOT, CLOUDSQL, CLOUDTASKS, COMPUTE, CONTAINER, DATAFLOW, DATASTORE, FIREBASEDATABASE, FIREBASEHOSTING, LOGGING, ML, PUBSUB, ROUTER, SPANNER, STORAGE, VPN")
  public List<CategoriesToFetchEnum> getCategoriesToFetch() {
    return categoriesToFetch;
  }

  public void setCategoriesToFetch(List<CategoriesToFetchEnum> categoriesToFetch) {
    this.categoriesToFetch = categoriesToFetch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPConfiguration gcPConfiguration = (GCPConfiguration) o;
    return Objects.equals(this.projectId, gcPConfiguration.projectId) &&
        Objects.equals(this.metricFilterRegex, gcPConfiguration.metricFilterRegex) &&
        Objects.equals(this.gcpJsonKey, gcPConfiguration.gcpJsonKey) &&
        Objects.equals(this.categoriesToFetch, gcPConfiguration.categoriesToFetch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, metricFilterRegex, gcpJsonKey, categoriesToFetch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPConfiguration {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    metricFilterRegex: ").append(toIndentedString(metricFilterRegex)).append("\n");
    sb.append("    gcpJsonKey: ").append(toIndentedString(gcpJsonKey)).append("\n");
    sb.append("    categoriesToFetch: ").append(toIndentedString(categoriesToFetch)).append("\n");
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
