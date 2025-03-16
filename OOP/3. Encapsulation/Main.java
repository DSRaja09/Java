
/*
 * Encapsulation is one of the fundamental concepts of OOP. 
 * It is the process of wrapping data (variables) and the code acting on the data (methods) together 
 * as a single unit to protect it from unauthorized access.
 * 
 * To achieve encapsulation:
 * 1. Declare the class variables as private.
 * 2. Provide public getter methods to read the data.
 * 3. Provide public setter methods to update the data if necessary.
 * 
 * Advantages of Encapsulation:
 * - Better control of class attributes and methods.
 * - Class attributes can be made read-only (if only getter is provided) or write-only (if only setter is provided).
 * - Flexible: The programmer can change one part of the code without affecting other parts.
 * - Increases security and prevents unintended modifications.
 */

 class Student {
    // Private attributes to ensure data hiding
    private String firstName;
    private String secondName;
    private int id;
    
    // Constructor to initialize the student object
    public Student(String firstName, String secondName, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }
    
    // Getter methods to access private attributes
    public String getFirstName() {
        return firstName;
    }
    
    public String getSecondName() {
        return secondName;
    }
    
    public int getId() {
        return id;
    }
    
    // Setter methods to modify private attributes
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student("Spongebob", "Squarepants", 177);
        
        // Accessing student details using getter methods
        System.out.println("Full name is " + s1.getFirstName() + " " + s1.getSecondName());
        
        // Modifying student details using setter methods
        s1.setFirstName("Patrick");
        s1.setSecondName("Star");
        s1.setId(7); // Leading zeros in an integer are ignored
        
        // Displaying updated student details
        System.out.println("Updated Name: " + s1.getFirstName() + " " + s1.getSecondName());
        System.out.println("Updated ID: " + s1.getId());
    }
}
