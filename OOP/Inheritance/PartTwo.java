/*
 * Here we will talk about method overiding
 * it is basically using the method of the parent class, however the child class
 * will be able to change it, this change will only work for that particular child class
 */
class Vehicle {
    void runs() {
        System.out.println("This vehicle runs on gasoline.");
    }
}

class Car extends Vehicle {
    // Now Car has all attributes and methods of the Vehicle class
    void wheels() {
        System.out.println("This is a Car, so it has 4 wheels.");
    }
    @Override // good practice to add this, it has no impact on the code
    void runs() {
        System.out.println("This vehicle now runs on electricity.");
    }
    // here Car uses the method of Vehicle and overides (changes) it
}

class Motorbike extends Vehicle {
    void steering() { 
        System.out.println("This is a Motorbike, so it has handlebars instead of a steering wheel.");
    }
}

public class PartTwo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.runs();
    }
}
