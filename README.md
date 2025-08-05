# ETEREA.gateway-service

[![ETEREA.gateway-service Build JVM Image](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/maven.yml)
[![Java Version](https://img.shields.io/badge/Java-24-blue.svg)](https://www.oracle.com/java/technologies/downloads/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-green.svg)](https://spring.io/projects/spring-boot)
[![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2025.0.0-blue.svg)](https://spring.io/projects/spring-cloud)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![SonarCloud Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=ETEREA-services_ETEREA.gateway-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ETEREA-services_ETEREA.gateway-service)
[![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=ETEREA-services_ETEREA.gateway-service&metric=bugs)](https://sonarcloud.io/summary/new_code?id=ETEREA-services_ETEREA.gateway-service)
[![SonarCloud Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ETEREA-services_ETEREA.gateway-service&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=ETEREA-services_ETEREA.gateway-service)
[![SonarCloud Code Smells](https://sonarcloud.io/api/project_badges/measure?project=ETEREA-services_ETEREA.gateway-service&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=ETEREA-services_ETEREA.gateway-service)
[![SonarCloud Duplication](https://sonarcloud.io/api/project_badges/measure?project=ETEREA-services_ETEREA.gateway-service&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=ETEREA-services_ETEREA.gateway-service)
[![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=ETEREA-services_ETEREA.gateway-service&metric=coverage)](https://sonarcloud.io/summary/new_code?id=ETEREA-services_ETEREA.gateway-service)

## Description
ETEREA.gateway-service is a Spring Cloud Gateway service that acts as the entry point for all microservices in the ETEREA ecosystem. It provides routing, load balancing, and security features for the distributed system.

## Features
- Dynamic service routing
- Load balancing with Spring Cloud LoadBalancer
- **Service discovery with Consul**
- CORS configuration
- Health monitoring with Spring Boot Actuator
- Caffeine cache for optimized load balancing
- SonarCloud integration for code quality analysis

## Prerequisites
- Java 24
- Maven 3.x
- Docker (optional)

## Getting Started

### Local Development
1. Clone the repository
```bash
git clone https://github.com/ETEREA-services/ETEREA.gateway-service.git
```

2. Build the project
```bash
mvn clean install
```

3. Run the service
```bash
mvn spring-boot:run
```

### Docker
Build and run with Docker:
```bash
docker build -t eterea-gateway-service:2.0.1 .
docker run -p 8080:8080 eterea-gateway-service:2.0.1
```

## Configuration
The service can be configured through `application.yml` or environment variables. Key configurations include:
- Server port
- **Consul service discovery settings**
- Route definitions
- CORS policies
- Load balancer settings

## Health Endpoints
The service exposes health endpoints via Spring Boot Actuator:
- `/actuator/health` - Service health status
- `/actuator/info` - Service information
- `/actuator/metrics` - Service metrics

## Documentation
- [API Documentation](https://eterea-services.github.io/ETEREA.gateway-service/)
- [Technical Wiki](https://github.com/ETEREA-services/ETEREA.gateway-service/wiki)

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Recent Changes
- **v2.0.1 Release**
- Changed: Actualización de la dependencia `spring-boot-starter-parent` de la versión `3.5.3` a `3.5.4` en `pom.xml`.
- **v2.0.0 Release**
- Changed: Se reemplazó el sistema de descubrimiento de servicios de Eureka a Consul.
- Changed: Actualización de la configuración en `bootstrap.yml` para soportar Consul.
- Changed: Cambio del nombre del proyecto a "ETEREA.gateway-service" en `pom.xml`.
- Removed: Eliminada la dependencia de `spring-cloud-starter-netflix-eureka-client`.
- Removed: Eliminada la configuración de Eureka en los archivos de configuración.
- **v1.2.0 Release**
- Added: Integración con SonarCloud para análisis de calidad de código.
- Changed: Refactorización del workflow de CI/CD para construcción de imágenes JVM, incluyendo login a Docker Hub y etiquetado semántico.
- Changed: Implementación de Dockerfile multi-etapa para optimizar el tamaño de la imagen y mejorar la seguridad con usuario no privilegiado.
- Removed: Eliminación de los scripts del Maven Wrapper (`mvnw`, `mvnw.cmd`).
- Removed: Eliminación de `Dockerfile.local`.
- Removed: Eliminación de `pages.png`.

## Contact
ETEREA Services Team