# 🧱 The Two Building Blocks

Before diving into the core principles, you must understand the two components that make OOP possible:

* Class: A blueprint, template, or user-defined data type used to create objects. It defines the variables (attributes) and methods (behaviors) that the object will have.
* Object: A basic unit of OOP that represents a real-world entity. It is an instance of a class that takes up memory space and contains actual data.

# 🏛️ The 4 Pillars of OOP

### 1. Encapsulation

Encapsulation is the practice of **wrapping variables and methods together into a single unit** (a class) and restricting direct access to some of the object's components.

- **How it works:** You declare the variables of a class as `private`. To allow external code to interact with these variables, you provide `public` getter and setter methods. 
- **Why use it:** It protects data from unauthorized modification, improves data security, and gives you total control over what values are passed into your object. 

### 2. Inheritance

Inheritance is the mechanism by which **one class acquires the properties and behaviors of another class**. 

- **How it works:** Java uses the `extends` keyword. The existing class is called the **superclass** (or parent), and the new class is the **subclass** (or child).
- **Why use it:** It promotes **code reusability**. You don't have to rewrite code that has already been tested and established in a parent class.

### 3. Polymorphism

Polymorphism translates to "many forms". It allows a **single method or action to behave differently** depending on the object execution context.

- **Compile-time Polymorphism (Static):** Achieved through **Method Overloading**, where multiple methods in the same class have the same name but different parameters.

- **Runtime Polymorphism (Dynamic):** Achieved through **Method Overriding**, where a subclass provides a specific implementation of a method already defined in its parent class.

### 4. Abstraction

Abstraction is the process of **hiding complex implementation details** and showing only the essential features to the user.

- **How it works:** In Java, this is achieved using `abstract` classes (which offer partial abstraction) and `interfaces` (which offer 100% abstraction).
- **Why use it:** It reduces complexity. Just like you only need to know how to use the steering wheel of a car without knowing how the internal combustion engine works, abstraction lets a developer use a tool without managing its background code.
