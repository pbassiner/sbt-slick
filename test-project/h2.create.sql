CREATE SCHEMA IF NOT EXISTS TEST_DB;
CREATE TABLE IF NOT EXISTS Users(USER_ID INT PRIMARY KEY, NAME VARCHAR(255));
CREATE TABLE IF NOT EXISTS Address(USER_ID INT PRIMARY KEY, STREET VARCHAR(255), CITY VARCHAR(255))
