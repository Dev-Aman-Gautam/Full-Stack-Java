# SELECT Query

## Introduction

The `SELECT` query is one of the most important SQL commands.

It is used to retrieve data from tables.

Using SELECT, we can:

- View records
- Filter data
- Sort results
- Analyze information
- Generate reports

Almost every SQL operation involves SELECT queries.

---

# Basic SELECT Syntax

## Syntax

```sql
SELECT column_name
FROM table_name;
```

---

# Example

```sql
SELECT name
FROM students;
```

This retrieves only the `name` column.

---

# Creating Sample Table

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT
);
```

---

# Insert Sample Data

```sql
INSERT INTO students
VALUES
(1, 'John', 20),
(2, 'Alice', 22),
(3, 'David', 21);
```

---

# Selecting All Columns

Use `*` to retrieve all columns.

---

# Syntax

```sql
SELECT *
FROM table_name;
```

---

# Example

```sql
SELECT *
FROM students;
```

---

# Output

| id | name | age |
|----|------|-----|
| 1 | John | 20 |
| 2 | Alice | 22 |
| 3 | David | 21 |

---

# Selecting Specific Columns

Example:

```sql
SELECT name, age
FROM students;
```

---

# Output

| name | age |
|------|-----|
| John | 20 |
| Alice | 22 |
| David | 21 |

---

# Using Column Aliases

Aliases rename columns temporarily.

---

# Syntax

```sql
SELECT column_name AS alias_name
FROM table_name;
```

---

# Example

```sql
SELECT name AS student_name
FROM students;
```

---

# Output

| student_name |
|--------------|
| John |
| Alice |
| David |

---

# Using Mathematical Expressions

Example:

```sql
SELECT salary * 12 AS yearly_salary
FROM employees;
```

---

# Selecting Constant Values

Example:

```sql
SELECT 'Hello SQL';
```

---

# Removing Duplicate Values

Use `DISTINCT`.

---

# Syntax

```sql
SELECT DISTINCT column_name
FROM table_name;
```

---

# Example

```sql
SELECT DISTINCT city
FROM customers;
```

---

# SELECT with WHERE Clause

Filters rows.

Example:

```sql
SELECT *
FROM students
WHERE age > 20;
```

---

# Output

| id | name | age |
|----|------|-----|
| 2 | Alice | 22 |
| 3 | David | 21 |

---

# SELECT with Multiple Conditions

Example:

```sql
SELECT *
FROM employees
WHERE salary > 50000
AND department = 'IT';
```

---

# Sorting Results

Use `ORDER BY`.

---

# Syntax

```sql
SELECT *
FROM table_name
ORDER BY column_name;
```

---

# Example

```sql
SELECT *
FROM students
ORDER BY age;
```

---

# Descending Order

```sql
SELECT *
FROM students
ORDER BY age DESC;
```

---

# Limiting Results

Use `LIMIT`.

---

# Example

```sql
SELECT *
FROM students
LIMIT 2;
```

---

# Output

| id | name | age |
|----|------|-----|
| 1 | John | 20 |
| 2 | Alice | 22 |

---

# Using OFFSET

Example:

```sql
SELECT *
FROM students
LIMIT 2 OFFSET 1;
```

---

# Aggregate Functions

SELECT works with aggregate functions.

---

# COUNT()

Counts rows.

Example:

```sql
SELECT COUNT(*)
FROM students;
```

---

# SUM()

Calculates total.

Example:

```sql
SELECT SUM(salary)
FROM employees;
```

---

# AVG()

Calculates average.

Example:

```sql
SELECT AVG(age)
FROM students;
```

---

# MAX()

Finds maximum value.

Example:

```sql
SELECT MAX(salary)
FROM employees;
```

---

# MIN()

Finds minimum value.

Example:

```sql
SELECT MIN(age)
FROM students;
```

---

# Using Expressions in SELECT

Example:

```sql
SELECT name,
       salary,
       salary * 0.10 AS bonus
FROM employees;
```

---

# Using CONCAT()

Example:

```sql
SELECT CONCAT(first_name, ' ', last_name) AS full_name
FROM users;
```

---

# SELECT with NULL Values

Example:

```sql
SELECT *
FROM employees
WHERE manager_id IS NULL;
```

---

# SELECT from Multiple Tables

Example:

```sql
SELECT employees.name,
       departments.department_name
FROM employees,
     departments;
```

---

# SQL Query Execution Order

Logical execution order:

1. FROM
2. WHERE
3. GROUP BY
4. HAVING
5. SELECT
6. ORDER BY
7. LIMIT

---

# Real-World Example

## E-Commerce Products

```sql
SELECT product_name, price
FROM products
WHERE stock > 0
ORDER BY price DESC;
```

Purpose:

- Display available products
- Show expensive items first

---

# Performance Considerations

Avoid:

```sql
SELECT *
```

in production systems.

Better:

```sql
SELECT id, name
FROM users;
```

Benefits:

- Faster queries
- Reduced memory usage
- Better optimization

---

# Common SELECT Errors

## Wrong Column Name

Wrong:

```sql
SELECT fullname
FROM students;
```

Correct:

```sql
SELECT name
FROM students;
```

---

# Missing Table

Wrong:

```sql
SELECT *
FROM unknown_table;
```

---

# Missing Quotes

Wrong:

```sql
WHERE name = John
```

Correct:

```sql
WHERE name = 'John'
```

---

# Best Practices

- Select only required columns
- Use aliases for readability
- Filter unnecessary data
- Use LIMIT when testing
- Avoid SELECT * in production

---

# Common Beginner Mistakes

- Using wrong column names
- Forgetting quotes
- Missing WHERE conditions
- Using SELECT * everywhere

---

# Practice Exercises

## Exercise 1

Display all students.

---

## Exercise 2

Display only student names.

---

## Exercise 3

Display students older than 20.

---

## Exercise 4

Sort students by age descending.

---

## Exercise 5

Show only first 3 students.

---

# Mini Project

Create queries for:

## Online Store

Retrieve:

- Expensive products
- Out-of-stock items
- Top 5 cheapest products
- Products sorted by stock

---

# Interview Questions

## Q1. What does SELECT do?

It retrieves data from database tables.

---

## Q2. Difference between SELECT * and specific columns?

| SELECT * | Specific Columns |
|----------|------------------|
| Retrieves all columns | Retrieves selected columns |

---

## Q3. What does DISTINCT do?

Removes duplicate values.

---

## Q4. Why avoid SELECT * in production?

Because it reduces performance and increases unnecessary data retrieval.

---

# Summary

In this chapter, you learned:

- SELECT syntax
- Selecting all columns
- Selecting specific columns
- Aliases
- DISTINCT
- ORDER BY
- LIMIT
- Aggregate functions
- Query best practices

You are now ready to filter data using the WHERE clause.

---

# Next Topic

➡ 09_WHERE_Clause.md