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
import com.wavefront.rest.models.Chart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DashboardSectionRow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class DashboardSectionRow {
  @SerializedName("heightFactor")
  private Integer heightFactor = null;

  @SerializedName("charts")
  private List<Chart> charts = new ArrayList<Chart>();

  public DashboardSectionRow heightFactor(Integer heightFactor) {
    this.heightFactor = heightFactor;
    return this;
  }

   /**
   * Scalar for the height of this row. 100 is normal and default. 50 is half height
   * @return heightFactor
  **/
  @ApiModelProperty(value = "Scalar for the height of this row. 100 is normal and default. 50 is half height")
  public Integer getHeightFactor() {
    return heightFactor;
  }

  public void setHeightFactor(Integer heightFactor) {
    this.heightFactor = heightFactor;
  }

  public DashboardSectionRow charts(List<Chart> charts) {
    this.charts = charts;
    return this;
  }

  public DashboardSectionRow addChartsItem(Chart chartsItem) {
    this.charts.add(chartsItem);
    return this;
  }

   /**
   * Charts in this section row
   * @return charts
  **/
  @ApiModelProperty(required = true, value = "Charts in this section row")
  public List<Chart> getCharts() {
    return charts;
  }

  public void setCharts(List<Chart> charts) {
    this.charts = charts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSectionRow dashboardSectionRow = (DashboardSectionRow) o;
    return Objects.equals(this.heightFactor, dashboardSectionRow.heightFactor) &&
        Objects.equals(this.charts, dashboardSectionRow.charts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heightFactor, charts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSectionRow {\n");
    
    sb.append("    heightFactor: ").append(toIndentedString(heightFactor)).append("\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
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
