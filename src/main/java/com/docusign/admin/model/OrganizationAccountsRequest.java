package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationAccountRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OrganizationAccountsRequest.
 *
 */

public class OrganizationAccountsRequest {
  @JsonProperty("accounts")
  private java.util.List<OrganizationAccountRequest> accounts = null;


  /**
   * accounts.
   *
   * @return OrganizationAccountsRequest
   **/
  public OrganizationAccountsRequest accounts(java.util.List<OrganizationAccountRequest> accounts) {
    this.accounts = accounts;
    return this;
  }
  
  /**
   * addAccountsItem.
   *
   * @return OrganizationAccountsRequest
   **/
  public OrganizationAccountsRequest addAccountsItem(OrganizationAccountRequest accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts.
   * @return accounts
   **/
  @Schema(description = "")
  public java.util.List<OrganizationAccountRequest> getAccounts() {
    return accounts;
  }

  /**
   * setAccounts.
   **/
  public void setAccounts(java.util.List<OrganizationAccountRequest> accounts) {
    this.accounts = accounts;
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
    OrganizationAccountsRequest organizationAccountsRequest = (OrganizationAccountsRequest) o;
    return Objects.equals(this.accounts, organizationAccountsRequest.accounts);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountsRequest {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

