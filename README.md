# Movie Review Application

## Overview

This application is built with Spring Boot and MongoDB. It provides RESTful endpoints for managing movies and reviews.

## Technologies Used

- **Spring Boot**: Framework for building the REST API
- **MongoDB**: Database for storing movie and review data

## Endpoints

### 1. Add a Movie Review

- **Endpoint**: `POST /api/v1/reviews`
- **Description**: Adds a new movie review.
- **Request Body**: JSON object with movie review details.
- **Response**: Confirmation of review addition.

### 2. Get All Movies

- **Endpoint**: `GET /api/v1/movies`
- **Description**: Retrieves a list of all movies.
- **Response**: JSON array of movie objects.

### 3. Get Movie by ID

- **Endpoint**: `GET /api/v1/movies/{id}`
- **Description**: Retrieves a specific movie by its ID.
- **Response**: JSON object of the movie with the specified ID.
