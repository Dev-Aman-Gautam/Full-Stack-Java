# ORDER BY

## Introduction

The `ORDER BY` clause is used to sort query results.

It helps organize data in:

- Ascending order
- Descending order
- Alphabetical order
- Numerical order
- Date order

Sorting data is very important for:

- Reports
- Dashboards
- Search results
- Analytics
- User interfaces

---

# Basic ORDER BY Syntax

## Syntax

```sql
SELECT column_name
FROM table_name
ORDER BY column_name;
```

---

# Example Table

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT,
    marks INT
);
```

---

# Sample Data

```sql
INSERT INTO students
VALUES
(1, 'John', 20, 85),
(2, 'Alice', 22, 95),
(3, 'David', 19, 70),
(4, 'Emma', 21, 90);
```

---

# Sorting in Ascending Order

Ascending order is default.

---

# Example

```sql
SELECT *
FROM students
ORDER BY age;
```

---

# Output

| id | name | age | marks |
|----|------|-----|------|
| 3 | David | 19 | 70 |
| 1 | John | 20 | 85 |
| 4 | Emma | 21 | 90 |
| 2 | Alice | 22 | 95 |

---

# ASC Keyword

Explicit ascending order.

Example:

```sql
SELECT *
FROM students
ORDER BY age ASC;
```

---

# Descending Order

Use `DESC`.

---

# Example

```sql
SELECT *
FROM students
ORDER BY marks DESC;
```

---

# Output

| id | name | age | marks |
|----|------|-----|------|
| 2 | Alice | 22 | 95 |
| 4 | Emma | 21 | 90 |
| 1 | John | 20 | 85 |
| 3 | David | 19 | 70 |

---

# Sorting Text Data

Example:

```sql
SELECT *
FROM students
ORDER BY name;
```

---

# Alphabetical Output

```text
Alice
David
Emma
John
```

---

# Sorting Multiple Columns

SQL allows sorting by multiple columns.

---

# Syntax

```sql
ORDER BY column1, column2
```

---

# Example

```sql
SELECT *
FROM students
ORDER BY age ASC, marks DESC;
```

---

# How It Works

1. Sort by age
2. If ages are same, sort by marks

---

# ORDER BY with WHERE

Example:

```sql
SELECT *
FROM students
WHERE marks > 80
ORDER BY marks DESC;
```

---

# ORDER BY with LIMIT

Example:

```sql
SELECT *
FROM students
ORDER BY marks DESC
LIMIT 3;
```

Purpose:

- Get top 3 students

---

# Sorting by Column Position

You can sort using column numbers.

---

# Example

```sql
SELECT id, name, marks
FROM students
ORDER BY 3 DESC;
```

Here:

```text
3 = marks column
```

⚠ Not recommended for readability.

---

# ORDER BY with Aliases

Example:

```sql
SELECT name,
       marks * 2 AS final_marks
FROM students
ORDER BY final_marks DESC;
```

---

# ORDER BY with Dates

Example:

```sql
SELECT *
FROM employees
ORDER BY joining_date DESC;
```

Purpose:

- Show latest employees first

---

# ORDER BY with NULL Values

Different databases handle NULL differently.

Example:

```sql
SELECT *
FROM employees
ORDER BY manager_id;
```

---

# NULLS FIRST / NULLS LAST

Supported in some databases.

Example:

```sql
SELECT *
FROM employees
ORDER BY manager_id NULLS LAST;
```

---

# Real-World Example

## E-Commerce Products

```sql
SELECT product_name, price
FROM products
ORDER BY price DESC;
```

Purpose:

- Show expensive products first

---

# Top Customers Example

```sql
SELECT customer_name, total_spent
FROM customers
ORDER BY total_spent DESC
LIMIT 5;
```

Purpose:

- Find highest spending customers

---

# ORDER BY Execution Order

Logical SQL order:

1. FROM
2. WHERE
3. SELECT
4. ORDER BY
5. LIMIT

---

# Performance Considerations

Sorting large datasets can be expensive.

---

# Improving ORDER BY Performance

Use indexes.

Example:

```sql
CREATE INDEX idx_marks
ON students(marks);
```

Benefits:

- Faster sorting
- Better query performance

---

# ORDER BY on Multiple Columns

Example:

```sql
SELECT *
FROM employees
ORDER BY department ASC,
         salary DESC;
```

Purpose:

- Group departments
- Show highest salary first within department

---

# Common ORDER BY Errors

## Wrong Column Name

Wrong:

```sql
ORDER BY salaryy
```

Correct:

```sql
ORDER BY salary
```

---

# Sorting Text Instead of Numbers

If numeric values stored as VARCHAR:

```text
100
20
5
```

May sort incorrectly.

Use proper numeric data types.

---

# Using ORDER BY Before WHERE

Wrong:

```sql
SELECT *
FROM students
ORDER BY age
WHERE age > 20;
```

Correct:

```sql
SELECT *
FROM students
WHERE age > 20
ORDER BY age;
```

---

# Best Practices

- Use ORDER BY for user-friendly output
- Use indexes for sorted columns
- Avoid sorting huge datasets unnecessarily
- Use LIMIT with ORDER BY for top records
- Use readable column names

---

# Common Beginner Mistakes

- Forgetting DESC keyword
- Sorting wrong column
- Using column numbers excessively
- Sorting text-based numbers

---

# Practice Exercises

## Exercise 1

Display students sorted by age.

---

## Exercise 2

Display students sorted by marks descending.

---

## Exercise 3

Display top 2 students by marks.

---

## Exercise 4

Sort employees by department and salary.

---

## Exercise 5

Display products sorted by price.

---

# Mini Project

## Online Store Queries

Write queries to:

- Show cheapest products
- Show latest orders
- Show top customers
- Show highest-rated products

---

# Interview Questions

## Q1. What does ORDER BY do?

It sorts query results.

---

## Q2. Difference between ASC and DESC?

| ASC | DESC |
|-----|------|
| Ascending order | Descending order |

---

## Q3. Why use ORDER BY with LIMIT?

To retrieve top or bottom records.

---

## Q4. Can ORDER BY sort multiple columns?

Yes.

---

# Summary

In this chapter, you learned:

- ORDER BY syntax
- Ascending sorting
- Descending sorting
- Sorting multiple columns
- ORDER BY with WHERE
- ORDER BY with LIMIT
- Sorting best practices
- Performance optimization

You are now ready to learn LIMIT and OFFSET for pagination.

---

# Next Topic

➡ 11_LIMIT_OFFSET.md