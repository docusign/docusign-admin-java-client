package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationAccountResponse.
 *
 */

public class OrganizationAccountResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("external_account_id")
  private Long externalAccountId = null;

  @JsonProperty("site_id")
  private Integer siteId = null;


  /**
   * id.
   *
   * @return OrganizationAccountResponse
   **/
  public OrganizationAccountResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  /**
   * name.
   *
   * @return OrganizationAccountResponse
   **/
  public OrganizationAccountResponse name(String name) {
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
   * externalAccountId.
   *
   * @return OrganizationAccountResponse
   **/
  public OrganizationAccountResponse externalAccountId(Long externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Get externalAccountId.
   * @return externalAccountId
   **/
  @Schema(description = "")
  public Long getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * setExternalAccountId.
   **/
  public void setExternalAccountId(Long externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  /**
   * siteId.
   *
   * @return OrganizationAccountResponse
   **/
  public OrganizationAccountResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
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
    OrganizationAccountResponse organizationAccountResponse = (OrganizationAccountResponse) o;
    return Objects.equals(this.id, organizationAccountResponse.id) &&
        Objects.equals(this.name, organizationAccountResponse.name) &&
        Objects.equals(this.externalAccountId, organizationAccountResponse.externalAccountId) &&
        Objects.equals(this.siteId, organizationAccountResponse.siteId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, externalAccountId, siteId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

