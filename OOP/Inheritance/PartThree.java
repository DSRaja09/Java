/* ***Super Keyword*** */
/*
 * Super keyword basically allows child class to refer to the parent class
 * it helps accessing:
 * 1. Parent Class Constructor
 * 2. Parent Class Method
 * 3. Parent Class Variable
 */
class Vehicle {
    String brand = "RandomBrand";
    Vehicle(){
        System.out.println("This is the Vehicle Constructor");
    }
    void runs() {
        System.out.println("This vehicle runs on gasoline.");
    }
}

class Car extends Vehicle {
    // Now you can add a Car Constructor, which can also access Vehicle 
    // constructor using super keyword
    Car(){
        super();
        System.out.println("This is the Car Constructor");
    }
    void wheels() {
        System.out.println("This is a Car, so it has 4 wheels.");
    }
    /*
     * Similarly it can display Parent Method when it is overriden
     * void runs(){
     *  super.runs();
     *  System.out.println("This Car runs on electricity.");
     * }
     */
}

class Motorbike extends Vehicle {
    String brand = "CoolBrand";
    void steering() { 
        System.out.println("This is a Motorbike, so it has handlebars instead of a steering wheel.");
    }
    void display(){
        System.out.println("Parent Brand " + super.brand);
        System.out.println("Child brand: " + brand);
    }
    // Accessing the variable of Parent Class
}
public class PartThree {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorbike myBike = new Motorbike();
        myBike.display();
    }
}
/*
 * There is more to it in super keyword, these are just basic
 * will learn more on the way 
 */