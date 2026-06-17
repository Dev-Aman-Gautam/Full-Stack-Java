# Installing SQL Database

## Introduction

Before writing SQL queries, we need a database system installed on our computer.

A database management system (DBMS) helps us:

- Create databases
- Store data
- Run SQL queries
- Manage tables
- Control users and permissions

In this chapter, we will learn how to install:

- MySQL
- PostgreSQL
- SQLite

We will also learn about database tools and SQL editors.

---

## Choosing a Database

## Recommended for Beginners

| Database          | Difficulty | Best For         |
|-------------------|------------|------------------|
| SQLite            |   Easy     | Beginners        |
| MySQL             |   Easy     | Web Development  |
| PostgreSQL        |   Medium   | Advanced SQL     |
| SQL Server        |   Medium   | Enterprise Apps  |

---

## Option 1 — Install MySQL

## What is MySQL?

MySQL is one of the most popular relational database systems.

Used by:

- YouTube
- Facebook
- WordPress
- Many web applications

---

## Step-by-Step MySQL Installation

## Step 1 — Download MySQL

Official Website:

<https://www.mysql.com/downloads/>

Download:

- MySQL Community Server

---

## Step 2 — Run Installer

Choose:

```text
Developer Default
```

This installs:

- MySQL Server
- MySQL Workbench
- Command Line Tools

---

## Step 3 — Configure MySQL

Set:

- Root password
- Port number (default: 3306)

Example password:

```text
root123
```

---

## Step 4 — Start MySQL Server

MySQL server should start automatically.

---

## Step 5 — Open MySQL Workbench

MySQL Workbench is a graphical SQL editor.

You can:

- Write queries
- Create databases
- Manage tables

---

## Testing MySQL Installation

Open MySQL Command Line or Workbench.

Run:

```sql
SELECT VERSION();
```

If installed correctly, MySQL version will appear.

---

## Option 2 — Install PostgreSQL

## What is PostgreSQL?

PostgreSQL is a powerful open-source relational database.

Features:

- Advanced SQL support
- JSON support
- High performance
- Enterprise-grade features

---

# PostgreSQL Installation

## Step 1 — Download PostgreSQL

Official Website:

<https://www.postgresql.org/download/>

---

## Step 2 — Run Installer

Install:

- PostgreSQL Server
- pgAdmin

---

## Step 3 — Set Password

Create password for user:

```text
postgres
```

---

## Step 4 — Default Port

PostgreSQL uses:

```text
5432
```

---

# Testing PostgreSQL

Open pgAdmin or terminal.

Run:

```sql
SELECT version();
```

---

# Option 3 — Install SQLite

## What is SQLite?

SQLite is a lightweight embedded database.

Features:

- No server required
- Very small size
- Easy to use
- Perfect for beginners

---

# SQLite Installation

## Windows

Download:

<https://www.sqlite.org/download.html>

Extract files.

---

# Using SQLite

Open CMD inside SQLite folder.

Run:

```cmd
sqlite3
```

You should see:

```text
sqlite>
```

---

# Create Database in SQLite

```sql
.open school.db
```

---

# Show Databases

```sql
.databases
```

---

# GUI Tools for SQL

## 1. MySQL Workbench

Used for MySQL.

Features:

- Visual interface
- Query editor
- Database modeling

---

## 2. pgAdmin

Used for PostgreSQL.

Features:

- SQL editor
- Database administration
- Dashboard

---

## 3. DBeaver

Universal database tool.

Supports:

- MySQL
- PostgreSQL
- SQLite
- SQL Server

Website:

<https://dbeaver.io/>

---

## 4. VS Code Extensions

Useful extensions:

- SQLTools
- Database Client
- SQLite Viewer

---

# Connecting to a Database

## MySQL Connection

Example:

```text
Host: localhost
Port: 3306
Username: root
Password: yourpassword
```

---

## PostgreSQL Connection

Example:

```text
Host: localhost
Port: 5432
Username: postgres
Password: yourpassword
```

---

# Understanding SQL Environment

A typical SQL environment contains:

| Component | Purpose |
|-----------|----------|
| Database Server | Stores data |
| SQL Client | Executes queries |
| Tables | Store records |
| Queries | Retrieve/manipulate data |

---

# First Database Setup

## Create Database

```sql
CREATE DATABASE company;
```

---

# Use Database

## MySQL

```sql
USE company;
```

---

# Create First Table

```sql
CREATE TABLE employees (
    id INT,
    name VARCHAR(100),
    salary DECIMAL(10,2)
);
```

---

# Insert Sample Data

```sql
INSERT INTO employees
VALUES (1, 'John', 50000);
```

---

# Verify Data

```sql
SELECT * FROM employees;
```

---

# Command Line vs GUI Tools

| Command Line | GUI |
|--------------|-----|
| Faster | Easier |
| More control | Beginner-friendly |
| Used by professionals | Better visualization |

---

# Common Installation Problems

## Port Already in Use

Problem:

```text
Port 3306 already used
```

Solution:

- Change port
- Stop existing service

---

## Forgot Password

Solutions:

- Reset database password
- Reinstall database

---

## Server Not Starting

Possible reasons:

- Firewall issue
- Port conflict
- Incorrect configuration

---

# Best Practices

- Use strong passwords
- Keep backups
- Install latest stable version
- Learn command line tools
- Practice regularly

---

# Practice Exercises

## Exercise 1

Install MySQL or PostgreSQL.

---

## Exercise 2

Create database:

```sql
school
```

---

## Exercise 3

Create table:

```sql
students
```

---

## Exercise 4

Insert 5 student records.

---

## Exercise 5

Display all records.

---

# Mini Project

Create a simple:

- Student database
- Employee database
- Library management database

---

# Summary

In this chapter, you learned:

- How to install SQL databases
- MySQL basics
- PostgreSQL basics
- SQLite basics
- GUI tools
- Running first SQL commands

You are now ready to start learning SQL syntax.

---
