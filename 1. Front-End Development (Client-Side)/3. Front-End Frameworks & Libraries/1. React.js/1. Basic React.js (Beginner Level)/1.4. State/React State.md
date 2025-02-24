# React.js State

## Introduction

State is a built-in object in React that allows components to create and manage their own data. Unlike props, which are immutable and passed down from a parent component, **state** is mutable and managed within the component itself.

## Why Use State?

State enables components to dynamically update their content without requiring a full page refresh. It is commonly used for interactive features such as:

- Handling form inputs
- Managing UI toggles
- Updating component content based on user actions

## Initializing State

State can be initialized using the `useState` hook in function components or inside a class component's constructor.

### Using `useState` (Function Components)

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

### Explanation

- `useState(0)` initializes `count` with a value of `0`.
- `setCount` updates the state when the button is clicked.

### Using `this.state` (Class Components)

```jsx
import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
      </div>
    );
  }
}

export default Counter;
```

Explanation

- The state is initialized inside the constructor.
- `this.setState()` updates the state asynchronously.

## Updating State Correctly

When updating state based on a previous value, use a function inside `setState` to avoid stale state updates.

```jsx
setCount(prevCount => prevCount + 1);
```

For class components:

```jsx
this.setState(prevState => ({ count: prevState.count + 1 }));
```

## State in Multiple Components

Each component manages its own state unless explicitly lifted to a parent component.

### Example: Lifting State Up

```jsx
const Parent = () => {
  const [message, setMessage] = useState("Hello");

  return <Child message={message} setMessage={setMessage} />;
};

const Child = ({ message, setMessage }) => (
  <div>
    <p>{message}</p>
    <button onClick={() => setMessage("New Message")}>Change Message</button>
  </div>
);
```

## State vs Props

| Feature | State | Props |
|---------|------|------|
| Mutability | Mutable | Immutable |
| Defined By | Component itself | Parent component |
| Purpose | Manages local data | Passes data to child components |

## Conclusion

State is an essential part of React that enables interactivity and dynamic UI updates. By understanding how to use state properly, developers can build responsive and maintainable applications.
