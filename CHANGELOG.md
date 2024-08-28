# DocuSign Admin Java Client Changelog
See [DocuSign Support Center](https://support.docusign.com/en/releasenotes/) for Product Release Notes.

## [v2.0.0-RC1] - Admin API v2.1-1.4.0 - 2024-08-27
### Breaking Changes
<details>
<summary>API Changes (Click to expand)</summary>

<br/>
<div style="margin-left: 20px;">

Added new query parameter "include_ds_groups" to the API "/v2/organizations/{organizationId}/users":

<h3>Added New APIs for Account Creation</h3>
<li>GET: get subscription details for organization</li>
<li>POST: initiate Create account request</li>
<li>GET: get ongoing process details by org ID</li>
<li>GET: get individual process details by org ID, asset group ID, asset group work ID</li>


</div>
</details>

- Modified the default basePath to `DEMO_REST_BASEPATH`.
- Deprecation of OLTU library: The OLTU library for handling OAuth is no longer used.
 
### Other Changes
- Revised the logic to determine the `oAuthBasePath` based on the `basePath`.
- Model classes are now serializable.
- Resolved an issue** where setting a default SSL socket for the entire JVM caused unintended side effects.
- **Fixed a memory leak** related to the class loader.
- **Addressed dependency vulnerabilities** in the following libraries:
  - `bcprov-jdk18on` updated to version 1.78.1
  - `com.fasterxml.jackson.core` updated to version 2.17.1
  - `org.json` updated to version 20240303
  - `jersey` updated to version 3.1.6
- Upgradation of OWASP for vulnerability check of dependencies.
- Added support for version v2.1-1.4.0 of the DocuSign Admin API.
- Updated the SDK release version.
## [v1.3.0] - Admin API v2.1-1.3.0 - 2023-08-14
### Changed
- Added support for version v2.1-1.3.0 of the DocuSign Admin API.
- Updated the SDK release version.

New endpoints:
* `GET /v1/organizations/{organizationId}/assetGroups/accounts` Get asset group accounts for an organization.
* `POST /v1/organizations/{organizationId}/assetGroups/accountClone` Clone an existing DocuSign account.
* `GET /v1/organizations/{organizationId}/assetGroups/accountClones` Gets all asset group account clones for an organization.
* `GET /v1/organizations/{organizationId}/assetGroups/{assetGroupId}/accountClones/{assetGroupWorkId}` Gets information about a single cloned account.
## [v1.2.0] - Admin API v2.1-1.2.0 - 2023-05-10
### Changed
- Added support for version v2.1-1.2.0 of the DocuSign Admin API.
- Updated the SDK release version.

## [v1.1.0] - Admin API v2.1-1.1.0 - 2022-04-26
### Changed
- Added support for version v2.1-1.1.0 of the DocuSign Admin API.
- Updated the SDK release version.

## [v1.0.0-BETA] - Admin API v2.1-1.0.0 - 2021-08-30
### Changed
- Updated the SDK release version.

## [v1.0.0-RC3] - Admin API v2.1-1.0.0 - 2021-08-06
### Changed
- Added support for version v2.1-1.0.0 of the DocuSign Admin API.
- Updated the SDK release version.
### Fixed
- Used String for enum properties instead of Integer

## [v1.0.0-RC2] - Admin API v2.1-1.0.0 - 2021-07-29
### Changed
- Added support for version v2.1-1.0.0 of the DocuSign Admin API.
- Updated the SDK release version.

## [v1.0.0-RC1] - Admin API v2.1-1.0.0 - 2021-07-23
### Added
- First version of Admin API, supports DocuSign Admin
