# **Special Characters in HTML**  

## **1. Introduction**  
Special characters in HTML are symbols that cannot be typed directly or have special meanings in HTML. They are represented using **HTML entities** (named codes or numeric codes).  

**Example:**  
✅ `<` is written as `&lt;`  
✅ `©` is written as `&copy;`  

---

## **2. Commonly Used Special Characters**  

### **2.1 Reserved Characters**  
These are symbols that have a special meaning in HTML and must be **escaped** to display correctly.  

| **Character** | **Description** | **Entity Code** |
|--------------|----------------|-----------------|
| `<` | Less than | `&lt;` |
| `>` | Greater than | `&gt;` |
| `&` | Ampersand | `&amp;` |
| `"` | Double Quote | `&quot;` |
| `'` | Single Quote | `&apos;` |

**Example:**  
```html
<p>Use &lt;p&gt; to define a paragraph.</p>
```
✅ This displays: `Use <p> to define a paragraph.`  

---

### **2.2 Mathematical Symbols**  

| **Symbol** | **Description** | **Entity Code** |
|-----------|---------------|-----------------|
| `×` | Multiplication | `&times;` |
| `÷` | Division | `&divide;` |
| `±` | Plus-Minus | `&plusmn;` |
| `√` | Square Root | `&radic;` |
| `≈` | Approximately Equal | `&asymp;` |

**Example:**  
```html
<p>The result is 5 &times; 3 = 15.</p>
```
✅ Displays: **The result is 5 × 3 = 15.**  

---

### **2.3 Currency Symbols**  

| **Symbol** | **Description** | **Entity Code** |
|-----------|---------------|-----------------|
| `$` | Dollar | `&#36;` |
| `€` | Euro | `&euro;` |
| `£` | Pound | `&pound;` |
| `¥` | Yen | `&yen;` |
| `₹` | Rupee | `&#8377;` |

**Example:**  
```html
<p>The price is &pound;50 or &euro;60.</p>
```
✅ Displays: **The price is £50 or €60.**  

---

### **2.4 Punctuation & Miscellaneous Symbols**  

| **Symbol** | **Description** | **Entity Code** |
|-----------|---------------|-----------------|
| `©` | Copyright | `&copy;` |
| `®` | Registered | `&reg;` |
| `™` | Trademark | `&trade;` |
| `°` | Degree | `&deg;` |
| `✓` | Check Mark | `&check;` |

**Example:**  
```html
<p>Copyright &copy; 2024. All rights reserved.</p>
```
✅ Displays: **Copyright © 2024. All rights reserved.**  

---

### **2.5 Arrows & Directional Symbols**  

| **Symbol** | **Description** | **Entity Code** |
|-----------|---------------|-----------------|
| `←` | Left Arrow | `&larr;` |
| `→` | Right Arrow | `&rarr;` |
| `↑` | Up Arrow | `&uarr;` |
| `↓` | Down Arrow | `&darr;` |
| `↔` | Left-Right Arrow | `&harr;` |

**Example:**  
```html
<p>Click &rarr; to continue.</p>
```
✅ Displays: **Click → to continue.**  

---

## **3. Using Unicode for Special Characters**  
Instead of named entities, you can use **Unicode character codes** in HTML.  

**Example:**  
```html
<p>The Unicode for the heart symbol is &#9829; ♥</p>
```
✅ Displays: **The Unicode for the heart symbol is ♥**  

---

## **4. Why Use Special Characters?**  
✔ Ensures **compatibility** across browsers.  
✔ Prevents **HTML errors** by escaping reserved symbols.  
✔ Supports **international symbols and languages**.  

---

## **Conclusion**  
HTML special characters are essential for displaying **symbols, reserved characters, and special icons** correctly. Using **HTML entities** ensures cross-browser **compatibility and correct rendering** of content. 🎯