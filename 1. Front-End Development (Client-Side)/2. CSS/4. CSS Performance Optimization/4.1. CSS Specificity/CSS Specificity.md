# 4.1. CSS Specificity

## Introduction
CSS specificity determines which styles apply when multiple rules target the same element. Understanding specificity helps prevent unexpected styling issues and ensures maintainable CSS code.

---

## 1. Understanding Specificity Calculation
CSS assigns weight to selectors based on their type. The specificity score is calculated using the following structure:

- **Inline styles** (e.g., `style="color: red;"`) → **1000 points**
- **ID selectors** (e.g., `#header`) → **100 points**
- **Class, attribute, and pseudo-class selectors** (e.g., `.button`, `[type="text"]`, `:hover`) → **10 points**
- **Element and pseudo-element selectors** (e.g., `h1`, `p`, `::before`) → **1 point**
- **Universal selector (`*`) and combinators (`+`, `>`, `~`)** → **0 points**

Example calculation:
```css
/* Specificity: 10 (class selector) */
.button {
    color: blue;
}

/* Specificity: 100 (ID selector, higher priority) */
#main {
    color: red;
}
```
Here, `#main` will override `.button` due to higher specificity.

---

## 2. Examples of Specificity Hierarchy

### 2.1 Low to High Specificity Order
```css
/* Specificity: 1 */
h1 {
    color: black;
}

/* Specificity: 10 */
.title {
    color: green;
}

/* Specificity: 100 */
#main-title {
    color: red;
}
```
Since `#main-title` has the highest specificity, it takes precedence.

### 2.2 Combining Selectors
```css
/* Specificity: 20 (class + pseudo-class) */
.button:hover {
    background-color: yellow;
}

/* Specificity: 110 (ID + class) */
#main .button {
    background-color: orange;
}
```
In this case, `#main .button` has higher specificity and overrides `.button:hover`.

---

## 3. !important and Its Impact
The `!important` rule overrides all specificity calculations.

Example:
```css
.button {
    color: blue !important;
}

#main .button {
    color: red;
}
```
Even though `#main .button` has higher specificity, `!important` forces `.button` to take priority.

Use `!important` sparingly, as it can make debugging more difficult.

---

## 4. Best Practices to Manage Specificity
- **Use lower specificity selectors for better maintainability.**
- **Avoid overusing `!important`,** except in utility classes or global resets.
- **Use class-based styling instead of ID selectors.**
- **Structure CSS to prevent specificity conflicts.**

Example:
```css
/* Prefer using class selectors */
.card {
    border: 1px solid #ddd;
}
```
This keeps styles modular and easy to override.

---

## Conclusion
CSS specificity determines how styles are applied when conflicts arise. By understanding specificity rules, developers can write efficient, maintainable CSS while avoiding unnecessary complexity and overrides.

