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

import com.wavefront.rest.models.ExternalLink;
import com.wavefront.rest.models.Sorting;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PagedExternalLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class PagedExternalLink {
  @SerializedName("items")
  private List<ExternalLink> items = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("totalItems")
  private Integer totalItems = null;

  @SerializedName("moreItems")
  private Boolean moreItems = null;

  @SerializedName("sort")
  private Sorting sort = null;

  public PagedExternalLink items(List<ExternalLink> items) {
    this.items = items;
    return this;
  }

  public PagedExternalLink addItemsItem(ExternalLink itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ExternalLink>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of requested items
   *
   * @return items
   **/
  @ApiModelProperty(value = "List of requested items")
  public List<ExternalLink> getItems() {
    return items;
  }

  public void setItems(List<ExternalLink> items) {
    this.items = items;
  }

  /**
   * Get offset
   *
   * @return offset
   **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }

  public PagedExternalLink limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   *
   * @return limit
   **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public PagedExternalLink cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * The id at which the current (limited) search can be continued to obtain more matching items
   *
   * @return cursor
   **/
  @ApiModelProperty(value = "The id at which the current (limited) search can be continued to obtain more matching items")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public PagedExternalLink totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * An estimate (lower-bound) of the total number of items available for return.  May not be a tight estimate for facet queries
   *
   * @return totalItems
   **/
  @ApiModelProperty(value = "An estimate (lower-bound) of the total number of items available for return.  May not be a tight estimate for facet queries")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public PagedExternalLink moreItems(Boolean moreItems) {
    this.moreItems = moreItems;
    return this;
  }

  /**
   * Whether more items are available for return by increment offset or cursor
   *
   * @return moreItems
   **/
  @ApiModelProperty(value = "Whether more items are available for return by increment offset or cursor")
  public Boolean isMoreItems() {
    return moreItems;
  }

  public void setMoreItems(Boolean moreItems) {
    this.moreItems = moreItems;
  }

  public PagedExternalLink sort(Sorting sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   *
   * @return sort
   **/
  @ApiModelProperty(value = "")
  public Sorting getSort() {
    return sort;
  }

  public void setSort(Sorting sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedExternalLink pagedExternalLink = (PagedExternalLink) o;
    return Objects.equals(this.items, pagedExternalLink.items) &&
        Objects.equals(this.offset, pagedExternalLink.offset) &&
        Objects.equals(this.limit, pagedExternalLink.limit) &&
        Objects.equals(this.cursor, pagedExternalLink.cursor) &&
        Objects.equals(this.totalItems, pagedExternalLink.totalItems) &&
        Objects.equals(this.moreItems, pagedExternalLink.moreItems) &&
        Objects.equals(this.sort, pagedExternalLink.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, offset, limit, cursor, totalItems, moreItems, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedExternalLink {\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    moreItems: ").append(toIndentedString(moreItems)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

