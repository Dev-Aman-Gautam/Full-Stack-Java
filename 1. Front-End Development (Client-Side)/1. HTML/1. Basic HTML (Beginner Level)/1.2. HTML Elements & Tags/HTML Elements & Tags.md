# HTML Elements & Tags: A Comprehensive Guide

HTML (HyperText Markup Language) consists of elements and tags that define the structure and content of web pages. Below is a detailed breakdown of HTML elements and tags.

---

## 1. Understanding HTML Elements and Tags

### **HTML Tags**
- HTML tags are enclosed in angle brackets (`<>`).
- Most tags have an opening and closing pair (`<tag>...</tag>`), while some are self-closing (`<tag />`).
- Example:
  ```html
  <p>This is a paragraph.</p>
  ```

### **HTML Elements**
- An HTML element consists of an opening tag, content, and a closing tag.
- Example:
  ```html
  <h1>Hello, World!</h1>
  ```
  - `<h1>`: Opening tag
  - `Hello, World!`: Content
  - `</h1>`: Closing tag

---

## 2. Common HTML Elements & Tags

### **1. Document Structure Tags**
|     Tag       |         Description                          |
|---------------|----------------------------------------------|
| `<!DOCTYPE>`  | Declares the document type (HTML5)           |
| `<html>`      | Root element of an HTML document             |
| `<head>`      | Contains meta-information about the document |
| `<title>`     | Sets the title of the document               |
| `<body>`      | Contains the visible page content            |

### **2. Text Formatting Tags**
|     Tag        |         Description                              |
|----------------|--------------------------------------------------|
| `<h1> to <h6>` | Headings from largest (`h1`) to smallest (`h6`)  |
| `<p>`          | Defines a paragraph                              |
| `<strong>`     | Bold text (important text)                       |
| `<em>`         | Italicized text (emphasized text)                |
| `<br>`         | Line break (self-closing)                        |
| `<hr>`         | Horizontal rule (self-closing)                   |
| `<blockquote>` | Defines a block quote                            |
| `<code>`       | Represents inline code snippets                  |

### **3. Lists and Tables**
|    Tag    | Description       |
|---------- |------------------ |
| `<ul>`    | Unordered list    |
| `<ol>`    | Ordered list      |
| `<li>`    | List item         |
| `<table>` | Defines a table   |
| `<tr>`    | Table row         |
| `<td>`    | Table data cell   |
| `<th>`    | Table header cell |

### **4. Links and Media**
| Tag | Description |
|------|------------|
| `<a>` | Defines a hyperlink |
| `<img>` | Embeds an image (self-closing) |
| `<audio>` | Embeds audio content |
| `<video>` | Embeds video content |
| `<iframe>` | Embeds another webpage |

Example:
```html
<a href="https://example.com">Visit Example</a>
<img src="image.jpg" alt="Example Image">
```

### **5. Forms and Input Elements**
| Tag | Description |
|------|------------|
| `<form>` | Defines a form for user input |
| `<input>` | Defines an input field (self-closing) |
| `<textarea>` | Multi-line text input |
| `<button>` | Clickable button |
| `<select>` | Dropdown list |
| `<option>` | Defines an option inside `<select>` |
| `<label>` | Labels an input field |

Example:
```html
<form action="submit.php" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <button type="submit">Submit</button>
</form>
```

### **6. Semantic HTML Elements**
| Tag | Description |
|------|------------|
| `<header>` | Represents introductory content |
| `<nav>` | Defines navigation links |
| `<main>` | Contains the main content |
| `<section>` | Groups related content |
| `<article>` | Represents an independent piece of content |
| `<aside>` | Holds supplementary information |
| `<footer>` | Contains footer content |

Example:
```html
<header>
    <h1>My Website</h1>
</header>
<nav>
    <a href="#home">Home</a>
    <a href="#about">About</a>
</nav>
```

### **7. Metadata and Scripts**
| Tag | Description |
|------|------------|
| `<meta>` | Provides metadata (self-closing) |
| `<link>` | Links external resources (self-closing) |
| `<script>` | Embeds JavaScript code |
| `<style>` | Defines internal CSS styles |

Example:
```html
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
```

---

## 3. Self-Closing Tags
Some HTML tags do not require closing tags:

```html
<img src="image.jpg" alt="Image">
<br>
<hr>
<meta charset="UTF-8">
```

---

## 4. Nesting and Indentation
Proper nesting improves readability and maintainability.

Example:
```html
<div>
    <p>This is a paragraph inside a div.</p>
</div>
```

---
