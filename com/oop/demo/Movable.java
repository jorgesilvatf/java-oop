package com.oop.demo;

/**
 * Interface -> Abstraction (100% abstraction)
 * Defines only the contract. Implementers must provide the behavior.
 */
public interface Movable {

    // Abstract method (implicitly public abstract)
    void move();

    // Default method (Java 8+) - allows partial implementation in the interface
    default void stop() {
        System.out.println("The animal stopped moving.");
    }
}
