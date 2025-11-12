/*
1) ----- 
Type Conversion Practice
Create a program that converts an int value to double, and a double value to int.
Print both conversions and explain the result in a comment.
*/
package Topic_2;

public class TypeConversion {
    public static void main(String[] args) {
        int number_1 = 33;
        double number_2 = 33.33333;

        System.out.println((double) number_1);
        // the variable "number_1" with a value of 33, we changed it with a "Narrowing" and after printed 
        System.out.println((int) number_2);
        // the variable "number_2" with a value of 33.33333, we changed it with a "Narrowing" and after printed 
    }
}
