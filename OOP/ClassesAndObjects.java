// An Introduction to Classes and Objects in Java
/*
    A Class is a blueprint or template that defines what characteristics an Object will have.
    An Object is an instance of a Class.

    Simply put, a 'Student' Class defines the attributes (characteristics) of a Student,
    such as first name, last name, and ID.

    An Object would be an actual student created based on the Student Class.
*/

package OOP;

// Defining the Student class
class Student {
    // Attributes (characteristics of a student)
    String firstName;
    String secondName; 
    int id;
}

public class ClassesAndObjects {
    public static void main(String[] args) { 
        // Creating the first student object
        Student student1 = new Student();
        student1.firstName = "Bugs";  
        student1.secondName = "Bunny";
        student1.id = 11231;

        // Creating the second student object
        Student student2 = new Student();
        student2.firstName = "Daffy";  //
        student2.secondName = "Duck";
        student2.id = 11122;

        // Displaying student details
        System.out.println("Student 1: " + student1.firstName + " " + student1.secondName + ", ID: " + student1.id);
        System.out.println("Student 2: " + student2.firstName + " " + student2.secondName + ", ID: " + student2.id);
    }
}
