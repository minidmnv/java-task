-- Insert employees
INSERT INTO employees (id, first_name, last_name, email, phone_number, date_of_birth, salary)
VALUES (1, 'John', 'Doe', 'john.doe@example.com', '+1234567890', '1990-01-01', 50000),
       (2, 'Jane', 'Smith', 'jane.smith@example.com', '+0987654321', '1985-05-15', 60000),
       (3, 'Mike', 'Johnson', 'mike.johnson@example.com', NULL, '1995-03-20', 45000);

-- Insert products
INSERT INTO products (id, name, category, price)
VALUES (1, 'Laptop', 'Electronics', 1500.0),
       (2, 'Smartphone', 'Electronics', 800.0),
       (3, 'Desk', 'Furniture', 200.0),
       (4, 'Chair', 'Furniture', 100.0);
