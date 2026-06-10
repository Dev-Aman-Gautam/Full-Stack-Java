# Data Types

## Introduction

Data types define the kind of data a column can store.

Choosing the correct data type is very important because it affects:

- Storage size
- Performance
- Accuracy
- Validation
- Query optimization

Every column in a table must have a data type.

Example:

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT
);
```

Here:

| Column | Data Type |
|--------|------------|
| id | INT |
| name | VARCHAR(100) |
| age | INT |

---

# Why Data Types Matter

Using proper data types helps:

- Save storage
- Improve speed
- Prevent invalid data
- Maintain consistency

Example:

Age should use:

```sql
INT
```

Not:

```sql
VARCHAR
```

---

# Categories of SQL Data Types

Main categories:

1. Numeric Data Types
2. String Data Types
3. Date and Time Data Types
4. Boolean Data Types
5. Binary Data Types

---

# 1. Numeric Data Types

Used for numbers.

---

# INT

Stores integer values.

Example:

```sql
age INT
```

Valid values:

```text
10
25
100
```

---

# BIGINT

Stores very large integers.

Example:

```sql
population BIGINT
```

---

# SMALLINT

Stores smaller integer values.

Example:

```sql
rating SMALLINT
```

---

# TINYINT

Stores tiny integer values.

Commonly used for:

- Boolean flags
- Status values

Example:

```sql
is_active TINYINT
```

---

# DECIMAL

Stores exact decimal numbers.

Best for:

- Financial calculations
- Money values

Syntax:

```sql
DECIMAL(total_digits, decimal_places)
```

Example:

```sql
salary DECIMAL(10,2)
```

Valid value:

```text
12345.67
```

---

# FLOAT

Stores approximate decimal numbers.

Example:

```sql
temperature FLOAT
```

---

# DOUBLE

Higher precision floating-point type.

Example:

```sql
price DOUBLE
```

---

# Numeric Data Type Comparison

| Data Type | Use Case |
|-----------|-----------|
| INT | Whole numbers |
| BIGINT | Large numbers |
| DECIMAL | Exact money values |
| FLOAT | Approximate decimals |

---

# 2. String Data Types

Used for text values.

---

# CHAR

Fixed-length string.

Example:

```sql
gender CHAR(1)
```

Possible values:

```text
M
F
```

---

# VARCHAR

Variable-length string.

Most commonly used text type.

Example:

```sql
name VARCHAR(100)
```

---

# TEXT

Stores large text.

Example:

```sql
description TEXT
```

Used for:

- Articles
- Comments
- Long descriptions

---

# String Data Type Comparison

| Data Type | Description |
|-----------|-------------|
| CHAR | Fixed length |
| VARCHAR | Variable length |
| TEXT | Large text |

---

# CHAR vs VARCHAR

| CHAR | VARCHAR |
|------|----------|
| Faster for fixed-size data | Flexible storage |
| Wastes space if unused | Efficient storage |

Example:

```sql
country_code CHAR(2)
```

```sql
email VARCHAR(255)
```

---

# 3. Date and Time Data Types

Used for storing dates and times.

---

# DATE

Stores date only.

Format:

```text
YYYY-MM-DD
```

Example:

```sql
birth_date DATE
```

---

# TIME

Stores time only.

Format:

```text
HH:MM:SS
```

Example:

```sql
meeting_time TIME
```

---

# DATETIME

Stores both date and time.

Example:

```sql
created_at DATETIME
```

---

# TIMESTAMP

Stores timestamp values.

Often used for:

- Logs
- Record creation time
- Updates

Example:

```sql
updated_at TIMESTAMP
```

---

# Date Data Type Comparison

| Data Type | Stores |
|-----------|--------|
| DATE | Date |
| TIME | Time |
| DATETIME | Date + Time |
| TIMESTAMP | Timestamp |

---

# 4. Boolean Data Types

Used for true/false values.

Example:

```sql
is_active BOOLEAN
```

Possible values:

```text
TRUE
FALSE
```

Some databases internally store boolean as:

```text
1 = TRUE
0 = FALSE
```

---

# 5. Binary Data Types

Used for binary files.

Examples:

- Images
- PDFs
- Videos

---

# BLOB

Binary Large Object.

Example:

```sql
profile_image BLOB
```

---

# Creating Table with Different Data Types

Example:

```sql
CREATE TABLE employees (
    id INT,
    name VARCHAR(100),
    salary DECIMAL(10,2),
    joining_date DATE,
    is_active BOOLEAN
);
```

---

# Inserting Data

Example:

```sql
INSERT INTO employees
VALUES (
    1,
    'John',
    50000.50,
    '2025-01-10',
    TRUE
);
```

---

# Choosing the Correct Data Type

## Best Practices

### Use INT for IDs

```sql
id INT
```

---

### Use VARCHAR for Names

```sql
name VARCHAR(100)
```

---

### Use DECIMAL for Money

```sql
price DECIMAL(10,2)
```

---

### Use DATE for Dates

```sql
birth_date DATE
```

---

# Storage Optimization

Choosing smaller data types improves performance.

Example:

Use:

```sql
TINYINT
```

instead of:

```sql
BIGINT
```

when storing small values.

---

# NULL Values

Columns can store:

```sql
NULL
```

Meaning:

- Unknown value
- Missing value

Example:

```sql
middle_name VARCHAR(100) NULL
```

---

# NOT NULL Constraint

Prevents empty values.

Example:

```sql
name VARCHAR(100) NOT NULL
```

---

# Common Data Type Mistakes

## Using VARCHAR for Numbers

Wrong:

```sql
age VARCHAR(10)
```

Correct:

```sql
age INT
```

---

## Using FLOAT for Money

Wrong:

```sql
salary FLOAT
```

Correct:

```sql
salary DECIMAL(10,2)
```

---

# Real-World Example

## E-Commerce Products Table

```sql
CREATE TABLE products (
    id INT PRIMARY KEY,
    product_name VARCHAR(200),
    price DECIMAL(10,2),
    stock INT,
    created_at DATETIME
);
```

---

# Data Type Conversion

Sometimes data needs conversion.

Example:

```sql
CAST(price AS INT)
```

---

# SQL Type Functions

Examples:

```sql
LENGTH(name)
```

```sql
ROUND(price, 2)
```

---

# Best Practices

- Use smallest suitable data type
- Use DECIMAL for currency
- Use VARCHAR for flexible text
- Use DATE for dates
- Avoid unnecessary TEXT fields

---

# Common Beginner Mistakes

- Wrong data type selection
- Using large data types unnecessarily
- Ignoring NULL handling
- Using TEXT everywhere

---

# Practice Exercises

## Exercise 1

Create table:

```sql
students
```

Columns:

- id
- name
- age
- email
- created_at

Choose appropriate data types.

---

## Exercise 2

Create products table with:

- product name
- price
- stock quantity

---

## Exercise 3

Create employees table with:

- salary
- joining date
- active status

---

# Mini Project

Design tables for:

## Hospital System

Think about data types for:

- patient name
- age
- appointment date
- medical report

---

# Interview Questions

## Q1. What is a data type?

A data type defines what kind of value a column can store.

---

## Q2. Difference between CHAR and VARCHAR?

| CHAR | VARCHAR |
|------|----------|
| Fixed length | Variable length |

---

## Q3. Why use DECIMAL for money?

Because it stores exact decimal values.

---

## Q4. Difference between DATE and DATETIME?

| DATE | DATETIME |
|------|-----------|
| Stores date only | Stores date and time |

---

# Summary

In this chapter, you learned:

- SQL data types
- Numeric types
- String types
- Date/time types
- Boolean types
- Binary types
- Choosing correct data types
- Data type best practices

You are now ready to learn how to insert data into tables.

---

# Next Topic

➡ 07_INSERT_Query.md