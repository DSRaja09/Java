/* ***Compile Time Polymorphism (Method Overloading)*** */
/*
 * Polymorphism is the ability of an object to take multiple forms.
 * Here, we are discussing **Compile-Time Polymorphism**, also known as **Method Overloading**.
 * 
 * Method Overloading allows multiple methods to have the same name, but with different 
 * parameters (different type, number, or both). 
 * The method that gets executed is determined at **compile-time** based on the arguments passed.
 * 
 * Example:
 * - If we call `add(10, 20)`, the compiler selects `add(int x, int y)`.
 * - If we call `add(10, 20, 30)`, the compiler selects `add(int x, int y, int z)`.
 */

 class doMath {
    // Method with two parameters
    int add(int x, int y) {
        return x + y;  // Adds two numbers
    }

    // Overloaded method with three parameters
    int add(int x, int y, int z) {
        return x + y + z;  // Adds three numbers
    }

    /*
     * Explanation:
     * - The method `add(int, int)` and `add(int, int, int)` have the same name.
     * - However, they have **different numbers of parameters**.
     * - The Java compiler determines at compile-time which method to call based on the arguments.
     * - This is an example of **Compile-Time Polymorphism**.
     */
}

public class Type1 {
    public static void main(String[] args) {
        doMath xyz = new doMath();
        
        // Calls the add method with 2 parameters
        System.out.println(xyz.add(10, 20));  // Output: 30
        
        // Calls the add method with 3 parameters
        System.out.println(xyz.add(10, 20, 30));  // Output: 60
    }
}
