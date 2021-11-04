DROP TABLE IF EXISTS book;
CREATE TABLE IF NOT EXISTS book (
    id bigserial PRIMARY KEY,
    title VARCHAR ( 50 ) NOT NULL,
    author VARCHAR ( 50 ) NOT NULL
    );
CREATE TABLE IF NOT EXISTS author (
    id bigserial PRIMARY KEY,
    name varchar(50) not null,
    surname varchar(50) not null
);
DELETE FROM book;
INSERT INTO book (title, author) VALUES ('Java for Beginners', 'Java Guru');
INSERT INTO book (title, author) VALUES ('Angular for Beginners', 'Angular Guru');
INSERT INTO book (title, author) VALUES ('title', 'author');

DELETE FROM author;
INSERT INTO author (name, surname) VALUES ('name1', 'surname 1');
INSERT INTO author (name, surname) VALUES ('name2', 'surname 2');
INSERT INTO author (name, surname) VALUES ('name3', 'surname 3');

