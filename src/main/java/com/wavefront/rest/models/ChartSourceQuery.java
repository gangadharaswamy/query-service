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
 * ChartSourceQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class ChartSourceQuery {
  /**
   * For scatter plots, does this query source the X-axis or the Y-axis
   */
  @JsonAdapter(ScatterPlotSourceEnum.Adapter.class)
  public enum ScatterPlotSourceEnum {
    X("X"),
    
    Y("Y");

    private String value;

    ScatterPlotSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScatterPlotSourceEnum fromValue(String text) {
      for (ScatterPlotSourceEnum b : ScatterPlotSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScatterPlotSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScatterPlotSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScatterPlotSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScatterPlotSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scatterPlotSource")
  private ScatterPlotSourceEnum scatterPlotSource = null;

  @SerializedName("sourceColor")
  private String sourceColor = null;

  @SerializedName("secondaryAxis")
  private Boolean secondaryAxis = null;

  @SerializedName("querybuilderSerialization")
  private String querybuilderSerialization = null;

  @SerializedName("querybuilderEnabled")
  private Boolean querybuilderEnabled = null;

  @SerializedName("sourceDescription")
  private String sourceDescription = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("name")
  private String name = null;

  public ChartSourceQuery scatterPlotSource(ScatterPlotSourceEnum scatterPlotSource) {
    this.scatterPlotSource = scatterPlotSource;
    return this;
  }

   /**
   * For scatter plots, does this query source the X-axis or the Y-axis
   * @return scatterPlotSource
  **/
  @ApiModelProperty(value = "For scatter plots, does this query source the X-axis or the Y-axis")
  public ScatterPlotSourceEnum getScatterPlotSource() {
    return scatterPlotSource;
  }

  public void setScatterPlotSource(ScatterPlotSourceEnum scatterPlotSource) {
    this.scatterPlotSource = scatterPlotSource;
  }

  public ChartSourceQuery sourceColor(String sourceColor) {
    this.sourceColor = sourceColor;
    return this;
  }

   /**
   * The color used to draw all results from this source (auto if unset)
   * @return sourceColor
  **/
  @ApiModelProperty(value = "The color used to draw all results from this source (auto if unset)")
  public String getSourceColor() {
    return sourceColor;
  }

  public void setSourceColor(String sourceColor) {
    this.sourceColor = sourceColor;
  }

  public ChartSourceQuery secondaryAxis(Boolean secondaryAxis) {
    this.secondaryAxis = secondaryAxis;
    return this;
  }

   /**
   * Determines if this source relates to the right hand Y-axis or not
   * @return secondaryAxis
  **/
  @ApiModelProperty(value = "Determines if this source relates to the right hand Y-axis or not")
  public Boolean isSecondaryAxis() {
    return secondaryAxis;
  }

  public void setSecondaryAxis(Boolean secondaryAxis) {
    this.secondaryAxis = secondaryAxis;
  }

  public ChartSourceQuery querybuilderSerialization(String querybuilderSerialization) {
    this.querybuilderSerialization = querybuilderSerialization;
    return this;
  }

   /**
   * Opaque representation of the querybuilder
   * @return querybuilderSerialization
  **/
  @ApiModelProperty(value = "Opaque representation of the querybuilder")
  public String getQuerybuilderSerialization() {
    return querybuilderSerialization;
  }

  public void setQuerybuilderSerialization(String querybuilderSerialization) {
    this.querybuilderSerialization = querybuilderSerialization;
  }

  public ChartSourceQuery querybuilderEnabled(Boolean querybuilderEnabled) {
    this.querybuilderEnabled = querybuilderEnabled;
    return this;
  }

   /**
   * Whether or not this source line should have the query builder enabled
   * @return querybuilderEnabled
  **/
  @ApiModelProperty(value = "Whether or not this source line should have the query builder enabled")
  public Boolean isQuerybuilderEnabled() {
    return querybuilderEnabled;
  }

  public void setQuerybuilderEnabled(Boolean querybuilderEnabled) {
    this.querybuilderEnabled = querybuilderEnabled;
  }

  public ChartSourceQuery sourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
    return this;
  }

   /**
   * A description for the purpose of this source
   * @return sourceDescription
  **/
  @ApiModelProperty(value = "A description for the purpose of this source")
  public String getSourceDescription() {
    return sourceDescription;
  }

  public void setSourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
  }

  public ChartSourceQuery query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query expression to plot on the chart
   * @return query
  **/
  @ApiModelProperty(required = true, value = "Query expression to plot on the chart")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ChartSourceQuery disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the source is disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "Whether the source is disabled")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public ChartSourceQuery name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the source
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the source")
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
    ChartSourceQuery chartSourceQuery = (ChartSourceQuery) o;
    return Objects.equals(this.scatterPlotSource, chartSourceQuery.scatterPlotSource) &&
        Objects.equals(this.sourceColor, chartSourceQuery.sourceColor) &&
        Objects.equals(this.secondaryAxis, chartSourceQuery.secondaryAxis) &&
        Objects.equals(this.querybuilderSerialization, chartSourceQuery.querybuilderSerialization) &&
        Objects.equals(this.querybuilderEnabled, chartSourceQuery.querybuilderEnabled) &&
        Objects.equals(this.sourceDescription, chartSourceQuery.sourceDescription) &&
        Objects.equals(this.query, chartSourceQuery.query) &&
        Objects.equals(this.disabled, chartSourceQuery.disabled) &&
        Objects.equals(this.name, chartSourceQuery.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scatterPlotSource, sourceColor, secondaryAxis, querybuilderSerialization, querybuilderEnabled, sourceDescription, query, disabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartSourceQuery {\n");
    
    sb.append("    scatterPlotSource: ").append(toIndentedString(scatterPlotSource)).append("\n");
    sb.append("    sourceColor: ").append(toIndentedString(sourceColor)).append("\n");
    sb.append("    secondaryAxis: ").append(toIndentedString(secondaryAxis)).append("\n");
    sb.append("    querybuilderSerialization: ").append(toIndentedString(querybuilderSerialization)).append("\n");
    sb.append("    querybuilderEnabled: ").append(toIndentedString(querybuilderEnabled)).append("\n");
    sb.append("    sourceDescription: ").append(toIndentedString(sourceDescription)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

