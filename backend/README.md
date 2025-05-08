# Backend API

## Overview

This folder contains the server-side implementation of our application, providing RESTful API endpoints and business
logic for the frontend components.

## Technologies

- Java 24
- Spring Boot framework
- Spring Data JPA for database operations
- Jakarta EE for enterprise Java components
- REST API architecture
- MySQL database
- Lombok for reducing boilerplate code
- JWT for authentication
- Hibernate as ORM

## Structure

- `controllers/` - API endpoint definitions
- `services/` - Business logic implementation
- `repositories/` - Data access layer
- `models/` - Entity definitions
- `config/` - Application configuration
- `security/` - Authentication and authorization
- `utils/` - Helper classes and utilities

## Key Features

- RESTful API endpoints for all frontend operations
- Secure authentication and authorization
- Data validation and error handling
- Efficient database operations
- Business logic implementation

## Development

When adding new features:

1. Create/modify entity models
2. Implement repository interfaces
3. Add business logic in services
4. Expose functionality through controllers
5. Update documentation as needed

## API Documentation

API documentation is available at `/api/swagger-ui.html` when running the application.