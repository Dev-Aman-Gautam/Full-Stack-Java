# Inline vs. Block Elements

HTML elements are categorized into two main types: **inline** and **block** elements. Understanding their differences helps in structuring web pages effectively.

---

## 1. Block Elements
Block elements take up the full width available and start on a new line. They define sections or blocks of content.

### Examples of Block Elements:
- `<div>`
- `<p>`
- `<h1>` to `<h6>`
- `<ul>` and `<ol>`
- `<table>`
- `<section>`
- `<article>`
- `<footer>`
- `<header>`

### Example:
```html
<div>
    <h1>This is a heading</h1>
    <p>This is a paragraph inside a div.</p>
</div>
```

In this example, `<h1>` and `<p>` are block elements, meaning they take up the full width and appear on new lines.

---

## 2. Inline Elements
Inline elements do not start on a new line and only take up as much width as necessary. They are mainly used for styling or linking text.

### Examples of Inline Elements:
- `<span>`
- `<a>`
- `<strong>`
- `<em>`
- `<img>`
- `<label>`
- `<small>`
- `<code>`

### Example:
```html
<p>This is an <strong>important</strong> word inside a paragraph.</p>
```

In this example, `<strong>` is an inline element, meaning it does not break the flow of the surrounding text.

---

## 3. Differences Between Inline and Block Elements
| Feature | Block Elements | Inline Elements |
|---------|---------------|----------------|
| Width | Takes full width | Takes only necessary width |
| Line Break | Starts on a new line | Does not start on a new line |
| Nesting | Can contain block and inline elements | Cannot contain block elements |

---

## 4. Inline-Block Elements
Some elements can behave like both inline and block elements using CSS:
```css
div {
    display: inline-block;
    width: 200px;
    height: 100px;
    background-color: lightblue;
}
```

This makes the `<div>` behave like an inline element while retaining block-like properties (width and height).

---


