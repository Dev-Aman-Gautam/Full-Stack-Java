# HTML5 Features

HTML5 introduced several new features that enhance the functionality, efficiency, and user experience of web development. These features include new elements, improved multimedia handling, better semantics, and APIs for advanced web applications.

---

## 1. New Semantic Elements
HTML5 introduced semantic elements that define the meaning of the content, making it easier to read and maintain.

### Examples:
- `<header>` - Defines the header of a webpage or section.
- `<nav>` - Represents a navigation menu.
- `<section>` - Defines a section in a document.
- `<article>` - Represents independent content, like blog posts.
- `<aside>` - Contains related content, like sidebars.
- `<footer>` - Defines a footer for a webpage or section.

Example:
```html
<header>
    <h1>Welcome to My Website</h1>
</header>
<nav>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
    </ul>
</nav>
<section>
    <article>
        <h2>Article Title</h2>
        <p>This is an article.</p>
    </article>
</section>
<footer>
    <p>&copy; 2025 My Website</p>
</footer>
```

---

## 2. Improved Multimedia Support
HTML5 introduced new elements to handle multimedia content without plugins like Flash.

### Examples:
- `<audio>` - Embeds audio files.
- `<video>` - Embeds video files.
- `<source>` - Specifies multiple media sources.

Example:
```html
<video controls>
    <source src="video.mp4" type="video/mp4">
    Your browser does not support the video tag.
</video>
```

---

## 3. Form Enhancements
HTML5 introduced new input types and attributes to improve forms.

### New Input Types:
- `email` - Validates email addresses.
- `date` - Provides a date picker.
- `number` - Allows numeric input.
- `range` - Provides a slider.
- `search` - Optimized for search queries.

Example:
```html
<form>
    <label for="email">Email:</label>
    <input type="email" id="email" required>
    <br>
    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob">
    <br>
    <input type="submit" value="Submit">
</form>
```

---

## 4. Canvas and SVG for Graphics
HTML5 supports **Canvas** and **SVG** for rendering graphics directly in the browser.

### Canvas Example:
```html
<canvas id="myCanvas" width="200" height="100" style="border:1px solid #000;"></canvas>
<script>
    let canvas = document.getElementById("myCanvas");
    let ctx = canvas.getContext("2d");
    ctx.fillStyle = "blue";
    ctx.fillRect(20, 20, 150, 75);
</script>
```

---

## 5. Local Storage and Session Storage
HTML5 provides **localStorage** and **sessionStorage** for storing data in the browser without cookies.

### Example:
```js
// Store data
localStorage.setItem("username", "Aman");

// Retrieve data
let user = localStorage.getItem("username");
console.log(user); // Output: Aman
```

---

## 6. Geolocation API
Allows web applications to access a user’s location.

### Example:
```js
navigator.geolocation.getCurrentPosition(function(position) {
    console.log("Latitude: " + position.coords.latitude);
    console.log("Longitude: " + position.coords.longitude);
});
```

---

## 7. Responsive Web Design Features
HTML5 supports **media queries** and **flexible layouts** for responsive web design.

### Example Media Query:
```css
@media (max-width: 600px) {
    body {
        background-color: lightblue;
    }
}
```

---

## Conclusion
HTML5 introduces powerful features that improve semantics, multimedia handling, form validation, graphics, storage, and user experience. These enhancements make web development more efficient and accessible.

