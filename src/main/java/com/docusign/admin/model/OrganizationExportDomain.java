package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationExportDomain.
 *
 */

public class OrganizationExportDomain {
  @JsonProperty("domain")
  private String domain = null;


  /**
   * domain.
   *
   * @return OrganizationExportDomain
   **/
  public OrganizationExportDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain.
   * @return domain
   **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  /**
   * setDomain.
   **/
  public void setDomain(String domain) {
    this.domain = domain;
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
    OrganizationExportDomain organizationExportDomain = (OrganizationExportDomain) o;
    return Objects.equals(this.domain, organizationExportDomain.domain);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(domain);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportDomain {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

