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
import java.util.List;

/**
 * Configurations specific to the EC2 AWS integration.  Only applicable when the containing Credential has service&#x3D;EC2
 */
@ApiModel(description = "Configurations specific to the EC2 AWS integration.  Only applicable when the containing Credential has service=EC2")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class EC2Configuration {
  @SerializedName("baseCredentials")
  private AWSBaseCredentials baseCredentials = null;

  @SerializedName("hostNameTags")
  private List<String> hostNameTags = null;

  public EC2Configuration baseCredentials(AWSBaseCredentials baseCredentials) {
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

  public EC2Configuration hostNameTags(List<String> hostNameTags) {
    this.hostNameTags = hostNameTags;
    return this;
  }

  public EC2Configuration addHostNameTagsItem(String hostNameTagsItem) {
    if (this.hostNameTags == null) {
      this.hostNameTags = new ArrayList<String>();
    }
    this.hostNameTags.add(hostNameTagsItem);
    return this;
  }

   /**
   * A list of AWS instance tags that, when found, will be used as the \&quot;source\&quot; name in a series.  Default: [\&quot;hostname\&quot;, \&quot;host\&quot;, \&quot;name\&quot;].  If no tag in this list is found, the series source is set to the instance id.
   * @return hostNameTags
  **/
  @ApiModelProperty(value = "A list of AWS instance tags that, when found, will be used as the \"source\" name in a series.  Default: [\"hostname\", \"host\", \"name\"].  If no tag in this list is found, the series source is set to the instance id.")
  public List<String> getHostNameTags() {
    return hostNameTags;
  }

  public void setHostNameTags(List<String> hostNameTags) {
    this.hostNameTags = hostNameTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EC2Configuration ec2Configuration = (EC2Configuration) o;
    return Objects.equals(this.baseCredentials, ec2Configuration.baseCredentials) &&
        Objects.equals(this.hostNameTags, ec2Configuration.hostNameTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCredentials, hostNameTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EC2Configuration {\n");
    
    sb.append("    baseCredentials: ").append(toIndentedString(baseCredentials)).append("\n");
    sb.append("    hostNameTags: ").append(toIndentedString(hostNameTags)).append("\n");
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

