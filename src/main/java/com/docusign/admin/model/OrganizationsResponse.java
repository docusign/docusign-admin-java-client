package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationsResponse.
 *
 */

public class OrganizationsResponse {
  @JsonProperty("organizations")
  private java.util.List<OrganizationResponse> organizations = null;


  /**
   * organizations.
   *
   * @return OrganizationsResponse
   **/
  public OrganizationsResponse organizations(java.util.List<OrganizationResponse> organizations) {
    this.organizations = organizations;
    return this;
  }
  
  /**
   * addOrganizationsItem.
   *
   * @return OrganizationsResponse
   **/
  public OrganizationsResponse addOrganizationsItem(OrganizationResponse organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new java.util.ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

  /**
   * Get organizations.
   * @return organizations
   **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationResponse> getOrganizations() {
    return organizations;
  }

  /**
   * setOrganizations.
   **/
  public void setOrganizations(java.util.List<OrganizationResponse> organizations) {
    this.organizations = organizations;
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
    OrganizationsResponse organizationsResponse = (OrganizationsResponse) o;
    return Objects.equals(this.organizations, organizationsResponse.organizations);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(organizations);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsResponse {\n");
    
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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

