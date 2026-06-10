# Introduction to SQL

## What is SQL?

SQL (Structured Query Language) is a standard programming language used to communicate with relational databases.

Using SQL, we can:

- Store data
- Retrieve data
- Update records
- Delete records
- Create databases and tables
- Manage permissions

SQL is one of the most important skills for:

- Backend Developers
- Data Analysts
- Data Engineers
- Database Administrators
- Software Engineers

---

# What is a Database?

A database is an organized collection of data stored electronically.

Example:

| ID | Name    | Age |
|----|----------|-----|
| 1  | John     | 25  |
| 2  | Alice    | 30  |

Instead of storing data in files manually, databases help us:

- Store huge amounts of data
- Search quickly
- Maintain relationships
- Ensure security
- Prevent duplication

---

# Types of Databases

## 1. Relational Databases (SQL)

Stores data in tables.

Examples:

- MySQL
- PostgreSQL
- SQLite
- Oracle
- Microsoft SQL Server

---

## 2. Non-Relational Databases (NoSQL)

Stores data differently such as documents or key-value pairs.

Examples:

- MongoDB
- Redis
- Cassandra

---

# Why Learn SQL?

SQL is used almost everywhere.

## SQL is important for:

### Web Development

Applications use databases to store:

- Users
- Products
- Orders
- Payments

### Data Analysis

Companies analyze data using SQL.

### Software Engineering Interviews

Most companies ask SQL interview questions.

### Data Science & AI

SQL is heavily used for preparing datasets.

---

# Features of SQL

- Easy to learn
- Powerful querying language
- Standardized language
- Fast data retrieval
- Supports large databases
- Works with multiple database systems

---

# Common SQL Commands

SQL commands are divided into categories.

---

## 1. DDL (Data Definition Language)

Used to define database structure.

Commands:

- CREATE
- ALTER
- DROP
- TRUNCATE

Example:

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100)
);
```

---

## 2. DML (Data Manipulation Language)

Used to manipulate data.

Commands:

- INSERT
- UPDATE
- DELETE

Example:

```sql
INSERT INTO students (id, name)
VALUES (1, 'John');
```

---

## 3. DQL (Data Query Language)

Used to retrieve data.

Command:

- SELECT

Example:

```sql
SELECT * FROM students;
```

---

## 4. DCL (Data Control Language)

Used for permissions.

Commands:

- GRANT
- REVOKE

---

## 5. TCL (Transaction Control Language)

Used to manage transactions.

Commands:

- COMMIT
- ROLLBACK
- SAVEPOINT

---

# How SQL Works

Step-by-step process:

1. User writes SQL query
2. Database receives query
3. Query is processed
4. Database returns result

Example:

```sql
SELECT name FROM students;
```

Result:

| name |
|------|
| John |
| Alice |

---

# Popular SQL Databases

| Database | Description |
|----------|-------------|
| MySQL | Most popular open-source database |
| PostgreSQL | Advanced open-source relational DB |
| SQLite | Lightweight embedded database |
| Oracle | Enterprise-level database |
| SQL Server | Microsoft relational database |

---

# Installing SQL Databases

## MySQL

Website:
https://www.mysql.com/

## PostgreSQL

Website:
https://www.postgresql.org/

## SQLite

Website:
https://www.sqlite.org/

---

# First SQL Query

Example:

```sql
SELECT 'Hello World';
```

Output:

```text
Hello World
```

---

# Creating Your First Database

```sql
CREATE DATABASE company;
```

---

# Creating Your First Table

```sql
CREATE TABLE employees (
    id INT,
    name VARCHAR(100),
    salary DECIMAL(10,2)
);
```

---

# Inserting Data

```sql
INSERT INTO employees (id, name, salary)
VALUES (1, 'John', 50000);
```

---

# Retrieving Data

```sql
SELECT * FROM employees;
```

---

# Real-World Example

Imagine an e-commerce application.

Database tables might include:

- users
- products
- orders
- payments
- inventory

SQL helps applications:

- Find products
- Store customer orders
- Track payments
- Generate reports

---

# Advantages of SQL

- Easy to read
- Industry standard
- High performance
- Secure
- Scalable
- Supports complex queries

---

# Limitations of SQL

- Complex queries can become difficult
- Large databases need optimization
- Scaling horizontally is harder than NoSQL

---

# SQL vs NoSQL

| Feature | SQL | NoSQL |
|---------|-----|--------|
| Structure | Tables | Documents/Key-Value |
| Schema | Fixed | Flexible |
| Relationships | Strong | Weak |
| Scaling | Vertical | Horizontal |
| Best For | Structured Data | Unstructured Data |

---

# Best Practices

- Use meaningful table names
- Normalize data properly
- Avoid duplicate data
- Use indexes wisely
- Backup databases regularly

---

# Common Beginner Mistakes

- Forgetting WHERE clause in UPDATE/DELETE
- Using SELECT *
- Poor naming conventions
- Not understanding relationships

---

# Practice Questions

1. What does SQL stand for?
2. Difference between SQL and NoSQL?
3. What is a relational database?
4. What does SELECT do?
5. What is DDL?

---

# Mini Exercises

## Exercise 1

Create a database named:

```sql
school
```

---

## Exercise 2

Create a table named students.

Columns:

- id
- name
- age

---

## Exercise 3

Insert 3 student records.

---

## Exercise 4

Display all students.

---

# Summary

In this chapter, you learned:

- What SQL is
- Why SQL is important
- Database basics
- Types of SQL commands
- Creating databases and tables
- Running basic queries

You are now ready to learn SQL syntax and start writing real queries.

---
