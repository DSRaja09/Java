/* ***Abstraction in Java*** */
/*
 * Abstraction is a fundamental concept in Object-Oriented Programming (OOP).
 * It is used to hide the implementation details of a class and show only the essential features.
 * 
 * - An **abstract class** cannot be instantiated (i.e., objects of an abstract class cannot be created directly).
 * - It can contain both **abstract methods** (methods without a body) and **concrete methods** (methods with implementation).
 * - The **subclass must provide implementations** for all abstract methods of its parent abstract class.
 * - Abstraction helps in reducing code complexity and increasing reusability.
 *
 * ***Why is Abstraction Useful?***
 * - Helps in achieving security by hiding implementation details.
 * - Reduces code duplication and improves maintainability.
 * - Encourages modular design by separating "what an object does" from "how it does it."
 */

 abstract class Animal {
    String name; // Instance variable to store the name of the animal

    // Constructor to initialize the name of the animal
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void isFast();

    // Concrete method (common functionality that all subclasses inherit)
    void display() {
        System.out.println("Animal name: " + name);
    }
}

// Subclass (Dog) that extends the abstract class Animal
class Dog extends Animal {
    // Constructor that calls the superclass constructor
    Dog(String name) {
        super(name); // Passes the name to the Animal constructor
    }

    // Implementation of the abstract method
    void isFast() {
        System.out.println("Dogs are fast.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog (allowed because Dog is a concrete class)
        Dog dog = new Dog("Spike");

        // Calling methods
        dog.display(); // Calls the inherited method from Animal
        dog.isFast();  // Calls the overridden method in Dog
    }
}
