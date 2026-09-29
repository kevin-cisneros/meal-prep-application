# Meal Prep Application


> **Status:** Actively under development

## About the Project
A full-stack meal prep application for creating, saving, and finding recipes for household meal planning 

I created this project to reduce time spent repeatedly searching for the recipes across browser tabs, bookmarks, and screenshots. It provides 
one organized place to save meal ideas and quickly find the information needed when planning meals and finding past meals. 


## Current Functionality
- Create recipes through a Spring Boot REST API
- Retrieve recipes through the API, including finding a recipe by ID
- Add an ingredient entry with a name, category, quantity, and unit to an existing recipe
- Save recipes and ingredient entries in MySQL using Spring Data JPA and Hibernate
- Test `POST` and `GET` requests using Postman
- Apply initial validation constraints to entity fields


## Planned Features
- [x] Link ingredient entries to an existing recipe
- [x] Return a complete recipe overview with its ingredient entries
- [ ] Submit recipe details and ingredients together from one form
- [ ] Add `PUT` and `PATCH` endpoints so owners can edit their own recipes
- [ ] Add `DELETE` endpoints with ownership checks
- [ ] Add recipe search and filtering
- [ ] Add consistent API error responses
- [ ] Add user accounts and authentication
- [ ] Let users share recipes without giving recipients permission to edit the original
- [ ] Let recipients create their own editable copy of a shared recipe
- [ ] Add unit and integration tests
- [ ] Build and connect the Angular frontend
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



