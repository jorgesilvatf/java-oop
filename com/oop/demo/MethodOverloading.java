package com.oop.demo;

/**
 * Demonstration of Compile-time Polymorphism (Method Overloading)
 * Same method name, different signatures.
 */
public class MethodOverloading {

    // Version 1: only name
    public void showInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Version 2: name + age
    public void showInfo(String name, int age) {
        System.out.println("Name: " + name + " | Age: " + age + " years");
    }

    // Version 3: name + age + species
    public void showInfo(String name, int age, String species) {
        System.out.println("Name: " + name + " | Age: " + age + " | Species: " + species);
    }

    // Version 4: receives an Animal object (polymorphism + overloading)
    public void showInfo(Animal animal) {
        System.out.println("=== Animal Information ===");
        System.out.println(animal.toString());
        animal.makeSound(); // polymorphic call
    }
}
