# ToyShop

ToyShop is a modern e-commerce web application for selling toys online. Built with Spring Boot backend and Bootstrap frontend, it provides a seamless shopping experience for customers.

## Features

- **User Management**
    - Customer registration and authentication
    - Profile management with personal details
    - Secure password handling using JWT for authentication

- **Shopping Experience**
    - Product browsing and search
    - Shopping cart functionality
    - Multiple delivery methods (Standard, Express, Same-day, Store pickup)
    - Order tracking with various status updates

- **Order Management**
    - Order status tracking (Pending, Confirmed, Processing, etc.)
    - Multiple delivery options
    - Order history

- **Advanced Features**
    - Real-time notifications using Kafka
    - Caching for improved performance with Redis
    - Full-text search and analytics with ElasticSearch
    - API documentation with Swagger

## Technology Stack

### Backend
- Java with Spring Boot
- JPA/Hibernate for database management
- Maven for dependency management
- RESTful API architecture
- JWT for secure authentication
- Kafka for real-time messaging
- Redis for caching
- ElasticSearch for search and analytics

### Frontend
- JavaScript/TypeScript
- Bootstrap for responsive design
- NPM for package management

### Database
- SQL database (via JPA)
- Entity relationship model for data structure
- MySQL as the database engine
- Dbeaver for database management

### API Documentation
- Swagger for interactive API documentation

## Project Structure

The project is organized into the following directories:

- **backend/**: Contains the Spring Boot application code, including controllers, services, repositories, and configuration files.
- **frontend/**: Contains the Bootstrap-based frontend code, including HTML, CSS, and JavaScript/TypeScript files.
- **database/**: Includes SQL scripts for database schema and initial data population.
- **docs/**: Documentation files, including API specifications and design documents.

## Setup Instructions

Follow these steps to set up the project locally:

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd ToyShop
   ```

2. **Backend Setup**:
   - Ensure you have Java 17+ and Maven installed.
   - Navigate to the `backend/` directory:
     ```bash
     cd backend
     ```
   - Configure the `application.properties` file with your database credentials.
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

3. **Frontend Setup**:
   - Ensure you have Node.js and NPM installed.
   - Navigate to the `frontend/` directory:
     ```bash
     cd frontend
     ```
   - Install dependencies:
     ```bash
     npm install
     ```
   - Start the development server:
     ```bash
     npm start
     ```

4. **Database Setup**:
   - Import the SQL scripts from the `database/` directory into your MySQL database.
   - Verify the database connection in the backend configuration.

5. **Access the Application**:
   - Open your browser and navigate to `http://localhost:3000` for the frontend.
   - The backend API will be available at `http://localhost:8080`.

## Contributing

We welcome contributions to ToyShop! To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request on the main repository.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
`