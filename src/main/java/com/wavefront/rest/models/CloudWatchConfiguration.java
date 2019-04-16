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
import com.wavefront.rest.models.AWSBaseCredentials;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Configuration specific to the CloudWatch AWS integration.  Only applicable when the containing Credential has service&#x3D;CLOUDWATCH
 */
@ApiModel(description = "Configuration specific to the CloudWatch AWS integration.  Only applicable when the containing Credential has service=CLOUDWATCH")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class CloudWatchConfiguration {
  @SerializedName("metricFilterRegex")
  private String metricFilterRegex = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("baseCredentials")
  private AWSBaseCredentials baseCredentials = null;

  @SerializedName("instanceSelectionTags")
  private Map<String, String> instanceSelectionTags = null;

  @SerializedName("volumeSelectionTags")
  private Map<String, String> volumeSelectionTags = null;

  @SerializedName("pointTagFilterRegex")
  private String pointTagFilterRegex = null;

  public CloudWatchConfiguration metricFilterRegex(String metricFilterRegex) {
    this.metricFilterRegex = metricFilterRegex;
    return this;
  }

   /**
   * A regular expression that a CloudWatch metric name must match (case-insensitively) in order to be ingested
   * @return metricFilterRegex
  **/
  @ApiModelProperty(example = "^aws.(billing|instance|sqs|sns|reservedInstance|ebs|route53.health|ec2.status|elb).*$", value = "A regular expression that a CloudWatch metric name must match (case-insensitively) in order to be ingested")
  public String getMetricFilterRegex() {
    return metricFilterRegex;
  }

  public void setMetricFilterRegex(String metricFilterRegex) {
    this.metricFilterRegex = metricFilterRegex;
  }

  public CloudWatchConfiguration namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public CloudWatchConfiguration addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<String>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * A list of namespace that limit what we query from CloudWatch.
   * @return namespaces
  **/
  @ApiModelProperty(value = "A list of namespace that limit what we query from CloudWatch.")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public CloudWatchConfiguration baseCredentials(AWSBaseCredentials baseCredentials) {
    this.baseCredentials = baseCredentials;
    return this;
  }

   /**
   * Get baseCredentials
   * @return baseCredentials
  **/
  @ApiModelProperty(value = "")
  public AWSBaseCredentials getBaseCredentials() {
    return baseCredentials;
  }

  public void setBaseCredentials(AWSBaseCredentials baseCredentials) {
    this.baseCredentials = baseCredentials;
  }

  public CloudWatchConfiguration instanceSelectionTags(Map<String, String> instanceSelectionTags) {
    this.instanceSelectionTags = instanceSelectionTags;
    return this;
  }

  public CloudWatchConfiguration putInstanceSelectionTagsItem(String key, String instanceSelectionTagsItem) {
    if (this.instanceSelectionTags == null) {
      this.instanceSelectionTags = new HashMap<String, String>();
    }
    this.instanceSelectionTags.put(key, instanceSelectionTagsItem);
    return this;
  }

   /**
   * A comma-separated white list of AWS instance tag-value pairs (in AWS).  If the instance&#39;s AWS tags match this whitelist, CloudWatch data about this instance is ingested.  Multiple entries are OR&#39;ed
   * @return instanceSelectionTags
  **/
  @ApiModelProperty(value = "A comma-separated white list of AWS instance tag-value pairs (in AWS).  If the instance's AWS tags match this whitelist, CloudWatch data about this instance is ingested.  Multiple entries are OR'ed")
  public Map<String, String> getInstanceSelectionTags() {
    return instanceSelectionTags;
  }

  public void setInstanceSelectionTags(Map<String, String> instanceSelectionTags) {
    this.instanceSelectionTags = instanceSelectionTags;
  }

  public CloudWatchConfiguration volumeSelectionTags(Map<String, String> volumeSelectionTags) {
    this.volumeSelectionTags = volumeSelectionTags;
    return this;
  }

  public CloudWatchConfiguration putVolumeSelectionTagsItem(String key, String volumeSelectionTagsItem) {
    if (this.volumeSelectionTags == null) {
      this.volumeSelectionTags = new HashMap<String, String>();
    }
    this.volumeSelectionTags.put(key, volumeSelectionTagsItem);
    return this;
  }

   /**
   * A comma-separated white list of AWS volume tag-value pairs (in AWS).  If the volume&#39;s AWS tags match this whitelist, CloudWatch data about this volume is ingested.  Multiple entries are OR&#39;ed
   * @return volumeSelectionTags
  **/
  @ApiModelProperty(value = "A comma-separated white list of AWS volume tag-value pairs (in AWS).  If the volume's AWS tags match this whitelist, CloudWatch data about this volume is ingested.  Multiple entries are OR'ed")
  public Map<String, String> getVolumeSelectionTags() {
    return volumeSelectionTags;
  }

  public void setVolumeSelectionTags(Map<String, String> volumeSelectionTags) {
    this.volumeSelectionTags = volumeSelectionTags;
  }

  public CloudWatchConfiguration pointTagFilterRegex(String pointTagFilterRegex) {
    this.pointTagFilterRegex = pointTagFilterRegex;
    return this;
  }

   /**
   * A regular expression that AWS tag key name must match (case-insensitively) in order to be ingested
   * @return pointTagFilterRegex
  **/
  @ApiModelProperty(example = "(region|name)", value = "A regular expression that AWS tag key name must match (case-insensitively) in order to be ingested")
  public String getPointTagFilterRegex() {
    return pointTagFilterRegex;
  }

  public void setPointTagFilterRegex(String pointTagFilterRegex) {
    this.pointTagFilterRegex = pointTagFilterRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWatchConfiguration cloudWatchConfiguration = (CloudWatchConfiguration) o;
    return Objects.equals(this.metricFilterRegex, cloudWatchConfiguration.metricFilterRegex) &&
        Objects.equals(this.namespaces, cloudWatchConfiguration.namespaces) &&
        Objects.equals(this.baseCredentials, cloudWatchConfiguration.baseCredentials) &&
        Objects.equals(this.instanceSelectionTags, cloudWatchConfiguration.instanceSelectionTags) &&
        Objects.equals(this.volumeSelectionTags, cloudWatchConfiguration.volumeSelectionTags) &&
        Objects.equals(this.pointTagFilterRegex, cloudWatchConfiguration.pointTagFilterRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricFilterRegex, namespaces, baseCredentials, instanceSelectionTags, volumeSelectionTags, pointTagFilterRegex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWatchConfiguration {\n");
    
    sb.append("    metricFilterRegex: ").append(toIndentedString(metricFilterRegex)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    baseCredentials: ").append(toIndentedString(baseCredentials)).append("\n");
    sb.append("    instanceSelectionTags: ").append(toIndentedString(instanceSelectionTags)).append("\n");
    sb.append("    volumeSelectionTags: ").append(toIndentedString(volumeSelectionTags)).append("\n");
    sb.append("    pointTagFilterRegex: ").append(toIndentedString(pointTagFilterRegex)).append("\n");
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

