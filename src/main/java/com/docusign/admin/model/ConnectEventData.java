package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectEventData.
 *
 */

public class ConnectEventData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("includeData")
  private java.util.List<String> includeData = null;


  /**
   * version.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version.
   * @return version
   **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  /**
   * setVersion.
   **/
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * includeData.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData includeData(java.util.List<String> includeData) {
    this.includeData = includeData;
    return this;
  }
  
  /**
   * addIncludeDataItem.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData addIncludeDataItem(String includeDataItem) {
    if (this.includeData == null) {
      this.includeData = new java.util.ArrayList<>();
    }
    this.includeData.add(includeDataItem);
    return this;
  }

  /**
   * Get includeData.
   * @return includeData
   **/
  @Schema(description = "")
  public java.util.List<String> getIncludeData() {
    return includeData;
  }

  /**
   * setIncludeData.
   **/
  public void setIncludeData(java.util.List<String> includeData) {
    this.includeData = includeData;
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
    ConnectEventData connectEventData = (ConnectEventData) o;
    return Objects.equals(this.version, connectEventData.version) &&
        Objects.equals(this.includeData, connectEventData.includeData);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(version, includeData);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectEventData {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    includeData: ").append(toIndentedString(includeData)).append("\n");
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

