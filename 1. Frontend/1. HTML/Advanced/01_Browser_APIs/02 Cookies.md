# Cookies in Browser APIs

Cookies are small pieces of data stored on the user's computer by the web browser while browsing a website. They are used to remember information about the user, such as login credentials, preferences, or tracking data.

---

## Types of Cookies

1. **Session Cookies**: Temporary cookies that are deleted when the browser is closed.
2. **Persistent Cookies**: Stored on the user's device until they expire or are manually deleted.
3. **Secure Cookies**: Transmitted over HTTPS to ensure data security.
4. **HttpOnly Cookies**: Accessible only by the server, not by JavaScript.
5. **SameSite Cookies**: Restrict cross-site requests to prevent CSRF attacks.

---

## Setting Cookies

Cookies can be set using JavaScript or HTTP headers.

### Using JavaScript

```javascript
document.cookie = "username=JohnDoe; expires=Fri, 31 Dec 2023 23:59:59 GMT; path=/";
```

### Using HTTP Headers

```http
Set-Cookie: username=JohnDoe; Expires=Fri, 31 Dec 2023 23:59:59 GMT; Path=/; Secure; HttpOnly
```

---

## Reading Cookies

Using JavaScript

```javascript
console.log(document.cookie);
```

---

## Deleting Cookies

To delete a cookie, set its expiration date to a past date:

```javascript
document.cookie = "username=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/";
```

---

## Best Practices

- Use `Secure` and `HttpOnly` flags for sensitive data.
- Set `SameSite` attribute to prevent CSRF attacks.
- Avoid storing sensitive information in cookies.

---

## References

- [MDN Web Docs: Cookies](https://developer.mozilla.org/en-US/docs/Web/HTTP/Cookies)
- [OWASP: Cookie Security](https://owasp.org/www-community/controls/SecureCookieAttribute)
