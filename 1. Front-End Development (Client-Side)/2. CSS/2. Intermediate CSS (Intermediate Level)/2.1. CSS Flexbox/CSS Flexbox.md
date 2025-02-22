# CSS Flexbox

## Introduction
CSS Flexbox (Flexible Box Layout) is a powerful layout model designed to align and distribute space among items in a container efficiently. It helps create flexible and responsive designs with minimal code.

---

## 1. Enabling Flexbox
To use Flexbox, set the `display` property to `flex` or `inline-flex`.
```css
.container {
    display: flex; /* Enables flexbox */
}
```

---

## 2. Flex Container Properties
### `flex-direction`
Defines the direction of flex items.
```css
display: flex;
flex-direction: row; /* Default: horizontal */
flex-direction: column; /* Vertical */
```

### `justify-content`
Aligns items along the main axis.
```css
justify-content: flex-start; /* Default */
justify-content: center;
justify-content: space-between;
justify-content: space-around;
justify-content: space-evenly;
```

### `align-items`
Aligns items along the cross axis.
```css
align-items: flex-start;
align-items: center;
align-items: flex-end;
align-items: stretch;
```

### `align-content`
Aligns multiple rows along the cross axis.
```css
align-content: center;
align-content: space-between;
```

### `flex-wrap`
Controls item wrapping.
```css
flex-wrap: nowrap; /* Default */
flex-wrap: wrap;
flex-wrap: wrap-reverse;
```

---

## 3. Flex Item Properties
### `flex-grow`
Defines how much an item can grow relative to others.
```css
.item {
    flex-grow: 1; /* Takes available space */
}
```

### `flex-shrink`
Defines how much an item shrinks when space is limited.
```css
.item {
    flex-shrink: 1;
}
```

### `flex-basis`
Specifies the initial size of an item.
```css
.item {
    flex-basis: 100px;
}
```

### `order`
Defines the order of items.
```css
.item {
    order: 2;
}
```

---

## 4. Complete Example
```css
.container {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
}
.item {
    flex: 1;
    padding: 20px;
    background: lightblue;
    border: 1px solid #ccc;
}
```

---

## Conclusion
Flexbox simplifies layout design by providing powerful alignment and spacing options. It is widely used for responsive layouts, navigation bars, and dynamic UI elements.

