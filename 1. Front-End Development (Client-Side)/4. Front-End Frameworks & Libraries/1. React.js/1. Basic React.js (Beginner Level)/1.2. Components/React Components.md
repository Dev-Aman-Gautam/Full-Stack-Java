# React.js Components

## Introduction

React.js is a JavaScript library used for building user interfaces, particularly single-page applications where UI components need to be updated dynamically. At the core of React are **components**, which are reusable, self-contained pieces of UI that help break down complex applications into smaller, manageable parts.

## Types of Components in React

React components can be broadly classified into two categories:

1. **Class Components** (Older approach)
2. **Function Components** (Modern approach, introduced with Hooks)

## 1. Class Components

Class components were the primary way to create components before React 16.8. They are ES6 classes that extend `React.Component` and must include a `render()` method that returns JSX.

## Example

```jsx
import React, { Component } from 'react';

class Greeting extends Component {
  render() {
    return <h1>Hello, {this.props.name}!</h1>;
  }
}

export default Greeting;
```

### 2. Function Components

Function components are simpler and more concise than class components. They are JavaScript functions that return JSX. With the introduction of **React Hooks**, function components can now manage state and side effects, making them more powerful.

Example

```jsx
import React from 'react';

const Greeting = ({ name }) => {
  return <h1>Hello, {name}!</h1>;
};

export default Greeting;
```

## Component Lifecycle Methods

Class components have lifecycle methods that allow you to hook into different phases of a component's existence:

### 1. Mounting (Component Creation)

- `constructor()`
- `static getDerivedStateFromProps()`
- `render()`
- `componentDidMount()`

### 2. Updating (State or Props Change)

- `static getDerivedStateFromProps()`
- `shouldComponentUpdate()`
- `render()`
- `getSnapshotBeforeUpdate()`
- `componentDidUpdate()`

### 3. Unmounting (Component Removal)

- `componentWillUnmount()`

## React Hooks (For Function Components)

React Hooks enable function components to manage state and side effects. Some common hooks include:

### 1. `useState` (Managing State)

```jsx
import React, { useState } from 'react';

const Counter = () => {
  const [count, setCount] = useState(0);
  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
};

export default Counter;
```

### 2. `useEffect` (Handling Side Effects)

```jsx
import React, { useState, useEffect } from 'react';

const Timer = () => {
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setSeconds((prev) => prev + 1);
    }, 1000);
    return () => clearInterval(interval); // Cleanup function
  }, []);

  return <p>Timer: {seconds} seconds</p>;
};

export default Timer;
```

### 3. `useContext` (Accessing Context API)

```jsx
import React, { useContext } from 'react';

const ThemeContext = React.createContext('light');

const ThemedComponent = () => {
  const theme = useContext(ThemeContext);
  return <p>Current Theme: {theme}</p>;
};

export default ThemedComponent;
```

## Props vs State

| Feature | Props | State |
|---------|------|------|
| Mutability | Immutable | Mutable |
| Defined By | Parent component | Component itself |
| Updates | Passed down, does not change internally | Changes with user interaction |

## Higher-Order Components (HOC)

A Higher-Order Component is a function that takes a component and returns a new component with added functionality.

Example

```jsx
const withLogging = (WrappedComponent) => {
  return (props) => {
    console.log("Component Rendered");
    return <WrappedComponent {...props} />;
  };
};

const SimpleComponent = () => <p>Hello, World!</p>;
export default withLogging(SimpleComponent);
```

## Conclusion

React components are the building blocks of modern UI development. With function components, hooks, and lifecycle methods, developers can create dynamic, efficient, and maintainable applications.

---
