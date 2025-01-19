# Rewards Program API

This is a simple web-based API designed to calculate reward points for customers based on their purchases. The API is built using **Spring Boot** and follows **RESTful** principles. It offers an endpoint to calculate the reward points for each customer, based on the amount spent in a transaction.

## Features

### Calculate Rewards

The application calculates rewards based on the amount spent, giving customers:
- **2 points** for every dollar spent over **$100**.
- **1 point** for every dollar spent between **$50** and **$100**.

### Example:

For a purchase of **$120**, the reward points would be:

- 2 points for each dollar over $100: 2 × $20 = **40 points**
- 1 point for each dollar between $50 and $100: 1 × $50 = **50 points**

**Total points = 40 + 50 = 90 points**

## Technologies Used:
- **Java 8**
- **Spring Boot** for building the API
- **Spring Data JPA** for database interactions
- **Maven** for dependency management
- **Postman** or any HTTP client to interact with the API.

## How to Run:

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Build the project using Maven.
4. Run the Spring Boot application.

   The application will start running on `http://localhost:8080` by default.

## API Endpoints:

### `GET /api/rewards/calculate`

This endpoint calculates the reward points for a given amount.

- **Request:**

   Use the endpoint to provide the total transaction amount (in dollars).

   Example: `http://localhost:8080/api/rewards/calculate?amount=120`

- **Response:**

   A response with the calculated reward points for the transaction.

   Example:

   
     "points": 90
