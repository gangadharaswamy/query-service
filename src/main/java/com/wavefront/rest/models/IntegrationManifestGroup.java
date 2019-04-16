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
import com.wavefront.rest.models.Integration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A functional group of integrations defined together in a manifest
 */
@ApiModel(description = "A functional group of integrations defined together in a manifest")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class IntegrationManifestGroup {
  @SerializedName("integrations")
  private List<String> integrations = new ArrayList<String>();

  @SerializedName("integrationObjs")
  private List<Integration> integrationObjs = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("subtitle")
  private String subtitle = null;

  public IntegrationManifestGroup integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public IntegrationManifestGroup addIntegrationsItem(String integrationsItem) {
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * A list of paths to JSON definitions for integrations in this group
   * @return integrations
  **/
  @ApiModelProperty(required = true, value = "A list of paths to JSON definitions for integrations in this group")
  public List<String> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<String> integrations) {
    this.integrations = integrations;
  }

  public IntegrationManifestGroup integrationObjs(List<Integration> integrationObjs) {
    this.integrationObjs = integrationObjs;
    return this;
  }

  public IntegrationManifestGroup addIntegrationObjsItem(Integration integrationObjsItem) {
    if (this.integrationObjs == null) {
      this.integrationObjs = new ArrayList<Integration>();
    }
    this.integrationObjs.add(integrationObjsItem);
    return this;
  }

   /**
   * Materialized JSONs for integrations belonging to this group, as referenced by &#x60;integrations&#x60;
   * @return integrationObjs
  **/
  @ApiModelProperty(value = "Materialized JSONs for integrations belonging to this group, as referenced by `integrations`")
  public List<Integration> getIntegrationObjs() {
    return integrationObjs;
  }

  public void setIntegrationObjs(List<Integration> integrationObjs) {
    this.integrationObjs = integrationObjs;
  }

  public IntegrationManifestGroup title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of this integration group
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title of this integration group")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IntegrationManifestGroup subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Subtitle of this integration group
   * @return subtitle
  **/
  @ApiModelProperty(required = true, value = "Subtitle of this integration group")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationManifestGroup integrationManifestGroup = (IntegrationManifestGroup) o;
    return Objects.equals(this.integrations, integrationManifestGroup.integrations) &&
        Objects.equals(this.integrationObjs, integrationManifestGroup.integrationObjs) &&
        Objects.equals(this.title, integrationManifestGroup.title) &&
        Objects.equals(this.subtitle, integrationManifestGroup.subtitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrations, integrationObjs, title, subtitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationManifestGroup {\n");
    
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    integrationObjs: ").append(toIndentedString(integrationObjs)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
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
