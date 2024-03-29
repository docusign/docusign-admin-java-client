# DocuSign Admin Java Client Changelog
See [DocuSign Support Center](https://support.docusign.com/en/releasenotes/) for Product Release Notes.

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
