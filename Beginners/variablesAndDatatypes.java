package Beginners;

public class variablesAndDatatypes {
    public static void main(String[] args) {
                /* 
        Variables are like containers used to store different types of data, 
        such as numbers, characters, or words. Every variable must have a 
        data type, which specifies the kind of value it can hold. 
        If its a intergar data type would be int, decimal 
        then its double (or float), for character its a char
        */

        int var1 = 10; // here int is the data type, val is the variable name and 10 is the value it will store in the memory
        double pie = 3.1416; //  here the data type is double, pie is the variable name and 3.1416 is the value it will store in memory
        char c = 'a';  // Similar explaination as above

        // To output (or display) the values we write the follwoing function
        System.out.println(var1);
        System.out.println(pie);
        System.out.println(c);
    }
}
/*
 * there are some rules for naming a variables, these are:
 * Must Start with a Letter, Underscore (_), or Dollar Sign ($)
 * Cannot Use Java Reserved Keywords (like int, super, double etc..)
 * Case Sensitivity (variable name, val, vAl, VAL are completely different)
 * Although not a rule, choosing names that describe the data the variable holds.
   is a good practice, example, 'int age = 12 is better than int x = 12'
 */