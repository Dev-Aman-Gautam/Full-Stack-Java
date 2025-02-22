# Introduction to CSS

## What is CSS?
CSS (Cascading Style Sheets) is a stylesheet language used to control the presentation of HTML documents. It allows developers to separate content from design, making websites more visually appealing and easier to maintain.

---

## Why Use CSS?
CSS offers several benefits:
- **Separation of Concerns**: Keeps HTML structure separate from styling.
- **Reusability**: Styles can be applied to multiple elements or pages.
- **Consistency**: Ensures a uniform look across a website.
- **Improved Accessibility**: Enhances readability and usability.
- **Faster Load Times**: Reduces redundancy and improves performance.

---

## Types of CSS
There are three main ways to apply CSS:

### 1. Inline CSS
Styles are applied directly to an HTML element using the `style` attribute.
```html
<p style="color: blue; font-size: 16px;">This is an inline-styled paragraph.</p>
```
**Pros**: Quick and easy for small changes.
**Cons**: Hard to maintain and not reusable.

### 2. Internal CSS
Styles are defined within a `<style>` tag inside the HTML document’s `<head>`.
```html
<head>
    <style>
        p { color: blue; font-size: 16px; }
    </style>
</head>
```
**Pros**: Allows styling for an entire page.
**Cons**: Does not apply across multiple pages.

### 3. External CSS
Styles are written in a separate `.css` file and linked to the HTML document.
```html
<head>
    <link rel="stylesheet" href="styles.css">
</head>
```
**Pros**: Best for maintaining consistency and scalability.
**Cons**: Requires an additional file request.

---

## CSS Syntax
CSS follows a simple structure:
```css
selector {
    property: value;
}
```
Example:
```css
p {
    color: red;
    font-size: 14px;
}
```
- **Selector**: Specifies the HTML element(s) to be styled (e.g., `p` for paragraphs).
- **Property**: Defines the aspect to be styled (e.g., `color`).
- **Value**: Specifies the styling details (e.g., `red`).

---

## Conclusion
CSS is an essential tool for web development, allowing designers to create visually engaging and well-structured websites. Understanding its types, syntax, and best practices helps in building scalable and maintainable web applications.

