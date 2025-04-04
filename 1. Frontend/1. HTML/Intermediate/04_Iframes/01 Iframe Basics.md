# **HTML `<iframe>` Basics**  

## **Introduction**  
The `<iframe>` (Inline Frame) element in HTML allows you to embed **another webpage or document** within your current webpage. It is commonly used for embedding:  
✅ Web pages  
✅ YouTube videos  
✅ Google Maps  
✅ Third-party widgets (social media feeds, forms, etc.)  

---

## **1. Basic Syntax**  
```html
<iframe src="https://example.com" width="600" height="400"></iframe>
```
✅ This embeds `example.com` inside an iframe with **600px width** and **400px height**.  

---

## **2. Common Attributes of `<iframe>`**  

| Attribute | Description | Example |
|-----------|-------------|---------|
| `src` | Specifies the URL of the page to embed | `src="https://example.com"` |
| `width` | Defines the width of the iframe | `width="800"` |
| `height` | Defines the height of the iframe | `height="500"` |
| `title` | Improves accessibility by describing the iframe content | `title="Embedded Page"` |
| `allowfullscreen` | Enables fullscreen mode (for videos) | `allowfullscreen` |
| `frameborder` | Defines the border (deprecated in HTML5) | `frameborder="0"` |
| `loading` | Lazy loads the iframe (improves performance) | `loading="lazy"` |

---

## **3. Example: Embedding YouTube Videos**
```html
<iframe width="560" height="315" src="https://www.youtube.com/embed/VIDEO_ID" allowfullscreen></iframe>
```
✅ This correctly embeds a **YouTube video**.  

---

## **4. Example: Embedding Google Maps**
```html
<iframe
  src="https://www.google.com/maps/embed?pb=YOUR_MAP_EMBED_CODE"
  width="600"
  height="450"
  style="border:0;"
  allowfullscreen>
</iframe>
```
✅ This embeds an **interactive Google Map**.  

---

## **5. Security and Restrictions**  

| Feature | Description |
|---------|-------------|
| `sandbox` | Restricts iframe behavior (prevents scripts, pop-ups, etc.) |
| `referrerpolicy` | Controls referrer information sent when loading the iframe |
| `allow` | Specifies allowed features like camera, microphone, etc. |

### **Example: Secure Iframe with Sandbox**
```html
<iframe src="https://example.com" sandbox="allow-scripts allow-same-origin"></iframe>
```
✅ This limits scripts but allows content from the same origin.  

---

## **6. Best Practices**  
✅ Use **`title`** for accessibility.  
✅ Enable **lazy loading (`loading="lazy"`)** for performance.  
✅ Use **sandboxing (`sandbox` attribute)** for security.  
✅ Avoid embedding **untrusted content** to prevent security risks.  

---

## **Conclusion**  
- `<iframe>` is a powerful tool for **embedding external content** into a webpage.  
- It is widely used for **videos, maps, forms, and external sites**.  
- Proper **security practices** (sandboxing, lazy loading) help improve performance and safety.  

By mastering `<iframe>`, you can **seamlessly integrate external resources** into your website! 🌐🎥📍