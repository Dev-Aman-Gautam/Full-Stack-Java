# 2.4. Pseudo-Classes and Pseudo-Elements

## Introduction
Pseudo-classes and pseudo-elements in CSS allow for the selection and styling of elements based on their state or specific portions of an element without modifying the HTML structure.

---

## 1. Pseudo-Classes
Pseudo-classes define special states of elements.

### Common Pseudo-Classes:
- `:hover` – Styles an element when hovered over.
- `:focus` – Styles an element when focused.
- `:nth-child(n)` – Selects elements based on their position.
- `:first-child` – Selects the first child of a parent.
- `:last-child` – Selects the last child of a parent.

Example:
```css
button:hover {
    background-color: blue;
    color: white;
}
```

```css
input:focus {
    border: 2px solid green;
}
```

```css
p:nth-child(2) {
    color: red;
}
```

---

## 2. Pseudo-Elements
Pseudo-elements allow styling of specific parts of an element.

### Common Pseudo-Elements:
- `::before` – Inserts content before an element.
- `::after` – Inserts content after an element.
- `::first-letter` – Styles the first letter of text.
- `::first-line` – Styles the first line of text.
- `::selection` – Styles the selected text.

Example:
```css
p::first-letter {
    font-size: 2em;
    font-weight: bold;
}
```

```css
div::before {
    content: '★ ';
    color: gold;
}
```

```css
p::selection {
    background-color: yellow;
}
```

---

## 3. Combining Pseudo-Classes and Pseudo-Elements
You can combine pseudo-classes and pseudo-elements for advanced styling.
```css
a:hover::after {
    content: ' →';
    color: red;
}
```

---

## Conclusion
Pseudo-classes and pseudo-elements enhance styling capabilities by targeting specific states and sections of elements without additional HTML. They are essential for interactive and visually appealing designs.

