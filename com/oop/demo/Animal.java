package com.oop.demo;

/**
 * Abstract class -> Abstraction (partial) + Encapsulation + base for Inheritance
 *
 * Cannot be instantiated directly.
 * Provides common attributes and behaviors for all animals.
 */
public abstract class Animal implements Movable {

    // ========== ENCAPSULATION ==========
    // Private attributes - controlled access via getters/setters
    private String name;
    private int age;
    private String species;

    // Protected constructor (only subclasses can call)
    protected Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // ========== Getters and Setters (Encapsulation) ==========
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    public String getSpecies() {
        return species;
    }

    // Concrete method (common implementation)
    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // ========== Abstraction ==========
    // Abstract method - each subclass MUST implement
    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", species='" + species + "'}";
    }
}
