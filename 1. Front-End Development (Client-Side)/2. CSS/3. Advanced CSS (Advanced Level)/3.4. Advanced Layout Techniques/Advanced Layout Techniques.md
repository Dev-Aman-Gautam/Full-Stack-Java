# 3.4. Advanced Layout Techniques

## Introduction
Advanced layout techniques in CSS allow developers to create complex, responsive, and flexible designs efficiently. Modern CSS provides powerful tools such as CSS Grid, Flexbox, multi-column layouts, and advanced positioning techniques to structure content effectively.

---

## 1. CSS Grid
CSS Grid is a two-dimensional layout system that allows precise placement of elements in rows and columns.

### 1.1 Defining a Grid Container
```css
.container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    grid-template-rows: auto;
    gap: 20px;
}
```
This creates a three-column layout with equal width and a 20px gap between elements.

### 1.2 Placing Grid Items
```css
.item {
    grid-column: span 2;
    grid-row: 1 / 3;
}
```
This places an item spanning two columns and two rows.

---

## 2. CSS Flexbox
Flexbox is a one-dimensional layout model that arranges items in rows or columns efficiently.

### 2.1 Basic Flexbox Structure
```css
.container {
    display: flex;
    justify-content: space-between;
    align-items: center;
}
```
This distributes items evenly with equal spacing and aligns them in the center.

### 2.2 Responsive Wrapping
```css
.container {
    flex-wrap: wrap;
}
```
This ensures items wrap to the next line when the container width is insufficient.

---

## 3. Multi-Column Layout
Multi-column layout allows text to be split into multiple columns.

Example:
```css
.article {
    column-count: 3;
    column-gap: 20px;
}
```
This creates a three-column layout with a 20px gap.

---

## 4. Positioning Techniques

### 4.1 Absolute and Relative Positioning
```css
.parent {
    position: relative;
}
.child {
    position: absolute;
    top: 20px;
    left: 50px;
}
```
This positions the `.child` element relative to `.parent`.

### 4.2 Sticky Positioning
```css
.header {
    position: sticky;
    top: 0;
    background: white;
}
```
This keeps the header visible at the top when scrolling.

---

## 5. Responsive Layouts with Media Queries
Using media queries enhances responsiveness by adapting styles based on screen size.

Example:
```css
@media (max-width: 768px) {
    .container {
        flex-direction: column;
    }
}
```
This changes the layout to a vertical column on smaller screens.

---

## Conclusion
Advanced layout techniques enable developers to create sophisticated, adaptive designs. Mastering CSS Grid, Flexbox, multi-column layouts, and positioning techniques leads to more efficient and visually appealing web pages.

