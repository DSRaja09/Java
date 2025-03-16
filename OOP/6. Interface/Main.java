/* ***Interface in Java*** */
/*
 * An interface in Java is similar to inheritance, as it defines what a class 
 * must do without specifying how it does it.
 * 
 * A class can implement multiple interfaces, whereas in inheritance, 
 * a class can only extend one parent class.
 * 
 * In inheritance, we use the keyword 'extends' to inherit from a parent class.
 * In interfaces, we use the keyword 'implements' to define the required behavior.
 * 
 * Why use Interface?
 * - It helps achieve abstraction.
 * - It allows multiple inheritance of behavior.
 * - It provides a contract for classes to follow.
 */

// Defining an interface Prey with a flee method
interface Prey {
    void flee();
}

// Defining an interface Predator with a hunt method
interface Predator {
    void hunt();
}

// Rabbit is a prey, so it implements the Prey interface
class Rabbit implements Prey {
    public void flee() {
        System.out.println("The Rabbit is fleeing");
    }
}

// Lion is a predator, so it implements the Predator interface
class Lion implements Predator {
    public void hunt() {
        System.out.println("The Lion is hunting");
    }
}

// Fox is both a prey and a predator, so it implements both interfaces
class Fox implements Prey, Predator {
    public void flee() {
        System.out.println("The Fox is fleeing from the lion");
    }
    
    public void hunt() {
        System.out.println("The Fox is hunting the rabbit");
    }
}

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee(); // Rabbit can only use the flee() method from Prey
        
        Lion lion = new Lion();
        lion.hunt(); // Lion can only use the hunt() method from Predator
        
        Fox fox = new Fox();
        fox.flee();  // Fox behaves as prey
        fox.hunt();  // Fox behaves as predator
        
        // Since Fox implements both Prey and Predator, it can use both flee() and hunt()
    }
}
