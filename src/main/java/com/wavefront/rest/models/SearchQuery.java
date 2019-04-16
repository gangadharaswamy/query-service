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
 * SearchQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class SearchQuery {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  /**
   * The method by which search matching is performed.  Default: CONTAINS
   */
  @JsonAdapter(MatchingMethodEnum.Adapter.class)
  public enum MatchingMethodEnum {
    CONTAINS("CONTAINS"),
    
    STARTSWITH("STARTSWITH"),
    
    EXACT("EXACT"),
    
    TAGPATH("TAGPATH");

    private String value;

    MatchingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchingMethodEnum fromValue(String text) {
      for (MatchingMethodEnum b : MatchingMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchingMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("matchingMethod")
  private MatchingMethodEnum matchingMethod = null;

  public SearchQuery key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The entity facet (key) by which to search.  Valid keys are any property keys returned by the JSON representation of the entity.  Examples are &#39;creatorId&#39;, &#39;name&#39;, etc.  The following special key keywords are also valid:  &#39;tags&#39; performs a search on entity tags, &#39;tagpath&#39; performs a hierarchical search on tags, with  periods (.) as path level separators.  &#39;freetext&#39; performs a free text search across many fields of the entity
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The entity facet (key) by which to search.  Valid keys are any property keys returned by the JSON representation of the entity.  Examples are 'creatorId', 'name', etc.  The following special key keywords are also valid:  'tags' performs a search on entity tags, 'tagpath' performs a hierarchical search on tags, with  periods (.) as path level separators.  'freetext' performs a free text search across many fields of the entity")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SearchQuery value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The entity facet value for which to search
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The entity facet value for which to search")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SearchQuery matchingMethod(MatchingMethodEnum matchingMethod) {
    this.matchingMethod = matchingMethod;
    return this;
  }

   /**
   * The method by which search matching is performed.  Default: CONTAINS
   * @return matchingMethod
  **/
  @ApiModelProperty(value = "The method by which search matching is performed.  Default: CONTAINS")
  public MatchingMethodEnum getMatchingMethod() {
    return matchingMethod;
  }

  public void setMatchingMethod(MatchingMethodEnum matchingMethod) {
    this.matchingMethod = matchingMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuery searchQuery = (SearchQuery) o;
    return Objects.equals(this.key, searchQuery.key) &&
        Objects.equals(this.value, searchQuery.value) &&
        Objects.equals(this.matchingMethod, searchQuery.matchingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, matchingMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuery {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    matchingMethod: ").append(toIndentedString(matchingMethod)).append("\n");
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

