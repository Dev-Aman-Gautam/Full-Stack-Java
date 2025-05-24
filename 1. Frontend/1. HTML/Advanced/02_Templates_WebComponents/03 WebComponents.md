# Web Components

Web Components are a set of web platform APIs that allow you to create reusable and encapsulated custom elements. They enable developers to build modular and maintainable web applications.

## Key Features of Web Components

1. **Custom Elements**  
    Define your own HTML elements with custom behavior.

2. **Shadow DOM**  
    Encapsulate styles and markup to prevent them from affecting the rest of the page.

3. **HTML Templates**  
    Define reusable HTML structures that can be cloned and used in your components.

4. **ES Modules**  
    Use JavaScript modules to organize and share code.

---

## Benefits of Web Components

- **Reusability**: Build components once and use them across multiple projects.
- **Encapsulation**: Avoid style and behavior conflicts with other parts of the application.
- **Interoperability**: Work seamlessly with any JavaScript framework or library.

---

## Example: Creating a Custom Element

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Web Components Example</title>
</head>
<body>
  <my-greeting></my-greeting>

  <script>
     class MyGreeting extends HTMLElement {
        constructor() {
          super();
          const shadow = this.attachShadow({ mode: 'open' });
          shadow.innerHTML = `<p>Hello, Web Components!</p>`;
        }
     }

     customElements.define('my-greeting', MyGreeting);
  </script>
</body>
</html>
```

---

## Browser Support

Web Components are supported in most modern browsers. For older browsers, you may need polyfills.

| Feature         | Chrome | Firefox | Safari | Edge | IE  |
|------------------|--------|---------|--------|------|-----|
| Custom Elements | 54+    | 63+     | 10.1+  | 79+  | No  |
| Shadow DOM      | 53+    | 63+     | 10+    | 79+  | No  |
| HTML Templates  | 26+    | 22+     | 8+     | 13+  | No  |

---

## Resources

- [MDN Web Components Guide](https://developer.mozilla.org/en-US/docs/Web/Web_Components)
- [Web Components Official Site](https://www.webcomponents.org/)
- [Can I Use - Web Components](https://caniuse.com/web-components)
