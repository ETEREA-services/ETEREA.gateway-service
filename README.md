# ETEREA.gateway-service

[![ETEREA.gateway-service CI](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/ETEREA-services/ETEREA.gateway-service/actions/workflows/maven.yml)

## Description
ETEREA.gateway-service is a Spring Cloud Gateway service that acts as the entry point for all microservices in the ETEREA ecosystem. It provides routing, load balancing, and security features for the distributed system.

## Features
- Dynamic service discovery with Eureka
- Load balancing across microservices
- CORS configuration for cross-origin requests
- Route management for multiple microservices
- Health monitoring and metrics via Actuator
- Caffeine cache for optimized load balancing

## Prerequisites
- Java 21
- Maven 3.x
- Docker (optional)

## Supported Services
The gateway routes requests to the following services:
- Report Service (`/api/report/**`)
- Core Service (`/api/core/**`)
- AFIPWS Service (`/api/afipws/**`)
- Stock Service (`/api/stock/**`)
- Programa Día Service (`/api/programa-dia/**`)
- Isolate Service (`/api/isolate/**`)

## Getting Started

### Local Development
1. Clone the repository
2. Build the project:
   ```bash
   ./mvnw clean install
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

### Docker
Build and run using Docker:
```bash
# Development
docker build -f Dockerfile.local -t eterea-gateway-service .

# Production
docker build -t eterea-gateway-service .
```

## Configuration
The service can be configured through:
- `bootstrap.yml` - Service discovery and routing configuration
- Environment variables for dynamic configuration

## Health Check
The service exposes health endpoints via Spring Boot Actuator:
- `/actuator/health` - Service health status
- `/actuator/info` - Service information
- `/actuator/metrics` - Service metrics

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Contact
ETEREA Services Team
