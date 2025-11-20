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
        
    }
    /*
    @param x int: primer número a sumar
    @param y int: segundo número a sumar
    @return int: suma de x + y
    */   
    public static int add(int x, int y) {
        return x + y;
    }
    /*
    @param x int: dividendo
    @param y int: divisor
    @return int: resultado de la división entera x / y, o 0 si y es 0
    */
    public static int subtract(int x, int y){
        return x - y;
    }
    /*
    @param x int: primer número a multiplicar
    @param y int: segundo número a multiplicar
    @return int: producto de x * y
    */
    public static int multiply(int x, int y){
        return x * y;
    }    
    /*
    @param x int: dividendo
    @param y int: divisor
    @return float: resultado de la división x / y, o 0 si y es 0
    */
    public static float divide(int x, int y){
        if (y == 0){
            return 0;
        }
        return (float) x / y;
    }
}
