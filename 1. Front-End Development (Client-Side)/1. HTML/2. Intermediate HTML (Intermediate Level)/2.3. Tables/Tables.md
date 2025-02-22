# HTML Tables

HTML tables allow you to organize and display data in a structured format using rows and columns.

---

## 1. Basic Table Structure
An HTML table is created using the `<table>` element, with rows defined by `<tr>` and columns (cells) by `<td>`.

Example:
```html
<table border="1">
    <tr>
        <td>Row 1, Column 1</td>
        <td>Row 1, Column 2</td>
    </tr>
    <tr>
        <td>Row 2, Column 1</td>
        <td>Row 2, Column 2</td>
    </tr>
</table>
```

---

## 2. Table Headings
Use the `<th>` element instead of `<td>` for header cells.
```html
<table border="1">
    <tr>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>Alice</td>
        <td>25</td>
    </tr>
</table>
```

---

## 3. Table Attributes
### `border` Attribute
Defines a border around the table.
```html
<table border="1">
    ...
</table>
```

### `cellpadding` and `cellspacing`
- `cellpadding`: Adds space inside each cell.
- `cellspacing`: Adds space between cells.
```html
<table border="1" cellpadding="5" cellspacing="5">
    ...
</table>
```

---

## 4. Table Sections
Tables can be divided into sections using `<thead>`, `<tbody>`, and `<tfoot>`.
```html
<table border="1">
    <thead>
        <tr>
            <th>Name</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Bob</td>
            <td>30</td>
        </tr>
    </tbody>
    <tfoot>
        <tr>
            <td colspan="2">Footer Content</td>
        </tr>
    </tfoot>
</table>
```

---

## 5. Merging Cells
### `colspan` Attribute
Merges multiple columns into a single cell.
```html
<tr>
    <td colspan="2">Merged Columns</td>
</tr>
```

### `rowspan` Attribute
Merges multiple rows into a single cell.
```html
<tr>
    <td rowspan="2">Merged Rows</td>
    <td>Row 1, Column 2</td>
</tr>
<tr>
    <td>Row 2, Column 2</td>
</tr>
```

---

## 6. Styling Tables with CSS
Tables can be styled using CSS to improve readability and design.
```css
table {
    width: 100%;
    border-collapse: collapse;
}
th, td {
    border: 1px solid black;
    padding: 8px;
    text-align: left;
}
th {
    background-color: #f2f2f2;
}
```

Applying the CSS to an HTML table:
```html
<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>John</td>
        <td>28</td>
    </tr>
</table>
```

---


