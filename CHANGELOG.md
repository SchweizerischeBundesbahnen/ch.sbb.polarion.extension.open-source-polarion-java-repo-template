# Changelog

## [1.3.19](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.18...v1.3.19) (2025-12-03)


### Bug Fixes

* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v11 ([#67](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/issues/67)) ([1187fe1](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/1187fe109ded614d9fb2c1b5d9c8750047868fcc))
* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v11.0.2 ([191cbc4](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/191cbc48da15095a27e394d78d17749efa34757e))
* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v11.1.0 ([33b2922](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/33b2922e1ad52f0c0b369bfea6aab6c11a7c13e6))
* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v11.2.0 ([bd1e054](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/bd1e0545d8f04cf251e55968749fde4a98e98da1))
* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v11.3.0 ([b9af701](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/b9af7012d64584fcdd8a351e0e4dc61b6b03fb9b))

## [1.3.18](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.17...v1.3.18) (2025-06-30)


### Bug Fixes

* update maven-build.yml to use 'clean verify' instead of 'clean install' for build steps ([ad3ab90](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/ad3ab9072eb9be246dcb69b5cf1562aabd26908d))

## [1.3.17](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.16...v1.3.17) (2025-06-30)


### Bug Fixes

* update maven-build.yml to include project version and adjust release condition ([39f44de](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/39f44de0848de3c9c74da74b8c8b0b0daf17527a))

## [1.3.16](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.15...v1.3.16) (2025-06-30)


### Bug Fixes

* add debugging output for downloaded artifacts and Maven cache in maven-build.yml ([933f9ca](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/933f9ca16acbea7846b2a1fd6efd738c01aa05f5))
* add deploy-github-packages profile to maven-build.yml for asset upload ([1430f18](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/1430f18d137f994ad82d44d66dd3078f154a2631))
* add deploy-github-packages profile to maven-build.yml for asset upload ([8f46eaa](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/8f46eaae14ad23d16301be199b302b57697f2b91))
* add deploy-github-packages profile to maven-build.yml for asset upload ([0b61702](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/0b61702b745679f848418d05b2cb3e2d6731bbd4))
* add GPG passphrase secret to maven-build.yml ([4f5d447](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/4f5d447b7cd321b0fba6badf0ef15d692f93560f))
* add GPG private key to maven-build.yml for signing artifacts ([a4231a8](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/a4231a8736ce67fdd2473e3a0a9320472c3c21b6))
* clean up maven-build.yml by removing commented-out steps and adj… ([#60](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/issues/60)) ([cca4272](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/cca42728bb9cbdafae9a6b5801b7fcead31073ff))
* comment out artifact download step and enhance debugging output in maven-build.yml ([6796558](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/67965585b637bcf84f4adbff11867afee8f36161))
* correct syntax for repositoryId in maven-build.yml ([7c472fb](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/7c472fbf5145bd5960d3c490a882e9cc86dde863))
* correct syntax for repositoryId in maven-build.yml ([a1f8083](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/a1f80838481c8ca14d749e44ad4cd93c193ded49))
* correct syntax for repositoryId in maven-build.yml ([68d6a7d](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/68d6a7d1a04be9cc9a7346708011ede713363856))
* correct syntax for repositoryId in maven-build.yml ([4fff2b3](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/4fff2b305b1d8a5b14d33c3ec0cf5b85e172ac9f))
* correct syntax for repositoryId in maven-build.yml ([f2a680c](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/f2a680c345ccb8a3e75d477642e26e1f4917b68d))
* enable debug output for Maven deployment in maven-build.yml ([4621abf](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/4621abfdf8ced4aa41d892603041913f259e830f))
* enhance debugging output in maven-build.yml and adjust environment variable setup ([5a5eac8](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/5a5eac8755fedb563f7925fb833ef6e176e3be71))
* enhance debugging output in maven-build.yml and adjust environment variable setup ([830494a](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/830494af721e617cac6256ff24091eebd43df769))
* remove unused environment variables and streamline Maven deployment steps in maven-build.yml ([ac19635](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/ac1963528e38a3125935a100866212139006e37f))
* remove unused environment variables and streamline Maven deployment steps in maven-build.yml ([1828220](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/1828220a12a51634e5f623e1fa56170c5a004ee4))
* update maven-build.yml and settings files for GPG configuration and cleanup ([0847d06](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/0847d06e279025373e0c581ac3409bd2f19036a2))
* update maven-build.yml and settings.xml for GitHub Packages deployment profile ([ff75c98](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/ff75c98d72a3f487be60306440782d11ef533277))
* update maven-build.yml for deploying artifacts and bump version to 1.4.0 ([46d9d68](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/46d9d684d8541629833a1e6f3ed509116834ce17))
* update maven-build.yml to replace 'install' with 'verify' for build steps and adjust GPG key usage ([2a3ae8d](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/2a3ae8d909965ef21f8f0a2f58891795f5bb8e8c))
* update maven-build.yml to use 'install' instead of 'verify' and adjust deployment steps ([8d18f9b](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/8d18f9b449fb583f3dfba9ad4512697a1c038df9))
* update maven-build.yml to use central-publishing-maven-plugin for deployment ([6d988e5](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/6d988e5668bd5fe1eaf9b006d3412aae6cae7968))
* update version to 1.3.16 and remove unnecessary skip option in maven-build.yml ([70831b5](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/70831b5a1abd429dc366976dedb92deb84614ff5))

## [1.3.15](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.14...v1.3.15) (2025-06-27)


### Bug Fixes

* update maven-build.yml to add GPG passphrase for Sonatype Central deployment ([3c9c819](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/3c9c819b2274cf7f8ee48a342359146dd7e152cd))

## [1.3.14](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.13...v1.3.14) (2025-06-27)


### Bug Fixes

* update maven-build.yml to use Sonatype Central credentials from secrets ([daeb8c1](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/daeb8c15e6f559840da52ca78c43f99b8b553038))

## [1.3.13](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.12...v1.3.13) (2025-06-27)


### Bug Fixes

* update maven-build.yml to add GPG passphrase and private key for signing ([0fc442e](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/0fc442eafeccf026045e4d1c1440c0e4858c2af1))

## [1.3.12](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.11...v1.3.12) (2025-06-27)


### Bug Fixes

* add repositoryId parameter for GitHub package deployment in maven-build.yml ([0c61d22](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/0c61d22c3448206cf87508e892b95e3bb16b3006))
* comment out test results publishing and coverage upload steps in maven-build.yml ([129070c](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/129070c1852f5f0313eff301833c68872dfca391))
* enhance maven-build.yml for improved artifact handling and add integration tests for OpenAPIInfo ([6c61572](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/6c61572f0f56b3594c35e9120f10b2bb60fa6ff8))
* update maven-build.yml and CLAUDE.md to improve workflow caching and add new validation workflows ([c516ccb](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c516ccb847f52ea6677913374916e28448f18e09))
* update maven-build.yml to change GPG key reference and adjust comment mode for test results ([036db43](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/036db437c1acd1c1430edbcf45a3fe30553a1ea6))
* update maven-build.yml to conditionally run Maven commands based on branch presence and enhance settings.local.json with additional commands ([cfefcb0](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/cfefcb06bb54f71d18eeda517608c24e5e2a4d0f))
* update maven-build.yml to deploy main, sources, and javadoc JARs to Sonatype Central ([fc42ea4](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/fc42ea49763b04a467d7e8f332fe2e46392e5571))
* update maven-build.yml to disable comment mode for test results and comment out security scan steps ([48a2f76](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/48a2f761714ef9bdb2e614862b70adc2d7cc6cc6))
* update maven-build.yml to include repository URL for GitHub package deployment ([4da5cf0](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/4da5cf0b686723935647279151acacdd55c59298))
* update maven-build.yml to streamline deployment process and adjust GPG key usage ([9cdb951](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/9cdb95144de9f6022a59b660b0f41666efb64c96))
* update maven-build.yml to use latest action versions for caching and publishing test results ([d6860d5](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/d6860d5729c37db85b46270f6ed15de7d338a477))
* update maven-build.yml to use latest action versions for SonarQube caching and test results publishing ([5b33fc9](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/5b33fc938dac4b635bb4a5d38de4f05ee4db7192))
* update maven-build.yml to use latest Codecov action version and add caching for OWASP Dependency Check database ([969cb5a](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/969cb5a6dc33f327608df91625633c12b1010c23))

## [1.3.11](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.10...v1.3.11) (2025-06-27)


### Bug Fixes

* update maven-build.yml to skip main module during deployment and streamline artifact handling ([661b23e](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/661b23e1f4d09b635f3ec915fee11ac44578c1cd))

## [1.3.10](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.9...v1.3.10) (2025-06-27)


### Bug Fixes

* add connectedMode.json and update maven-build.yml to include GPG signing profile for builds ([c792248](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c792248e929a576f696f167e7d03873eaef9c15f))

## [1.3.9](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.8...v1.3.9) (2025-06-27)


### Bug Fixes

* update maven-build.yml to include GPG keys in environment variables and adjust artifact paths ([8df54dd](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/8df54dd3d575f23086a4a15b7ff8eb9c1f79e2e5))

## [1.3.8](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.7...v1.3.8) (2025-06-25)


### Bug Fixes

* update maven-build.yml to adjust GPG signing configuration and refine deployment profiles ([eebd1f7](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/eebd1f73242bfe9c317b4caccbc534360c193d40))

## [1.3.7](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.6...v1.3.7) (2025-06-25)


### Bug Fixes

* update maven-build.yml to streamline GPG signing and improve permissions in settings.local.json ([c0bbcb9](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c0bbcb9c394c33d8488bc56319f6340de8ac2e79))

## [1.3.6](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.5...v1.3.6) (2025-06-25)


### Bug Fixes

* update maven-build.yml to skip Javadoc and source generation during deployment ([589c6a5](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/589c6a5fd6481e490e5b544f9ebcb32d9b00a2d2))

## [1.3.5](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.4...v1.3.5) (2025-06-25)


### Bug Fixes

* include .pom files in maven artifact paths in maven-build.yml ([c78b137](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c78b137fadbdfb6f93baa27ac58c26cf53086f7b))

## [1.3.4](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.3...v1.3.4) (2025-06-25)


### Bug Fixes

* update maven-build.yml to use 'verify' instead of 'package' and clean up openapi.json formatting ([c8edcc6](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c8edcc6fd4793132c5c947a8e48c01dc0bc83d23))

## [1.3.3](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.2...v1.3.3) (2025-06-25)


### Bug Fixes

* add GPG private key and passphrase to maven-build.yml for secure deployment ([472a99f](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/472a99f7ccca9646b15943a8776abafcf9bd111b))
* remove unnecessary .pom file from maven artifact paths in maven-build.yml ([0cd329a](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/0cd329adc677c612d27bc686c3396ba76ee8004c))
* update openapi.json and pom.xml for consistency and clarity ([6d5bfa7](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/6d5bfa79a8bd82a64edcdcbfc46229534daebbaa))

## [1.3.2](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.1...v1.3.2) (2025-06-24)


### Bug Fixes

* add GPG private key to maven-build.yml for secure deployment ([37c54a9](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/37c54a9174d1403531cb4a092e279cada261cd1e))

## [1.3.1](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.3.0...v1.3.1) (2025-06-24)


### Bug Fixes

* clean up maven-build.yml by removing unnecessary comments and skipping Javadoc/source generation ([ee94e6c](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/ee94e6c82cbaf31630c35d1ce3bd0538b5c8664f))

## [1.3.0](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.2.1...v1.3.0) (2025-06-24)


### Features

* add .pom file to maven artifacts and update settings for VS Code extensions ([a79272e](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/a79272ec2784ccd70fe1bf91e217742bccb036a8))

## [1.2.1](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.2.0...v1.2.1) (2025-06-24)


### Bug Fixes

* skip Javadoc and source generation in maven-build.yml ([3284d98](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/3284d988adc0b4b0bdf2fd58c68ba36247cb21f2))

## [1.2.0](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.1.0...v1.2.0) (2025-06-24)


### Features

* add settings.local.json for GitHub Actions permissions configuration ([96ab7d1](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/96ab7d1fef0a805b6b145cd11435fe9ac0e5dc95))
* Update README.md ([#18](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/issues/18)) ([374fba3](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/374fba3074a03aca500cc18301f75ef4b2ce3ba2))


### Bug Fixes

* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v10 ([#17](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/issues/17)) ([2a32da9](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/2a32da9ff86f8d1e936435aad7435aebb2307ece))
* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v9.1.1 ([daf4b47](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/daf4b475ff329cdf743ba4a6c47e2bd81c37a1c2))
* update JDK distribution from adopt to temurin in maven-build.yml ([8b121c4](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/8b121c41f95c7cebd9f225c606a82f3749d88930))
* update version to 1.1.1-SNAPSHOT in pom.xml ([48fbdf2](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/48fbdf2da9e6678944aa11982eb6722bf2e92e32))


### Documentation

* update README.md with documentation sections and add release-please.yml for automated releases ([48a0575](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/48a05753060f9bd62497618258b8a22a13e0bbde))

## [1.1.0](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/compare/v1.0.0...v1.1.0) (2025-05-22)


### Features

* add ActionLint workflow to check GitHub Actions for errors ([3fed567](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/3fed56787058191e8e83bbb0188523d79861460f))


### Bug Fixes

* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v9 ([#15](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/issues/15)) ([d8b8b77](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/d8b8b7722c8c1cb951e2799a6fb13726bae9dc57))
* update GitHub release condition to exclude SNAPSHOT versions ([d88bfaa](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/d88bfaa753ddb556b7620cd320b96565a3048251))

## 1.0.0 (2025-04-23)


### Bug Fixes

* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v8.1.0 ([#12](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/issues/12)) ([9c0922d](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/9c0922d9d9efb30220c370c9e551b2540ff80a22))
* **deps:** update dependency ch.sbb.polarion.extensions:ch.sbb.polarion.extension.generic to v8.1.1 ([3261094](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/3261094eb428249950ed2e61fc9421966e5abde6))
* only deploy to gh when not SNAPSHOT ([c716ae3](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c716ae3a89b04fefd7b98d53be51da11b73f2cbe))
* pre-commit run -a ([de00354](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/de0035485dce1d4deb4282d0eb69c95cb2ed4de0))
* pre-commit run -a ([c11c281](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/c11c2813d6945e835ff819dae7b81ebdde4d21d2))
* pre-commit run -a ([0a7b3b0](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/0a7b3b0a96f2e121c3b4a04bdd4714cd9d177fff))
* pre-commit run -a ([179edc2](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/179edc23f79354a28ed8cfea63a671445890dd98))
* pre-commit run -a ([886f733](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/886f733f305bd4e83709bb36a92eb1a868965168))
* triggering of all branch names ([4fcfe83](https://github.com/SchweizerischeBundesbahnen/ch.sbb.polarion.extension.open-source-polarion-java-repo-template/commit/4fcfe83f568d06743dedec404f9c5e26059c5128))
