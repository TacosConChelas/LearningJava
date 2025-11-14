/*
- --------  Exercise 1 – Nested Decisions (if‑else + Ternary Operator)
Task
Write a program that asks the user for three integers a, b, and c. The program must:

    Determine which of the three numbers is the greatest using only if‑else statements.
    Print “All numbers are equal” if the three values are identical.
    If they are not all equal, output the greatest number using the ternary operator ?: for the final print statement.

What you’ll practice

    Nested if‑else blocks.
    Using the ternary operator to simplify a single expression.
 */

package Topic_3;

import java.util.Scanner;

public class NestedDecisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();
        System.out.print("Enter third integer (c): ");
        int c = sc.nextInt();   

        if (a == b && b == c) {
            System.out.println("All the numbers are equal.");
        } else if (a > b) {
            greatest_of_(a, c);
        } else if (c > b) {
            greatest_of_(c, b);    
        }  else{
            System.out.println("The greatest is B");
        }
        sc.close();
    }
    public static void greatest_of_(int a, int b){
        String result = (a > b)? ("The greatest is " + a) : ("The greatest is " + b);
        System.out.println(result);
    }
}
