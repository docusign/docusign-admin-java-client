package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AssetGroupAccountResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AssetGroupAccountsResponse.
 *
 */

public class AssetGroupAccountsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("assetGroupAccounts")
  private java.util.List<AssetGroupAccountResponse> assetGroupAccounts = null;

  /**
   * The list of asset group accounts..
   * @return assetGroupAccounts
   **/
  @Schema(description = "The list of asset group accounts.")
  public java.util.List<AssetGroupAccountResponse> getAssetGroupAccounts() {
    return assetGroupAccounts;
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
    AssetGroupAccountsResponse assetGroupAccountsResponse = (AssetGroupAccountsResponse) o;
    return Objects.equals(this.assetGroupAccounts, assetGroupAccountsResponse.assetGroupAccounts);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(assetGroupAccounts);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupAccountsResponse {\n");
    
    sb.append("    assetGroupAccounts: ").append(toIndentedString(assetGroupAccounts)).append("\n");
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

