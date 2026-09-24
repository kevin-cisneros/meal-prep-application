# Meal Prep Application


> **Status:** Actively under development

## About the Project
A full-stack meal prep application that allows users to create, save, and search recipes and ingredients for household meal preparation. 

I created this project to reduce time spent repeatedly searching for the recipes across browser tabs, bookmarks, and screenshots. It provides 
one organized place to save meal ideas and quickly find the information needed when planning meals and finding past meals. 


## Current Functionality
- Create and retrieve ingredient data through Spring Boot REST API endpoints
- Create and retrieve recipe data through Spring Boot REST API endpoints
- Persist recipe and ingredient data in MySQL using Spring Data JPA and Hibernate
- Test API requests (`POST` and `GET`) and verify HTTP responses using Postman


## Planned Features
- [ ] Complete recipe-to-ingredient relationships, including quantities and units
- [ ] Add `PUT` endpoints to fully update recipes and ingredients
- [ ] Add `PATCH` endpoints to partially update recipes and ingredients
- [ ] Add `DELETE` endpoints for recipes and ingredients
- [ ] Add recipe and ingredient search and filtering
- [ ] Add server-side input validation and consistent API error responses
- [ ] Add user accounts and authentication
- [ ] Enforce user-specific ownership for recipes and ingredients
- [ ] Implement role-based access control for sensitive operations
- [ ] Add unit and integration tests
- [ ] Build an Angular frontend for creating, viewing, and managing recipes and ingredients
- [ ] Connect Angular frontend to Spring Boot REST API
- [ ] Deploy the application

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- REST APIs

### Database & Tools
- MySQL
- Postman for API testing
- Git and GitHub for version control

## Configuration

> **Note:** Database credentials are not included in this repository.

1. Copy `src/main/resources/application-example.properties`.
2. Rename the copied file to `application.properties`.
3. Replace `YOUR_MYSQL_USERNAME` and `YOUR_MYSQL_PASSWORD` with your local MySQL credentials.
4. Confirm that the database name in `spring.datasource.url` matches your local setup.
5. Do not commit `application.properties`.

## Architecture

The backend uses a layered architecture:

```text
Spring Boot REST Controllers
    ↓
Service Layer
    ↓
Repository Layer / Spring Data JPA
    ↓
MySQL Database
```

## Running Locally

### Prerequisites

- Java 17
- MySQL
- Maven or the Maven Wrapper

### Backend Setup

1. Clone this repository.
2. Configure `application.properties` as described in the [Configuration](#configuration) section.
3. Ensure MySQL is running locally.
4. Run the Spring Boot application from IntelliJ IDEA or Maven.

## API Testing

API endpoints are tested with Postman during development to verify request payloads,
HTTP status codes, response bodies, and MySQL database persistence.

Current testing includes `POST` requests to create recipe and ingredient data and
`GET` requests to retrieve saved records.

## Security Considerations

The project is being developed with secure application practices in mind.
Planned improvements include server-side validation, authentication, authorization,
user-specific ownership checks, role-based access control, and clear API error handling.

## Author

Kevin Cisneros 

Software Engineering Student, Western Governors University  
A.A.S. Cybersecurity | CompTIA Security+



