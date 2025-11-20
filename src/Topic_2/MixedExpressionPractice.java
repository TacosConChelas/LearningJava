/*
Mixed Expression Practice
Write an expression combining arithmetic, relational, and logical operators:
    int a = 5, b = 10, c = 20;
    boolean result = (a + b * 2 < c) && (c % a == 0);
Print result and explain the operator precedence.
 */
package Topic_2;

public class MixedExpressionPractice {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 20;
        boolean result = (a + b * 2 < c) && (c % a == 0);
        System.out.println("Result: " + result);
        /*
        primero lo que pasa es que se resuelve la  multiplicación de b * 2
        esto dando 20,, después se realiza la suma de 20 + 5, dando 25
        en este caso se an acabado las operaciones aritméticas, ahora viene una comparación relacional
        se compara si 25 es menor que 20, dando como resultado false
        
        el siguiente paréntesis primero realiza la extracción del residuo de c % a resultando 0
        posteriormente se compara 0 si es igual a 0, dando como resultado true
        
        ambos resultados de los paréntesis se comparan por los &&, ambos tienen que ser true para que el resultado sea true
        pero como la comparación es false && true, el resultado es false
         */
    }
}
