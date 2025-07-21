# Changelog

Todos los cambios notables en este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
y este proyecto adhiere a [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.2.0] - 2025-07-21
### Added
- Integración con SonarCloud para análisis de calidad de código.

### Changed
- Refactorización del workflow de CI/CD para construcción de imágenes JVM, incluyendo login a Docker Hub y etiquetado semántico.
- Implementación de Dockerfile multi-etapa para optimizar el tamaño de la imagen y mejorar la seguridad con usuario no privilegiado.

### Removed
- Eliminación de los scripts del Maven Wrapper (`mvnw`, `mvnw.cmd`).
- Eliminación de `Dockerfile.local`.
- Eliminación de `pages.png`.

## [1.1.2] - 2025-07-06
### Fixed
- fix(docs): reparar la estructura de index.html en el workflow
- fix(docs): corregir la generación de data.js en el workflow

## [1.1.1] - 2025-07-04
### Changed
- build(deps): update Spring Boot/Cloud and gateway config

## [1.1.0] - 2025-06-30
### Added
- feat(monitoring): implementar sistema de métricas avanzadas
- feat: actualiza dependencias y mejora infraestructura

## [1.0.0] - 2024-03-24
### Added
- Actualización de dependencias:
  - Spring Boot a 3.4.5
  - Java a versión 24
- Implementación de documentación automática:
  - Generación de documentación técnica
  - Wiki del proyecto
  - GitHub Pages para documentación
- Scripts de automatización:
  - `fetch_github_data.py` para obtener datos del repositorio
  - `generate_docs.py` para generar documentación
  - `generate_wiki.py` para mantener la wiki actualizada

### Changed
- Actualización de Dockerfiles para usar Java 24
- Optimización del workflow de Maven
- Mejoras en la infraestructura de CI/CD

## [0.9.0] - 2024-12-16
### Added
- Endpoints de Actuator para monitoreo
- Centralización del nombre del servicio

## [0.8.0] - 2024-12-05
### Changed
- Actualización de versiones de dependencias

## [0.7.0] - 2024-11-15
### Changed
- Actualización de versiones de dependencias

## [0.6.0] - 2024-10-13
### Added
- Nueva ruta para Programa Día Service (`/api/programa-dia/**`)

## [0.5.0] - 2024-09-29
### Added
- Nueva ruta para Stock Service (`/api/stock/**`)

## [0.4.0] - 2024-09-22
### Changed
- Actualización de versiones de dependencias

## [0.3.0] - 2024-09-11
### Changed
- Modificación del puerto de servicio

## [0.2.0] - 2024-09-08
### Changed
- Optimización de Dockerfile para reducir tamaño de imagen

## [0.1.0] - 2024-08-31
### Changed
- Actualización de versiones de dependencias

## [0.0.3] - 2024-08-13
### Added
- Badge de CI en README
- Mejoras en GitHub Actions

## [0.0.2] - 2024-07-09
### Added
- Configuración inicial de GitHub Actions
- Primera implementación del servicio

## [0.0.1] - 2024-07-06
### Added
- Commit inicial del proyecto
- Configuración básica de Maven
- Estructura inicial del proyecto

[1.2.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v1.1.2...v1.2.0
[1.1.2]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v1.1.1...v1.1.2
[1.1.1]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v1.1.0...v1.1.1
[1.1.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v1.0.0...v1.1.0
[1.0.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.9.0...v1.0.0
[0.9.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.8.0...v0.9.0
[0.8.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.7.0...v0.8.0
[0.7.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.6.0...v0.7.0
[0.6.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.5.0...v0.6.0
[0.5.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.4.0...v0.5.0
[0.4.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.3.0...v0.4.0
[0.3.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.2.0...v0.3.0
[0.2.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.1.0...v0.2.0
[0.1.0]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.0.3...v0.1.0
[0.0.3]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.0.2...v0.0.3
[0.0.2]: https://github.com/ETEREA-services/ETEREA.gateway-service/compare/v0.0.1...v0.0.2
[0.0.1]: https://github.com/ETEREA-services/ETEREA.gateway-service/releases/tag/v0.0.1