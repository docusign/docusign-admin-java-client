package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupRequest;
import com.docusign.admin.model.ProductPermissionProfileRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewMultiProductUserAddRequest
 */

public class NewMultiProductUserAddRequest {
  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileRequest> productPermissionProfiles = new java.util.ArrayList<ProductPermissionProfileRequest>();

  @JsonProperty("ds_groups")
  private java.util.List<DSGroupRequest> dsGroups = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("default_account_id")
  private java.util.UUID defaultAccountId = null;

  @JsonProperty("language_culture")
  private String languageCulture = null;

  @JsonProperty("access_code")
  private String accessCode = null;

  @JsonProperty("federated_status")
  private String federatedStatus = null;

  @JsonProperty("auto_activate_memberships")
  private Boolean autoActivateMemberships = null;

  public NewMultiProductUserAddRequest productPermissionProfiles(java.util.List<ProductPermissionProfileRequest> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
    return this;
  }

  public NewMultiProductUserAddRequest addProductPermissionProfilesItem(ProductPermissionProfileRequest productPermissionProfilesItem) {
    this.productPermissionProfiles.add(productPermissionProfilesItem);
    return this;
  }

   /**
   * Get productPermissionProfiles
   * @return productPermissionProfiles
  **/
  @ApiModelProperty(required = true, value = "")
  public java.util.List<ProductPermissionProfileRequest> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }

  public void setProductPermissionProfiles(java.util.List<ProductPermissionProfileRequest> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
  }

  public NewMultiProductUserAddRequest dsGroups(java.util.List<DSGroupRequest> dsGroups) {
    this.dsGroups = dsGroups;
    return this;
  }

  public NewMultiProductUserAddRequest addDsGroupsItem(DSGroupRequest dsGroupsItem) {
    if (this.dsGroups == null) {
      this.dsGroups = new java.util.ArrayList<DSGroupRequest>();
    }
    this.dsGroups.add(dsGroupsItem);
    return this;
  }

   /**
   * Get dsGroups
   * @return dsGroups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DSGroupRequest> getDsGroups() {
    return dsGroups;
  }

  public void setDsGroups(java.util.List<DSGroupRequest> dsGroups) {
    this.dsGroups = dsGroups;
  }

  public NewMultiProductUserAddRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public NewMultiProductUserAddRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public NewMultiProductUserAddRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public NewMultiProductUserAddRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewMultiProductUserAddRequest defaultAccountId(java.util.UUID defaultAccountId) {
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

  public NewMultiProductUserAddRequest languageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
    return this;
  }

   /**
   * Get languageCulture
   * @return languageCulture
  **/
  @ApiModelProperty(value = "")
  public String getLanguageCulture() {
    return languageCulture;
  }

  public void setLanguageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
  }

  public NewMultiProductUserAddRequest accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * Get accessCode
   * @return accessCode
  **/
  @ApiModelProperty(value = "")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public NewMultiProductUserAddRequest federatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
    return this;
  }

   /**
   * Get federatedStatus
   * @return federatedStatus
  **/
  @ApiModelProperty(value = "")
  public String getFederatedStatus() {
    return federatedStatus;
  }

  public void setFederatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
  }

  public NewMultiProductUserAddRequest autoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
    return this;
  }

   /**
   * Get autoActivateMemberships
   * @return autoActivateMemberships
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoActivateMemberships() {
    return autoActivateMemberships;
  }

  public void setAutoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewMultiProductUserAddRequest newMultiProductUserAddRequest = (NewMultiProductUserAddRequest) o;
    return Objects.equals(this.productPermissionProfiles, newMultiProductUserAddRequest.productPermissionProfiles) &&
        Objects.equals(this.dsGroups, newMultiProductUserAddRequest.dsGroups) &&
        Objects.equals(this.userName, newMultiProductUserAddRequest.userName) &&
        Objects.equals(this.firstName, newMultiProductUserAddRequest.firstName) &&
        Objects.equals(this.lastName, newMultiProductUserAddRequest.lastName) &&
        Objects.equals(this.email, newMultiProductUserAddRequest.email) &&
        Objects.equals(this.defaultAccountId, newMultiProductUserAddRequest.defaultAccountId) &&
        Objects.equals(this.languageCulture, newMultiProductUserAddRequest.languageCulture) &&
        Objects.equals(this.accessCode, newMultiProductUserAddRequest.accessCode) &&
        Objects.equals(this.federatedStatus, newMultiProductUserAddRequest.federatedStatus) &&
        Objects.equals(this.autoActivateMemberships, newMultiProductUserAddRequest.autoActivateMemberships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productPermissionProfiles, dsGroups, userName, firstName, lastName, email, defaultAccountId, languageCulture, accessCode, federatedStatus, autoActivateMemberships);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewMultiProductUserAddRequest {\n");
    
    sb.append("    productPermissionProfiles: ").append(toIndentedString(productPermissionProfiles)).append("\n");
    sb.append("    dsGroups: ").append(toIndentedString(dsGroups)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    languageCulture: ").append(toIndentedString(languageCulture)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    federatedStatus: ").append(toIndentedString(federatedStatus)).append("\n");
    sb.append("    autoActivateMemberships: ").append(toIndentedString(autoActivateMemberships)).append("\n");
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

