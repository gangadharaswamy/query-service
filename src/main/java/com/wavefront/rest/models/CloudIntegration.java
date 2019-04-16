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
import com.wavefront.rest.models.AzureActivityLogConfiguration;
import com.wavefront.rest.models.AzureConfiguration;
import com.wavefront.rest.models.CloudTrailConfiguration;
import com.wavefront.rest.models.CloudWatchConfiguration;
import com.wavefront.rest.models.EC2Configuration;
import com.wavefront.rest.models.Event;
import com.wavefront.rest.models.GCPBillingConfiguration;
import com.wavefront.rest.models.GCPConfiguration;
import com.wavefront.rest.models.NewRelicConfiguration;
import com.wavefront.rest.models.TeslaConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wavefront Cloud Integration
 */
@ApiModel(description = "Wavefront Cloud Integration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class CloudIntegration {
  @SerializedName("forceSave")
  private Boolean forceSave = null;

  /**
   * A value denoting which cloud service this integration integrates with
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    CLOUDWATCH("CLOUDWATCH"),
    
    CLOUDTRAIL("CLOUDTRAIL"),
    
    EC2("EC2"),
    
    GCP("GCP"),
    
    GCPBILLING("GCPBILLING"),
    
    TESLA("TESLA"),
    
    AZURE("AZURE"),
    
    AZUREACTIVITYLOG("AZUREACTIVITYLOG");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("service")
  private ServiceEnum service = null;

  @SerializedName("inTrash")
  private Boolean inTrash = null;

  @SerializedName("creatorId")
  private String creatorId = null;

  @SerializedName("updaterId")
  private String updaterId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lastErrorEvent")
  private Event lastErrorEvent = null;

  @SerializedName("additionalTags")
  private Map<String, String> additionalTags = null;

  @SerializedName("lastReceivedDataPointMs")
  private Long lastReceivedDataPointMs = null;

  @SerializedName("lastMetricCount")
  private Long lastMetricCount = null;

  @SerializedName("cloudWatch")
  private CloudWatchConfiguration cloudWatch = null;

  @SerializedName("cloudTrail")
  private CloudTrailConfiguration cloudTrail = null;

  @SerializedName("ec2")
  private EC2Configuration ec2 = null;

  @SerializedName("gcp")
  private GCPConfiguration gcp = null;

  @SerializedName("gcpBilling")
  private GCPBillingConfiguration gcpBilling = null;

  @SerializedName("newRelic")
  private NewRelicConfiguration newRelic = null;

  @SerializedName("tesla")
  private TeslaConfiguration tesla = null;

  @SerializedName("azure")
  private AzureConfiguration azure = null;

  @SerializedName("azureActivityLog")
  private AzureActivityLogConfiguration azureActivityLog = null;

  @SerializedName("lastError")
  private String lastError = null;

  @SerializedName("lastErrorMs")
  private Long lastErrorMs = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("lastProcessorId")
  private String lastProcessorId = null;

  @SerializedName("lastProcessingTimestamp")
  private Long lastProcessingTimestamp = null;

  @SerializedName("createdEpochMillis")
  private Long createdEpochMillis = null;

  @SerializedName("updatedEpochMillis")
  private Long updatedEpochMillis = null;

  @SerializedName("serviceRefreshRateInMins")
  private Integer serviceRefreshRateInMins = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("name")
  private String name = null;

  public CloudIntegration forceSave(Boolean forceSave) {
    this.forceSave = forceSave;
    return this;
  }

   /**
   * Get forceSave
   * @return forceSave
  **/
  @ApiModelProperty(value = "")
  public Boolean isForceSave() {
    return forceSave;
  }

  public void setForceSave(Boolean forceSave) {
    this.forceSave = forceSave;
  }

  public CloudIntegration service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * A value denoting which cloud service this integration integrates with
   * @return service
  **/
  @ApiModelProperty(required = true, value = "A value denoting which cloud service this integration integrates with")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }

   /**
   * Get inTrash
   * @return inTrash
  **/
  @ApiModelProperty(value = "")
  public Boolean isInTrash() {
    return inTrash;
  }

   /**
   * Get creatorId
   * @return creatorId
  **/
  @ApiModelProperty(value = "")
  public String getCreatorId() {
    return creatorId;
  }

   /**
   * Get updaterId
   * @return updaterId
  **/
  @ApiModelProperty(value = "")
  public String getUpdaterId() {
    return updaterId;
  }

  public CloudIntegration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudIntegration lastErrorEvent(Event lastErrorEvent) {
    this.lastErrorEvent = lastErrorEvent;
    return this;
  }

   /**
   * Get lastErrorEvent
   * @return lastErrorEvent
  **/
  @ApiModelProperty(value = "")
  public Event getLastErrorEvent() {
    return lastErrorEvent;
  }

  public void setLastErrorEvent(Event lastErrorEvent) {
    this.lastErrorEvent = lastErrorEvent;
  }

  public CloudIntegration additionalTags(Map<String, String> additionalTags) {
    this.additionalTags = additionalTags;
    return this;
  }

  public CloudIntegration putAdditionalTagsItem(String key, String additionalTagsItem) {
    if (this.additionalTags == null) {
      this.additionalTags = new HashMap<String, String>();
    }
    this.additionalTags.put(key, additionalTagsItem);
    return this;
  }

   /**
   * A list of point tag key-values to add to every point ingested using this integration
   * @return additionalTags
  **/
  @ApiModelProperty(value = "A list of point tag key-values to add to every point ingested using this integration")
  public Map<String, String> getAdditionalTags() {
    return additionalTags;
  }

  public void setAdditionalTags(Map<String, String> additionalTags) {
    this.additionalTags = additionalTags;
  }

   /**
   * Time that this integration last received a data point, in epoch millis
   * @return lastReceivedDataPointMs
  **/
  @ApiModelProperty(value = "Time that this integration last received a data point, in epoch millis")
  public Long getLastReceivedDataPointMs() {
    return lastReceivedDataPointMs;
  }

   /**
   * Number of metrics / events ingested by this integration the last time it ran
   * @return lastMetricCount
  **/
  @ApiModelProperty(value = "Number of metrics / events ingested by this integration the last time it ran")
  public Long getLastMetricCount() {
    return lastMetricCount;
  }

  public CloudIntegration cloudWatch(CloudWatchConfiguration cloudWatch) {
    this.cloudWatch = cloudWatch;
    return this;
  }

   /**
   * Get cloudWatch
   * @return cloudWatch
  **/
  @ApiModelProperty(value = "")
  public CloudWatchConfiguration getCloudWatch() {
    return cloudWatch;
  }

  public void setCloudWatch(CloudWatchConfiguration cloudWatch) {
    this.cloudWatch = cloudWatch;
  }

  public CloudIntegration cloudTrail(CloudTrailConfiguration cloudTrail) {
    this.cloudTrail = cloudTrail;
    return this;
  }

   /**
   * Get cloudTrail
   * @return cloudTrail
  **/
  @ApiModelProperty(value = "")
  public CloudTrailConfiguration getCloudTrail() {
    return cloudTrail;
  }

  public void setCloudTrail(CloudTrailConfiguration cloudTrail) {
    this.cloudTrail = cloudTrail;
  }

  public CloudIntegration ec2(EC2Configuration ec2) {
    this.ec2 = ec2;
    return this;
  }

   /**
   * Get ec2
   * @return ec2
  **/
  @ApiModelProperty(value = "")
  public EC2Configuration getEc2() {
    return ec2;
  }

  public void setEc2(EC2Configuration ec2) {
    this.ec2 = ec2;
  }

  public CloudIntegration gcp(GCPConfiguration gcp) {
    this.gcp = gcp;
    return this;
  }

   /**
   * Get gcp
   * @return gcp
  **/
  @ApiModelProperty(value = "")
  public GCPConfiguration getGcp() {
    return gcp;
  }

  public void setGcp(GCPConfiguration gcp) {
    this.gcp = gcp;
  }

  public CloudIntegration gcpBilling(GCPBillingConfiguration gcpBilling) {
    this.gcpBilling = gcpBilling;
    return this;
  }

   /**
   * Get gcpBilling
   * @return gcpBilling
  **/
  @ApiModelProperty(value = "")
  public GCPBillingConfiguration getGcpBilling() {
    return gcpBilling;
  }

  public void setGcpBilling(GCPBillingConfiguration gcpBilling) {
    this.gcpBilling = gcpBilling;
  }

  public CloudIntegration newRelic(NewRelicConfiguration newRelic) {
    this.newRelic = newRelic;
    return this;
  }

   /**
   * Get newRelic
   * @return newRelic
  **/
  @ApiModelProperty(value = "")
  public NewRelicConfiguration getNewRelic() {
    return newRelic;
  }

  public void setNewRelic(NewRelicConfiguration newRelic) {
    this.newRelic = newRelic;
  }

  public CloudIntegration tesla(TeslaConfiguration tesla) {
    this.tesla = tesla;
    return this;
  }

   /**
   * Get tesla
   * @return tesla
  **/
  @ApiModelProperty(value = "")
  public TeslaConfiguration getTesla() {
    return tesla;
  }

  public void setTesla(TeslaConfiguration tesla) {
    this.tesla = tesla;
  }

  public CloudIntegration azure(AzureConfiguration azure) {
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty(value = "")
  public AzureConfiguration getAzure() {
    return azure;
  }

  public void setAzure(AzureConfiguration azure) {
    this.azure = azure;
  }

  public CloudIntegration azureActivityLog(AzureActivityLogConfiguration azureActivityLog) {
    this.azureActivityLog = azureActivityLog;
    return this;
  }

   /**
   * Get azureActivityLog
   * @return azureActivityLog
  **/
  @ApiModelProperty(value = "")
  public AzureActivityLogConfiguration getAzureActivityLog() {
    return azureActivityLog;
  }

  public void setAzureActivityLog(AzureActivityLogConfiguration azureActivityLog) {
    this.azureActivityLog = azureActivityLog;
  }

   /**
   * Digest of the last error encountered by Wavefront servers when fetching data using this integration
   * @return lastError
  **/
  @ApiModelProperty(value = "Digest of the last error encountered by Wavefront servers when fetching data using this integration")
  public String getLastError() {
    return lastError;
  }

   /**
   * Time, in epoch millis, of the last error encountered by Wavefront servers when fetching data using this integration
   * @return lastErrorMs
  **/
  @ApiModelProperty(value = "Time, in epoch millis, of the last error encountered by Wavefront servers when fetching data using this integration")
  public Long getLastErrorMs() {
    return lastErrorMs;
  }

   /**
   * True when an aws credential failed to authenticate.
   * @return disabled
  **/
  @ApiModelProperty(value = "True when an aws credential failed to authenticate.")
  public Boolean isDisabled() {
    return disabled;
  }

   /**
   * Opaque id of the last Wavefront integrations service to act on this integration
   * @return lastProcessorId
  **/
  @ApiModelProperty(value = "Opaque id of the last Wavefront integrations service to act on this integration")
  public String getLastProcessorId() {
    return lastProcessorId;
  }

   /**
   * Time, in epoch millis, that this integration was last processed
   * @return lastProcessingTimestamp
  **/
  @ApiModelProperty(value = "Time, in epoch millis, that this integration was last processed")
  public Long getLastProcessingTimestamp() {
    return lastProcessingTimestamp;
  }

   /**
   * Get createdEpochMillis
   * @return createdEpochMillis
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedEpochMillis() {
    return createdEpochMillis;
  }

   /**
   * Get updatedEpochMillis
   * @return updatedEpochMillis
  **/
  @ApiModelProperty(value = "")
  public Long getUpdatedEpochMillis() {
    return updatedEpochMillis;
  }

  public CloudIntegration serviceRefreshRateInMins(Integer serviceRefreshRateInMins) {
    this.serviceRefreshRateInMins = serviceRefreshRateInMins;
    return this;
  }

   /**
   * Service refresh rate in minutes.
   * @return serviceRefreshRateInMins
  **/
  @ApiModelProperty(value = "Service refresh rate in minutes.")
  public Integer getServiceRefreshRateInMins() {
    return serviceRefreshRateInMins;
  }

  public void setServiceRefreshRateInMins(Integer serviceRefreshRateInMins) {
    this.serviceRefreshRateInMins = serviceRefreshRateInMins;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public CloudIntegration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human-readable name of this integration
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The human-readable name of this integration")
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
    CloudIntegration cloudIntegration = (CloudIntegration) o;
    return Objects.equals(this.forceSave, cloudIntegration.forceSave) &&
        Objects.equals(this.service, cloudIntegration.service) &&
        Objects.equals(this.inTrash, cloudIntegration.inTrash) &&
        Objects.equals(this.creatorId, cloudIntegration.creatorId) &&
        Objects.equals(this.updaterId, cloudIntegration.updaterId) &&
        Objects.equals(this.id, cloudIntegration.id) &&
        Objects.equals(this.lastErrorEvent, cloudIntegration.lastErrorEvent) &&
        Objects.equals(this.additionalTags, cloudIntegration.additionalTags) &&
        Objects.equals(this.lastReceivedDataPointMs, cloudIntegration.lastReceivedDataPointMs) &&
        Objects.equals(this.lastMetricCount, cloudIntegration.lastMetricCount) &&
        Objects.equals(this.cloudWatch, cloudIntegration.cloudWatch) &&
        Objects.equals(this.cloudTrail, cloudIntegration.cloudTrail) &&
        Objects.equals(this.ec2, cloudIntegration.ec2) &&
        Objects.equals(this.gcp, cloudIntegration.gcp) &&
        Objects.equals(this.gcpBilling, cloudIntegration.gcpBilling) &&
        Objects.equals(this.newRelic, cloudIntegration.newRelic) &&
        Objects.equals(this.tesla, cloudIntegration.tesla) &&
        Objects.equals(this.azure, cloudIntegration.azure) &&
        Objects.equals(this.azureActivityLog, cloudIntegration.azureActivityLog) &&
        Objects.equals(this.lastError, cloudIntegration.lastError) &&
        Objects.equals(this.lastErrorMs, cloudIntegration.lastErrorMs) &&
        Objects.equals(this.disabled, cloudIntegration.disabled) &&
        Objects.equals(this.lastProcessorId, cloudIntegration.lastProcessorId) &&
        Objects.equals(this.lastProcessingTimestamp, cloudIntegration.lastProcessingTimestamp) &&
        Objects.equals(this.createdEpochMillis, cloudIntegration.createdEpochMillis) &&
        Objects.equals(this.updatedEpochMillis, cloudIntegration.updatedEpochMillis) &&
        Objects.equals(this.serviceRefreshRateInMins, cloudIntegration.serviceRefreshRateInMins) &&
        Objects.equals(this.deleted, cloudIntegration.deleted) &&
        Objects.equals(this.name, cloudIntegration.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceSave, service, inTrash, creatorId, updaterId, id, lastErrorEvent, additionalTags, lastReceivedDataPointMs, lastMetricCount, cloudWatch, cloudTrail, ec2, gcp, gcpBilling, newRelic, tesla, azure, azureActivityLog, lastError, lastErrorMs, disabled, lastProcessorId, lastProcessingTimestamp, createdEpochMillis, updatedEpochMillis, serviceRefreshRateInMins, deleted, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudIntegration {\n");
    
    sb.append("    forceSave: ").append(toIndentedString(forceSave)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    inTrash: ").append(toIndentedString(inTrash)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastErrorEvent: ").append(toIndentedString(lastErrorEvent)).append("\n");
    sb.append("    additionalTags: ").append(toIndentedString(additionalTags)).append("\n");
    sb.append("    lastReceivedDataPointMs: ").append(toIndentedString(lastReceivedDataPointMs)).append("\n");
    sb.append("    lastMetricCount: ").append(toIndentedString(lastMetricCount)).append("\n");
    sb.append("    cloudWatch: ").append(toIndentedString(cloudWatch)).append("\n");
    sb.append("    cloudTrail: ").append(toIndentedString(cloudTrail)).append("\n");
    sb.append("    ec2: ").append(toIndentedString(ec2)).append("\n");
    sb.append("    gcp: ").append(toIndentedString(gcp)).append("\n");
    sb.append("    gcpBilling: ").append(toIndentedString(gcpBilling)).append("\n");
    sb.append("    newRelic: ").append(toIndentedString(newRelic)).append("\n");
    sb.append("    tesla: ").append(toIndentedString(tesla)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    azureActivityLog: ").append(toIndentedString(azureActivityLog)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    lastErrorMs: ").append(toIndentedString(lastErrorMs)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    lastProcessorId: ").append(toIndentedString(lastProcessorId)).append("\n");
    sb.append("    lastProcessingTimestamp: ").append(toIndentedString(lastProcessingTimestamp)).append("\n");
    sb.append("    createdEpochMillis: ").append(toIndentedString(createdEpochMillis)).append("\n");
    sb.append("    updatedEpochMillis: ").append(toIndentedString(updatedEpochMillis)).append("\n");
    sb.append("    serviceRefreshRateInMins: ").append(toIndentedString(serviceRefreshRateInMins)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
