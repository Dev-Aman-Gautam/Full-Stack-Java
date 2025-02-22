# 3.5. Advanced Transitions and Animations

## Introduction
CSS provides powerful tools for creating smooth transitions and animations, enhancing user experience. Advanced techniques involve keyframes, easing functions, and performance optimization.

---

## 1. CSS Transitions
Transitions allow smooth property changes over time.

### 1.1 Basic Transition
```css
button {
    background-color: blue;
    transition: background-color 0.3s ease-in-out;
}
button:hover {
    background-color: red;
}
```
This smoothly transitions the background color in 0.3 seconds.

### 1.2 Transition Multiple Properties
```css
div {
    transition: transform 0.5s ease, opacity 0.5s linear;
}
div:hover {
    transform: scale(1.2);
    opacity: 0.8;
}
```
This scales and fades the element smoothly.

---

## 2. CSS Animations
Animations use keyframes to create more complex movements.

### 2.1 Defining Keyframes
```css
@keyframes slideIn {
    from {
        transform: translateX(-100%);
        opacity: 0;
    }
    to {
        transform: translateX(0);
        opacity: 1;
    }
}
```

### 2.2 Applying Animation
```css
div {
    animation: slideIn 1s ease-in-out;
}
```
This smoothly moves and fades in an element.

### 2.3 Infinite Animation
```css
div {
    animation: bounce 2s infinite alternate;
}
@keyframes bounce {
    0% {
        transform: translateY(0);
    }
    100% {
        transform: translateY(-20px);
    }
}
```
This makes the element bounce indefinitely.

---

## 3. Easing Functions
Easing functions control the speed of animations.

- `ease-in`: Starts slow, speeds up
- `ease-out`: Starts fast, slows down
- `ease-in-out`: Smooth acceleration and deceleration
- `cubic-bezier(x1, y1, x2, y2)`: Custom easing function

Example:
```css
div {
    animation: fadeIn 2s cubic-bezier(0.42, 0, 0.58, 1);
}
```

---

## 4. Performance Optimization
To ensure smooth animations:
- Use `transform` and `opacity` instead of `width`, `height`, `margin`
- Use `will-change: transform;` to optimize rendering
- Avoid excessive animations that affect page performance

Example:
```css
div {
    will-change: transform;
}
```

---

## Conclusion
Advanced transitions and animations enhance user engagement. Proper use of easing, keyframes, and performance techniques ensures smooth and efficient animations.

