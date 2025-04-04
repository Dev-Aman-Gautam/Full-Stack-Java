# Widget Accessibility

## Introduction

Accessibility in widgets ensures that all users, including those with disabilities, can interact with web applications effectively. This involves making widgets usable with assistive technologies like screen readers and keyboard navigation.

## Key Principles of Accessible Widgets

1. **Keyboard Navigation**  
    Ensure all interactive elements are operable using the keyboard alone.
    - Use `tabindex` for focus management.
    - Provide logical tab order.

2. **ARIA Roles and Attributes**  
    Use ARIA (Accessible Rich Internet Applications) to define widget roles and states.
    - Example: `role="button"`, `aria-expanded="true"`.

3. **Focus Management**  
    - Set focus to the widget when it is activated.
    - Return focus to the triggering element when the widget is closed.

4. **Semantic HTML**  
    Use native HTML elements whenever possible, as they come with built-in accessibility features.

## Common Accessible Widgets

### 1. Modal Dialogs

- Use `role="dialog"` or `role="alertdialog"`.
- Trap focus within the modal while it is open.

### 2. Dropdown Menus

- Use `aria-haspopup="true"` to indicate a menu.
- Manage `aria-expanded` to reflect the menu's state.

### 3. Tabs

- Use `role="tablist"`, `role="tab"`, and `role="tabpanel"`.
- Ensure arrow keys navigate between tabs.

### 4. Tooltips

- Use `aria-describedby` to associate the tooltip with the triggering element.
- Ensure tooltips are dismissible.

## Testing Accessibility

- Use screen readers like NVDA or VoiceOver.
- Test keyboard navigation thoroughly.
- Validate ARIA roles and attributes using tools like Axe or Lighthouse.

## Conclusion

Building accessible widgets improves usability for everyone and ensures compliance with accessibility standards like WCAG. By following best practices, developers can create inclusive web experiences.
