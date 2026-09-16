package com.oop.demo;

/**
 * Concrete class -> Inheritance (extends Animal) + Polymorphism (overriding)
 * Also implements the Movable interface.
 */
public class Dog extends Animal {

    // Dog-specific attribute (Encapsulation)
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Canis lupus familiaris"); // calls superclass constructor
        this.breed = breed;
    }

    // Specific getter/setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed != null && !breed.trim().isEmpty()) {
            this.breed = breed;
        }
    }

    // ========== Polymorphism - Runtime (Method Overriding) ==========
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof woof!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running happily!");
    }

    // Subclass-specific method
    public void fetch() {
        System.out.println(getName() + " went to fetch the ball!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", breed='" + breed + '\'' +
                '}';
    }
}
