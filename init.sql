DROP TABLE IF EXISTS book;
CREATE TABLE IF NOT EXISTS book (
    id serial PRIMARY KEY,
    title VARCHAR ( 50 ) NOT NULL,
    author VARCHAR ( 50 ) NOT NULL
    );
CREATE TABLE IF NOT EXISTS author (
    id serial PRIMARY KEY,
    name varchar(50) not null,
    surname varchar(50) not null
);
