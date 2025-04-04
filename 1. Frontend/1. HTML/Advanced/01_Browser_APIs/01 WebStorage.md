# Web Storage API

The Web Storage API provides mechanisms by which browsers can store key-value pairs, in a much more intuitive fashion than using cookies.

## Types of Web Storage

1. **Local Storage**:
    - Stores data with no expiration time.
    - Data persists even after the browser is closed and reopened.

2. **Session Storage**:
    - Stores data for the duration of the page session.
    - Data is cleared when the page is closed.

## Key Features

- Data is stored as key-value pairs.
- Storage is specific to the origin (protocol, domain, and port).
- Accessible only via JavaScript, not sent with HTTP requests.

## Methods

### Common Methods for `localStorage` and `sessionStorage`

| Method               | Description                                      |
|----------------------|--------------------------------------------------|
| `setItem(key, value)` | Adds a key-value pair to storage.                |
| `getItem(key)`        | Retrieves the value associated with the key.     |
| `removeItem(key)`     | Removes the key-value pair from storage.         |
| `clear()`             | Clears all key-value pairs in the storage.       |
| `key(index)`          | Returns the key at the specified index.          |

## Example Usage

### Local Storage Example

```javascript
// Store data
localStorage.setItem('username', 'JohnDoe');

// Retrieve data
const username = localStorage.getItem('username');
console.log(username); // Output: JohnDoe

// Remove data
localStorage.removeItem('username');

// Clear all data
localStorage.clear();
```

### Session Storage Example

```javascript
// Store data
sessionStorage.setItem('sessionID', '12345');

// Retrieve data
const sessionID = sessionStorage.getItem('sessionID');
console.log(sessionID); // Output: 12345

// Remove data
sessionStorage.removeItem('sessionID');

// Clear all data
sessionStorage.clear();
```

## Use Cases

- **Local Storage**:
  - Storing user preferences.
  - Caching data for offline use.

- **Session Storage**:
  - Temporary data storage during a single session.
  - Storing form data temporarily.

## Limitations

- Limited storage capacity (typically 5-10 MB).
- Only supports string data (use `JSON.stringify()` and `JSON.parse()` for objects).
- Not suitable for sensitive data (e.g., passwords).

## Browser Support

The Web Storage API is supported by all modern browsers, including:

- Google Chrome
- Mozilla Firefox
- Microsoft Edge
- Safari
- Opera

## References

- [MDN Web Docs: Web Storage API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Storage_API)
- [W3C Specification](https://www.w3.org/TR/webstorage/)
