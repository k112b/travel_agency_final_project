CREATE DATABASE `travel_agency`;

USE `travel_agency`;
-- Create tables etc.

CREATE TABLE `continents` (
   `id` INT AUTO_INCREMENT PRIMARY KEY,
   `continent_name` VARCHAR(255) NOT NULL UNIQUE
);

INSERT INTO continents(continent_name)
VALUES('Africa'),
      ('Asia'),
      ('Europe'),
      ('North America'),
      ('South America'),
      ('Antarctica'),
      ('Australia');

-- CREATE USER 'agency_user' IDENTIFIED BY 'agency_pass';
-- GRANT ALL on travel_agency.* TO 'agency_user';
