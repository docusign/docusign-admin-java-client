package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PagingResponseProperties.
 *
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


  /**
   * resultSetSize.
   *
   * @return PagingResponseProperties
   **/
  public PagingResponseProperties resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Get resultSetSize.
   * @return resultSetSize
   **/
  @Schema(description = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * resultSetStartPosition.
   *
   * @return PagingResponseProperties
   **/
  public PagingResponseProperties resultSetStartPosition(Integer resultSetStartPosition) {
    this.resultSetStartPosition = resultSetStartPosition;
    return this;
  }

  /**
   * Get resultSetStartPosition.
   * @return resultSetStartPosition
   **/
  @Schema(description = "")
  public Integer getResultSetStartPosition() {
    return resultSetStartPosition;
  }

  /**
   * setResultSetStartPosition.
   **/
  public void setResultSetStartPosition(Integer resultSetStartPosition) {
    this.resultSetStartPosition = resultSetStartPosition;
  }


  /**
   * resultSetEndPosition.
   *
   * @return PagingResponseProperties
   **/
  public PagingResponseProperties resultSetEndPosition(Integer resultSetEndPosition) {
    this.resultSetEndPosition = resultSetEndPosition;
    return this;
  }

  /**
   * Get resultSetEndPosition.
   * @return resultSetEndPosition
   **/
  @Schema(description = "")
  public Integer getResultSetEndPosition() {
    return resultSetEndPosition;
  }

  /**
   * setResultSetEndPosition.
   **/
  public void setResultSetEndPosition(Integer resultSetEndPosition) {
    this.resultSetEndPosition = resultSetEndPosition;
  }


  /**
   * totalSetSize.
   *
   * @return PagingResponseProperties
   **/
  public PagingResponseProperties totalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * Get totalSetSize.
   * @return totalSetSize
   **/
  @Schema(description = "")
  public Integer getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
  }


  /**
   * next.
   *
   * @return PagingResponseProperties
   **/
  public PagingResponseProperties next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next.
   * @return next
   **/
  @Schema(description = "")
  public String getNext() {
    return next;
  }

  /**
   * setNext.
   **/
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * previous.
   *
   * @return PagingResponseProperties
   **/
  public PagingResponseProperties previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous.
   * @return previous
   **/
  @Schema(description = "")
  public String getPrevious() {
    return previous;
  }

  /**
   * setPrevious.
   **/
  public void setPrevious(String previous) {
    this.previous = previous;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, resultSetStartPosition, resultSetEndPosition, totalSetSize, next, previous);
  }


  /**
   * Converts the given object to string.
   */
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

