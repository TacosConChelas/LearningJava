/*
3) ---- 
Logical Conditions
Create a program that checks if a number is both even and greater than 10 using logical operators.
Print the result (true or false).
 */
package Topic_2;

public class LogicalConditions {
    public static void main(String[] args) {
        int number_1 = 6, number_2 = 7, number_3 = 20;
        System.out.println("The number 1 is even and greater than 10? " + ((number_1 % 2 == 0) && (number_1 > 10)));
        System.out.println("The number 2 is even and greater than 10? " + ((number_2 % 2 == 0) && (number_2 > 10)));
        System.out.println("The number 3 is even and greater than 10? " + ((number_3 % 2 == 0) && (number_3 > 10)));
    }
}
