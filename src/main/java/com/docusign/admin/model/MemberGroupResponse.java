package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * MemberGroupResponse.
 *
 */

public class MemberGroupResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;


  /**
   * id.
   *
   * @return MemberGroupResponse
   **/
  public MemberGroupResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * name.
   *
   * @return MemberGroupResponse
   **/
  public MemberGroupResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * type.
   *
   * @return MemberGroupResponse
   **/
  public MemberGroupResponse type(String type) {
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
    MemberGroupResponse memberGroupResponse = (MemberGroupResponse) o;
    return Objects.equals(this.id, memberGroupResponse.id) &&
        Objects.equals(this.name, memberGroupResponse.name) &&
        Objects.equals(this.type, memberGroupResponse.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberGroupResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

