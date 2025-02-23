# Introduction to React and JSX

## What is React?

React is a JavaScript library for building user interfaces, primarily for single-page applications. It was developed by Facebook and is maintained by both Facebook and a community of individual developers and companies. React allows developers to create reusable UI components, manage application state efficiently, and render dynamic content efficiently.

### Key Features of React

1. Component-Based Architecture - UI is divided into reusable components.
2. Virtual DOM - Efficient updates and rendering.
3. Unidirectional Data Flow - Predictable state management.
4. Declarative UI - Code is easier to debug and understand.
5. JSX Syntax - JavaScript syntax extension that simplifies UI development.
6. Fast Rendering - Uses a diffing algorithm to update only changed elements.

## What is JSX?

JSX (JavaScript XML) is a syntax extension for JavaScript used with React. It allows developers to write UI components using an HTML-like syntax directly in JavaScript files. JSX makes React code more readable and easier to write.

### Why Use JSX?

1. Readability - JSX looks like HTML, making it easy to understand.
2. Efficiency - React optimizes JSX for performance.
3. Prevents XSS Attacks - JSX escapes values to prevent security vulnerabilities.
4. Component Composition - Makes it easy to compose complex UIs.

### JSX Syntax and Usage

JSX allows embedding expressions and functions inside HTML-like structures.

```jsx
import React from 'react';

function Greeting() {
  const name = 'Aman';
  return <h1>Hello, {name}!</h1>;
}

export default Greeting;
```

In the above example:

- The `{name}` expression is dynamically inserted inside the JSX.
- JSX is transpiled to JavaScript using Babel.

### JSX Rules

1. Elements must be wrapped - JSX requires a single parent element.

   ```jsx
   return (
     <div>
       <h1>Hello</h1>
       <p>Welcome to React</p>
     </div>
   );
   ```

2. Self-closing tags - Elements without children must be self-closed.

   ```jsx
   <img src="logo.png" alt="Logo" />
   ```

3. Use `className` instead of `class` - Since `class` is a reserved JavaScript keyword, JSX uses `className`.

   ```jsx
   <div className="container">Hello</div>
   ```

4. Expressions inside `{}` - Embed JavaScript expressions inside curly braces.

   ```jsx
   <p>{new Date().toLocaleTimeString()}</p>
   ```

### JSX and React.createElement

JSX is syntactic sugar for `React.createElement()`. The JSX code:

```jsx
const element = <h1>Hello, World!</h1>;
```

Compiles to:

```js
const element = React.createElement('h1', null, 'Hello, World!');
```

## JSX Advantages

- Simplifies UI development.
- Avoids separate HTML and JavaScript files.
- Offers better performance with virtual DOM.
- Reduces development complexity with a component-based approach.

## Conclusion

React and JSX together provide a powerful way to build modern web applications. JSX makes writing React components more intuitive and expressive, while React itself offers a flexible and efficient way to create dynamic user interfaces.

---

## Components in React

## What are Components?

Components are the building blocks of a React application. They allow developers to break the UI into independent, reusable pieces that can be managed separately. Components make applications easier to maintain and scale.

## Types of Components

### 1. Functional Components

Functional components are JavaScript functions that return JSX. They are simple and primarily used for UI rendering.

Example:

```jsx
import React from 'react';

function Welcome() {
  return <h1>Hello, World!</h1>;
}

export default Welcome;
```

### 2. Class Components

Class components are ES6 classes that extend `React.Component` and have a render method that returns JSX.

Example:

```jsx
import React, { Component } from 'react';

class Welcome extends Component {
  render() {
    return <h1>Hello, World!</h1>;
  }
}

export default Welcome;
```

## Component Lifecycle

Class components have lifecycle methods that allow developers to run code at specific points.

### Lifecycle Methods

1. `componentDidMount` - Runs after the component is mounted.
2. `componentDidUpdate` - Runs after a component updates.
3. `componentWillUnmount` - Runs before a component is removed from the DOM.

Example:

```jsx
import React, { Component } from 'react';

class Timer extends Component {
  componentDidMount() {
    console.log('Component Mounted');
  }

  componentWillUnmount() {
    console.log('Component Unmounted');
  }

  render() {
    return <h1>Timer Component</h1>;
  }
}

export default Timer;
```

## Props and State

### Props

Props (short for properties) allow passing data between components.

Example:

```jsx
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

<Greeting name="Aman" />
```

### State

State allows components to manage dynamic data.

Example:

```jsx
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increase</button>
    </div>
  );
}

export default Counter;
```

## Conclusion**

Components are fundamental to React. Functional components are simple and efficient, while class components provide more features such as lifecycle methods. Understanding components, props, and state is essential for building React applications.
