package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationExportAccount;
import com.docusign.admin.model.OrganizationExportDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationExportRequest
 */

public class OrganizationExportRequest {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("accounts")
  private java.util.List<OrganizationExportAccount> accounts = null;

  @JsonProperty("domains")
  private java.util.List<OrganizationExportDomain> domains = null;

  public OrganizationExportRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrganizationExportRequest accounts(java.util.List<OrganizationExportAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public OrganizationExportRequest addAccountsItem(OrganizationExportAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<OrganizationExportAccount>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationExportAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(java.util.List<OrganizationExportAccount> accounts) {
    this.accounts = accounts;
  }

  public OrganizationExportRequest domains(java.util.List<OrganizationExportDomain> domains) {
    this.domains = domains;
    return this;
  }

  public OrganizationExportRequest addDomainsItem(OrganizationExportDomain domainsItem) {
    if (this.domains == null) {
      this.domains = new java.util.ArrayList<OrganizationExportDomain>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationExportDomain> getDomains() {
    return domains;
  }

  public void setDomains(java.util.List<OrganizationExportDomain> domains) {
    this.domains = domains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationExportRequest organizationExportRequest = (OrganizationExportRequest) o;
    return Objects.equals(this.type, organizationExportRequest.type) &&
        Objects.equals(this.accounts, organizationExportRequest.accounts) &&
        Objects.equals(this.domains, organizationExportRequest.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accounts, domains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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

