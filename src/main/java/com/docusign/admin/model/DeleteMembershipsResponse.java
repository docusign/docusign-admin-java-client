package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DeleteMembershipsResponse. */
public class DeleteMembershipsResponse {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("accounts")
  private java.util.List<DeleteMembershipResponse> accounts = null;

  /**
   * success.
   *
   * @return DeleteMembershipsResponse
   */
  public DeleteMembershipsResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success.
   *
   * @return success
   */
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  /** setSuccess. */
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * accounts.
   *
   * @return DeleteMembershipsResponse
   */
  public DeleteMembershipsResponse accounts(java.util.List<DeleteMembershipResponse> accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * addAccountsItem.
   *
   * @return DeleteMembershipsResponse
   */
  public DeleteMembershipsResponse addAccountsItem(DeleteMembershipResponse accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts.
   *
   * @return accounts
   */
  @ApiModelProperty(value = "")
  public java.util.List<DeleteMembershipResponse> getAccounts() {
    return accounts;
  }

  /** setAccounts. */
  public void setAccounts(java.util.List<DeleteMembershipResponse> accounts) {
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
    DeleteMembershipsResponse deleteMembershipsResponse = (DeleteMembershipsResponse) o;
    return Objects.equals(this.success, deleteMembershipsResponse.success)
        && Objects.equals(this.accounts, deleteMembershipsResponse.accounts);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(success, accounts);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMembershipsResponse {\n");

    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
