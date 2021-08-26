package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationAccountResponse
 */

public class OrganizationAccountResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("external_account_id")
  private Long externalAccountId = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  public OrganizationAccountResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public OrganizationAccountResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationAccountResponse externalAccountId(Long externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

   /**
   * Get externalAccountId
   * @return externalAccountId
  **/
  @ApiModelProperty(value = "")
  public Long getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(Long externalAccountId) {
    this.externalAccountId = externalAccountId;
  }

  public OrganizationAccountResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(id, name, externalAccountId, siteId);
  }


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

