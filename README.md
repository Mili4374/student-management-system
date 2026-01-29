# Student Management System

A full stack Student Management System built using Spring Boot, Spring Data JPA, JWT Security, Thymeleaf, and MySQL. The application supports user authentication and complete student CRUD operations.

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security with JWT
- Thymeleaf
- MySQL
- Maven
- Tomcat (embedded)

## Features

- User registration and login using JWT authentication
- Secure endpoints with Spring Security
- Add new student
- View student list
- Update student details
- Delete student
- Server side rendering with Thymeleaf
- MySQL database integration
- JPA based persistence

## Project Structure

-controller
-service
-repository
-entity
-security
-templates
-config

## Database Configuration

-Update application.properties:
-spring.datasource.url=jdbc:mysql://localhost:3308/dac_feb
-spring.datasource.username=YOUR_USERNAME
-spring.datasource.password=YOUR_PASSWORD
-spring.jpa.hibernate.ddl-auto=update
-spring.jpa.show_sql=true


## JWT Configuration

jwt.secret=your_secret_key
jwt.expiration=3600000


## Run Locally

1. Clone the repository
-https://github.com/Mili4374/student-management-system.git
2. Open in your IDE
3. Configure MySQL database
4. Run the main Spring Boot application class

## Default Flow

Register → Login → Manage Students → Add / Edit / Delete

## Author

Mili Singh




