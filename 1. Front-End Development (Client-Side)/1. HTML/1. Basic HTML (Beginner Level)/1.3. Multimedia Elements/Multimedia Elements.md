# HTML Multimedia Elements

HTML provides several multimedia elements to integrate images, audio, video, and other media into web pages, enhancing user interaction and engagement.

---

## 1. Image Element (`<img>`)
The `<img>` tag is used to embed images in an HTML document.

### Syntax:
```html
<img src="image.jpg" alt="Description of Image">
```

### Attributes:
- `src` – Specifies the image source (URL or file path).
- `alt` – Provides alternative text for accessibility.
- `width` and `height` – Define image dimensions.

Example:
```html
<img src="photo.jpg" alt="A beautiful landscape" width="500" height="300">
```

---

## 2. Audio Element (`<audio>`)
The `<audio>` tag allows embedding audio files in a webpage.

### Syntax:
```html
<audio controls>
    <source src="audio.mp3" type="audio/mpeg">
    Your browser does not support the audio element.
</audio>
```

### Attributes:
- `controls` – Displays playback controls.
- `autoplay` – Plays the audio automatically when the page loads.
- `loop` – Repeats the audio file indefinitely.
- `muted` – Starts the audio muted.

Example:
```html
<audio controls>
    <source src="song.mp3" type="audio/mpeg">
</audio>
```

---

## 3. Video Element (`<video>`)
The `<video>` tag allows embedding video files.

### Syntax:
```html
<video width="600" height="400" controls>
    <source src="video.mp4" type="video/mp4">
    Your browser does not support the video tag.
</video>
```

### Attributes:
- `controls` – Displays video playback controls.
- `autoplay` – Starts playing the video automatically.
- `loop` – Repeats the video.
- `poster` – Specifies an image to show before playback starts.

Example:
```html
<video width="500" controls>
    <source src="movie.mp4" type="video/mp4">
</video>
```

---

## 4. Embed Element (`<embed>`)
The `<embed>` tag is used to embed external applications, such as PDF viewers or multimedia players.

### Syntax:
```html
<embed src="file.pdf" width="800" height="600">
```

### Attributes:
- `src` – Specifies the embedded file's source.
- `width` and `height` – Define the size of the embedded content.

Example:
```html
<embed src="video.mp4" type="video/mp4" width="500" height="300">
```

---

## 5. Object Element (`<object>`)
The `<object>` tag is used to embed multimedia files, such as Flash animations or PDFs.

### Syntax:
```html
<object data="file.pdf" type="application/pdf" width="800" height="600"></object>
```

### Attributes:
- `data` – Specifies the source of the embedded file.
- `type` – Defines the MIME type.
- `width` and `height` – Define dimensions.

Example:
```html
<object data="presentation.pdf" type="application/pdf" width="600" height="400"></object>
```

---

## 6. Iframe Element (`<iframe>`)
The `<iframe>` tag embeds another webpage inside the current page.

### Syntax:
```html
<iframe src="https://example.com" width="800" height="600"></iframe>
```

### Attributes:
- `src` – Specifies the URL of the page to embed.
- `width` and `height` – Define the dimensions.

Example:
```html
<iframe src="https://www.youtube.com/embed/videoID" width="600" height="400" allowfullscreen></iframe>
```

---


