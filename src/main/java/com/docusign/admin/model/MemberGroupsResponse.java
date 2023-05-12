package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MemberGroupResponse;
import com.docusign.admin.model.PagingResponseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * MemberGroupsResponse.
 *
 */

public class MemberGroupsResponse {
  @JsonProperty("groups")
  private java.util.List<MemberGroupResponse> groups = null;

  @JsonProperty("paging")
  private PagingResponseProperties paging = null;


  /**
   * groups.
   *
   * @return MemberGroupsResponse
   **/
  public MemberGroupsResponse groups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
    return this;
  }
  
  /**
   * addGroupsItem.
   *
   * @return MemberGroupsResponse
   **/
  public MemberGroupsResponse addGroupsItem(MemberGroupResponse groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups.
   * @return groups
   **/
  @Schema(description = "")
  public java.util.List<MemberGroupResponse> getGroups() {
    return groups;
  }

  /**
   * setGroups.
   **/
  public void setGroups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
  }


  /**
   * paging.
   *
   * @return MemberGroupsResponse
   **/
  public MemberGroupsResponse paging(PagingResponseProperties paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging.
   * @return paging
   **/
  @Schema(description = "")
  public PagingResponseProperties getPaging() {
    return paging;
  }

  /**
   * setPaging.
   **/
  public void setPaging(PagingResponseProperties paging) {
    this.paging = paging;
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
    MemberGroupsResponse memberGroupsResponse = (MemberGroupsResponse) o;
    return Objects.equals(this.groups, memberGroupsResponse.groups) &&
        Objects.equals(this.paging, memberGroupsResponse.paging);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(groups, paging);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberGroupsResponse {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

