/* 
Exercise 2 – Multiple‑Choice Selection (switch)

Task
Create an interactive menu that lets the user choose an operation on two integers x and y:
Option	Action
1	Add (x + y)
2	Subtract (x - y)
3	Multiply (x * y)
4	Divide (x / y) – handle division‑by‑zero gracefully
5	Exit

Use a switch statement to process the selected option. The menu should keep appearing until the user chooses “Exit”.

What you’ll practice

    switch with case and default.
    Looping with while to repeat the menu.
    Simple error handling (division by zero).

Cambios:

    Bucle do‑while que mantiene el menú activo hasta que el usuario elige la opción 5.
    Lectura de operandos dentro de cada caso (solo cuando la operación lo necesita).
    Nombres claros y en español (MultipleChoiceSelection, readTwoOperands, readIntegerInput).
    Formato de salida con printf para la división, mostrando 4 decimales.
    Manejo específico de InputMismatchException y mensajes de error en español.
    Código bien sangrado y documentado con Javadoc.
*/

package Topic_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleChoiseSelection_lvUP {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int option;

            // Bucle principal del menú
            do {
                option = readIntegerInput(sc,
                        "\n=== MENÚ DE OPERACIONES ===\n" +
                        "1) Sumar\n" +
                        "2) Restar\n" +
                        "3) Multiplicar\n" +
                        "4) Dividir\n" +
                        "5) Salir\n" +
                        "Selecciona una opción:");

                switch (option) {
                    case 1 -> {
                        int[] operands = readTwoOperands(sc);
                        System.out.println("Resultado de la suma: " + (operands[0] + operands[1]));
                    }
                    case 2 -> {
                        int[] operands = readTwoOperands(sc);
                        System.out.println("Resultado de la resta: " + (operands[0] - operands[1]));
                    }
                    case 3 -> {
                        int[] operands = readTwoOperands(sc);
                        System.out.println("Resultado de la multiplicación: " + (operands[0] * operands[1]));
                    }
                    case 4 -> {
                        int[] operands = readTwoOperands(sc);
                        if (operands[1] == 0) {
                            System.out.println("Error: División por cero no permitida.");
                        } else {
                            double result = (double) operands[0] / operands[1];
                            System.out.printf("Resultado de la división: %.4f%n", result);
                        }
                    }
                    case 5 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                    default -> System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                }

                // Línea en blanco para separar iteraciones
                System.out.println();

            } while (option != 5);
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. El programa finalizará.");
        }
    }

    /**
     * Solicita dos enteros al usuario y los devuelve en un arreglo de tamaño 2.
     *
     * @param sc Scanner activo
     * @return int[2] con los operandos
     */
    private static int[] readTwoOperands(Scanner sc) {
        int a = readIntegerInput(sc, "Introduce el primer entero:");
        int b = readIntegerInput(sc, "Introduce el segundo entero:");
        return new int[]{a, b};
    }

    /**
     * Lee un entero del scanner mostrando el mensaje indicado.
     * Repite la petición mientras la entrada no sea un entero válido.
     *
     * @param sc     Scanner activo
     * @param prompt Mensaje que se mostrará al usuario
     * @return entero leído
     */
    private static int readIntegerInput(Scanner sc, String prompt) {
        System.out.print(prompt + " ");
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Debes introducir un número entero.");
            sc.next(); // descarta la entrada errónea
            System.out.print(prompt + " ");
        }
        return sc.nextInt();
    }
}
