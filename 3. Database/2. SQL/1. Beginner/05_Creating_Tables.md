# Creating Tables

## Introduction

Tables are the core building blocks of a relational database.

A table stores data in:

- Rows
- Columns

Every database application uses tables to organize information.

Examples:

| Application | Possible Tables |
|-------------|----------------|
| School System | students, teachers |
| E-commerce | products, orders |
| Banking | accounts, transactions |

---

# What is a Table?

A table is a structured collection of related data.

Example:

## students Table

| id | name | age |
|----|------|-----|
| 1 | John | 20 |
| 2 | Alice | 22 |

---

# Table Components

## 1. Rows

Rows represent records.

Example:

```text
1 | John | 20
```

This is one row.

---

## 2. Columns

Columns represent fields or attributes.

Example:

| Column |
|--------|
| id |
| name |
| age |

---

# SQL Command to Create Table

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

# Understanding the Example

| Column | Data Type | Description |
|--------|------------|-------------|
| id | INT | Student ID |
| name | VARCHAR(100) | Student name |
| age | INT | Student age |

---

# Common SQL Data Types

## Numeric Data Types

| Data Type | Description |
|-----------|-------------|
| INT | Integer values |
| BIGINT | Large integers |
| DECIMAL | Precise decimal numbers |
| FLOAT | Floating point numbers |

---

## String Data Types

| Data Type | Description |
|-----------|-------------|
| CHAR | Fixed-length text |
| VARCHAR | Variable-length text |
| TEXT | Large text |

---

## Date and Time Types

| Data Type | Description |
|-----------|-------------|
| DATE | Date only |
| TIME | Time only |
| DATETIME | Date and time |

---

# Creating a Table with Multiple Data Types

Example:

```sql
CREATE TABLE employees (
    id INT,
    name VARCHAR(100),
    salary DECIMAL(10,2),
    joining_date DATE
);
```

---

# Table Naming Conventions

## Recommended Naming Rules

- Use lowercase names
- Use plural table names
- Use meaningful names

Good examples:

```text
students
employees
products
customer_orders
```

Bad examples:

```text
tbl1
data
abc
```

---

# Column Naming Conventions

Good examples:

```text
first_name
email
created_at
salary
```

Bad examples:

```text
fn
e
dt
```

---

# Viewing Tables

## MySQL

```sql
SHOW TABLES;
```

---

# Viewing Table Structure

## MySQL

```sql
DESCRIBE students;
```

---

# Example Output

| Field | Type |
|------|------|
| id | int |
| name | varchar(100) |
| age | int |

---

# Creating Table with Constraints

Constraints enforce rules on data.

---

# NOT NULL Constraint

Prevents empty values.

Example:

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100) NOT NULL
);
```

---

# UNIQUE Constraint

Prevents duplicate values.

Example:

```sql
CREATE TABLE users (
    email VARCHAR(100) UNIQUE
);
```

---

# PRIMARY KEY Constraint

Uniquely identifies each row.

Example:

```sql
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100)
);
```

---

# AUTO_INCREMENT

Automatically increases values.

Example:

```sql
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);
```

---

# DEFAULT Constraint

Provides default values.

Example:

```sql
CREATE TABLE employees (
    status VARCHAR(20) DEFAULT 'active'
);
```

---

# CHECK Constraint

Validates values.

Example:

```sql
CREATE TABLE students (
    age INT CHECK (age >= 18)
);
```

---

# FOREIGN KEY Constraint

Creates relationships between tables.

Example:

```sql
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    FOREIGN KEY (customer_id)
    REFERENCES customers(id)
);
```

---

# Creating a Real-World Table

Example:

```sql
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(200) NOT NULL,
    price DECIMAL(10,2),
    stock INT DEFAULT 0,
    created_at DATETIME
);
```

---

# Temporary Tables

Temporary tables exist only during the session.

Example:

```sql
CREATE TEMPORARY TABLE temp_users (
    id INT,
    name VARCHAR(100)
);
```

---

# Renaming a Table

## Syntax

```sql
RENAME TABLE old_name TO new_name;
```

---

# Example

```sql
RENAME TABLE students TO college_students;
```

---

# Deleting a Table

## Syntax

```sql
DROP TABLE table_name;
```

---

# Example

```sql
DROP TABLE students;
```

⚠ Warning:

This permanently deletes:

- Table structure
- Data
- Relationships

---

# Safe Table Deletion

Example:

```sql
DROP TABLE IF EXISTS students;
```

---

# Truncating a Table

Removes all rows but keeps table structure.

Example:

```sql
TRUNCATE TABLE students;
```

---

# Difference Between DROP and TRUNCATE

| DROP | TRUNCATE |
|------|-----------|
| Deletes table | Deletes rows only |
| Removes structure | Keeps structure |

---

# Real-World Example

## E-Commerce Database

### users Table

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE
);
```

---

### products Table

```sql
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(200),
    price DECIMAL(10,2)
);
```

---

### orders Table

```sql
CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    total DECIMAL(10,2),
    FOREIGN KEY (user_id)
    REFERENCES users(id)
);
```

---

# Best Practices

- Use PRIMARY KEY
- Use meaningful names
- Add constraints properly
- Avoid unnecessary columns
- Normalize data

---

# Common Beginner Mistakes

- Wrong data types
- Missing PRIMARY KEY
- Poor naming conventions
- Forgetting constraints
- Using too many NULL values

---

# Practice Exercises

## Exercise 1

Create table:

```sql
teachers
```

Columns:

- id
- name
- subject

---

## Exercise 2

Create table:

```sql
courses
```

Columns:

- id
- course_name
- duration

---

## Exercise 3

Add PRIMARY KEY.

---

## Exercise 4

Add UNIQUE email column.

---

## Exercise 5

Create relationship between two tables.

---

# Mini Project

Create tables for:

## Library System

Tables:

- books
- members
- borrow_records

---

## Banking System

Tables:

- customers
- accounts
- transactions

---

# Interview Questions

## Q1. What is a table?

A table is a collection of related data organized in rows and columns.

---

## Q2. What is a PRIMARY KEY?

A column that uniquely identifies each row.

---

## Q3. Difference between CHAR and VARCHAR?

| CHAR | VARCHAR |
|------|----------|
| Fixed length | Variable length |

---

## Q4. What is a FOREIGN KEY?

A column that creates relationship between tables.

---

# Summary

In this chapter, you learned:

- What tables are
- Creating tables
- Data types
- Constraints
- Primary keys
- Foreign keys
- Renaming and deleting tables

You are now ready to learn SQL data types in detail.

---

# Next Topic

➡ 06_Data_Types.md