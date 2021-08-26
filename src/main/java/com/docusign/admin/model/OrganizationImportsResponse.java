package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationImportResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationImportsResponse
 */

public class OrganizationImportsResponse {
  @JsonProperty("imports")
  private java.util.List<OrganizationImportResponse> imports = null;

  public OrganizationImportsResponse imports(java.util.List<OrganizationImportResponse> imports) {
    this.imports = imports;
    return this;
  }

  public OrganizationImportsResponse addImportsItem(OrganizationImportResponse importsItem) {
    if (this.imports == null) {
      this.imports = new java.util.ArrayList<OrganizationImportResponse>();
    }
    this.imports.add(importsItem);
    return this;
  }

   /**
   * Get imports
   * @return imports
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationImportResponse> getImports() {
    return imports;
  }

  public void setImports(java.util.List<OrganizationImportResponse> imports) {
    this.imports = imports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationImportsResponse organizationImportsResponse = (OrganizationImportsResponse) o;
    return Objects.equals(this.imports, organizationImportsResponse.imports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationImportsResponse {\n");
    
    sb.append("    imports: ").append(toIndentedString(imports)).append("\n");
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

