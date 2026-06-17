# SQL Syntax

## Introduction

SQL syntax refers to the rules and structure used to write SQL statements.

Every SQL query follows a specific format.

Understanding SQL syntax is important because:

- Queries must follow proper structure
- Databases only understand valid SQL commands
- Clean syntax improves readability
- Proper syntax reduces errors

---

# Basic SQL Query Structure

A simple SQL query looks like this:

```sql
SELECT column_name
FROM table_name;
```

Example:

```sql
SELECT name
FROM students;
```

---

# SQL Statements

SQL statements are instructions sent to the database.

Examples:

```sql
SELECT * FROM students;
```

```sql
INSERT INTO students VALUES (1, 'John');
```

```sql
DELETE FROM students WHERE id = 1;
```

---

# SQL is Case Insensitive

These queries are the same:

```sql
SELECT * FROM students;
```

```sql
select * from students;
```

However, best practice is to use uppercase for SQL keywords.

Recommended:

```sql
SELECT * FROM students;
```

---

# SQL Query Terminator

SQL statements usually end with:

```sql
;
```

Example:

```sql
SELECT * FROM employees;
```

---

# Understanding SQL Keywords

Keywords are reserved words used by SQL.

Examples:

- SELECT
- FROM
- WHERE
- INSERT
- UPDATE
- DELETE
- CREATE

Example:

```sql
SELECT * FROM products;
```

---

# Creating a Database

Syntax:

```sql
CREATE DATABASE database_name;
```

Example:

```sql
CREATE DATABASE company;
```

---

# Using a Database

MySQL syntax:

```sql
USE company;
```

---

# Creating Tables

## Syntax

```sql
CREATE TABLE table_name (
    column1 datatype,
    column2 datatype
);
```

---

# Example

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT
);
```

---

# Understanding Table Structure

| Column | Data Type |
|--------|------------|
| id | INT |
| name | VARCHAR |
| age | INT |

---

# SQL Data Types

## Numeric Types

| Type | Description |
|------|-------------|
| INT | Integer numbers |
| DECIMAL | Decimal numbers |
| FLOAT | Floating-point numbers |

---

## String Types

| Type | Description |
|------|-------------|
| CHAR | Fixed-length string |
| VARCHAR | Variable-length string |
| TEXT | Large text |

---

## Date & Time Types

| Type | Description |
|------|-------------|
| DATE | Date |
| TIME | Time |
| DATETIME | Date and time |

---

# Inserting Data

## Syntax

```sql
INSERT INTO table_name (column1, column2)
VALUES (value1, value2);
```

---

# Example

```sql
INSERT INTO students (id, name, age)
VALUES (1, 'John', 20);
```

---

# Selecting Data

## Select All Columns

```sql
SELECT * FROM students;
```

---

## Select Specific Columns

```sql
SELECT name, age
FROM students;
```

---

# Filtering Data

## WHERE Clause

```sql
SELECT *
FROM students
WHERE age > 18;
```

---

# Updating Data

## Syntax

```sql
UPDATE table_name
SET column_name = value
WHERE condition;
```

---

# Example

```sql
UPDATE students
SET age = 21
WHERE id = 1;
```

---

# Deleting Data

## Syntax

```sql
DELETE FROM table_name
WHERE condition;
```

---

# Example

```sql
DELETE FROM students
WHERE id = 1;
```

---

# SQL Comments

Comments are ignored by SQL.

---

## Single-line Comment

```sql
-- This is a comment
SELECT * FROM students;
```

---

## Multi-line Comment

```sql
/*
This is
a multi-line comment
*/
SELECT * FROM students;
```

---

# Naming Conventions

## Recommended Naming Rules

### Table Names

Use plural nouns.

Examples:

```text
students
employees
products
orders
```

---

## Column Names

Use descriptive names.

Good:

```text
first_name
email
created_at
```

Bad:

```text
fn
e
dt
```

---

# SQL Formatting Best Practices

Good formatting improves readability.

Recommended:

```sql
SELECT id, name, salary
FROM employees
WHERE salary > 50000
ORDER BY salary DESC;
```

Avoid:

```sql
select id,name,salary from employees where salary>50000;
```

---

# Common SQL Errors

## Missing Semicolon

Wrong:

```sql
SELECT * FROM students
```

Correct:

```sql
SELECT * FROM students;
```

---

## Misspelled Keywords

Wrong:

```sql
SELEC * FROM students;
```

Correct:

```sql
SELECT * FROM students;
```

---

## Missing WHERE Clause

Dangerous query:

```sql
DELETE FROM students;
```

This deletes ALL records.

Safer:

```sql
DELETE FROM students
WHERE id = 1;
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

# Example Query Breakdown

Query:

```sql
SELECT name, salary
FROM employees
WHERE salary > 50000
ORDER BY salary DESC;
```

Explanation:

| Clause | Purpose |
|--------|----------|
| SELECT | Choose columns |
| FROM | Specify table |
| WHERE | Filter rows |
| ORDER BY | Sort results |

---

# Real-World Example

Imagine an online store.

You want to display expensive products.

Query:

```sql
SELECT product_name, price
FROM products
WHERE price > 1000;
```

---

# Practice Exercises

## Exercise 1

Create database:

```sql
school
```

---

## Exercise 2

Create table:

```sql
CREATE TABLE teachers (
    id INT,
    name VARCHAR(100),
    subject VARCHAR(100)
);
```

---

## Exercise 3

Insert 3 teacher records.

---

## Exercise 4

Display all teachers.

---

## Exercise 5

Update one teacher name.

---

## Exercise 6

Delete one teacher record.

---

# Mini Challenge

Create a database for:

- Hospital
- Library
- Banking system

Requirements:

- At least 2 tables
- Insert sample records
- Run SELECT queries

---

# Best Practices

- Always use WHERE in UPDATE/DELETE
- Use meaningful names
- Write readable queries
- Use uppercase SQL keywords
- Format queries properly

---

# Common Beginner Mistakes

- Forgetting commas
- Missing semicolons
- Wrong table names
- Wrong column names
- Incorrect quotes

---

# Summary

In this chapter, you learned:

- SQL syntax basics
- Creating databases and tables
- Inserting data
- Selecting records
- Updating and deleting data
- SQL formatting rules
- Common SQL errors

You are now ready to learn database creation in detail.

---
