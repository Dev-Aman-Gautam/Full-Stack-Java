# 2.3. Box Sizing

## Introduction
Box sizing in CSS defines how the width and height of elements are calculated. It determines whether padding and borders are included in the element’s total dimensions.

---

## 1. The `box-sizing` Property
The `box-sizing` property controls how the total width and height of an element are calculated.

### Values:
1. **`content-box` (default):** The width and height only include the content. Padding and borders are added outside the defined dimensions.
2. **`border-box`:** The width and height include padding and borders, ensuring the total size remains as defined.

Example:
```css
.box {
    width: 200px;
    height: 100px;
    padding: 20px;
    border: 5px solid black;
    box-sizing: content-box; /* Default behavior */
}
```

With `box-sizing: border-box;`, the padding and border are included in the total width and height:
```css
.box {
    box-sizing: border-box;
}
```

---

## 2. Why Use `border-box`?
- Helps maintain consistent element sizing.
- Avoids unexpected layout shifts due to added padding or borders.
- Commonly used in modern layouts.

To apply `border-box` globally:
```css
* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}
```

---

## Conclusion
Using `box-sizing: border-box;` simplifies layout management and ensures consistent element dimensions. It is widely recommended for modern web design to prevent unexpected sizing issues.

