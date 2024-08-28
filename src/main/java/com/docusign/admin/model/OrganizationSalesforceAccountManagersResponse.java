package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OSAMRContact;
import com.docusign.admin.model.OrganizationSalesforceAccountManagersResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationSalesforceAccountManagersResponse.
 *
 */

public class OrganizationSalesforceAccountManagersResponse implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * accountId.
   *
   * @return OrganizationSalesforceAccountManagersResponse
   **/
  public OrganizationSalesforceAccountManagersResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * accountName.
   *
   * @return OrganizationSalesforceAccountManagersResponse
   **/
  public OrganizationSalesforceAccountManagersResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName.
   * @return accountName
   **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  /**
   * setAccountName.
   **/
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  /**
   * accountType.
   *
   * @return OrganizationSalesforceAccountManagersResponse
   **/
  public OrganizationSalesforceAccountManagersResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType.
   * @return accountType
   **/
  @Schema(description = "")
  public String getAccountType() {
    return accountType;
  }

  /**
   * setAccountType.
   **/
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * accountOwner.
   *
   * @return OrganizationSalesforceAccountManagersResponse
   **/
  public OrganizationSalesforceAccountManagersResponse accountOwner(OSAMRContact accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

  /**
   * Get accountOwner.
   * @return accountOwner
   **/
  @Schema(description = "")
  public OSAMRContact getAccountOwner() {
    return accountOwner;
  }

  /**
   * setAccountOwner.
   **/
  public void setAccountOwner(OSAMRContact accountOwner) {
    this.accountOwner = accountOwner;
  }


  /**
   * accountManager.
   *
   * @return OrganizationSalesforceAccountManagersResponse
   **/
  public OrganizationSalesforceAccountManagersResponse accountManager(OSAMRContact accountManager) {
    this.accountManager = accountManager;
    return this;
  }

  /**
   * Get accountManager.
   * @return accountManager
   **/
  @Schema(description = "")
  public OSAMRContact getAccountManager() {
    return accountManager;
  }

  /**
   * setAccountManager.
   **/
  public void setAccountManager(OSAMRContact accountManager) {
    this.accountManager = accountManager;
  }


  /**
   * parentAccount.
   *
   * @return OrganizationSalesforceAccountManagersResponse
   **/
  public OrganizationSalesforceAccountManagersResponse parentAccount(OrganizationSalesforceAccountManagersResponse parentAccount) {
    this.parentAccount = parentAccount;
    return this;
  }

  /**
   * Get parentAccount.
   * @return parentAccount
   **/
  @Schema(description = "")
  public OrganizationSalesforceAccountManagersResponse getParentAccount() {
    return parentAccount;
  }

  /**
   * setParentAccount.
   **/
  public void setParentAccount(OrganizationSalesforceAccountManagersResponse parentAccount) {
    this.parentAccount = parentAccount;
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
    OrganizationSalesforceAccountManagersResponse organizationSalesforceAccountManagersResponse = (OrganizationSalesforceAccountManagersResponse) o;
    return Objects.equals(this.accountId, organizationSalesforceAccountManagersResponse.accountId) &&
        Objects.equals(this.accountName, organizationSalesforceAccountManagersResponse.accountName) &&
        Objects.equals(this.accountType, organizationSalesforceAccountManagersResponse.accountType) &&
        Objects.equals(this.accountOwner, organizationSalesforceAccountManagersResponse.accountOwner) &&
        Objects.equals(this.accountManager, organizationSalesforceAccountManagersResponse.accountManager) &&
        Objects.equals(this.parentAccount, organizationSalesforceAccountManagersResponse.parentAccount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountType, accountOwner, accountManager, parentAccount);
  }


  /**
   * Converts the given object to string.
   */
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

