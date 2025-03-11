# **Input Elements in HTML**

## **Introduction**
HTML provides various **input elements** to collect user data in web forms. These input fields allow users to enter different types of data, such as text, numbers, dates, passwords, and more. The `<input>` tag is the most commonly used element for form inputs.

---

## **Basic Syntax of an Input Element**
```html
<input type="text" name="username" placeholder="Enter your name">
```
✔ **`type`** → Defines the type of input (e.g., text, password, email).  
✔ **`name`** → Identifies the input field in the form submission.  
✔ **`placeholder`** → Displays a hint inside the field.  

---

## **Types of Input Elements**
### **1. Text Input (`type="text"`)**
Used for single-line text input.
```html
<label for="name">Name:</label>
<input type="text" id="name" name="name" placeholder="Enter your name">
```

---

### **2. Password Input (`type="password"`)**
Masks user input for security.
```html
<label for="password">Password:</label>
<input type="password" id="password" name="password" placeholder="Enter your password">
```

---

### **3. Email Input (`type="email"`)**
Validates email format.
```html
<label for="email">Email:</label>
<input type="email" id="email" name="email" placeholder="example@mail.com">
```

---

### **4. Number Input (`type="number"`)**
Accepts only numerical values.
```html
<label for="age">Age:</label>
<input type="number" id="age" name="age" min="1" max="100">
```

---

### **5. Date Input (`type="date"`)**
Provides a date picker.
```html
<label for="dob">Date of Birth:</label>
<input type="date" id="dob" name="dob">
```

---

### **6. Time Input (`type="time"`)**
Allows users to select a time.
```html
<label for="appt">Select Time:</label>
<input type="time" id="appt" name="appt">
```

---

### **7. Checkbox (`type="checkbox"`)**
Allows multiple selections.
```html
<label>Select your hobbies:</label>
<input type="checkbox" name="hobby" value="reading"> Reading
<input type="checkbox" name="hobby" value="sports"> Sports
```

---

### **8. Radio Buttons (`type="radio"`)**
Allows only one selection from a group.
```html
<label>Gender:</label>
<input type="radio" name="gender" value="male"> Male
<input type="radio" name="gender" value="female"> Female
```

---

### **9. Dropdown Selection (`<select>`)**
Creates a dropdown menu.
```html
<label for="country">Choose a country:</label>
<select id="country" name="country">
    <option value="us">USA</option>
    <option value="uk">UK</option>
    <option value="in">India</option>
</select>
```

---

### **10. File Upload (`type="file"`)**
Allows users to upload files.
```html
<label for="file">Upload File:</label>
<input type="file" id="file" name="file">
```

---

### **11. Search Box (`type="search"`)**
Provides a search input.
```html
<label for="search">Search:</label>
<input type="search" id="search" name="search" placeholder="Search here...">
```

---

### **12. Telephone Input (`type="tel"`)**
Accepts phone numbers.
```html
<label for="phone">Phone Number:</label>
<input type="tel" id="phone" name="phone" pattern="[0-9]{10}" placeholder="Enter 10-digit number">
```

---

### **13. URL Input (`type="url"`)**
Validates URLs.
```html
<label for="website">Website:</label>
<input type="url" id="website" name="website" placeholder="https://example.com">
```

---

### **14. Color Picker (`type="color"`)**
Lets users select a color.
```html
<label for="favcolor">Pick a color:</label>
<input type="color" id="favcolor" name="favcolor">
```

---

### **15. Range Slider (`type="range"`)**
Creates a slider input.
```html
<label for="volume">Volume:</label>
<input type="range" id="volume" name="volume" min="0" max="100">
```

---

### **16. Hidden Input (`type="hidden"`)**
Stores data without displaying it to users.
```html
<input type="hidden" name="userid" value="12345">
```

---

## **Attributes for Input Elements**
### **1. `required` (Makes Input Mandatory)**
```html
<input type="text" name="name" required>
```

### **2. `readonly` (Non-Editable Input)**
```html
<input type="text" name="country" value="USA" readonly>
```

### **3. `disabled` (Disables Input)**
```html
<input type="text" name="username" disabled>
```

### **4. `maxlength` (Limits Character Count)**
```html
<input type="text" name="username" maxlength="10">
```

### **5. `pattern` (Regex-Based Validation)**
```html
<input type="text" name="zipcode" pattern="[0-9]{5}" title="Enter a 5-digit zip code">
```

---

## **Styling Input Elements with CSS**
```css
input {
    width: 100%;
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
}
input:focus {
    border-color: blue;
    outline: none;
}
```

---

## **Conclusion**
HTML input elements are essential for **user interaction** and **data collection** in forms. By using different input types and attributes, you can create **user-friendly and accessible** forms that improve data validation and enhance the user experience. 🚀