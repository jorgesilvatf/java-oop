package com.oop.demo;

/**
 * Another subclass -> Inheritance + Polymorphism (overriding)
 */
public class Cat extends Animal {

    private boolean isIndoor; // specific attribute

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, "Felis catus");
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    // ========== Polymorphism - Runtime (Method Overriding) ==========
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is walking silently...");
    }

    // Specific method
    public void climb() {
        System.out.println(getName() + " climbed on the sofa!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isIndoor=" + isIndoor +
                '}';
    }
}
