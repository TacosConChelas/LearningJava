/**
Ejercicio 1 — Hola Mundo + argumentos

Objetivo: entender main, args y compilación básica.
Enunciado: Programa que imprime Hola, <nombre>! usando el primer argumento de la línea de comandos. Si no hay argumentos imprime Hola, mundo!.
Ejemplo: java Greet Juan → Hola, Juan!
Criterios: compila y maneja ausencia de argumentos.
 */
public class HelloWorld_lvUP {
    public static void main(String[] args) {
        if (args.length > 0){
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
