# Authors
- BONFIM FRANÇA Louise
- DO PRADO GONÇALVES Laura
- ROSA FREIRE SOUSA Camilla
- VILLANOVA VECCHIO Gustavo

# How to run the backend server
The back end consists of a database with information on the clients, the employees, the products for sale and the orders made via the app.

To run it, simply acess the local terminal on the automacorp folder using IntelliJ and run the command

    .\gradlew bootRun

While it's executing, it's connected to the frontend. You can open the webpages and they should be getting the data from the API.

The application is also hosted at the CleverCloud and accessible through the links:
- http://nixegourmet.cleverapps.io/swagger-ui/index.html
- https://app-cc00872f-6b7f-4087-b8fe-600c6cacd57d.cleverapps.io/swagger-ui/index.html

# Guide for developers

##**Overview**

This project is the backend, which likely serves as a culinary management or e-commerce platform. It handles order processing, customer management, employee management, and product management.

##**Project Structure**


The project follows a typical Spring Boot architecture, divided into several layers:

-**Controllers:** Responsible for communicating with clients via HTTP requests and responses.

-**Services:** Contain business logic and service logic.

-**Data Access Objects (DAOs):** Provide an abstract layer for any kind of database operation.

-**Data Transfer Objects (DTOs):** Used to transfer data between software sub-systems.

-**Mappers:** Assist in converting entities to DTOs and vice versa.

-**Entities:** Represent database tables and contain domain data.

-**Tests:** A suite of unit tests for DAOs that ensure the integrity of database operations.

##**Environment Setup**

Before starting development, ensure the following tools and dependencies are installed:

*JDK 11 or higher
*Gradle
*Your preferred IDE with support for Kotlin and Spring Boot (IntelliJ IDEA recommended)
