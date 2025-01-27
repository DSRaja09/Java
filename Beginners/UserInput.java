package Beginners;

// Importing the Scanner class from Java's built-in library.
// This class allows us to get input from the user (e.g., numbers, text, etc.).
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Creating a Scanner object called 'sc' to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a whole number (integer).
        System.out.print("Enter an integer: ");
        int a = sc.nextInt(); // Reads the whole number typed by the user.

        // After taking the integer input, the program also captures the "Enter" key press.
        // We need to clear this extra input, so we use sc.nextLine().
        sc.nextLine(); // Clears the leftover newline character.

        // Asking the user to enter a sentence or a word (string).
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); // Reads the text typed by the user.

        // Asking the user to enter a number that can have decimals (double).
        System.out.print("Enter a double: ");
        double d = sc.nextDouble(); // Reads the decimal number typed by the user.

        // Displaying the inputs back to the user in a readable format.
        System.out.println("The integer is: " + a); // Prints the whole number.
        System.out.println("The String input is: " + s); // Prints the text.
        System.out.println("The double input is: " + d); // Prints the decimal number.

        // Closing the Scanner object.
        // This is good practice to free up resources used by the program.
        sc.close();
    }
}
