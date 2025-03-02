// Introduction to Constructors
/*
 * Basically, constructors are special methods in a class that initialize objects.
 * Unlike regular methods, constructors:
 * 1. Do not have a return type.
 * 2. Always have the same name as the class.
 *
 * Why are constructors important?
 * 1. They automate object initialization, reducing manual assignment.
 * 2. They improve code readability and maintainability.
 * 3. They support Encapsulation, a key principle of OOP.
 */

 // Student class with a constructor
 class Student {
     String firstName;
     String secondName;
     int id;
 
     // Constructor to initialize student attributes
     Student(String firstName, String secondName, int id) {
         // 'this' keyword differentiates instance variables from parameters
         this.firstName = firstName;
         this.secondName = secondName;
         this.id = id;
     }
 }
 
 public class Constructors {
     public static void main(String[] args) {
         // Creating student objects using the constructor
         Student student1 = new Student("Bugs", "Bunny", 11231);
         Student student2 = new Student("Daffy", "Duck", 11221);
 
         // Displaying student details
         System.out.println("Student 1: " + student1.firstName + " " + student1.secondName + ", ID: " + student1.id);
         System.out.println("Student 2: " + student2.firstName + " " + student2.secondName + ", ID: " + student2.id);
     }
 }
 