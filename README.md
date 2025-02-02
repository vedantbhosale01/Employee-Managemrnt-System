 
CRUD Application (Spring Boot + React + MySQL)

Overview

This project is a basic CRUD (Create, Read, Update, Delete) application built using:

Backend: Spring Boot

Frontend: React

Database: MySQL

The application allows users to be added, updated, deleted, and viewed.

Features

Add new users

View all users

Edit existing users

Delete users

Tech Stack

Backend:

Spring Boot

Spring Data JPA

Spring Web

MySQL Connector

Frontend:

React

Axios

Bootstrap

Database:

MySQL

Setup Instructions

Prerequisites

Java 17+

Node.js & npm

MySQL Server

Backend Setup

Clone the repository:

git clone <repository-url>

Navigate to the backend directory:

cd backend

Configure the MySQL database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update

Run the Spring Boot application:

mvn spring-boot:run

Frontend Setup

Navigate to the frontend directory:

cd frontend

Install dependencies:

npm install

Start the React application:

npm start

API Endpoints

Method

Endpoint

Description

GET

/users

Get all users

GET

/users/{id}

Get user by ID

POST

/users

Add a new user

PUT

/users/{id}

Update user by ID

DELETE

/users/{id}

Delete user by ID

