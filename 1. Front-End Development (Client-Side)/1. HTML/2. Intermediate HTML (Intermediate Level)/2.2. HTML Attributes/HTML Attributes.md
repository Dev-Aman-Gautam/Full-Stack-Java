# HTML Attributes

HTML attributes provide additional information about HTML elements. They define properties and behaviors for elements, making them more functional and interactive.

---

## 1. What are HTML Attributes?
- Attributes are used inside HTML tags to modify their behavior.
- They are written as `name="value"` pairs inside the opening tag.
- Most attributes apply to specific HTML elements.

Example:
```html
<a href="https://example.com">Visit Example</a>
```

In this example, `href` is an attribute that defines the link destination.

---

## 2. Common HTML Attributes

### `id` Attribute
Defines a unique identifier for an element.
```html
<p id="intro">This is an introduction.</p>
```

### `class` Attribute
Assigns one or more classes to an element for styling and scripting.
```html
<p class="highlight">This text is highlighted.</p>
```

### `style` Attribute
Applies inline CSS styles to an element.
```html
<p style="color: red; font-size: 16px;">Styled text.</p>
```

### `title` Attribute
Provides extra information as a tooltip when hovered.
```html
<p title="This is a tooltip">Hover over me</p>
```

### `alt` Attribute
Defines alternative text for images (used for accessibility and SEO).
```html
<img src="image.jpg" alt="A beautiful sunset">
```

### `href` Attribute
Specifies the URL for links.
```html
<a href="https://example.com">Go to Example</a>
```

### `src` Attribute
Defines the source of an embedded resource (e.g., images, videos).
```html
<img src="picture.jpg" alt="A scenic view">
```

### `width` and `height` Attributes
Set the dimensions of an image or other elements.
```html
<img src="image.jpg" width="300" height="200">
```

### `placeholder` Attribute
Defines a hint for input fields.
```html
<input type="text" placeholder="Enter your name">
```

### `disabled` Attribute
Disables an input field.
```html
<input type="text" disabled>
```

### `readonly` Attribute
Prevents an input field from being edited.
```html
<input type="text" value="Cannot edit" readonly>
```

### `required` Attribute
Makes an input field mandatory.
```html
<input type="email" required>
```

### `checked` Attribute
Sets a checkbox or radio button as pre-selected.
```html
<input type="checkbox" checked> Subscribe to newsletter
```

### `maxlength` Attribute
Limits the number of characters in an input field.
```html
<input type="text" maxlength="10">
```

### `name` Attribute
Assigns a name to an input field for form submission.
```html
<input type="text" name="username">
```

---

## 3. Global Attributes
Global attributes can be used with most HTML elements.
| Attribute | Description |
|-----------|------------|
| `id` | Unique identifier |
| `class` | Assigns class names |
| `style` | Inline CSS styling |
| `title` | Tooltip text |
| `lang` | Defines the language |
| `dir` | Text direction (`ltr`, `rtl`) |
| `tabindex` | Keyboard navigation order |

Example:
```html
<p id="intro" class="highlight" title="Introduction">Welcome to HTML</p>
```

---

## 4. Data Attributes
Custom attributes used for storing extra data in HTML elements.
```html
<div data-user="1234" data-role="admin">User Info</div>
```

JavaScript can access these attributes:
```js
let userRole = document.querySelector("div").dataset.role;
console.log(userRole); // Output: admin
```

---

