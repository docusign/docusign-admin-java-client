package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupRequest;
import com.docusign.admin.model.ProductPermissionProfileRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * NewMultiProductUserAddRequest.
 *
 */

public class NewMultiProductUserAddRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileRequest> productPermissionProfiles = new java.util.ArrayList<>();

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


  /**
   * productPermissionProfiles.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest productPermissionProfiles(java.util.List<ProductPermissionProfileRequest> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
    return this;
  }
  
  /**
   * addProductPermissionProfilesItem.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest addProductPermissionProfilesItem(ProductPermissionProfileRequest productPermissionProfilesItem) {
    this.productPermissionProfiles.add(productPermissionProfilesItem);
    return this;
  }

  /**
   * Get productPermissionProfiles.
   * @return productPermissionProfiles
   **/
  @Schema(required = true, description = "")
  public java.util.List<ProductPermissionProfileRequest> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }

  /**
   * setProductPermissionProfiles.
   **/
  public void setProductPermissionProfiles(java.util.List<ProductPermissionProfileRequest> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
  }


  /**
   * dsGroups.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest dsGroups(java.util.List<DSGroupRequest> dsGroups) {
    this.dsGroups = dsGroups;
    return this;
  }
  
  /**
   * addDsGroupsItem.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest addDsGroupsItem(DSGroupRequest dsGroupsItem) {
    if (this.dsGroups == null) {
      this.dsGroups = new java.util.ArrayList<>();
    }
    this.dsGroups.add(dsGroupsItem);
    return this;
  }

  /**
   * Get dsGroups.
   * @return dsGroups
   **/
  @Schema(description = "")
  public java.util.List<DSGroupRequest> getDsGroups() {
    return dsGroups;
  }

  /**
   * setDsGroups.
   **/
  public void setDsGroups(java.util.List<DSGroupRequest> dsGroups) {
    this.dsGroups = dsGroups;
  }


  /**
   * userName.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName.
   * @return userName
   **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * firstName.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * email.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * defaultAccountId.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest defaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

  /**
   * Get defaultAccountId.
   * @return defaultAccountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
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
   * languageCulture.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest languageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
    return this;
  }

  /**
   * Get languageCulture.
   * @return languageCulture
   **/
  @Schema(description = "")
  public String getLanguageCulture() {
    return languageCulture;
  }

  /**
   * setLanguageCulture.
   **/
  public void setLanguageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
  }


  /**
   * accessCode.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Get accessCode.
   * @return accessCode
   **/
  @Schema(description = "")
  public String getAccessCode() {
    return accessCode;
  }

  /**
   * setAccessCode.
   **/
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  /**
   * federatedStatus.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest federatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
    return this;
  }

  /**
   * Get federatedStatus.
   * @return federatedStatus
   **/
  @Schema(description = "")
  public String getFederatedStatus() {
    return federatedStatus;
  }

  /**
   * setFederatedStatus.
   **/
  public void setFederatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
  }


  /**
   * autoActivateMemberships.
   *
   * @return NewMultiProductUserAddRequest
   **/
  public NewMultiProductUserAddRequest autoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
    return this;
  }

  /**
   * Get autoActivateMemberships.
   * @return autoActivateMemberships
   **/
  @Schema(description = "")
  public Boolean isAutoActivateMemberships() {
    return autoActivateMemberships;
  }

  /**
   * setAutoActivateMemberships.
   **/
  public void setAutoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(productPermissionProfiles, dsGroups, userName, firstName, lastName, email, defaultAccountId, languageCulture, accessCode, federatedStatus, autoActivateMemberships);
  }


  /**
   * Converts the given object to string.
   */
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

