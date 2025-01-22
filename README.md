# Employee Management System

This project is designed as a coding challenge for Java developers. It includes a set of tasks to test fundamental skills like implementing REST APIs, working with databases, validation, and testing.

## Project Overview

The system manages employees and products. Key functionalities include:
1.	CRUD operations for managing employees.
2.	Validation of employee data.
3.	CRUD operations for managing products.
4.	REST API design.
5.	Integration with a database (H2 or in-memory).
6.	Writing unit and integration tests.

## Requirements

#### Implement Product Service/Controller that includes methods based on mocked repository data:

Product model schema can be fetched from data.sql contents

ProductService has already some methods defined, please implement those:
1.	Product Filtering:
      •	List all products with a price greater than 500.
2.	Product Grouping:
      •	Group products by category.
3.	Statistics:
      •	Calculate the average price of products in each category.
4.	Most Expensive Product:
      •	Find the most expensive product in each category.
5.	List of Product Names:
      •	Return a list of all product names as a single string, separated by commas.

Add ProductController and ProductRepository to provide CRUD operations. Remember about unit tests. 

#### Employee model + Validation

1.	Employee data includes:
- firstName (required, minimum 2 characters).
- lastName (required, minimum 2 characters).
- email (required, valid email format).
- phoneNumber (optional, valid phone number format).
- dateOfBirth (optional, cannot be in the future).
- salary (optional, must be greater than or equal to 0).

Write REST controller that:
- Accepts input.
- Validates the input using the rules above.
- Displays error messages for invalid input.
- Displays the valid employee data.

#### Test brand new API

Just run few API calls to check if its working properly
