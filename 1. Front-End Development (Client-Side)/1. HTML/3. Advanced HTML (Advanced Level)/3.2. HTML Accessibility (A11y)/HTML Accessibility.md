# HTML Accessibility (A11y)

## Introduction
Web accessibility (A11y) ensures that websites and web applications are usable by everyone, including individuals with disabilities. HTML provides several features and best practices to improve accessibility.

---

## 1. Importance of Accessibility
- Makes web content usable for people with disabilities (e.g., visual, auditory, motor, cognitive impairments).
- Improves SEO and usability for all users.
- Complies with legal standards such as WCAG (Web Content Accessibility Guidelines).

---

## 2. Semantic HTML for Accessibility
Semantic HTML elements provide meaningful structure, improving screen reader navigation.

### Examples:
- Use `<header>`, `<nav>`, `<main>`, `<section>`, `<article>`, `<footer>` for proper structure.
- Avoid using `<div>` and `<span>` for content that has semantic meaning.

Example:
```html
<header>
    <h1>Website Title</h1>
</header>
<nav>
    <ul>
        <li><a href="#home">Home</a></li>
        <li><a href="#about">About</a></li>
    </ul>
</nav>
```

---

## 3. ARIA (Accessible Rich Internet Applications)
ARIA attributes enhance accessibility for interactive elements that lack native HTML support.

### Common ARIA Attributes:
- `role` – Defines the role of an element (e.g., `role="button"`).
- `aria-label` – Provides an accessible label.
- `aria-hidden` – Hides elements from screen readers.
- `aria-live` – Announces dynamic updates.

Example:
```html
<button aria-label="Submit Form">Submit</button>
```

---

## 4. Keyboard Navigation & Focus Management
Ensure users can navigate using only a keyboard:
- Use `tabindex="0"` to make elements focusable.
- Avoid removing default focus outlines.
- Use `:focus` styles for better visibility.

Example:
```css
button:focus {
    outline: 2px solid blue;
}
```

---

## 5. Text Alternatives for Non-Text Content
Provide text descriptions for images, icons, and multimedia:
- Use `alt` attributes for images.
- Provide captions and transcripts for videos.
- Use `aria-label` for icons.

Example:
```html
<img src="logo.png" alt="Company Logo">
```

---

## 6. Color Contrast & Readability
Ensure sufficient contrast between text and background:
- Use a contrast ratio of at least 4.5:1 for normal text.
- Avoid relying solely on color to convey meaning.

Example:
```css
body {
    color: #000;
    background-color: #fff;
}
```

---

## 7. Forms and Labels
Use proper labels and field associations to enhance form accessibility.

Example:
```html
<label for="email">Email:</label>
<input type="email" id="email" required>
```

---

## 8. Testing Accessibility
Use tools like:
- Chrome DevTools Accessibility Audit.
- WAVE Web Accessibility Evaluation Tool.
- Axe Accessibility Checker.

---

## Conclusion
Improving HTML accessibility ensures that all users, including those with disabilities, can interact with web content effectively. Following best practices and using semantic elements, ARIA attributes, and proper styling enhances usability and inclusivity.

