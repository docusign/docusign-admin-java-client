package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AssetGroupAccountResponse.
 *
 */

public class AssetGroupAccountResponse {
  @JsonProperty("assetGroupId")
  private java.util.UUID assetGroupId = null;

  @JsonProperty("assetGroupName")
  private String assetGroupName = null;

  @JsonProperty("accountId")
  private java.util.UUID accountId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("externalAccountId")
  private Long externalAccountId = null;

  @JsonProperty("compliant")
  private Boolean compliant = null;

  @JsonProperty("siteId")
  private Integer siteId = null;

  @JsonProperty("siteName")
  private String siteName = null;

  /**
   * The asset group id that the asset group account belongs to..
   * @return assetGroupId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The asset group id that the asset group account belongs to.")
  public java.util.UUID getAssetGroupId() {
    return assetGroupId;
  }

  /**
   * The name of asset group that the asset group account belongs to..
   * @return assetGroupName
   **/
  @Schema(description = "The name of asset group that the asset group account belongs to.")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  /**
   * The account id of the asset group account..
   * @return accountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The account id of the asset group account.")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  /**
   * The account name of the asset group account..
   * @return accountName
   **/
  @Schema(description = "The account name of the asset group account.")
  public String getAccountName() {
    return accountName;
  }

  /**
   * The external account id of the asset group account..
   * @return externalAccountId
   **/
  @Schema(description = "The external account id of the asset group account.")
  public Long getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * The compliant status for the account..
   * @return compliant
   **/
  @Schema(description = "The compliant status for the account.")
  public Boolean isCompliant() {
    return compliant;
  }

  /**
   * The site id of the asset group account..
   * @return siteId
   **/
  @Schema(description = "The site id of the asset group account.")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * The site name of the asset group account..
   * @return siteName
   **/
  @Schema(description = "The site name of the asset group account.")
  public String getSiteName() {
    return siteName;
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
    AssetGroupAccountResponse assetGroupAccountResponse = (AssetGroupAccountResponse) o;
    return Objects.equals(this.assetGroupId, assetGroupAccountResponse.assetGroupId) &&
        Objects.equals(this.assetGroupName, assetGroupAccountResponse.assetGroupName) &&
        Objects.equals(this.accountId, assetGroupAccountResponse.accountId) &&
        Objects.equals(this.accountName, assetGroupAccountResponse.accountName) &&
        Objects.equals(this.externalAccountId, assetGroupAccountResponse.externalAccountId) &&
        Objects.equals(this.compliant, assetGroupAccountResponse.compliant) &&
        Objects.equals(this.siteId, assetGroupAccountResponse.siteId) &&
        Objects.equals(this.siteName, assetGroupAccountResponse.siteName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, assetGroupName, accountId, accountName, externalAccountId, compliant, siteId, siteName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupAccountResponse {\n");
    
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    compliant: ").append(toIndentedString(compliant)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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

