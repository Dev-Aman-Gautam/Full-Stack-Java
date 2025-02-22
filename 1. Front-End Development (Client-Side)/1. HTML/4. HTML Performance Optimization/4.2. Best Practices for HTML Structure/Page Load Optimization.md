# Best Practices for HTML Structure

## Introduction
A well-structured HTML document improves readability, maintainability, and accessibility while enhancing SEO and user experience. Following best practices ensures that web pages are semantic, organized, and optimized for performance.

---

## 1. Use Proper DOCTYPE Declaration
The DOCTYPE declaration defines the document type and version of HTML.
```html
<!DOCTYPE html>
```
This ensures correct rendering in web browsers.

---

## 2. Organize the Document Structure
A proper HTML document should follow a logical order:
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document Title</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Page Header</h1>
    </header>
    <main>
        <section>
            <h2>Section Title</h2>
            <p>Content goes here.</p>
        </section>
    </main>
    <footer>
        <p>Footer Content</p>
    </footer>
</body>
</html>
```
---

## 3. Use Semantic HTML
Semantic elements improve readability and accessibility.
```html
<article>, <section>, <aside>, <header>, <footer>, <nav>
```
They provide meaningful structure rather than generic `<div>` elements.

---

## 4. Keep Code Indentation and Formatting Consistent
Consistent indentation and spacing improve code readability.
```html
<div>
    <p>Properly indented code</p>
</div>
```

---

## 5. Optimize for Accessibility
Use attributes like `alt` for images and `aria-label` for better accessibility.
```html
<img src="image.jpg" alt="Description of the image">
<button aria-label="Close window">X</button>
```

---

## 6. Ensure Mobile Responsiveness
Use the `viewport` meta tag and flexible layouts.
```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

---

## 7. Minimize the Use of Inline Styles and JavaScript
External stylesheets and scripts improve maintainability.
```html
<link rel="stylesheet" href="styles.css">
<script src="script.js" defer></script>
```

---

## 8. Optimize Load Performance
Place stylesheets in the `<head>` and scripts at the bottom or use `defer`.
```html
<script src="script.js" defer></script>
```

---

## Conclusion
Following best practices in HTML structure ensures a well-organized, accessible, and performant website. Proper structuring enhances readability, maintainability, and overall user experience.

