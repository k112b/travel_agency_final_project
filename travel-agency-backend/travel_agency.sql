DROP DATABASE IF EXISTS `travel_agency`;
CREATE DATABASE `travel_agency`;

USE `travel_agency`;
-- Create tables etc.

CREATE TABLE `continents` (
   `id` INT AUTO_INCREMENT PRIMARY KEY,
   `continent_name` VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE `countries` (
   `id` INT AUTO_INCREMENT PRIMARY KEY,
   `country_name` VARCHAR(255) NOT NULL UNIQUE,
   `continent_id` INT,
   FOREIGN KEY (`continent_id`) REFERENCES `continents`(`id`)
);

CREATE TABLE `cities` (
   `id` INT AUTO_INCREMENT PRIMARY KEY,
   `city_name` VARCHAR(255) NOT NULL UNIQUE,
   `country_id` INT,
   FOREIGN KEY (`country_id`) REFERENCES `countries`(`id`)
);

INSERT INTO continents(continent_name)
VALUES('Africa'),
      ('Asia'),
      ('Europe'),
      ('North America'),
      ('South America'),
      ('Antarctica'),
      ('Australia');

INSERT INTO countries(country_name, continent_id)
VALUES('Estonia', 3),
      ('Finland', 3),
      ('Russia', 3),
      ('Latvia', 3),
      ('Lithuania', 3);

INSERT INTO cities(city_name, country_id)
VALUES('Tallinn', 1),
      ('Helsinki', 2);

-- CREATE USER 'agency_user' IDENTIFIED BY 'agency_pass';
-- GRANT ALL on travel_agency.* TO 'agency_user';
