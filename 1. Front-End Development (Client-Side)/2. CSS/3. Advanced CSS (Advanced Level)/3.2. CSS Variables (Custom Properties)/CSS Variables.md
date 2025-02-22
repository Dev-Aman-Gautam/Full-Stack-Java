# 3.2. CSS Variables (Custom Properties)

## Introduction
CSS Variables, also known as Custom Properties, allow developers to store reusable values in stylesheets. They enable dynamic theming, easier maintenance, and more flexible styling across a project.

---

## 1. Defining and Using CSS Variables
CSS variables are defined using the `--` prefix and accessed using the `var()` function.

### 1.1 Defining CSS Variables
```css
:root {
    --primary-color: #3498db;
    --secondary-color: #2ecc71;
    --font-size: 16px;
}
```
The `:root` selector ensures variables are available globally.

### 1.2 Using CSS Variables
```css
button {
    background-color: var(--primary-color);
    color: white;
    font-size: var(--font-size);
}
```

---

## 2. Benefits of CSS Variables
- **Reusability**: Avoids redundancy by defining values once.
- **Dynamic Theming**: Easily switch themes by updating variable values.
- **Maintainability**: Changes to variables reflect across the entire stylesheet.
- **JavaScript Integration**: Allows runtime updates to styles.

---

## 3. Updating CSS Variables with JavaScript
CSS variables can be modified dynamically using JavaScript.

Example:
```js
document.documentElement.style.setProperty('--primary-color', '#e74c3c');
```
This changes `--primary-color` to red dynamically.

---

## 4. Local vs. Global Scope
CSS variables can be defined globally in `:root` or locally within specific elements.

### 4.1 Global Scope
```css
:root {
    --global-padding: 10px;
}
```

### 4.2 Local Scope
```css
div {
    --local-margin: 20px;
    margin: var(--local-margin);
}
```

---

## 5. Fallback Values
CSS variables support fallback values in case a variable is not defined.

Example:
```css
p {
    color: var(--text-color, black);
}
```
If `--text-color` is undefined, `black` is used.

---

## Conclusion
CSS Variables simplify styling, improve maintainability, and enable dynamic customization. They are a powerful feature in modern CSS, enhancing flexibility in design and development.

