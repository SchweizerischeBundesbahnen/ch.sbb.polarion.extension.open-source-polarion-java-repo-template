# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Polarion ALM extension template repository for SBB (Swiss Federal Railway). It serves as a starting point for creating Polarion extensions and demonstrates the standard project structure and build configuration.

## Architecture

### Core Components
- **Maven-based Java project** using parent POM `ch.sbb.polarion.extension.generic:10.1.0`
- **REST API structure** with OpenAPI/Swagger documentation generation
- **Polarion Extension Framework** - extends Polarion ALM functionality
- **Multi-profile deployment** supporting local Polarion installation and publishing

### Project Structure
```
src/main/java/ch/sbb/polarion/extension/
├── open-source-polarion-java-repo-template/     # Hyphenated package (legacy)
└── open_source_polarion_java_repo_template/     # Underscore package (current)
    └── rest/controller/                          # REST API controllers
```

Note: The project has both hyphenated and underscored package structures for compatibility reasons.

## Build Commands

### Basic Build
```bash
mvn clean package
```

### Install to Local Polarion
```bash
mvn clean install -P install-to-local-polarion
```
*Requires `POLARION_HOME` environment variable pointing to Polarion installation*

### Build with Full Verification
```bash
mvn clean verify
```

### Run Tests
```bash
mvn test
```

### Generate OpenAPI Documentation
OpenAPI spec is automatically generated during build to `docs/openapi.json`

## Development Setup

### Prerequisites
- Java JDK 17
- Maven 3.9+
- Active Polarion license
- `POLARION_HOME` environment variable for local installation

### Polarion Dependencies
Extract Polarion dependencies using [polarion-artifacts-deployer](https://github.com/SchweizerischeBundesbahnen/polarion-artifacts-deployer) before building.

## CI/CD Pipeline

The project uses GitHub Actions with the following key workflows:
- **maven-build.yml**: Main build, test, and SonarCloud analysis
- **Dual deployment**: Maven Central (releases) and GitHub Packages
- **Quality gates**: SonarCloud integration for code quality

## Code Standards

- Follows Google Java Style Guide
- Uses Checkstyle, FindBugs/SpotBugs, and PMD for static analysis
- JaCoCo for code coverage reporting
- SonarCloud for continuous quality monitoring

## Package Naming Convention

The project uses the pattern:
- Extension context: `ch.sbb.polarion.extension.open-source-polarion-java-repo-template`
- Module name: `ch.sbb.polarion.extension.open_source_polarion_java_repo_template`

## Key Configuration

### Maven Properties
- `maven-jar-plugin.Extension-Context`: Defines the Polarion extension context
- `maven-jar-plugin.Automatic-Module-Name`: Java module name
- `web.app.name`: Web application context name

### Swagger Configuration
REST API documentation includes packages:
- `ch.sbb.polarion.extension.generic.rest.controller.info`
- `ch.sbb.polarion.extension.generic.rest.model`
- `ch.sbb.polarion.extension.open_source_polarion_java_repo_template.rest.controller`
