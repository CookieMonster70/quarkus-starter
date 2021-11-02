CREATE ROLE quarkus WITH LOGIN PASSWORD 'quarkus';
CREATE DATABASE quarkus_starter_db;
GRANT ALL PRIVILEGES ON DATABASE quarkus_starter_db TO quarkus;
\c quarkus_starter_db

CREATE TABLE IF NOT EXISTS book (
    id serial PRIMARY KEY,
    title VARCHAR ( 50 ) NOT NULL,
    author VARCHAR ( 50 ) NOT NULL
    );
