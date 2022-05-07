package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrganizationImportResponseRequestor. */
public class OrganizationImportResponseRequestor {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * name.
   *
   * @return OrganizationImportResponseRequestor
   */
  public OrganizationImportResponseRequestor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * id.
   *
   * @return OrganizationImportResponseRequestor
   */
  public OrganizationImportResponseRequestor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /** setId. */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * type.
   *
   * @return OrganizationImportResponseRequestor
   */
  public OrganizationImportResponseRequestor type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  /** setType. */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * email.
   *
   * @return OrganizationImportResponseRequestor
   */
  public OrganizationImportResponseRequestor email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   *
   * @return email
   */
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  /** setEmail. */
  public void setEmail(String email) {
    this.email = email;
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
    OrganizationImportResponseRequestor organizationImportResponseRequestor =
        (OrganizationImportResponseRequestor) o;
    return Objects.equals(this.name, organizationImportResponseRequestor.name)
        && Objects.equals(this.id, organizationImportResponseRequestor.id)
        && Objects.equals(this.type, organizationImportResponseRequestor.type)
        && Objects.equals(this.email, organizationImportResponseRequestor.email);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(name, id, type, email);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationImportResponseRequestor {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
