# WHERE Clause

## Introduction

The `WHERE` clause is used to filter records in SQL queries.

It allows us to retrieve only the rows that match specific conditions.

Without `WHERE`, SQL returns all rows.

The WHERE clause is commonly used with:

- SELECT
- UPDATE
- DELETE

---

# Basic WHERE Syntax

## Syntax

```sql
SELECT column_name
FROM table_name
WHERE condition;
```

---

# Example Table

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT,
    city VARCHAR(100)
);
```

---

# Sample Data

```sql
INSERT INTO students
VALUES
(1, 'John', 20, 'New York'),
(2, 'Alice', 22, 'London'),
(3, 'David', 19, 'Paris'),
(4, 'Emma', 21, 'London');
```

---

# Simple WHERE Example

```sql
SELECT *
FROM students
WHERE age > 20;
```

---

# Output

| id | name | age | city |
|----|------|-----|------|
| 2 | Alice | 22 | London |
| 4 | Emma | 21 | London |

---

# Comparison Operators

| Operator | Meaning |
|----------|---------|
| = | Equal |
| != | Not equal |
| <> | Not equal |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal |
| <= | Less than or equal |

---

# Equal Operator

Example:

```sql
SELECT *
FROM students
WHERE city = 'London';
```

---

# Not Equal Operator

Example:

```sql
SELECT *
FROM students
WHERE city != 'London';
```

---

# Greater Than Operator

Example:

```sql
SELECT *
FROM students
WHERE age > 20;
```

---

# Less Than Operator

Example:

```sql
SELECT *
FROM students
WHERE age < 21;
```

---

# Greater Than or Equal

Example:

```sql
SELECT *
FROM students
WHERE age >= 21;
```

---

# Less Than or Equal

Example:

```sql
SELECT *
FROM students
WHERE age <= 20;
```

---

# Using WHERE with Strings

Example:

```sql
SELECT *
FROM students
WHERE name = 'John';
```

Strings must be inside quotes.

---

# Using WHERE with Numbers

Example:

```sql
SELECT *
FROM students
WHERE age = 22;
```

Numbers usually do not require quotes.

---

# Multiple Conditions with AND

`AND` requires all conditions to be true.

---

# Example

```sql
SELECT *
FROM students
WHERE age > 20
AND city = 'London';
```

---

# Output

| id | name | age | city |
|----|------|-----|------|
| 2 | Alice | 22 | London |
| 4 | Emma | 21 | London |

---

# Multiple Conditions with OR

`OR` requires at least one condition to be true.

---

# Example

```sql
SELECT *
FROM students
WHERE city = 'London'
OR city = 'Paris';
```

---

# Using NOT Operator

Negates conditions.

---

# Example

```sql
SELECT *
FROM students
WHERE NOT city = 'London';
```

---

# Combining AND and OR

Example:

```sql
SELECT *
FROM students
WHERE age > 20
AND (city = 'London' OR city = 'Paris');
```

---

# WHERE with BETWEEN

Used for ranges.

---

# Syntax

```sql
WHERE column BETWEEN value1 AND value2
```

---

# Example

```sql
SELECT *
FROM students
WHERE age BETWEEN 20 AND 22;
```

---

# WHERE with IN

Used to match multiple values.

---

# Example

```sql
SELECT *
FROM students
WHERE city IN ('London', 'Paris');
```

---

# WHERE with LIKE

Used for pattern matching.

---

# Example

```sql
SELECT *
FROM students
WHERE name LIKE 'J%';
```

This matches names starting with J.

---

# Common LIKE Patterns

| Pattern | Meaning |
|---------|---------|
| 'J%' | Starts with J |
| '%n' | Ends with n |
| '%oh%' | Contains oh |
| '_' | Single character |

---

# WHERE with NULL Values

Use `IS NULL`.

---

# Example

```sql
SELECT *
FROM employees
WHERE manager_id IS NULL;
```

---

# NOT NULL Example

```sql
SELECT *
FROM employees
WHERE manager_id IS NOT NULL;
```

---

# WHERE with Dates

Example:

```sql
SELECT *
FROM employees
WHERE joining_date > '2025-01-01';
```

---

# WHERE with UPDATE

Example:

```sql
UPDATE students
SET city = 'Berlin'
WHERE id = 1;
```

---

# WHERE with DELETE

Example:

```sql
DELETE FROM students
WHERE id = 3;
```

---

# Dangerous Query Without WHERE

⚠ Warning:

```sql
DELETE FROM students;
```

This deletes ALL rows.

---

# Real-World Example

## E-Commerce Products

```sql
SELECT product_name, price
FROM products
WHERE stock > 0
AND price < 50000;
```

Purpose:

- Show available products
- Filter affordable items

---

# Query Execution Example

Query:

```sql
SELECT *
FROM students
WHERE age > 20;
```

Execution process:

1. Read students table
2. Check each row
3. Keep rows matching condition
4. Return results

---

# Performance Considerations

WHERE clause improves performance by:

- Filtering unnecessary rows
- Reducing memory usage
- Speeding up queries

---

# Using Indexes with WHERE

Indexes improve WHERE clause performance.

Example:

```sql
CREATE INDEX idx_city
ON students(city);
```

---

# Common WHERE Errors

## Missing Quotes

Wrong:

```sql
WHERE city = London
```

Correct:

```sql
WHERE city = 'London'
```

---

# Using = with NULL

Wrong:

```sql
WHERE manager_id = NULL
```

Correct:

```sql
WHERE manager_id IS NULL
```

---

# Incorrect Logic

Wrong:

```sql
WHERE age > 20 OR city = 'London'
```

Can return unexpected rows.

Use parentheses when needed.

---

# Best Practices

- Always use WHERE carefully
- Use indexes on filtered columns
- Avoid unnecessary conditions
- Use parentheses for complex logic
- Test DELETE and UPDATE queries first

---

# Common Beginner Mistakes

- Forgetting quotes
- Using DELETE without WHERE
- Incorrect logical conditions
- Using = NULL instead of IS NULL

---

# Practice Exercises

## Exercise 1

Display students older than 20.

---

## Exercise 2

Display students from London.

---

## Exercise 3

Display students from London or Paris.

---

## Exercise 4

Display students between ages 18 and 22.

---

## Exercise 5

Find names starting with A.

---

# Mini Project

## Employee Database

Write queries to:

- Find high-salary employees
- Find employees from a city
- Find employees hired after a date
- Find inactive employees

---

# Interview Questions

## Q1. What does WHERE clause do?

It filters rows based on conditions.

---

## Q2. Difference between AND and OR?

| AND | OR |
|-----|----|
| All conditions must match | Any condition can match |

---

## Q3. Why is WHERE important in DELETE?

It prevents accidental deletion of all rows.

---

## Q4. Difference between = NULL and IS NULL?

| = NULL | IS NULL |
|---------|----------|
| Incorrect | Correct |

---

# Summary

In this chapter, you learned:

- WHERE clause syntax
- Comparison operators
- AND, OR, NOT
- BETWEEN
- IN
- LIKE
- NULL handling
- WHERE with UPDATE and DELETE
- Query filtering best practices

You are now ready to sort query results using ORDER BY.

---

# Next Topic

➡ 10_ORDER_BY.md