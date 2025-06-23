# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Changed
- Migrated the CI pipeline from Jenkins to GitHub Actions.

## [2.0.2] - 2025-04-18
### Changed
- Switched license from `EPL 2.0` to `MIT` (issue [#10]).
  The license switch has been authorized through a restructuring review supervised by the « Eclipse Management
  Organization » team https://gitlab.eclipse.org/eclipsefdn/emo-team/emo/-/issues/908#note_3394156.

## [2.0.1] - 2024-04-12
### Added
- `CHANGELOG.md` file (issue [eclipse-keyple/keyple#6]).
- CI: Forbid the publication of a version already released (issue [#5]).
- Added project status badges on `README.md` file.
### Fixed
- CI: code coverage report when releasing.
### Changed
- Java source and target levels `1.6` -> `1.8`
### Upgraded
- Gradle `6.8.3` -> `7.6.4`

## [2.0.0] - 2021-10-06
This is the initial release.
It follows the extraction of Keyple 1.0 components contained in the `eclipse-keyple/keyple-java` repository to dedicated repositories.
It also brings many major API changes.

[unreleased]: https://github.com/eclipse-keyple/keyple-common-java-api/compare/2.0.2...HEAD
[2.0.2]: https://github.com/eclipse-keyple/keyple-common-java-api/compare/2.0.1...2.0.2
[2.0.1]: https://github.com/eclipse-keyple/keyple-common-java-api/compare/2.0.0...2.0.1
[2.0.0]: https://github.com/eclipse-keyple/keyple-common-java-api/releases/tag/2.0.0

[#10]: https://github.com/eclipse-keyple/keyple-common-java-api/issues/10
[#5]: https://github.com/eclipse-keyple/keyple-common-java-api/issues/5

[eclipse-keyple/keyple#6]: https://github.com/eclipse-keyple/keyple/issues/6