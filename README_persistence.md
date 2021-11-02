# Persistence with REST Controller

## Setup
- a new branch 'persistence' based on Greeting example was created
- For persistance we chose PostgresDB and for local development use docker-compose.yml
- _Book_ is the entity which is persisted.
- _BookResource_ provides the REST endpoints and uses _BookService_ to return all books of the DB and to find one Book by Id.
- _docker-compose.yml_ uses _init.sql_ to initialize the DB at container startup time
- In _application.properties_ contains the configuration the application needs to use the DB.

## Usage

- In terminal 1 invoke: ```docker-compose up```
- In terminal 2 invoke: ```./mvnw compile quarkus:dev```
- In browser go to: http://localhost:8080/
- Click on _Library_ link at bottom of page
- Click the individual links (All books, Book 1, ...) to see the JSON response

## Further Information

- https://quarkus.io/guides/hibernate-orm-panache
- https://quarkus.io/guides/resteasy-reactive
- https://www.morling.dev/blog/quarkus-and-testcontainers/
