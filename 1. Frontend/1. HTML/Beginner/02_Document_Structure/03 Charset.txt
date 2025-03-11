## Charset in HTML

### What is Charset?
A **charset (character set)** in HTML defines the encoding system used to display text on a webpage correctly. It ensures that different characters, symbols, and languages appear as intended in a browser.

### Importance of Charset
- Prevents text corruption or display issues.
- Ensures proper rendering of special characters and symbols.
- Supports multiple languages on web pages.
- Enhances website compatibility across different browsers and systems.

### Declaring Charset in HTML
Charset is specified within the `<meta>` tag in the `<head>` section of an HTML document. The most commonly used encoding is **UTF-8**, which supports nearly all characters worldwide.

#### Example of Charset Declaration:
```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Charset Example</title>
</head>
<body>
    <p>This is an example of a webpage with UTF-8 encoding.</p>
</body>
</html>
```

### Commonly Used Character Encodings
1. **UTF-8** (Universal Character Set Transformation Format - 8-bit)
   - Default and most widely used encoding.
   - Supports all major languages and symbols.
   - Example declaration: `<meta charset="UTF-8">`

2. **ISO-8859-1** (Latin-1)
   - Supports Western European languages.
   - Example declaration: `<meta charset="ISO-8859-1">`

3. **UTF-16**
   - Used for languages requiring large character sets (e.g., Chinese, Japanese).
   - Example declaration: `<meta charset="UTF-16">`

### Why Use UTF-8?
- Covers a vast range of characters, including emojis and special symbols.
- Ensures consistency across different browsers and platforms.
- Eliminates issues related to incorrect character display.

### Conclusion
Using the correct charset, especially **UTF-8**, is essential for ensuring proper text representation in an HTML document. It guarantees that content is displayed correctly across various devices and languages, making webpages more accessible and user-friendly.

