/*
2 ) ---- 
Arithmetic and Division
Write a program that divides two integers and two doubles.
Print the result of both and explain why they differ.
 */
package Topic_2;

public class ArithmeticAndDivision {
    public static void main(String[] args) {
        int number_1 = 30, number_2 = 7;
        double number_3 = 3.67, number_4 = 8.43;

        System.out.println(number_1 / number_2);
        System.out.println(number_3 / number_4);
        // ambos son diferentes ya que al dividir enteros el resultado será entero aun que este tenga decimales 
        // Caso contrario si se dividen variables de tipo double ya que estas si permite que el resultado tenga decimales

        // When both operands are integers, Java performs integer division.
        // The fractional part is truncated (not rounded).
        // Example: 30 / 7 → 4

        // When both operands are doubles, Java performs floating-point division.
        // The result keeps the decimal part.
        // Example: 3.67 / 8.43 → 0.43535...
    }
}
