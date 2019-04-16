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
 * Specifies how returned items should be sorted
 */
@ApiModel(description = "Specifies how returned items should be sorted")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class Sorting {
  @SerializedName("ascending")
  private Boolean ascending = null;

  @SerializedName("field")
  private String field = null;

  @SerializedName("default")
  private Boolean _default = null;

  public Sorting ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

   /**
   * Whether to sort ascending.  If undefined, sorting is not guaranteed
   * @return ascending
  **/
  @ApiModelProperty(required = true, value = "Whether to sort ascending.  If undefined, sorting is not guaranteed")
  public Boolean isAscending() {
    return ascending;
  }

  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }

  public Sorting field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The facet by which to sort
   * @return field
  **/
  @ApiModelProperty(required = true, value = "The facet by which to sort")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

   /**
   * Whether this sort requests the default ranking order.  Ascending/descending does not matter if this attribute is true.
   * @return _default
  **/
  @ApiModelProperty(value = "Whether this sort requests the default ranking order.  Ascending/descending does not matter if this attribute is true.")
  public Boolean isDefault() {
    return _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sorting sorting = (Sorting) o;
    return Objects.equals(this.ascending, sorting.ascending) &&
        Objects.equals(this.field, sorting.field) &&
        Objects.equals(this._default, sorting._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ascending, field, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sorting {\n");
    
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
