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
 * Alert target display information that includes type, id, and the name of the alert target.
 */
@ApiModel(description = "Alert target display information that includes type, id, and the name of the alert target.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class TargetInfo {
  /**
   * Notification method of the alert target
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    EMAIL("EMAIL"),

    PAGERDUTY("PAGERDUTY"),

    WEBHOOK("WEBHOOK");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("method")
  private MethodEnum method = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Notification method of the alert target
   *
   * @return method
   **/
  @ApiModelProperty(value = "Notification method of the alert target")
  public MethodEnum getMethod() {
    return method;
  }

  /**
   * ID of the alert target
   *
   * @return id
   **/
  @ApiModelProperty(value = "ID of the alert target")
  public String getId() {
    return id;
  }

  /**
   * Name of the alert target
   *
   * @return name
   **/
  @ApiModelProperty(value = "Name of the alert target")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetInfo targetInfo = (TargetInfo) o;
    return Objects.equals(this.method, targetInfo.method) &&
        Objects.equals(this.id, targetInfo.id) &&
        Objects.equals(this.name, targetInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetInfo {\n");

    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

