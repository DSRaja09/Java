package Beginners;

public class Swapping {
    public static void main(String[] args) {
       /*
    * Task: Swap the values of two variables of the same data type.
    * Example:
    *   If a = 4 and b = 5, after swapping:
    *       a = 5
    *       b = 4
    * Notes:
    *   - The variables can be of any data type, but both must be of the same type.
    */

    // Initializing out variables
    char c1 = 'a'; 
    char c2 = 'x';
    System.out.println("Before swap " + c1 + ' ' + c2);

    // In order swap we can create variable, temp, which will aid swapping process
    char temp;

    /*
     * temp will store the value of c1, hence c1 can now be changed to c2
     * c2 can be made equal to the initial c1, by changing it to temp
     * The way we can change the values is using '=' operator
     */

     temp = c1; // storing the value of c1 in temp
     c1 = c2; // changing c1 to c2
     c2 = temp; // setting c2 to temp (the first value of c1) 

     // When we can to display multiple output, we use the system below
     System.out.println("After swap " + c1 + ' ' + c2);

    }
}
