# CSS Properties

## Introduction
CSS properties define how HTML elements are displayed on a web page. They allow developers to control layout, colors, fonts, spacing, and more. Understanding these properties is essential for designing visually appealing and responsive websites.

---

## 1. Text and Font Properties
These properties control the appearance of text.

### 1.1 Font Properties
```css
font-family: Arial, sans-serif; /* Sets the font style */
font-size: 16px; /* Controls text size */
font-weight: bold; /* Sets text thickness */
font-style: italic; /* Applies italic styling */
```

### 1.2 Text Properties
```css
color: #333; /* Sets text color */
text-align: center; /* Aligns text */
text-decoration: underline; /* Underlines text */
text-transform: uppercase; /* Converts text to uppercase */
```

---

## 2. Box Model Properties
The box model defines how elements are structured in terms of margin, border, padding, and content.

```css
width: 200px; /* Sets element width */
height: 100px; /* Sets element height */
padding: 10px; /* Space inside the element */
border: 1px solid #000; /* Defines border */
margin: 20px; /* Space outside the element */
```

---

## 3. Background Properties
Background properties define the appearance of an element's background.

```css
background-color: lightblue; /* Sets background color */
background-image: url('image.jpg'); /* Adds background image */
background-size: cover; /* Adjusts image size */
background-position: center; /* Positions image */
```

---

## 4. Display and Positioning
These properties determine how elements are positioned and displayed on a web page.

```css
display: flex; /* Uses flexbox layout */
visibility: hidden; /* Hides element but keeps space */
position: absolute; /* Positions element absolutely */
top: 20px; left: 10px; /* Adjusts position */
z-index: 10; /* Controls overlapping order */
```

---

## 5. Flexbox and Grid Properties
CSS Flexbox and Grid provide advanced layout control.

### 5.1 Flexbox Properties
```css
display: flex; /* Enables flexbox */
justify-content: center; /* Aligns items horizontally */
align-items: center; /* Aligns items vertically */
```

### 5.2 Grid Properties
```css
display: grid; /* Enables grid layout */
grid-template-columns: repeat(3, 1fr); /* Defines column structure */
gap: 10px; /* Sets spacing between grid items */
```

---

## 6. Transitions and Animations
These properties enhance user experience with smooth effects.

### 6.1 Transition
```css
transition: all 0.3s ease-in-out; /* Smooth animation */
```

### 6.2 Animation
```css
@keyframes fadeIn {
  from { opacity: 0; }
  to { opacity: 1; }
}

.element {
  animation: fadeIn 1s ease-in;
}
```

---

## Conclusion
CSS properties provide powerful tools for designing modern web applications. Mastering these properties ensures better control over page layout, styling, and responsiveness, improving the overall user experience.

