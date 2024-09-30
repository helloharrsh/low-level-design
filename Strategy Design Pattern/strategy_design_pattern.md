
# Strategy Design Pattern

## 1. Intent
The Strategy Design Pattern is used to:

- Define a family of algorithms.
- Encapsulate each algorithm in a separate class.
- Make them interchangeable so that the client using them can switch between different algorithms without altering its codebase.

This pattern allows us to avoid hardcoding specific behaviors inside a class, making the class more flexible and easier to maintain.

## 2. Problem
Imagine you’re building a payment processing system. Your system supports multiple payment methods (like credit card, PayPal, and cryptocurrency). You could write a single class with a lot of `if-else` or `switch-case` statements to handle these different payments, but this is problematic because:

- **Tight coupling**: The class handling payment has too many responsibilities and is dependent on all payment types.
- **Hard to maintain**: Adding new payment methods or modifying existing ones will require changing the class.
- **Code duplication**: Common elements of the algorithms might be repeated.

Instead, the Strategy Pattern suggests encapsulating each payment method in its own class.

## 3. Solution
To solve the problem, you break down the algorithms (in this case, the different payment methods) into separate classes and let the client (e.g., the main processing system) decide which algorithm to use at runtime. Here’s how it works:

- **Context**: The class that uses the algorithm (e.g., `PaymentProcessor`).
- **Strategy Interface**: This interface defines a method that each payment method must implement (e.g., `processPayment()`).
- **Concrete Strategy**: These are the different implementations of the strategy interface (e.g., `CreditCardPayment`, `PayPalPayment`).

By following this structure, you decouple the client from the specific details of the algorithms. The client only knows that it’s using a strategy but doesn’t care which one.

## 4. Explanation of Code

### Strategy Interface (`PaymentStrategy`):
Defines a common interface for all payment methods, with the method `pay(int amount)`.

### Concrete Strategies (`CreditCardPayment` and `PayPalPayment`):
These implement the `PaymentStrategy` interface and provide specific logic for how to process the payment.

### Context Class (`PaymentProcessor`):
- It has a reference to a `PaymentStrategy` and a method `processPayment()` that delegates the payment processing to the strategy.
- The `setPaymentStrategy()` method allows switching between different payment methods at runtime.

### Client Code:
The `Main` class shows how you can switch between payment methods dynamically by setting a new strategy.

## 5. Key Benefits
- **Flexibility**: New strategies (algorithms) can be added easily without modifying the existing code.
- **Open/Closed Principle**: The Context class is open for extension (new strategies) but closed for modification.
- **Separation of Concerns**: Each algorithm is isolated into its own class, making it easy to maintain.

## 6. Common Use Cases
- **Sorting Algorithms**: Use different sorting algorithms (e.g., merge sort, quicksort) and switch between them.
- **Compression Algorithms**: Use different compression techniques (e.g., ZIP, RAR).
- **Payment Methods**: As shown in the example, select different payment gateways at runtime.
- **Validation Logic**: Apply different validation rules depending on the situation.

## 7. Drawbacks
- **Overhead of Strategy Creation**: If the algorithms are simple, the overhead of creating multiple classes might be unnecessary.
- **Client Must Know Strategies**: The client (context) must be aware of all the available strategies and when to use them.
- **Increased Number of Classes**: Since each strategy requires a separate class, it can increase the number of classes in a project.
