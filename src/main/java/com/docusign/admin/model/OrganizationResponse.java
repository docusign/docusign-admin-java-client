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
import java.time.OffsetDateTime;

/**
 * OrganizationResponse.
 *
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
  private OffsetDateTime createdOn = null;

  @JsonProperty("created_by")
  private java.util.UUID createdBy = null;

  @JsonProperty("last_modified_on")
  private OffsetDateTime lastModifiedOn = null;

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


  /**
   * id.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  /**
   * name.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * description.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description.
   * @return description
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * defaultAccountId.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse defaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

  /**
   * Get defaultAccountId.
   * @return defaultAccountId
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getDefaultAccountId() {
    return defaultAccountId;
  }

  /**
   * setDefaultAccountId.
   **/
  public void setDefaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }


  /**
   * defaultPermissionProfileId.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse defaultPermissionProfileId(Long defaultPermissionProfileId) {
    this.defaultPermissionProfileId = defaultPermissionProfileId;
    return this;
  }

  /**
   * Get defaultPermissionProfileId.
   * @return defaultPermissionProfileId
   **/
  @ApiModelProperty(value = "")
  public Long getDefaultPermissionProfileId() {
    return defaultPermissionProfileId;
  }

  /**
   * setDefaultPermissionProfileId.
   **/
  public void setDefaultPermissionProfileId(Long defaultPermissionProfileId) {
    this.defaultPermissionProfileId = defaultPermissionProfileId;
  }


  /**
   * createdOn.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn.
   * @return createdOn
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  /**
   * setCreatedOn.
   **/
  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  /**
   * createdBy.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse createdBy(java.util.UUID createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy.
   * @return createdBy
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getCreatedBy() {
    return createdBy;
  }

  /**
   * setCreatedBy.
   **/
  public void setCreatedBy(java.util.UUID createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * lastModifiedOn.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse lastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn.
   * @return lastModifiedOn
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  /**
   * setLastModifiedOn.
   **/
  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }


  /**
   * lastModifiedBy.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse lastModifiedBy(java.util.UUID lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy.
   * @return lastModifiedBy
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getLastModifiedBy() {
    return lastModifiedBy;
  }

  /**
   * setLastModifiedBy.
   **/
  public void setLastModifiedBy(java.util.UUID lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  /**
   * accounts.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse accounts(java.util.List<OrganizationAccountResponse> accounts) {
    this.accounts = accounts;
    return this;
  }
  
  /**
   * addAccountsItem.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse addAccountsItem(OrganizationAccountResponse accountsItem) {
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
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationAccountResponse> getAccounts() {
    return accounts;
  }

  /**
   * setAccounts.
   **/
  public void setAccounts(java.util.List<OrganizationAccountResponse> accounts) {
    this.accounts = accounts;
  }


  /**
   * users.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse users(java.util.List<OrganizationSimpleIdObject> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse addUsersItem(OrganizationSimpleIdObject usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users.
   * @return users
   **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationSimpleIdObject> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<OrganizationSimpleIdObject> users) {
    this.users = users;
  }


  /**
   * reservedDomains.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse reservedDomains(java.util.List<DomainResponse> reservedDomains) {
    this.reservedDomains = reservedDomains;
    return this;
  }
  
  /**
   * addReservedDomainsItem.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse addReservedDomainsItem(DomainResponse reservedDomainsItem) {
    if (this.reservedDomains == null) {
      this.reservedDomains = new java.util.ArrayList<>();
    }
    this.reservedDomains.add(reservedDomainsItem);
    return this;
  }

  /**
   * Get reservedDomains.
   * @return reservedDomains
   **/
  @ApiModelProperty(value = "")
  public java.util.List<DomainResponse> getReservedDomains() {
    return reservedDomains;
  }

  /**
   * setReservedDomains.
   **/
  public void setReservedDomains(java.util.List<DomainResponse> reservedDomains) {
    this.reservedDomains = reservedDomains;
  }


  /**
   * identityProviders.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse identityProviders(java.util.List<IdentityProvidersResponse> identityProviders) {
    this.identityProviders = identityProviders;
    return this;
  }
  
  /**
   * addIdentityProvidersItem.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse addIdentityProvidersItem(IdentityProvidersResponse identityProvidersItem) {
    if (this.identityProviders == null) {
      this.identityProviders = new java.util.ArrayList<>();
    }
    this.identityProviders.add(identityProvidersItem);
    return this;
  }

  /**
   * Get identityProviders.
   * @return identityProviders
   **/
  @ApiModelProperty(value = "")
  public java.util.List<IdentityProvidersResponse> getIdentityProviders() {
    return identityProviders;
  }

  /**
   * setIdentityProviders.
   **/
  public void setIdentityProviders(java.util.List<IdentityProvidersResponse> identityProviders) {
    this.identityProviders = identityProviders;
  }


  /**
   * links.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse links(java.util.List<LinkResponse> links) {
    this.links = links;
    return this;
  }
  
  /**
   * addLinksItem.
   *
   * @return OrganizationResponse
   **/
  public OrganizationResponse addLinksItem(LinkResponse linksItem) {
    if (this.links == null) {
      this.links = new java.util.ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links.
   * @return links
   **/
  @ApiModelProperty(value = "")
  public java.util.List<LinkResponse> getLinks() {
    return links;
  }

  /**
   * setLinks.
   **/
  public void setLinks(java.util.List<LinkResponse> links) {
    this.links = links;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultAccountId, defaultPermissionProfileId, createdOn, createdBy, lastModifiedOn, lastModifiedBy, accounts, users, reservedDomains, identityProviders, links);
  }


  /**
   * Converts the given object to string.
   */
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

