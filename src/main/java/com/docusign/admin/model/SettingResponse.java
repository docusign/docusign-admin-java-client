package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SettingResponse.
 *
 */

public class SettingResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("type")
  private String type = null;


  /**
   * key.
   *
   * @return SettingResponse
   **/
  public SettingResponse key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key.
   * @return key
   **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  /**
   * setKey.
   **/
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * value.
   *
   * @return SettingResponse
   **/
  public SettingResponse value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value.
   * @return value
   **/
  @Schema(description = "")
  public Object getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * type.
   *
   * @return SettingResponse
   **/
  public SettingResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
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
    SettingResponse settingResponse = (SettingResponse) o;
    return Objects.equals(this.key, settingResponse.key) &&
        Objects.equals(this.value, settingResponse.value) &&
        Objects.equals(this.type, settingResponse.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(key, value, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingResponse {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

