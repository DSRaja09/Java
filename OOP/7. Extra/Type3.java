/* ***Exception Handling in Java*** */
/*
 * Exception handling is a technique to handle runtime errors 
 * and prevent the program from crashing unexpectedly.
 *
 * There are 3 main parts of exception handling:
 * 1. Try: Contains code that might generate an exception.
 * 2. Catch: Handles exceptions that occur in the try block.
 * 3. Finally: This block always executes, whether an exception occurs or not.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Type3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Taking user input for dividend and divisor
            System.out.print("Enter the Dividend: ");
            int a = sc.nextInt();

            System.out.print("Enter the Divisor: ");
            int b = sc.nextInt();

            // This line may throw an ArithmeticException if b = 0
            int ans = a / b;
            System.out.println("The answer is " + ans);
        } 
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Can't divide by Zero!!");
        } 
        catch (InputMismatchException e) {
            // Handles input mismatch (if user enters a non-integer value)
            System.out.println("Error: Invalid input! Please enter numbers only.");
        } 
        catch (Exception e) {
            // Catches any other unexpected exceptions
            System.out.println("Error: Something went wrong.");
        } 
        finally {
            // Always executes, ensuring resources are released
            System.out.println("Reached the end of program.");
            sc.close();
        }
    }
}
