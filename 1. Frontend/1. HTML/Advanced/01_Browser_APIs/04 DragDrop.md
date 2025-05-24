# Drag and Drop API

The Drag and Drop API allows users to drag and drop elements within a web page or between applications. It provides a user-friendly way to interact with content.

## Key Concepts

### 1. Draggable Attribute

- To make an element draggable, set the `draggable` attribute to `true`.

```html
<div draggable="true">Drag me!</div>
```

### 2. Events

The Drag and Drop API uses several events:

- `dragstart`: Fires when dragging starts.
- `drag`: Fires while the element is being dragged.
- `dragend`: Fires when dragging ends.
- `dragenter`: Fires when a dragged item enters a valid drop target.
- `dragover`: Fires when a dragged item is over a valid drop target.
- `dragleave`: Fires when a dragged item leaves a valid drop target.
- `drop`: Fires when the dragged item is dropped.

### 3. Data Transfer

The `DataTransfer` object is used to hold data during a drag-and-drop operation.

## Example

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Drag and Drop Example</title>
    <style>
        .dropzone {
            width: 200px;
            height: 200px;
            border: 2px dashed #ccc;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-top: 20px;
        }
        .drag-item {
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            cursor: grab;
        }
    </style>
</head>
<body>
    <div class="drag-item" draggable="true" id="dragItem">Drag Me</div>
    <div class="dropzone" id="dropZone">Drop Here</div>

    <script>
        const dragItem = document.getElementById('dragItem');
        const dropZone = document.getElementById('dropZone');

        dragItem.addEventListener('dragstart', (e) => {
            e.dataTransfer.setData('text/plain', dragItem.id);
        });

        dropZone.addEventListener('dragover', (e) => {
            e.preventDefault();
        });

        dropZone.addEventListener('drop', (e) => {
            e.preventDefault();
            const data = e.dataTransfer.getData('text/plain');
            const draggedElement = document.getElementById(data);
            dropZone.appendChild(draggedElement);
        });
    </script>
</body>
</html>
```

## Browser Support

The Drag and Drop API is supported in most modern browsers. However, some features may require polyfills for older browsers.

## References

- [MDN Web Docs: Drag and Drop API](https://developer.mozilla.org/en-US/docs/Web/API/HTML_Drag_and_Drop_API)
