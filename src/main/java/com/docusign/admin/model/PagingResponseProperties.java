package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PagingResponseProperties
 */

public class PagingResponseProperties {
  @JsonProperty("result_set_size")
  private Integer resultSetSize = null;

  @JsonProperty("result_set_start_position")
  private Integer resultSetStartPosition = null;

  @JsonProperty("result_set_end_position")
  private Integer resultSetEndPosition = null;

  @JsonProperty("total_set_size")
  private Integer totalSetSize = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  public PagingResponseProperties resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * Get resultSetSize
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public PagingResponseProperties resultSetStartPosition(Integer resultSetStartPosition) {
    this.resultSetStartPosition = resultSetStartPosition;
    return this;
  }

   /**
   * Get resultSetStartPosition
   * @return resultSetStartPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getResultSetStartPosition() {
    return resultSetStartPosition;
  }

  public void setResultSetStartPosition(Integer resultSetStartPosition) {
    this.resultSetStartPosition = resultSetStartPosition;
  }

  public PagingResponseProperties resultSetEndPosition(Integer resultSetEndPosition) {
    this.resultSetEndPosition = resultSetEndPosition;
    return this;
  }

   /**
   * Get resultSetEndPosition
   * @return resultSetEndPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getResultSetEndPosition() {
    return resultSetEndPosition;
  }

  public void setResultSetEndPosition(Integer resultSetEndPosition) {
    this.resultSetEndPosition = resultSetEndPosition;
  }

  public PagingResponseProperties totalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * Get totalSetSize
   * @return totalSetSize
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalSetSize() {
    return totalSetSize;
  }

  public void setTotalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  public PagingResponseProperties next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PagingResponseProperties previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingResponseProperties pagingResponseProperties = (PagingResponseProperties) o;
    return Objects.equals(this.resultSetSize, pagingResponseProperties.resultSetSize) &&
        Objects.equals(this.resultSetStartPosition, pagingResponseProperties.resultSetStartPosition) &&
        Objects.equals(this.resultSetEndPosition, pagingResponseProperties.resultSetEndPosition) &&
        Objects.equals(this.totalSetSize, pagingResponseProperties.totalSetSize) &&
        Objects.equals(this.next, pagingResponseProperties.next) &&
        Objects.equals(this.previous, pagingResponseProperties.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, resultSetStartPosition, resultSetEndPosition, totalSetSize, next, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingResponseProperties {\n");
    
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    resultSetStartPosition: ").append(toIndentedString(resultSetStartPosition)).append("\n");
    sb.append("    resultSetEndPosition: ").append(toIndentedString(resultSetEndPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

