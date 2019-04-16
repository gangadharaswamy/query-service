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
 * AzureBaseCredentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class AzureBaseCredentials {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("tenant")
  private String tenant = null;

  public AzureBaseCredentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client Id for an Azure service account within your project.
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Client Id for an Azure service account within your project.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AzureBaseCredentials clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client Secret for an Azure service account within your project. Use &#39;saved_secret&#39; to retain the client secret when updating.
   * @return clientSecret
  **/
  @ApiModelProperty(required = true, value = "Client Secret for an Azure service account within your project. Use 'saved_secret' to retain the client secret when updating.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public AzureBaseCredentials tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Tenant Id for an Azure service account within your project.
   * @return tenant
  **/
  @ApiModelProperty(required = true, value = "Tenant Id for an Azure service account within your project.")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureBaseCredentials azureBaseCredentials = (AzureBaseCredentials) o;
    return Objects.equals(this.clientId, azureBaseCredentials.clientId) &&
        Objects.equals(this.clientSecret, azureBaseCredentials.clientSecret) &&
        Objects.equals(this.tenant, azureBaseCredentials.tenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, tenant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureBaseCredentials {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
