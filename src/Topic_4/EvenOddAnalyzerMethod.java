/* 
Challenge 3 — Even/Odd Analyzer Method

Description:
Create a method analyze(int n) that returns:
    "even" if n is even

    "odd" if n is odd

    "zero" if n is 0

Call the method with: -4, 0, 13, 100.
Goal: Clean conditional structure + modular code.
 */
package Topic_4;

public class EvenOddAnalyzerMethod {
    public static void main(String[] args) {
        int[] testNumbers = {-4, 0, 13, 100};
        for (int number : testNumbers) {
            System.out.println("The number " + number + " is " + analyze(number) + ".");
        }   
    }
    /*
    @param n int: es el número que se va a analizar
    @return String: "even", "odd" o "zero" dependiendo del análisis
    */
    public static String analyze(int n){
        if (n == 0){
            return "zero";
        } else if (n % 2 == 0){
            return "even";
        } 
        return "odd";
    }
}
