package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DomainResponse;
import com.docusign.admin.model.IdentityProvidersResponse;
import com.docusign.admin.model.LinkResponse;
import com.docusign.admin.model.OrganizationAccountResponse;
import com.docusign.admin.model.OrganizationSimpleIdObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * OrganizationResponse
 */

public class OrganizationResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("default_account_id")
  private java.util.UUID defaultAccountId = null;

  @JsonProperty("default_permission_profile_id")
  private Long defaultPermissionProfileId = null;

  @JsonProperty("created_on")
  private DateTime createdOn = null;

  @JsonProperty("created_by")
  private java.util.UUID createdBy = null;

  @JsonProperty("last_modified_on")
  private DateTime lastModifiedOn = null;

  @JsonProperty("last_modified_by")
  private java.util.UUID lastModifiedBy = null;

  @JsonProperty("accounts")
  private java.util.List<OrganizationAccountResponse> accounts = null;

  @JsonProperty("users")
  private java.util.List<OrganizationSimpleIdObject> users = null;

  @JsonProperty("reserved_domains")
  private java.util.List<DomainResponse> reservedDomains = null;

  @JsonProperty("identity_providers")
  private java.util.List<IdentityProvidersResponse> identityProviders = null;

  @JsonProperty("links")
  private java.util.List<LinkResponse> links = null;

  public OrganizationResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public OrganizationResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrganizationResponse defaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

   /**
   * Get defaultAccountId
   * @return defaultAccountId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getDefaultAccountId() {
    return defaultAccountId;
  }

  public void setDefaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }

  public OrganizationResponse defaultPermissionProfileId(Long defaultPermissionProfileId) {
    this.defaultPermissionProfileId = defaultPermissionProfileId;
    return this;
  }

   /**
   * Get defaultPermissionProfileId
   * @return defaultPermissionProfileId
  **/
  @ApiModelProperty(value = "")
  public Long getDefaultPermissionProfileId() {
    return defaultPermissionProfileId;
  }

  public void setDefaultPermissionProfileId(Long defaultPermissionProfileId) {
    this.defaultPermissionProfileId = defaultPermissionProfileId;
  }

  public OrganizationResponse createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public OrganizationResponse createdBy(java.util.UUID createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(java.util.UUID createdBy) {
    this.createdBy = createdBy;
  }

  public OrganizationResponse lastModifiedOn(DateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

   /**
   * Get lastModifiedOn
   * @return lastModifiedOn
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(DateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public OrganizationResponse lastModifiedBy(java.util.UUID lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(java.util.UUID lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public OrganizationResponse accounts(java.util.List<OrganizationAccountResponse> accounts) {
    this.accounts = accounts;
    return this;
  }

  public OrganizationResponse addAccountsItem(OrganizationAccountResponse accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<OrganizationAccountResponse>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationAccountResponse> getAccounts() {
    return accounts;
  }

  public void setAccounts(java.util.List<OrganizationAccountResponse> accounts) {
    this.accounts = accounts;
  }

  public OrganizationResponse users(java.util.List<OrganizationSimpleIdObject> users) {
    this.users = users;
    return this;
  }

  public OrganizationResponse addUsersItem(OrganizationSimpleIdObject usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<OrganizationSimpleIdObject>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationSimpleIdObject> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<OrganizationSimpleIdObject> users) {
    this.users = users;
  }

  public OrganizationResponse reservedDomains(java.util.List<DomainResponse> reservedDomains) {
    this.reservedDomains = reservedDomains;
    return this;
  }

  public OrganizationResponse addReservedDomainsItem(DomainResponse reservedDomainsItem) {
    if (this.reservedDomains == null) {
      this.reservedDomains = new java.util.ArrayList<DomainResponse>();
    }
    this.reservedDomains.add(reservedDomainsItem);
    return this;
  }

   /**
   * Get reservedDomains
   * @return reservedDomains
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DomainResponse> getReservedDomains() {
    return reservedDomains;
  }

  public void setReservedDomains(java.util.List<DomainResponse> reservedDomains) {
    this.reservedDomains = reservedDomains;
  }

  public OrganizationResponse identityProviders(java.util.List<IdentityProvidersResponse> identityProviders) {
    this.identityProviders = identityProviders;
    return this;
  }

  public OrganizationResponse addIdentityProvidersItem(IdentityProvidersResponse identityProvidersItem) {
    if (this.identityProviders == null) {
      this.identityProviders = new java.util.ArrayList<IdentityProvidersResponse>();
    }
    this.identityProviders.add(identityProvidersItem);
    return this;
  }

   /**
   * Get identityProviders
   * @return identityProviders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<IdentityProvidersResponse> getIdentityProviders() {
    return identityProviders;
  }

  public void setIdentityProviders(java.util.List<IdentityProvidersResponse> identityProviders) {
    this.identityProviders = identityProviders;
  }

  public OrganizationResponse links(java.util.List<LinkResponse> links) {
    this.links = links;
    return this;
  }

  public OrganizationResponse addLinksItem(LinkResponse linksItem) {
    if (this.links == null) {
      this.links = new java.util.ArrayList<LinkResponse>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public java.util.List<LinkResponse> getLinks() {
    return links;
  }

  public void setLinks(java.util.List<LinkResponse> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationResponse organizationResponse = (OrganizationResponse) o;
    return Objects.equals(this.id, organizationResponse.id) &&
        Objects.equals(this.name, organizationResponse.name) &&
        Objects.equals(this.description, organizationResponse.description) &&
        Objects.equals(this.defaultAccountId, organizationResponse.defaultAccountId) &&
        Objects.equals(this.defaultPermissionProfileId, organizationResponse.defaultPermissionProfileId) &&
        Objects.equals(this.createdOn, organizationResponse.createdOn) &&
        Objects.equals(this.createdBy, organizationResponse.createdBy) &&
        Objects.equals(this.lastModifiedOn, organizationResponse.lastModifiedOn) &&
        Objects.equals(this.lastModifiedBy, organizationResponse.lastModifiedBy) &&
        Objects.equals(this.accounts, organizationResponse.accounts) &&
        Objects.equals(this.users, organizationResponse.users) &&
        Objects.equals(this.reservedDomains, organizationResponse.reservedDomains) &&
        Objects.equals(this.identityProviders, organizationResponse.identityProviders) &&
        Objects.equals(this.links, organizationResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultAccountId, defaultPermissionProfileId, createdOn, createdBy, lastModifiedOn, lastModifiedBy, accounts, users, reservedDomains, identityProviders, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    defaultPermissionProfileId: ").append(toIndentedString(defaultPermissionProfileId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    reservedDomains: ").append(toIndentedString(reservedDomains)).append("\n");
    sb.append("    identityProviders: ").append(toIndentedString(identityProviders)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

