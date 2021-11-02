DROP TABLE IF EXISTS book;
CREATE TABLE IF NOT EXISTS book (
    id serial PRIMARY KEY,
    title VARCHAR ( 50 ) NOT NULL,
    author VARCHAR ( 50 ) NOT NULL
    );
