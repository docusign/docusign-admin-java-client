package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DeleteMembershipsRequest. */
public class DeleteMembershipsRequest {
  @JsonProperty("accounts")
  private java.util.List<DeleteMembershipRequest> accounts = new java.util.ArrayList<>();

  /**
   * accounts.
   *
   * @return DeleteMembershipsRequest
   */
  public DeleteMembershipsRequest accounts(java.util.List<DeleteMembershipRequest> accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * addAccountsItem.
   *
   * @return DeleteMembershipsRequest
   */
  public DeleteMembershipsRequest addAccountsItem(DeleteMembershipRequest accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts.
   *
   * @return accounts
   */
  @ApiModelProperty(required = true, value = "")
  public java.util.List<DeleteMembershipRequest> getAccounts() {
    return accounts;
  }

  /** setAccounts. */
  public void setAccounts(java.util.List<DeleteMembershipRequest> accounts) {
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
    DeleteMembershipsRequest deleteMembershipsRequest = (DeleteMembershipsRequest) o;
    return Objects.equals(this.accounts, deleteMembershipsRequest.accounts);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMembershipsRequest {\n");

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
