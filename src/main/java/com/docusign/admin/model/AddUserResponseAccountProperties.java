package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupResponse;
import com.docusign.admin.model.ProductPermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AddUserResponseAccountProperties.
 *
 */

public class AddUserResponseAccountProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileResponse> productPermissionProfiles = null;

  @JsonProperty("ds_groups")
  private java.util.List<DSGroupResponse> dsGroups = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("job_title")
  private String jobTitle = null;

  @JsonProperty("license_type")
  private String licenseType = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("plan_name")
  private String planName = null;

  @JsonProperty("license_status")
  private String licenseStatus = null;


  /**
   * id.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
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
   * siteId.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  /**
   * Get productPermissionProfiles.
   * @return productPermissionProfiles
   **/
  @Schema(description = "")
  public java.util.List<ProductPermissionProfileResponse> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }

  /**
   * Get dsGroups.
   * @return dsGroups
   **/
  @Schema(description = "")
  public java.util.List<DSGroupResponse> getDsGroups() {
    return dsGroups;
  }


  /**
   * companyName.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName.
   * @return companyName
   **/
  @Schema(description = "")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * setCompanyName.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  /**
   * jobTitle.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle.
   * @return jobTitle
   **/
  @Schema(description = "")
  public String getJobTitle() {
    return jobTitle;
  }

  /**
   * setJobTitle.
   **/
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  /**
   * licenseType.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * Get licenseType.
   * @return licenseType
   **/
  @Schema(description = "")
  public String getLicenseType() {
    return licenseType;
  }

  /**
   * setLicenseType.
   **/
  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }


  /**
   * subscriptionId.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId.
   * @return subscriptionId
   **/
  @Schema(description = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * setSubscriptionId.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  /**
   * planName.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Get planName.
   * @return planName
   **/
  @Schema(description = "")
  public String getPlanName() {
    return planName;
  }

  /**
   * setPlanName.
   **/
  public void setPlanName(String planName) {
    this.planName = planName;
  }


  /**
   * licenseStatus.
   *
   * @return AddUserResponseAccountProperties
   **/
  public AddUserResponseAccountProperties licenseStatus(String licenseStatus) {
    this.licenseStatus = licenseStatus;
    return this;
  }

  /**
   * Get licenseStatus.
   * @return licenseStatus
   **/
  @Schema(description = "")
  public String getLicenseStatus() {
    return licenseStatus;
  }

  /**
   * setLicenseStatus.
   **/
  public void setLicenseStatus(String licenseStatus) {
    this.licenseStatus = licenseStatus;
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
    AddUserResponseAccountProperties addUserResponseAccountProperties = (AddUserResponseAccountProperties) o;
    return Objects.equals(this.id, addUserResponseAccountProperties.id) &&
        Objects.equals(this.siteId, addUserResponseAccountProperties.siteId) &&
        Objects.equals(this.productPermissionProfiles, addUserResponseAccountProperties.productPermissionProfiles) &&
        Objects.equals(this.dsGroups, addUserResponseAccountProperties.dsGroups) &&
        Objects.equals(this.companyName, addUserResponseAccountProperties.companyName) &&
        Objects.equals(this.jobTitle, addUserResponseAccountProperties.jobTitle) &&
        Objects.equals(this.licenseType, addUserResponseAccountProperties.licenseType) &&
        Objects.equals(this.subscriptionId, addUserResponseAccountProperties.subscriptionId) &&
        Objects.equals(this.planName, addUserResponseAccountProperties.planName) &&
        Objects.equals(this.licenseStatus, addUserResponseAccountProperties.licenseStatus);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, productPermissionProfiles, dsGroups, companyName, jobTitle, licenseType, subscriptionId, planName, licenseStatus);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserResponseAccountProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    productPermissionProfiles: ").append(toIndentedString(productPermissionProfiles)).append("\n");
    sb.append("    dsGroups: ").append(toIndentedString(dsGroups)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    licenseStatus: ").append(toIndentedString(licenseStatus)).append("\n");
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

