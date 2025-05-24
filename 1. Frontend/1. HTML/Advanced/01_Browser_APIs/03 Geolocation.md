# Geolocation API

The Geolocation API allows web applications to access the geographical location of a user's device. It is commonly used for location-based services such as maps, weather updates, and navigation.

## Features

- Retrieve the user's current location.
- Track the user's location in real-time.
- Provide location-based services.

## Methods

The Geolocation API provides the following methods:

### 1. `getCurrentPosition()`

Retrieves the current position of the user.

```javascript
navigator.geolocation.getCurrentPosition(successCallback, errorCallback, options);
```

- **Parameters**:
  - `successCallback`: A function executed when the location is successfully retrieved.
  - `errorCallback` (optional): A function executed when an error occurs.
  - `options` (optional): An object to configure the request (e.g., `enableHighAccuracy`, `timeout`, `maximumAge`).

- **Example**:

```javascript
navigator.geolocation.getCurrentPosition(
    (position) => {
        console.log('Latitude:', position.coords.latitude);
        console.log('Longitude:', position.coords.longitude);
    },
    (error) => {
        console.error('Error:', error.message);
    }
);
```

### 2. `watchPosition()`

Tracks the user's location and updates it whenever it changes.

```javascript
const watchId = navigator.geolocation.watchPosition(successCallback, errorCallback, options);
```

- **Example**:

```javascript
const watchId = navigator.geolocation.watchPosition(
    (position) => {
        console.log('Updated Latitude:', position.coords.latitude);
        console.log('Updated Longitude:', position.coords.longitude);
    },
    (error) => {
        console.error('Error:', error.message);
    }
);

// To stop tracking:
navigator.geolocation.clearWatch(watchId);
```

### 3. `clearWatch()`

Stops watching the user's location.

```javascript
navigator.geolocation.clearWatch(watchId);
```

## Error Handling

The `errorCallback` function provides an error object with the following properties:

- `code`: Error code (e.g., `1` for permission denied).
- `message`: A human-readable error message.

- **Example**:

```javascript
navigator.geolocation.getCurrentPosition(
    null,
    (error) => {
        switch (error.code) {
            case 1:
                console.error('Permission denied');
                break;
            case 2:
                console.error('Position unavailable');
                break;
            case 3:
                console.error('Timeout');
                break;
            default:
                console.error('Unknown error');
        }
    }
);
```

## Browser Support

The Geolocation API is supported by most modern browsers. However, it requires the website to be served over HTTPS for security reasons.

## Security and Privacy

- Always request user permission before accessing location data.
- Use location data responsibly and avoid storing sensitive information unnecessarily.

## References

- [MDN Web Docs: Geolocation API](https://developer.mozilla.org/en-US/docs/Web/API/Geolocation_API)
- [W3C Geolocation API Specification](https://www.w3.org/TR/geolocation-API/)
