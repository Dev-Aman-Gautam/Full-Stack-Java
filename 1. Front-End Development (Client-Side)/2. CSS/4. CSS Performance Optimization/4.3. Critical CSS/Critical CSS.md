# 4.3. Critical CSS

## Introduction

Critical CSS is an optimization technique that extracts and inlines the CSS required for above-the-fold content to speed up page rendering. By prioritizing essential styles, Critical CSS helps reduce render-blocking resources, leading to faster page load times and improved user experience.

---

## 1. Benefits of Critical CSS

- **Faster First Paint & First Contentful Paint (FCP)** – Ensures key content is styled immediately.
- **Reduces Render-Blocking CSS** – Prevents the browser from waiting for the full CSS file to load.
- **Improves Core Web Vitals** – Enhances metrics like Largest Contentful Paint (LCP) and Time to Interactive (TTI).
- **Better SEO & User Experience** – Faster pages improve search rankings and engagement.

---

## 2. How Critical CSS Works

The concept involves:

1. **Extracting only the styles needed for above-the-fold content.**
2. **Inlining the extracted CSS directly in the `<head>` of the HTML document.**
3. **Loading the rest of the CSS asynchronously.**

### Example:
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        /* Critical CSS */
        body { font-family: Arial, sans-serif; background: #f4f4f4; }
        h1 { color: #333; }
    </style>
    <link rel="stylesheet" href="styles.css" media="print" onload="this.media='all'">
    <noscript><link rel="stylesheet" href="styles.css"></noscript>
</head>
<body>
    <h1>Welcome to My Website</h1>
</body>
</html>
```
Here, Critical CSS is inlined while the full `styles.css` file loads asynchronously.

---

## 3. Generating Critical CSS

### 3.1 Manual Extraction
- Identify key styles using browser dev tools.
- Copy and inline them into the HTML `<head>`.

### 3.2 Automated Tools
- **Google Lighthouse** – Audits pages for render-blocking CSS.
- **PurgeCSS** – Removes unused CSS, helping identify critical styles.
- **Critical (npm package)** – Extracts and inlines Critical CSS automatically.

#### Using Critical npm Package:
```bash
npm install critical --save-dev
```
```javascript
const critical = require('critical');
critical.generate({
    inline: true,
    base: 'dist/',
    src: 'index.html',
    target: 'index-critical.html',
    width: 1300,
    height: 900
});
```

---

## 4. Best Practices for Critical CSS

- **Extract only essential styles** to avoid bloating the HTML.
- **Use media attributes (`media="print" onload="this.media='all'"`)** to load the rest of the CSS non-blockingly.
- **Test performance improvements** using Google Lighthouse or WebPageTest.
- **Regularly update Critical CSS** when the page structure changes.

---

## Conclusion

Critical CSS is a powerful technique to improve website performance by optimizing above-the-fold rendering. By extracting, inlining, and deferring non-essential styles, developers can achieve faster load times, enhanced SEO rankings, and a smoother user experience.

