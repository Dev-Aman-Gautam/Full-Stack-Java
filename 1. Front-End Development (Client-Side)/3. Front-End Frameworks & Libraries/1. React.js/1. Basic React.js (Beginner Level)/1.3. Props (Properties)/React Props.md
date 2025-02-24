# React.js Props (Properties)

## Introduction

Props (short for **properties**) are a fundamental concept in React.js. They allow data to be passed from a parent component to a child component, making components reusable and dynamic. Props are immutable, meaning they cannot be changed within the receiving component.

## How Props Work

Props are passed to components as attributes in JSX and accessed within the component using `props`.

### Example of Props Usage

```jsx
import React from 'react';

const Greeting = ({ name }) => {
  return <h1>Hello, {name}!</h1>;
};

const App = () => {
  return <Greeting name="John" />;
};

export default App;
```

### Explanation

- `name="John"` is passed as a prop to the `Greeting` component.
- The `Greeting` component receives the `name` prop and displays "Hello, John!".

## Default Props

If a prop is not provided, we can set default values using `defaultProps`.

```jsx
const Greeting = ({ name }) => {
  return <h1>Hello, {name}!</h1>;
};

Greeting.defaultProps = {
  name: "Guest",
};

export default Greeting;
```

Explanation

- If `name` is not provided, "Guest" will be used as the default value.

## PropTypes for Type Checking

React provides `prop-types` to enforce type checking on props.

```jsx
import PropTypes from 'prop-types';

const Greeting = ({ name, age }) => {
  return (
    <h1>Hello, {name}! You are {age} years old.</h1>
  );
};

Greeting.propTypes = {
  name: PropTypes.string.isRequired,
  age: PropTypes.number,
};

export default Greeting;
```

Explanation

- `PropTypes.string.isRequired` ensures `name` is always provided as a string.
- `age` is optional but must be a number if provided.

## Passing Objects as Props

Instead of passing multiple props, we can pass an object.

```jsx
const UserProfile = ({ user }) => {
  return (
    <div>
      <h1>Name: {user.name}</h1>
      <p>Age: {user.age}</p>
    </div>
  );
};

const App = () => {
  const userInfo = { name: "Alice", age: 25 };
  return <UserProfile user={userInfo} />;
};

export default App;
```

## Passing Functions as Props

We can also pass functions as props to handle events.

```jsx
const Button = ({ handleClick }) => {
  return <button onClick={handleClick}>Click Me</button>;
};

const App = () => {
  const showAlert = () => alert("Button clicked!");
  return <Button handleClick={showAlert} />;
};

export default App;
```

## Props vs State

| Feature | Props | State |
|---------|------|------|
| Mutability | Immutable | Mutable |
| Defined By | Parent component | Component itself |
| Purpose | Pass data to child components | Manage component-specific data |

## Conclusion

Props are a key part of React that allow components to communicate and share data. By understanding how to use, validate, and manage props effectively, developers can create modular and maintainable applications.
