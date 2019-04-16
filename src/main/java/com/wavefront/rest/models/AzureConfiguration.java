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
import com.wavefront.rest.models.AzureBaseCredentials;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Configurations specific to the Azure integration. Only applicable when the containing Credential has service&#x3D;AZURE
 */
@ApiModel(description = "Configurations specific to the Azure integration. Only applicable when the containing Credential has service=AZURE")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class AzureConfiguration {
  @SerializedName("metricFilterRegex")
  private String metricFilterRegex = null;

  @SerializedName("baseCredentials")
  private AzureBaseCredentials baseCredentials = null;

  @SerializedName("categoryFilter")
  private List<String> categoryFilter = null;

  @SerializedName("resourceGroupFilter")
  private List<String> resourceGroupFilter = null;

  public AzureConfiguration metricFilterRegex(String metricFilterRegex) {
    this.metricFilterRegex = metricFilterRegex;
    return this;
  }

   /**
   * A regular expression that a metric name must match (case-insensitively) in order to be ingested
   * @return metricFilterRegex
  **/
  @ApiModelProperty(example = "^azure.(compute|network|dbforpostgresql).*$", value = "A regular expression that a metric name must match (case-insensitively) in order to be ingested")
  public String getMetricFilterRegex() {
    return metricFilterRegex;
  }

  public void setMetricFilterRegex(String metricFilterRegex) {
    this.metricFilterRegex = metricFilterRegex;
  }

  public AzureConfiguration baseCredentials(AzureBaseCredentials baseCredentials) {
    this.baseCredentials = baseCredentials;
    return this;
  }

   /**
   * Get baseCredentials
   * @return baseCredentials
  **/
  @ApiModelProperty(value = "")
  public AzureBaseCredentials getBaseCredentials() {
    return baseCredentials;
  }

  public void setBaseCredentials(AzureBaseCredentials baseCredentials) {
    this.baseCredentials = baseCredentials;
  }

  public AzureConfiguration categoryFilter(List<String> categoryFilter) {
    this.categoryFilter = categoryFilter;
    return this;
  }

  public AzureConfiguration addCategoryFilterItem(String categoryFilterItem) {
    if (this.categoryFilter == null) {
      this.categoryFilter = new ArrayList<String>();
    }
    this.categoryFilter.add(categoryFilterItem);
    return this;
  }

   /**
   * A list of Azure services (such as Microsoft.Compute/virtualMachines, Microsoft.Cache/redis etc) from which to pull metrics.
   * @return categoryFilter
  **/
  @ApiModelProperty(value = "A list of Azure services (such as Microsoft.Compute/virtualMachines, Microsoft.Cache/redis etc) from which to pull metrics.")
  public List<String> getCategoryFilter() {
    return categoryFilter;
  }

  public void setCategoryFilter(List<String> categoryFilter) {
    this.categoryFilter = categoryFilter;
  }

  public AzureConfiguration resourceGroupFilter(List<String> resourceGroupFilter) {
    this.resourceGroupFilter = resourceGroupFilter;
    return this;
  }

  public AzureConfiguration addResourceGroupFilterItem(String resourceGroupFilterItem) {
    if (this.resourceGroupFilter == null) {
      this.resourceGroupFilter = new ArrayList<String>();
    }
    this.resourceGroupFilter.add(resourceGroupFilterItem);
    return this;
  }

   /**
   * A list of Azure resource groups from which to pull metrics.
   * @return resourceGroupFilter
  **/
  @ApiModelProperty(value = "A list of Azure resource groups from which to pull metrics.")
  public List<String> getResourceGroupFilter() {
    return resourceGroupFilter;
  }

  public void setResourceGroupFilter(List<String> resourceGroupFilter) {
    this.resourceGroupFilter = resourceGroupFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureConfiguration azureConfiguration = (AzureConfiguration) o;
    return Objects.equals(this.metricFilterRegex, azureConfiguration.metricFilterRegex) &&
        Objects.equals(this.baseCredentials, azureConfiguration.baseCredentials) &&
        Objects.equals(this.categoryFilter, azureConfiguration.categoryFilter) &&
        Objects.equals(this.resourceGroupFilter, azureConfiguration.resourceGroupFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricFilterRegex, baseCredentials, categoryFilter, resourceGroupFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureConfiguration {\n");
    
    sb.append("    metricFilterRegex: ").append(toIndentedString(metricFilterRegex)).append("\n");
    sb.append("    baseCredentials: ").append(toIndentedString(baseCredentials)).append("\n");
    sb.append("    categoryFilter: ").append(toIndentedString(categoryFilter)).append("\n");
    sb.append("    resourceGroupFilter: ").append(toIndentedString(resourceGroupFilter)).append("\n");
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
