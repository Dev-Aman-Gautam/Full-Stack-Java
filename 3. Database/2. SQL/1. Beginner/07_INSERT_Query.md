# INSERT Query

## Introduction

The `INSERT` query is used to add new records into a table.

Using INSERT, we can:

- Add users
- Store products
- Save transactions
- Insert employee data
- Populate databases

Without INSERT, tables remain empty.

---

# Basic INSERT Syntax

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

# Understanding the Query

| Part | Description |
|------|-------------|
| INSERT INTO | Specifies table |
| students | Table name |
| (id, name, age) | Columns |
| VALUES | Data to insert |

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

# Inserting Single Row

Example:

```sql
INSERT INTO students (id, name, age)
VALUES (2, 'Alice', 22);
```

---

# Viewing Inserted Data

```sql
SELECT * FROM students;
```

---

# Output

| id | name | age |
|----|------|-----|
| 1 | John | 20 |
| 2 | Alice | 22 |

---

# Inserting Multiple Rows

SQL allows inserting multiple records at once.

---

# Syntax

```sql
INSERT INTO table_name (column1, column2)
VALUES
(value1, value2),
(value3, value4);
```

---

# Example

```sql
INSERT INTO students (id, name, age)
VALUES
(3, 'David', 21),
(4, 'Emma', 23),
(5, 'Sophia', 19);
```

---

# INSERT Without Column Names

If values match table order exactly:

```sql
INSERT INTO students
VALUES (6, 'Michael', 24);
```

---

# Why Specifying Column Names is Better

Recommended:

```sql
INSERT INTO students (id, name, age)
VALUES (7, 'Chris', 22);
```

Benefits:

- Safer
- More readable
- Works even if table changes

---

# INSERT with NULL Values

Example:

```sql
INSERT INTO students (id, name, age)
VALUES (8, 'Kevin', NULL);
```

---

# INSERT with DEFAULT Values

Example table:

```sql
CREATE TABLE employees (
    id INT,
    name VARCHAR(100),
    status VARCHAR(20) DEFAULT 'active'
);
```

Insert:

```sql
INSERT INTO employees (id, name)
VALUES (1, 'John');
```

Result:

```text
status = active
```

---

# INSERT into AUTO_INCREMENT Table

Example:

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);
```

Insert:

```sql
INSERT INTO users (name)
VALUES ('John');
```

Database automatically generates ID.

---

# Inserting Date Values

Example:

```sql
INSERT INTO employees (
    id,
    name,
    joining_date
)
VALUES (
    1,
    'John',
    '2025-01-15'
);
```

---

# Inserting Boolean Values

Example:

```sql
INSERT INTO users (
    id,
    name,
    is_active
)
VALUES (
    1,
    'Alice',
    TRUE
);
```

---

# Inserting Large Text

Example:

```sql
INSERT INTO articles (
    title,
    content
)
VALUES (
    'SQL Basics',
    'This article explains SQL.'
);
```

---

# Real-World Example

## E-Commerce Products Table

```sql
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(200),
    price DECIMAL(10,2),
    stock INT
);
```

Insert records:

```sql
INSERT INTO products (
    product_name,
    price,
    stock
)
VALUES
('Laptop', 75000, 10),
('Mouse', 1200, 50),
('Keyboard', 2500, 25);
```

---

# INSERT Using SELECT

Copy data from another table.

---

# Syntax

```sql
INSERT INTO table2
SELECT * FROM table1;
```

---

# Example

```sql
INSERT INTO backup_students
SELECT * FROM students;
```

---

# Handling Duplicate Values

If table contains UNIQUE constraints:

Example:

```sql
email VARCHAR(100) UNIQUE
```

Duplicate inserts will fail.

---

# Example Error

```text
Duplicate entry for key
```

---

# INSERT IGNORE (MySQL)

Ignores duplicate errors.

Example:

```sql
INSERT IGNORE INTO users (email)
VALUES ('john@gmail.com');
```

---

# REPLACE INTO (MySQL)

Replaces existing rows.

Example:

```sql
REPLACE INTO users (
    id,
    name
)
VALUES (
    1,
    'John Updated'
);
```

---

# INSERT Performance Tips

## Batch Inserts

Better:

```sql
INSERT INTO products VALUES
(...),
(...),
(...);
```

Instead of many separate INSERT statements.

---

# Transactions for Bulk Inserts

Example:

```sql
START TRANSACTION;

INSERT INTO users VALUES (...);

COMMIT;
```

---

# Common INSERT Errors

## Column Count Mismatch

Wrong:

```sql
INSERT INTO students (id, name)
VALUES (1);
```

Correct:

```sql
INSERT INTO students (id, name)
VALUES (1, 'John');
```

---

# Wrong Data Type

Wrong:

```sql
INSERT INTO students (age)
VALUES ('abc');
```

Correct:

```sql
INSERT INTO students (age)
VALUES (20);
```

---

# NULL Constraint Error

Example:

```sql
name VARCHAR(100) NOT NULL
```

Wrong:

```sql
INSERT INTO students (name)
VALUES (NULL);
```

---

# SQL Injection Warning

Never directly insert user input.

Dangerous:

```sql
"INSERT INTO users VALUES ('" + userInput + "')"
```

Use:

- Prepared statements
- Parameterized queries

---

# Best Practices

- Always specify column names
- Use batch inserts
- Validate data before insert
- Use transactions for large operations
- Avoid duplicate data

---

# Common Beginner Mistakes

- Missing values
- Wrong column order
- Wrong data types
- Ignoring constraints
- Forgetting quotes around strings

---

# Practice Exercises

## Exercise 1

Create table:

```sql
employees
```

Insert 5 employee records.

---

## Exercise 2

Insert multiple rows into products table.

---

## Exercise 3

Insert NULL values into optional columns.

---

## Exercise 4

Create AUTO_INCREMENT table and insert data.

---

# Mini Project

Create and populate:

## Online Store Database

Tables:

- users
- products
- orders

Insert:

- 10 users
- 10 products
- 5 orders

---

# Interview Questions

## Q1. What does INSERT do?

It adds new rows into a table.

---

## Q2. Why specify column names?

For readability, safety, and flexibility.

---

## Q3. Difference between INSERT and UPDATE?

| INSERT | UPDATE |
|--------|---------|
| Adds new rows | Modifies existing rows |

---

## Q4. What is AUTO_INCREMENT?

Automatically generates sequential IDs.

---

# Summary

In this chapter, you learned:

- INSERT query syntax
- Inserting single rows
- Inserting multiple rows
- NULL and DEFAULT values
- AUTO_INCREMENT
- Batch inserts
- INSERT best practices
- Common INSERT errors

You are now ready to retrieve data using SELECT queries.

---

# Next Topic

➡ 08_SELECT_Query.md