DROP DATABASE IF EXISTS adlister_db;
CREATE DATABASE adlister_db;
USE adlister_db;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    userName VARCHAR(50),
    email VARCHAR (50),
    password VARCHAR (50)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(50),
    description VARCHAR(250),
    FOREIGN KEY (user_id) REFERENCES users (id)
);