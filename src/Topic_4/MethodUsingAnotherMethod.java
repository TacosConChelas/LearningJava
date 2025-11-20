/*
Challenge 4 — Method Using Another Method

Description:
Create:
    boolean isEven(int n)

    int countEvens(int a, int b, int c, int d)

    countEvens must use only isEven() to check each number.
Example:
    countEvens(2, 9, 4, 11) → returns 2
Goal: Understand method composition and reuse.
*/
package Topic_4;

public class MethodUsingAnotherMethod {
    public static void main(String[] args) {
        System.out.println("Count of even numbers: " + countEvens(2, 9, 4, 11)); // Should print 2    
    }   
    /*
    @paramn n int: numero a evaluar
    @return boolean: true si es par, false si es impar
    */
    public static boolean isEven(int n){
        return n % 2 == 0;        
    } 
    public static int countEvens(int a, int b, int c, int d){
        int count = 0;
        if (isEven(a)) count++;
        if (isEven(b)) count++;
        if (isEven(c)) count++;
        if (isEven(d)) count++;
        return count;
    }
}