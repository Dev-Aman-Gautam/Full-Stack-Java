# **Figure and Figcaption in HTML**  

## **Introduction**  
The `<figure>` and `<figcaption>` elements in HTML are used to group and describe **media content**, such as images, illustrations, diagrams, code snippets, and videos. They improve **semantic meaning** and accessibility by clearly associating captions with media elements.

---

## **1. The `<figure>` Element**  
The `<figure>` element is a **semantic container** for self-contained content like images, charts, or videos. It is commonly used with `<figcaption>` to provide a description.

### **Example: Basic Figure Usage**
```html
<figure>
    <img src="landscape.jpg" alt="A beautiful mountain landscape">
</figure>
```
✅ Groups an image as a standalone content block.

---

## **2. The `<figcaption>` Element**  
The `<figcaption>` element provides a **caption** for the `<figure>` element. It improves **SEO** and **accessibility** by giving context to the media content.

### **Example: Figure with Caption**
```html
<figure>
    <img src="sunset.jpg" alt="Sunset over the ocean">
    <figcaption>Sunset over the ocean with a clear sky.</figcaption>
</figure>
```
✅ The caption **describes** the image for better **clarity and accessibility**.

---

## **3. Benefits of Using `<figure>` and `<figcaption>`**
✔ **Improves Semantic HTML** – Provides clear meaning to images and media.  
✔ **Enhances SEO** – Search engines use captions to understand media content.  
✔ **Better Accessibility** – Screen readers read `<figcaption>` along with the image.  
✔ **Flexible Placement** – The caption can be placed **before or after** the media.  

---

## **4. Multiple Media Inside `<figure>`**  
The `<figure>` element can contain **multiple media elements**, such as an image and a video.

### **Example: Image and Video in a Figure**
```html
<figure>
    <img src="diagram.png" alt="Flowchart diagram">
    <figcaption>Figure 1: A flowchart explaining user authentication.</figcaption>
</figure>

<figure>
    <video controls>
        <source src="tutorial.mp4" type="video/mp4">
        Your browser does not support the video tag.
    </video>
    <figcaption>Video tutorial on HTML basics.</figcaption>
</figure>
```
✅ Works with images, videos, and other media types.

---

## **5. Using `<figure>` for Code Snippets**  
It’s also useful for presenting **code snippets** with a caption.

```html
<figure>
    <pre>
        <code>
        function greet() {
            console.log("Hello, World!");
        }
        </code>
    </pre>
    <figcaption>Figure 1: JavaScript function for greeting.</figcaption>
</figure>
```
✅ Great for **technical documentation**.

---

## **6. Styling `<figure>` and `<figcaption>` with CSS**  
You can style the figure and caption using CSS.

### **Example: Styling `<figure>` and `<figcaption>`**
```css
figure {
    border: 2px solid #ddd;
    padding: 10px;
    display: inline-block;
    text-align: center;
}

figcaption {
    font-style: italic;
    color: #555;
    margin-top: 5px;
}
```
✅ Makes captions visually distinct.

---

## **7. Accessibility Best Practices**
- **Use `alt` text** for images inside `<figure>` for screen readers.  
- **Ensure meaningful captions** that add value to the media content.  
- **Keep captions concise and informative**.  

---

## **Conclusion**  
The `<figure>` and `<figcaption>` elements are **essential** for structuring media content in HTML. They provide **semantic meaning, enhance accessibility, and improve SEO**. Whether for images, videos, or code snippets, using `<figure>` makes content more organized and informative. 🚀