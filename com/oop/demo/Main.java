package com.oop.demo;

/**
 * Main class - demonstrates all OOP pillars in action.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("===== DEMONSTRATION OF THE 4 PILLARS OF OOP =====\n");

        // ========== 1. ENCAPSULATION ==========
        System.out.println("--- 1. Encapsulation ---");
        Dog dog = new Dog("Rex", 3, "Labrador");
        System.out.println("Name (via getter): " + dog.getName());
        dog.setAge(4); // controlled modification
        System.out.println("New age: " + dog.getAge());
        dog.setAge(-5); // invalid attempt (protected)

        System.out.println("\n--- 2. Inheritance ---");
        // Dog and Cat inherit from Animal
        System.out.println(dog);           // toString inherited + overridden
        Cat cat = new Cat("Mimi", 2, true);
        System.out.println(cat);

        System.out.println("\n--- 3. Polymorphism (Runtime - Overriding) ---");
        // Superclass reference pointing to different objects
        Animal animal1 = new Dog("Thor", 5, "German Shepherd");
        Animal animal2 = new Cat("Luna", 1, false);

        // The same call behaves differently (polymorphism)
        animal1.makeSound(); // Woof!
        animal2.makeSound(); // Meow!

        animal1.move(); // Dog behavior
        animal2.move(); // Cat behavior

        // We can also use the interface
        Movable movable = new Dog("Buddy", 2, "Beagle");
        movable.move();
        movable.stop(); // default method from the interface

        System.out.println("\n--- 4. Polymorphism (Compile-time - Overloading) ---");
        MethodOverloading demo = new MethodOverloading();
        demo.showInfo("Rex");
        demo.showInfo("Rex", 4);
        demo.showInfo("Rex", 4, "Canis lupus familiaris");
        demo.showInfo(dog); // receives Animal object

        System.out.println("\n--- 5. Abstraction ---");
        // It is not possible to instantiate Animal directly:
        // Animal a = new Animal(...); // COMPILATION ERROR

        // We only use it through concrete subclasses
        System.out.println("Abstract Animal being used via Dog and Cat.");

        System.out.println("\n===== END OF DEMONSTRATION =====");
    }
}
