package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DeleteMembershipRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeleteMembershipsRequest
 */

public class DeleteMembershipsRequest {
  @JsonProperty("accounts")
  private java.util.List<DeleteMembershipRequest> accounts = new java.util.ArrayList<DeleteMembershipRequest>();

  public DeleteMembershipsRequest accounts(java.util.List<DeleteMembershipRequest> accounts) {
    this.accounts = accounts;
    return this;
  }

  public DeleteMembershipsRequest addAccountsItem(DeleteMembershipRequest accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "")
  public java.util.List<DeleteMembershipRequest> getAccounts() {
    return accounts;
  }

  public void setAccounts(java.util.List<DeleteMembershipRequest> accounts) {
    this.accounts = accounts;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMembershipsRequest {\n");
    
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

