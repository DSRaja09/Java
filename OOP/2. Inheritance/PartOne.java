/* *** Inheritance in Java *** */
/*
 * Inheritance is a process where one class acquires the attributes and 
 * behaviors (methods) of another class. It allows for code reuse and 
 * establishes a parent-child relationship between classes.
 *
 * - The class that inherits is called the "Child Class" or "Subclass."
 * - The class that provides the inheritance is called the "Parent Class" or "Superclass."
 *
 * Why use inheritance?
 * - Promotes code reuse.
 * - Establishes a relationship between general and specific types.
 * - Reduces redundancy.
 */

// Parent Class (Superclass)
class Vehicle {
    void runs() {
        System.out.println("This vehicle runs on gasoline.");
    }
}

// Child Class (Subclass) inheriting from Vehicle
class Car extends Vehicle {
    // Now Car has all attributes and methods of the Vehicle class
    void wheels() {
        System.out.println("This is a Car, so it has 4 wheels.");
    }
    // This method belongs only to the Car class.
}

// Another subclass inheriting from Vehicle
class Motorbike extends Vehicle {
    void steering() { 
        System.out.println("This is a Motorbike, so it has handlebars instead of a steering wheel.");
    }
}

public class PartOne {
    public static void main(String[] args) {
        // Creating objects of child classes
        Car myCar = new Car();
        Motorbike myBike = new Motorbike();
        
        // Calling the inherited method from Vehicle
        myCar.runs(); // Inherited from Vehicle
        myBike.runs(); // Inherited from Vehicle

        // Calling the subclass-specific methods
        myCar.wheels();  // Specific to Car
        myBike.steering(); // Specific to Motorbike

        // myBike.wheels(); // ❌ This would cause an error because Motorbike does not have a wheels() method.
    }
}
