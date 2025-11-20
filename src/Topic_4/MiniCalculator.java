/*
Challenge 5 — Mini Calculator (Methods Only)
Description:
    Create a class MiniCalc with these methods:

    add(int x, int y)

    subtract(int x, int y)

    multiply(int x, int y)

    divide(int x, int y)
Divide rules:
    If the divisor is 0 → return 0 (no errors).

    Otherwise perform regular integer division.

In main, call all methods and print results.
Goal: Small real module + safe logic + method organization.
 */
package Topic_4;

public class MiniCalculator {
    public static void main(String[] args) {
        int[] numbers = {20, 10, 0};
        add(numbers[0], numbers[1]);
        subtract(numbers[0], numbers[1]);
        multiply(numbers[0], numbers[1]);
        divide(numbers[0], numbers[1]);
        divide(numbers[0], numbers[2]); // Testing division by zero
    }
    /*
    @param x int: primer número a sumar
    @param y int: segundo número a sumar
    @return int: suma de x + y
    */   
    public static void add(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
    /*
    @param x int: dividendo
    @param y int: divisor
    @return int: resultado de la división entera x / y, o 0 si y es 0
    */
    public static void subtract(int x, int y){
        System.out.println("Subtract: " + (x - y));
    }
    /*
    @param x int: primer número a multiplicar
    @param y int: segundo número a multiplicar
    @return int: producto de x * y
    */
    public static void multiply(int x, int y){
        System.out.println("Multiply: " + (x * y));
    }    
    /*
    @param x int: dividendo
    @param y int: divisor
    @return float: resultado de la división x / y, o 0 si y es 0
    */
    public static void divide(int x, int y){
        if (y == 0){
            System.out.println("Divide: 0");
            return;
        }
        System.out.println("Divide: " + ((float) x / y));
    }
}
