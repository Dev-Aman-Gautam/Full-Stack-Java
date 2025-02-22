# CSS Grid

## Introduction
CSS Grid Layout is a two-dimensional layout system for the web. It allows developers to create complex and responsive grid-based layouts with ease.

---

## 1. Enabling CSS Grid
To use CSS Grid, set the `display` property to `grid` or `inline-grid`.
```css
.container {
    display: grid; /* Enables grid layout */
}
```

---

## 2. Grid Container Properties
### `grid-template-columns`
Defines the number and size of columns.
```css
.container {
    display: grid;
    grid-template-columns: 100px 200px 100px;
}
```
Using `fr` units for flexible layout:
```css
.container {
    grid-template-columns: 1fr 2fr 1fr; /* Flexible column widths */
}
```

### `grid-template-rows`
Defines the number and size of rows.
```css
.container {
    grid-template-rows: 100px 200px;
}
```

### `gap`
Defines spacing between rows and columns.
```css
.container {
    gap: 10px; /* Space between grid items */
}
```

### `justify-items`
Aligns grid items along the horizontal axis.
```css
.container {
    justify-items: center;
}
```

### `align-items`
Aligns grid items along the vertical axis.
```css
.container {
    align-items: center;
}
```

### `place-items`
Shorthand for `align-items` and `justify-items`.
```css
.container {
    place-items: center;
}
```

---

## 3. Grid Item Properties
### `grid-column`
Defines how many columns an item spans.
```css
.item {
    grid-column: 1 / 3; /* Spans from column 1 to 3 */
}
```

### `grid-row`
Defines how many rows an item spans.
```css
.item {
    grid-row: 2 / 4; /* Spans from row 2 to 4 */
}
```

### `grid-area`
Shorthand for `grid-row-start`, `grid-column-start`, `grid-row-end`, and `grid-column-end`.
```css
.item {
    grid-area: 1 / 2 / 3 / 4;
}
```

---

## 4. Complete Example
```css
.container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    grid-template-rows: auto;
    gap: 10px;
}
.item {
    background: lightblue;
    padding: 20px;
    text-align: center;
}
```

---

## Conclusion
CSS Grid provides a robust way to create flexible and responsive layouts. It is ideal for designing structured grids, complex UI components, and multi-dimensional layouts.

