/* ***Run Time Polymorphism (Method Overriding)*** */
/*
 * Polymorphism allows the same method to behave differently based on the object type.
 * In **Run Time Polymorphism**, the method that gets executed is determined at **runtime**,
 * depending on the actual object, not the reference type.
 * 
 * This is achieved through **Method Overriding**, where a subclass provides its own 
 * version of a method already defined in the parent class.
 */

 class Vehicle {
    void go() {
        System.out.println("This vehicle is going");
    }
}

class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("This Car is going on the road");
    }
}

class Boat extends Vehicle {
    @Override
    void go() {
        System.out.println("This Boat is floating in the sea");
    }
}

class Plane extends Vehicle {
    @Override
    void go() {
        System.out.println("This Plane is flying in the sky");
    }
}

public class Type2 {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();

        // Storing different Vehicle types in an array
        Vehicle[] vehicles = {car, boat, plane};

        // Calling the go() method for each object
        for (Vehicle v : vehicles) {
            v.go();
        }

        /*
         * Explanation:
         * - The `go()` method is **overridden** in each subclass (Car, Boat, Plane).
         * - The `vehicles` array stores different types of Vehicle objects.
         * - Even though the array is of type `Vehicle`, at runtime, Java calls the 
         *   correct overridden method based on the actual object type.
         * 
         * This is an example of **dynamic method dispatch**, where method selection
         * happens at runtime.
         */
    }    
}
