/*
hallenge 2 — Method Overloading With Meaning

Description:
Create 3 overloaded methods named sum():
    sum(int a, int b)

    sum(double a, double b)

    sum(int a, int b, int c)

    Print all results.
Twist
    Inside each method, print a message indicating which version is being executed.
Goal: Understand method resolution and debugging.
 */

package Topic_4;

public class MethodOverloadingWithMeaning {
    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + sum(5, 10)); // Calls sum(int, int)
        System.out.println("Sum of 2 doubles: " + sum(5.5, 10.2)); // Calls sum(double, double)
        System.out.println("Sum of 3 integers: " + sum(1, 2, 3)); // Calls sum(int, int, int)    
    }
    /*
    @param a int: primera variable a sumar
    @param  int: segunda variable a sumarb
    @return int: suma de a + b
     */
    public static int sum(int a, int b){
        return a + b;
    }
    /*
    @param a double: primera variable a sumar
    @param b double: segunda variable a sumarb
    @return double: suma de a + b
     */
    public static double sum(double a, double b){
        return a + b;
    }
    /*
     * @param a int: primera variable a sumar
    @param b int: segunda variable a sumarb
    @param c int: tercera variable a sumarb
    @return int: suma de a + b + c
     */
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    
}
