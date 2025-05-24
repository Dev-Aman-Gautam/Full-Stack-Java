# **HTML5 `<video>` Element**  

## **Introduction**  
The `<video>` element in HTML5 allows embedding **video files** directly into a webpage without third-party plugins like Flash. It provides built-in **controls for play, pause, volume adjustment, and full-screen mode**, making video integration seamless across modern web browsers.  

---

## **1. Basic Syntax of `<video>`**  
A simple way to add a video file is:  
```html
<video controls width="600">
    <source src="video.mp4" type="video/mp4">
    Your browser does not support the video tag.
</video>
```
✅ The `controls` attribute **displays playback buttons**.  
✅ The `<source>` tag allows **multiple video formats** for better browser support.  

---

## **2. Supported Video Formats**  
Different browsers support different video file types. To ensure compatibility, use multiple formats:  

| Format  | File Extension | Supported Browsers |
|---------|--------------|-------------------|
| MP4     | `.mp4`       | Chrome, Firefox, Edge, Safari, Opera |
| WebM    | `.webm`      | Chrome, Firefox, Edge, Opera |
| Ogg     | `.ogv`       | Chrome, Firefox, Opera |

### **Example: Providing Multiple Formats**
```html
<video controls width="600">
    <source src="video.mp4" type="video/mp4">
    <source src="video.webm" type="video/webm">
    <source src="video.ogv" type="video/ogg">
    Your browser does not support the video element.
</video>
```
✅ The browser **plays the first supported format**.  

---

## **3. Video Attributes**  

| Attribute   | Description |
|-------------|-------------|
| `controls`  | Displays built-in video controls (play, pause, volume, fullscreen). |
| `autoplay`  | Starts playing the video automatically when the page loads. |
| `loop`      | Repeats the video indefinitely. |
| `muted`     | Starts the video in a muted state. |
| `poster`    | Displays an image before the video loads or plays. |
| `preload`   | Specifies how the browser loads the video file (`auto`, `metadata`, `none`). |

### **Example: Using Different Attributes**
```html
<video controls autoplay loop muted poster="thumbnail.jpg" width="600">
    <source src="movie.mp4" type="video/mp4">
</video>
```
✅ This **autoplays** the video, **loops it continuously**, starts **muted**, and shows a **thumbnail image** before playing.  

---

## **4. Controlling Video with JavaScript**  
You can use JavaScript to play, pause, and control the video dynamically.  

### **Example: JavaScript Video Controls**
```html
<video id="myVideo" width="600">
    <source src="video.mp4" type="video/mp4">
</video>

<button onclick="playVideo()">Play</button>
<button onclick="pauseVideo()">Pause</button>

<script>
    var video = document.getElementById("myVideo");

    function playVideo() {
        video.play();
    }

    function pauseVideo() {
        video.pause();
    }
</script>
```
✅ Users can **play and pause the video** using buttons.  

---

## **5. Accessibility & Best Practices**  
- **Use `<video>` with `controls`** for user-friendly playback.  
- **Provide subtitles or captions** using the `<track>` element for accessibility.  
- **Avoid autoplay unless necessary**, as it can be disruptive.  
- **Provide multiple formats** for better browser support.  

### **Example: Adding Captions (`<track>` Tag)**
```html
<video controls width="600">
    <source src="video.mp4" type="video/mp4">
    <track src="subtitles.vtt" kind="subtitles" srclang="en" label="English">
</video>
```
✅ This adds **subtitles** for users with hearing impairments.  

---

## **Conclusion**  
The `<video>` element provides **seamless video playback** on webpages.  
- **Supports MP4, WebM, and Ogg formats.**  
- **Includes built-in controls, autoplay, looping, and JavaScript integration.**  
- **Enhances accessibility with subtitles and user-friendly features.**  

Using `<video>`, you can **embed tutorials, ads, entertainment, and educational videos efficiently** in modern web design. 🎥