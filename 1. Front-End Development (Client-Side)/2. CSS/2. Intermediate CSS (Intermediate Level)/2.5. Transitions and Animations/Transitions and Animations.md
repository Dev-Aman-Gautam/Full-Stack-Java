# 2.5. Transitions and Animations

## Introduction
CSS transitions and animations allow for smooth visual effects, enhancing user experience without requiring JavaScript.

---

## 1. CSS Transitions
Transitions enable smooth changes between property values over a duration.

### Syntax:
```css
selector {
    transition: property duration timing-function delay;
}
```

### Example:
```css
div {
    width: 100px;
    height: 100px;
    background-color: blue;
    transition: background-color 0.5s ease-in-out;
}

div:hover {
    background-color: red;
}
```

### Transition Properties:
- `transition-property`: Specifies the property to animate (e.g., `background-color`, `width`).
- `transition-duration`: Defines the time taken for the transition.
- `transition-timing-function`: Controls the acceleration (`ease`, `linear`, `ease-in`, `ease-out`, etc.).
- `transition-delay`: Adds a delay before the transition starts.

---

## 2. CSS Animations
Animations allow multiple state changes over time.

### Keyframe Animations:
```css
@keyframes fadeIn {
    from {
        opacity: 0;
    }
    to {
        opacity: 1;
    }
}
```

### Applying an Animation:
```css
div {
    animation: fadeIn 2s ease-in-out;
}
```

### Animation Properties:
- `animation-name`: Specifies the keyframes name.
- `animation-duration`: Defines how long the animation runs.
- `animation-timing-function`: Controls speed variation (`ease`, `linear`, etc.).
- `animation-delay`: Delays animation start.
- `animation-iteration-count`: Defines repetition (e.g., `infinite`, `1`, `3`).
- `animation-direction`: Sets playback direction (`normal`, `reverse`, `alternate`).

### Example:
```css
@keyframes bounce {
    0%, 100% {
        transform: translateY(0);
    }
    50% {
        transform: translateY(-20px);
    }
}

div {
    animation: bounce 1s infinite alternate;
}
```

---

## 3. Combining Transitions and Animations
Transitions and animations can be combined for enhanced effects.
```css
div:hover {
    animation: bounce 0.5s ease-in-out;
}
```

---

## Conclusion
CSS transitions and animations enhance user interfaces by providing smooth, engaging effects. Understanding them enables dynamic, interactive designs without JavaScript.

