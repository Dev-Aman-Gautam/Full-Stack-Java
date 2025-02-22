# Layout Basics

## Introduction
Layout is a fundamental aspect of web design, determining how elements are positioned and displayed on a webpage. CSS provides several techniques for creating effective layouts, including the box model, flexbox, grid, and positioning properties.

---

## 1. The Box Model
The CSS box model defines how elements are structured and spaced.
```css
div {
    width: 300px;
    height: 150px;
    padding: 10px;
    border: 2px solid black;
    margin: 20px;
}
```
**Components:**
- `content`: The actual content of the element.
- `padding`: Space inside the border.
- `border`: Surrounds the padding and content.
- `margin`: Space outside the border.

---

## 2. Display Property
Controls how elements are displayed on the page.
```css
display: block; /* Takes full width */
display: inline; /* Takes only needed width */
display: flex; /* Uses flexbox */
display: grid; /* Uses grid */
```

---

## 3. Positioning Elements
CSS provides different positioning techniques:
```css
position: static; /* Default position */
position: relative; /* Moves relative to itself */
position: absolute; /* Positions relative to the nearest positioned ancestor */
position: fixed; /* Stays fixed on the screen */
position: sticky; /* Sticks to a position while scrolling */
```

---

## 4. CSS Flexbox
Flexbox is used for creating flexible and responsive layouts.
```css
display: flex;
justify-content: space-between;
align-items: center;
flex-wrap: wrap;
```
**Key properties:**
- `justify-content`: Controls horizontal alignment.
- `align-items`: Controls vertical alignment.
- `flex-wrap`: Allows items to wrap when necessary.

---

## 5. CSS Grid
CSS Grid is a powerful layout system for creating complex designs.
```css
display: grid;
grid-template-columns: repeat(3, 1fr);
gap: 10px;
```
**Key properties:**
- `grid-template-columns`: Defines column structure.
- `grid-template-rows`: Defines row structure.
- `gap`: Controls spacing between grid items.

---

## 6. Responsive Layout Techniques
Creating layouts that adapt to different screen sizes.
```css
@media (max-width: 768px) {
    .container {
        flex-direction: column;
    }
}
```
Using **media queries** ensures a responsive design that adapts to different devices.

---

## Conclusion
Understanding layout techniques in CSS is crucial for building responsive, structured, and visually appealing web pages. Using the box model, flexbox, grid, and positioning correctly helps create effective designs.

