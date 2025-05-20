# ETEREA.gateway-service

[![ETEREA.gateway-service CI](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/maven.yml)
[![Documentation Status](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/pages.yml/badge.svg)](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/pages.yml)
[![Java Version](https://img.shields.io/badge/Java-24-blue.svg)](https://www.oracle.com/java/technologies/downloads/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-green.svg)](https://spring.io/projects/spring-boot)
[![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2024.0.1-blue.svg)](https://spring.io/projects/spring-cloud)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Description
ETEREA.gateway-service is a Spring Cloud Gateway service that acts as the entry point for all microservices in the ETEREA ecosystem. It provides routing, load balancing, and security features for the distributed system.

## Features
- Dynamic service routing
- Load balancing with Spring Cloud LoadBalancer
- Service discovery with Eureka
- CORS configuration
- Health monitoring with Spring Boot Actuator
- Caffeine cache for optimized load balancing

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
docker build -t eterea-gateway-service .
docker run -p 8080:8080 eterea-gateway-service
```

## Configuration
The service can be configured through `application.yml` or environment variables. Key configurations include:
- Server port
- Service discovery settings
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
- Updated to Java 24 and Spring Boot 3.4.5
- Added automated documentation generation
- Implemented GitHub Pages for documentation
- Added wiki generation scripts
- Improved CI/CD infrastructure

## Contact
ETEREA Services Team
