package Topic_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedDecisions_lvUP {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Lectura segura de los tres enteros
            final int a = readInt(sc, "Introduce el primer entero (a): ");
            final int b = readInt(sc, "Introduce el segundo entero (b): ");
            final int c = readInt(sc, "Introduce el tercer entero (c): ");

            // Caso especial: todos iguales
            if (a == b && b == c) {
                System.out.println("Todos los números son iguales.");
                return;
            }

            /* Determinamos el mayor usando únicamente if‑else.
               Después usamos el operador ternario para imprimir el resultado. */
            int mayor;
            if (a > b) {
                mayor = (a > c) ? a : c;
            } else {
                mayor = (b > c) ? b : c;
            }

            // Impresión mediante operador ternario
            String mensaje = (mayor == a) ? "El mayor es a: " + a
                           : (mayor == b) ? "El mayor es b: " + b
                                          : "El mayor es c: " + c;
            System.out.println(mensaje);
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Por favor, introduce sólo números enteros.");
        }
    }

    /**
     * Lee un entero del {@link Scanner}, solicitando repetidamente hasta obtener una entrada válida.
     *
     * @param sc   Scanner activo
     * @param prompt Mensaje que se muestra al usuario
     * @return el entero introducido
     */
    private static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Valor no entero. Inténtalo de nuevo.");
            sc.next(); // descarta la entrada inválida
            System.out.print(prompt);
        }
        return sc.nextInt();
    }
}
