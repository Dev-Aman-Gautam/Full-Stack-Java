# Template Element in HTML

The `<template>` element in HTML is used to declare fragments of HTML that are not rendered on the page. These fragments can be cloned and inserted into the DOM dynamically using JavaScript.

## Features of `<template>` Element

- The content inside the `<template>` tag is inert and not displayed in the DOM.
- It is useful for defining reusable HTML structures.
- The content can be accessed and manipulated using JavaScript.

## Syntax

```html
<template id="my-template">
    <div>
        <h2>Template Content</h2>
        <p>This content will be rendered dynamically.</p>
    </div>
</template>
```

## Example: Using `<template>` with JavaScript

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Template Element Example</title>
</head>
<body>
    <template id="card-template">
        <div class="card">
            <h3 class="title"></h3>
            <p class="description"></p>
        </div>
    </template>

    <div id="container"></div>

    <script>
        const template = document.getElementById('card-template');
        const container = document.getElementById('container');

        const data = [
            { title: 'Card 1', description: 'This is the first card.' },
            { title: 'Card 2', description: 'This is the second card.' },
        ];

        data.forEach(item => {
            const clone = template.content.cloneNode(true);
            clone.querySelector('.title').textContent = item.title;
            clone.querySelector('.description').textContent = item.description;
            container.appendChild(clone);
        });
    </script>
</body>
</html>
```

## Key Points

- The `<template>` element is not displayed in the DOM until its content is explicitly added using JavaScript.
- It is ideal for creating reusable components or templates for dynamic content.

## Browser Support

The `<template>` element is supported in all modern browsers. However, always check compatibility if targeting older browsers.

## References

- [MDN Web Docs: `<template>`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/template)
- [W3C Specification](https://html.spec.whatwg.org/multipage/scripting.html#the-template-element)
