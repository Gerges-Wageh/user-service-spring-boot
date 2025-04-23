# User Management API - Spring Boot

A clean and simple **User Management REST API** built using **Java Spring Boot**, following a layered N-tier architecture enhanced with a dedicated **Mapper layer** for data transformation.

---

## 🧱 Architecture Overview

The project follows the **N-tier architecture** with a clear separation of concerns:

- **Controller Layer**: Handles incoming HTTP requests and maps them to service methods.
- **Service Layer**: Contains the business logic and acts as an intermediary between controllers, mappers, and repositories.
- **Mapper Layer**: Converts between `Entity` and `DTO` objects, ensuring clean data transformation.
- **Repository Layer**: Interfaces with the database using Spring Data JPA.
- **DTOs (Data Transfer Objects)**: Lightweight classes used to safely transfer data between layers.
- **Entity Layer**: Represents the database model using JPA.

This structure enhances testability, scalability, and maintainability.

---

## 📁 Project Structure
<pre>
src/main/java/com/stunning/userService/
├── controller/               # REST Controllers
│   └── UserController.java
│
├── dto/                      # Data Transfer Objects
│   └── UserDTO.java
│
├── mapper/                   # Mapper Layer
│   └── UserMapper.java
│
├── model/                    # JPA Entities
│   └── User.java
│
├── repository/               # Spring Data JPA Repositories
│   └── UserRepository.java
│
├── service/                  # Business Logic Layer
│   ├── UserService.java
│   └── UserServiceImp.java
│
└── UserServiceApplication.java       # Application Entry Point
</pre>
