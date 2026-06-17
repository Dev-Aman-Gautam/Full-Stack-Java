# Creating Databases

## Introduction

A database is a collection of organized data stored electronically.

Before storing tables and records, we first create a database.

Databases help us:

- Organize data
- Store large amounts of information
- Improve performance
- Maintain relationships
- Secure data

---

# What is a Database?

A database contains:

- Tables
- Rows
- Columns
- Relationships
- Constraints

Example:

A school database may contain:

- students table
- teachers table
- courses table
- exams table

---

# Why Create Separate Databases?

Separate databases help:

- Organize applications
- Improve security
- Isolate projects
- Simplify maintenance

Example:

| Application | Database |
|-------------|----------|
| E-commerce App | ecommerce_db |
| Banking App | banking_db |
| School App | school_db |

---

# SQL Command for Creating Database

## Syntax

```sql
CREATE DATABASE database_name;
```

---

# Example

```sql
CREATE DATABASE company;
```

This creates a new database named:

```text
company
```

---

# Database Naming Rules

## Good Practices

- Use lowercase names
- Use meaningful names
- Use underscores if needed

Good examples:

```text
school_db
employee_management
ecommerce_store
```

Bad examples:

```text
123db
my database
test!!!
```

---

# Viewing Existing Databases

## MySQL

```sql
SHOW DATABASES;
```

---

# Example Output

```text
information_schema
mysql
performance_schema
company
school
```

---

# Selecting a Database

After creating a database, we must select it before creating tables.

---

## Syntax

```sql
USE database_name;
```

---

# Example

```sql
USE company;
```

Now all tables will be created inside the `company` database.

---

# Creating Database with Character Set

Sometimes we specify character encoding.

---

## Example

```sql
CREATE DATABASE company
CHARACTER SET utf8mb4;
```

---

# Understanding Character Sets

Character sets define how text is stored.

Common character sets:

| Character Set | Description |
|---------------|-------------|
| utf8 | Basic Unicode |
| utf8mb4 | Full Unicode support |
| latin1 | English characters |

---

# Creating Database with Collation

Collation controls text comparison rules.

Example:

```sql
CREATE DATABASE company
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
```

---

# Checking Current Database

## Syntax

```sql
SELECT DATABASE();
```

---

# Example Output

```text
company
```

---

# Deleting a Database

## Syntax

```sql
DROP DATABASE database_name;
```

---

# Example

```sql
DROP DATABASE company;
```

⚠ Warning:

This permanently deletes:

- Tables
- Data
- Relationships

---

# Safe Database Deletion

Better approach:

```sql
DROP DATABASE IF EXISTS company;
```

This prevents errors if database does not exist.

---

# Creating Database Only If Not Exists

## Syntax

```sql
CREATE DATABASE IF NOT EXISTS company;
```

This avoids duplicate database errors.

---

# Database Lifecycle

Typical database lifecycle:

1. Create database
2. Create tables
3. Insert data
4. Query data
5. Update data
6. Backup database
7. Delete database if no longer needed

---

# Real-World Example

## E-Commerce Application

Database:

```text
ecommerce_db
```

Tables:

- users
- products
- orders
- payments
- inventory

---

# Multi-Database Systems

Large applications may use multiple databases.

Example:

| Database | Purpose |
|----------|----------|
| user_db | User accounts |
| analytics_db | Reports |
| logs_db | System logs |

---

# Understanding System Databases

Databases like MySQL include built-in system databases.

Examples:

| Database | Purpose |
|----------|----------|
| mysql | User accounts and permissions |
| information_schema | Metadata |
| performance_schema | Performance monitoring |

---

# Backup Before Deleting

Always backup important databases.

Example tools:

- mysqldump
- pg_dump
- database snapshots

---

# Database Security Basics

## Important Security Practices

- Use strong passwords
- Restrict user access
- Avoid public exposure
- Backup regularly

---

# Common Database Errors

## Database Already Exists

Error:

```text
ERROR: database exists
```

Solution:

```sql
CREATE DATABASE IF NOT EXISTS company;
```

---

## Unknown Database

Error:

```text
Unknown database 'company'
```

Solution:

- Verify spelling
- Use SHOW DATABASES

---

# Database Storage Concepts

Databases are stored on disk.

Database server manages:

- Files
- Memory
- Queries
- Transactions

---

# SQL Database Architecture Overview

Basic architecture:

```text
Client Application
        ↓
SQL Query
        ↓
Database Server
        ↓
Storage Engine
        ↓
Disk Storage
```

---

# Best Practices

- Use meaningful database names
- Create separate databases for projects
- Use backups
- Avoid unnecessary databases
- Use UTF-8 encoding

---

# Common Beginner Mistakes

- Forgetting USE command
- Deleting wrong database
- Using bad naming conventions
- Ignoring backups

---

# Practice Exercises

## Exercise 1

Create database:

```sql
school_db
```

---

## Exercise 2

Create database:

```sql
hospital_db
```

---

## Exercise 3

Display all databases.

---

## Exercise 4

Select one database.

---

## Exercise 5

Delete a test database.

---

# Mini Project

Design databases for:

- Online Store
- Library System
- Banking System

Think about:

- Tables required
- Relationships
- User data
- Transactions

---

# Interview Questions

## Q1. What is a database?

A database is an organized collection of structured data.

---

## Q2. Difference between database and table?

| Database | Table |
|----------|-------|
| Collection of tables | Collection of rows and columns |

---

## Q3. What does USE command do?

It selects the active database.

---

## Q4. Difference between DROP and DELETE?

| DROP | DELETE |
|------|--------|
| Removes entire object | Removes rows |

---

# Summary

In this chapter, you learned:

- What databases are
- Creating databases
- Selecting databases
- Dropping databases
- Character sets and collations
- Database best practices
- Common database errors

You are now ready to create tables inside databases.

---

