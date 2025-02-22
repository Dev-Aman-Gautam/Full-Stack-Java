# Integrating HTML with Other Technologies

## Introduction
HTML is the backbone of web development, but to build dynamic, interactive, and efficient websites, it needs to be integrated with other technologies such as CSS, JavaScript, backend programming languages, databases, and APIs.

---

## 1. HTML and CSS Integration
CSS (Cascading Style Sheets) is used to style HTML content, making web pages visually appealing.

### 1.1 Internal CSS
Defined within the `<style>` tag in the `<head>` section of an HTML document.
```html
<head>
    <style>
        body { background-color: lightblue; }
        h1 { color: darkblue; }
    </style>
</head>
```

### 1.2 External CSS
Linked via a separate `.css` file for better maintainability.
```html
<head>
    <link rel="stylesheet" href="styles.css">
</head>
```

---

## 2. HTML and JavaScript Integration
JavaScript enhances interactivity and functionality in web pages.

### 2.1 Inline JavaScript
Executed within an HTML tag.
```html
<button onclick="alert('Hello!')">Click Me</button>
```

### 2.2 Internal JavaScript
Defined within a `<script>` tag.
```html
<script>
    function showMessage() {
        alert("Hello, World!");
    }
</script>
<button onclick="showMessage()">Click Me</button>
```

### 2.3 External JavaScript
Linked through a `.js` file.
```html
<head>
    <script src="script.js"></script>
</head>
```

---

## 3. HTML and Backend Technologies
Backend technologies process data and generate dynamic content for HTML pages.

### 3.1 PHP
Used to handle form submissions and interact with databases.
```html
<form action="process.php" method="POST">
    <input type="text" name="username">
    <button type="submit">Submit</button>
</form>
```

### 3.2 Node.js and Express.js
Used for server-side applications.
```javascript
const express = require('express');
const app = express();
app.get('/', (req, res) => {
    res.send('<h1>Welcome to My Website</h1>');
});
app.listen(3000, () => console.log('Server running on port 3000'));
```

---

## 4. HTML and Databases
Databases store and retrieve data for web applications.

### 4.1 MySQL with PHP
```php
<?php
$conn = new mysqli('localhost', 'user', 'password', 'database');
$result = $conn->query("SELECT * FROM users");
while ($row = $result->fetch_assoc()) {
    echo "<p>" . $row['name'] . "</p>";
}
?>
```

### 4.2 MongoDB with Node.js
```javascript
const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost:27017/mydb');
const User = mongoose.model('User', { name: String });
User.find().then(users => console.log(users));
```

---

## 5. HTML and APIs
APIs allow interaction between web applications and external services.

### 5.1 Fetch API Example
```javascript
fetch('https://api.example.com/data')
    .then(response => response.json())
    .then(data => console.log(data));
```

### 5.2 JSON Data Handling
```html
<script>
    let jsonData = '{"name": "John", "age": 30}';
    let obj = JSON.parse(jsonData);
    console.log(obj.name);
</script>
```

---

## Conclusion
Integrating HTML with CSS, JavaScript, backend technologies, databases, and APIs is essential for building modern web applications. By leveraging these technologies together, developers can create dynamic, interactive, and scalable web solutions.

