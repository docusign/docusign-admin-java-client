package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrganizationAccountSettingsImportRequestorResponse. */
public class OrganizationAccountSettingsImportRequestorResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * id.
   *
   * @return OrganizationAccountSettingsImportRequestorResponse
   */
  public OrganizationAccountSettingsImportRequestorResponse id(String id) {
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
   * @return OrganizationAccountSettingsImportRequestorResponse
   */
  public OrganizationAccountSettingsImportRequestorResponse type(String type) {
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
   * name.
   *
   * @return OrganizationAccountSettingsImportRequestorResponse
   */
  public OrganizationAccountSettingsImportRequestorResponse name(String name) {
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
   * email.
   *
   * @return OrganizationAccountSettingsImportRequestorResponse
   */
  public OrganizationAccountSettingsImportRequestorResponse email(String email) {
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
    OrganizationAccountSettingsImportRequestorResponse
        organizationAccountSettingsImportRequestorResponse =
            (OrganizationAccountSettingsImportRequestorResponse) o;
    return Objects.equals(this.id, organizationAccountSettingsImportRequestorResponse.id)
        && Objects.equals(this.type, organizationAccountSettingsImportRequestorResponse.type)
        && Objects.equals(this.name, organizationAccountSettingsImportRequestorResponse.name)
        && Objects.equals(this.email, organizationAccountSettingsImportRequestorResponse.email);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, email);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountSettingsImportRequestorResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
