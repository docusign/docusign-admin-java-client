package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrgExportSelectedDomain.
 *
 */

public class OrgExportSelectedDomain implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("domain")
  private String domain = null;


  /**
   * domain.
   *
   * @return OrgExportSelectedDomain
   **/
  public OrgExportSelectedDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain.
   * @return domain
   **/
  @Schema(description = "")
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
    OrgExportSelectedDomain orgExportSelectedDomain = (OrgExportSelectedDomain) o;
    return Objects.equals(this.domain, orgExportSelectedDomain.domain);
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
    sb.append("class OrgExportSelectedDomain {\n");
    
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

