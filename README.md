Product and Category Management
This Spring Boot application is designed to manage products and categories with RESTful API endpoints. It provides full CRUD functionality for Category and Product entities, supports pagination, and implements a one-to-many relationship between categories and products.

Overview
This project includes:

A robust API for managing products and categories.
Integration with a relational database for persistent data storage.
Implementation of server-side pagination for efficient data handling.
Use of JPA and Hibernate for seamless ORM and database interactions.
Key Features
1. Category Management
API endpoints to create, read, update, and delete categories.
Paginated responses for efficient listing of categories.
2. Product Management
API endpoints to handle products' creation, retrieval, updating, and deletion.
Paginated responses for product listings.
Each product is linked to a category, reflecting a one-to-many relationship.
3. Category-Product Relationship
A category can contain multiple products.
Product details include associated category information.
4. Pagination
Server-side pagination for endpoints that list categories and products to optimize performance and response size.
Technologies
Java 8+: Backend logic and application core.
Spring Boot: Framework for fast development and configuration.
Spring Data JPA: Simplifies data layer interactions.
Hibernate: ORM for database mapping.
MySQL (or other RDBMS): Persistent storage for categories and products.
Maven: Build and dependency management.
Prerequisites
Ensure the following are installed and set up before running the project:

Java 8 or newer.
Maven for building the project.
Relational Database (e.g., MySQL) configured and accessible.
Database Configuration
To configure the database connection, update the application.properties file located in src/main/resources:

properties
Copy code
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_user
spring.datasource.password=your_database_password

# JPA & Hibernate Settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
Getting Started
Clone the repository and navigate to the project directory.
Set up the database with the appropriate schema.
Update database credentials in the application.properties file.
Run the project using mvn spring-boot:run.
Access the API endpoints for managing categories and products.
This application simplifies product and category management with a clean and scalable approach, making it ideal for e-commerce or inventory systems.
