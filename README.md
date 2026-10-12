# Data Exchanges Backend Service

Backend service for the data exchanges domain, built with Spring Boot and Maze conventions.

## Quality

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=coverage)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=bugs)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=maze-technology_data-exchanges-backend&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=maze-technology_data-exchanges-backend)

## Commands

Check [Makefile](Makefile)

## Configuration

Configuration files are located in the `src/main/resources` directory. Modify `application-local.yml` to suit your needs.

### Configure the GitHub Repository

1. Go to your GitHub repository settings.
2. Navigate to the "Secrets and variables" section and add the following:

   **Secrets:**

   - `DOCKER_PASSWORD` (Your Docker Hub password)

   **Variables:**

   - `DOCKER_USERNAME` (Your Docker Hub username)
   - `DOCKER_REPOSITORY` (The Docker Hub repository where the built image should be pushed by the workflow)
