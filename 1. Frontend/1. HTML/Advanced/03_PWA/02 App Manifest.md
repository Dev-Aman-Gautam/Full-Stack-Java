# App Manifest

The App Manifest is a JSON file that provides metadata about a Progressive Web App (PWA). It allows developers to control how the app appears to users and how it behaves when installed on a device.

## Key Features of App Manifest

- Defines the app's name, icons, and theme colors.
- Enables the app to be installed on a user's home screen.
- Provides a full-screen or standalone experience.

## Basic Structure of a Manifest File

```json
{
    "name": "My PWA App",
    "short_name": "PWA",
    "start_url": "/index.html",
    "display": "standalone",
    "background_color": "#ffffff",
    "theme_color": "#000000",
    "icons": [
        {
            "src": "/images/icon-192x192.png",
            "sizes": "192x192",
            "type": "image/png"
        },
        {
            "src": "/images/icon-512x512.png",
            "sizes": "512x512",
            "type": "image/png"
        }
    ]
}
```

## Key Properties

- **name**: Full name of the app.
- **short_name**: Shortened name for display purposes.
- **start_url**: URL to launch the app.
- **display**: Defines the display mode (e.g., `standalone`, `fullscreen`, `minimal-ui`).
- **background_color**: Background color of the splash screen.
- **theme_color**: Theme color for the browser UI.
- **icons**: Array of image objects for app icons.

## Adding the Manifest to Your HTML

To link the manifest file to your HTML, use the `<link>` tag in the `<head>` section:

```html
<link rel="manifest" href="/manifest.json">
```

## Testing the Manifest

1. Use Chrome DevTools:
     - Open the **Application** tab.
     - Check the **Manifest** section.
2. Ensure all required properties are present and valid.

## Best Practices

- Use multiple icon sizes for better compatibility.
- Validate your manifest file using online tools.
- Keep the `start_url` relative to ensure flexibility.

## Resources

- [MDN Web Docs: Web App Manifest](https://developer.mozilla.org/en-US/docs/Web/Manifest)
- [Google Developers: Web App Manifest](https://web.dev/add-manifest/)
