# 3.3. CSS Functions

## Introduction
CSS functions provide dynamic ways to manipulate values within stylesheets. They allow for calculations, color manipulations, positioning, and more, making styles more flexible and maintainable.

---

## 1. Commonly Used CSS Functions

### 1.1 `calc()`
The `calc()` function performs mathematical operations within CSS properties.

Example:
```css
div {
    width: calc(100% - 50px);
}
```
This makes the width dynamic by subtracting `50px` from `100%` of the container.

### 1.2 `var()`
The `var()` function accesses CSS variables (custom properties).

Example:
```css
:root {
    --main-color: blue;
}

p {
    color: var(--main-color);
}
```
This allows easy updates to styles by modifying the variable.

### 1.3 `rgb()` and `rgba()`
These functions define colors using red, green, blue, and optional alpha (opacity) values.

Example:
```css
div {
    background-color: rgba(255, 0, 0, 0.5);
}
```
This sets a semi-transparent red background.

### 1.4 `hsl()` and `hsla()`
HSL (Hue, Saturation, Lightness) and HSLA (including alpha for transparency) define colors more intuitively.

Example:
```css
div {
    background-color: hsl(200, 100%, 50%);
}
```
This sets a bright blue background.

### 1.5 `min()`, `max()`, and `clamp()`
These functions help create responsive designs by setting limits on values.

Example:
```css
p {
    font-size: clamp(14px, 2vw, 20px);
}
```
This keeps the font size between `14px` and `20px`, scaling with the viewport width (`2vw`).

### 1.6 `url()`
The `url()` function specifies external resources like images, fonts, or other assets.

Example:
```css
body {
    background-image: url('background.jpg');
}
```

### 1.7 `attr()`
The `attr()` function retrieves an attribute value from an element.

Example:
```css
a::after {
    content: " (" attr(href) ")";
}
```
This displays the hyperlink URL next to links dynamically.

---

## Conclusion
CSS functions enhance flexibility in styling, enabling calculations, dynamic values, and responsive adjustments. They help in making stylesheets more maintainable and adaptable to different scenarios.

