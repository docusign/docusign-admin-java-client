package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OSAMRContact;
import com.docusign.admin.model.OrganizationSalesforceAccountManagersResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationSalesforceAccountManagersResponse
 */

public class OrganizationSalesforceAccountManagersResponse {
  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("account_type")
  private String accountType = null;

  @JsonProperty("account_owner")
  private OSAMRContact accountOwner = null;

  @JsonProperty("account_manager")
  private OSAMRContact accountManager = null;

  @JsonProperty("parent_account")
  private OrganizationSalesforceAccountManagersResponse parentAccount = null;

  public OrganizationSalesforceAccountManagersResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OrganizationSalesforceAccountManagersResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public OrganizationSalesforceAccountManagersResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public OrganizationSalesforceAccountManagersResponse accountOwner(OSAMRContact accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * Get accountOwner
   * @return accountOwner
  **/
  @ApiModelProperty(value = "")
  public OSAMRContact getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(OSAMRContact accountOwner) {
    this.accountOwner = accountOwner;
  }

  public OrganizationSalesforceAccountManagersResponse accountManager(OSAMRContact accountManager) {
    this.accountManager = accountManager;
    return this;
  }

   /**
   * Get accountManager
   * @return accountManager
  **/
  @ApiModelProperty(value = "")
  public OSAMRContact getAccountManager() {
    return accountManager;
  }

  public void setAccountManager(OSAMRContact accountManager) {
    this.accountManager = accountManager;
  }

  public OrganizationSalesforceAccountManagersResponse parentAccount(OrganizationSalesforceAccountManagersResponse parentAccount) {
    this.parentAccount = parentAccount;
    return this;
  }

   /**
   * Get parentAccount
   * @return parentAccount
  **/
  @ApiModelProperty(value = "")
  public OrganizationSalesforceAccountManagersResponse getParentAccount() {
    return parentAccount;
  }

  public void setParentAccount(OrganizationSalesforceAccountManagersResponse parentAccount) {
    this.parentAccount = parentAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSalesforceAccountManagersResponse organizationSalesforceAccountManagersResponse = (OrganizationSalesforceAccountManagersResponse) o;
    return Objects.equals(this.accountId, organizationSalesforceAccountManagersResponse.accountId) &&
        Objects.equals(this.accountName, organizationSalesforceAccountManagersResponse.accountName) &&
        Objects.equals(this.accountType, organizationSalesforceAccountManagersResponse.accountType) &&
        Objects.equals(this.accountOwner, organizationSalesforceAccountManagersResponse.accountOwner) &&
        Objects.equals(this.accountManager, organizationSalesforceAccountManagersResponse.accountManager) &&
        Objects.equals(this.parentAccount, organizationSalesforceAccountManagersResponse.parentAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountType, accountOwner, accountManager, parentAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSalesforceAccountManagersResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    accountManager: ").append(toIndentedString(accountManager)).append("\n");
    sb.append("    parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
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

