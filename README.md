# MS Teams API Integration

## Overview

This project is a Spring Boot application that integrates with **Microsoft Teams / Microsoft Graph API** to create and manage online meetings.

It provides a simple web UI using **Thymeleaf + Bootstrap**, stores meeting information using **Spring Data JPA + H2 Database**, and communicates with Microsoft Graph using OAuth2 client credentials.

The main goal of this project is to demonstrate backend integration with Microsoft Teams meeting creation and basic meeting persistence.

---

## Main Features

- Create Microsoft Teams online meetings using Microsoft Graph API
- OAuth2 authentication using Azure AD application credentials
- Store meeting information in H2 in-memory database
- Simple Thymeleaf UI for testing and management
- Bootstrap-based frontend
- REST + MVC controller structure
- Local development support with Spring Boot DevTools

---

## Technology Stack

- Java 20
- Spring Boot 2.7.16
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- Gson
- Microsoft Graph API
- Bootstrap
- Maven

---

## Project Structure

```text
src/main/java/com/contactcenterlab/msteamsdemo
│
├── Authentication.java        # OAuth token retrieval from Azure AD
├── Controllers.java           # Main web controllers
├── DemoApplication.java       # Spring Boot entry point
├── Meeting.java               # Business logic for meeting creation
│
├── config/
│   └── Configuration.java     # Application configuration
│
├── db/
│   └── TableModel.java        # Database entity model
│
├── graph/
│   ├── Token.java             # OAuth token response model
│   └── meeting/               # Microsoft Graph meeting DTOs
│
└── storage/
    └── MeetingStorageController.java
```

---

## Configuration

Application settings are located in:

```properties
src/main/resources/application.properties
```

### Required Azure AD / Graph API Settings

```properties
application.graphapi.user=user@example.com
application.graphapi.tenant=AZURE_TENANT_ID
application.graphapi.client_id=AZURE_API_CLIENT_ID
application.graphapi.client_secret=AZURE_API_CLIENT_SECRET
```

### Default Database Configuration

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
```

---

## Azure Configuration Requirements

You must create an Azure App Registration with permissions for Microsoft Graph.

Typical required permissions:

- `OnlineMeetings.ReadWrite.All`
- `User.Read.All`
- `Calendars.ReadWrite` (depending on implementation)

Admin consent is usually required.

Client credentials flow is used for authentication.

---

## Build and Run

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/MSTeamsIntegration-1.0.jar
```

---

## Local Access

After startup:

```text
http://localhost:8080
```

You can use the UI to test meeting creation and stored records.

---

## Notes

This project is a good integration prototype and proof-of-concept for Teams automation.

It is suitable for:

- internal scheduling tools
- contact center integrations
- CRM integrations
- callback scheduling workflows
- customer support meeting automation

For production usage, stronger security, observability, retries, and exception handling should be added.
