
# Student Management System

A backend-based Student Management System developed Java, Spring Boot, Hibernate, and MySQL.That provides REST APIs to manage student records efficiently. This project demonstrates CRUD operations, RESTful API development, validation handling, database integration, and clean layered architecture.

---

# Features

- Add new student
- Update existing student details
- Delete student records
- Fetch student by ID
- Fetch all students
- Request validation using Jakarta Validation
- DTO implementation
- RESTful API architecture
- MySQL database integration

---

# Tech Stack

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- Git & GitHub

---

# Project Structure

```bash
src
 └── main
     ├── java
     │    └── controller
     │    └── service
     │    └── repository
     │    └── model
     │    └── dto
     │    └── exception
     └── resources
          └── application.properties
```

---

# API Endpoints

## Create Student

```http
POST /students
```

## Get All Students

```http
GET /students
```

## Get Student By ID

```http
GET /students/{id}
```

## Update Student

```http
PUT /students/{id}
```

## Delete Student

```http
DELETE /students/{id}
```

---

# Validation

The project uses Jakarta Validation for request validation.

Example:
- `@NotNull`
- `@NotBlank`
- `@Email`

---

# Database Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# How to Run the Project

## Clone Repository

```bash
git clone <your-repository-link>
```

## Open Project

Open the project in IntelliJ IDEA or any Java IDE.

## Install Dependencies

Maven will automatically install required dependencies.

## Run Application

Run the main Spring Boot application class.

---

# Future Enhancements

- JWT Authentication
- Role-Based Access
- Swagger Documentation
- Pagination & Sorting
- Docker Deployment
- Frontend Integration

---

# Learning Outcomes

This project helped in understanding:

- Spring Boot fundamentals
- REST API development
- Layered architecture
- DTO usage
- Validation handling
- Database operations using JPA & Hibernate
- Git and GitHub workflow

---

# Author

Richa  
Java Backend Developer
