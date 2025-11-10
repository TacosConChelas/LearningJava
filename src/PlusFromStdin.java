/**
Ejercicio 2 — Suma desde stdin

Objetivo: práctica con E/S estándar y BufferedReader.
Enunciado: Lee dos enteros a y b en una sola línea y escribe a + b.
Entrada ejemplo: 3 5 → salida 8
Criterios: correcto para valores grandes dentro de int, uso de BufferedReader y StringTokenizer.
**/
import java.io.*;
import java.util.*;

class PlusFromStdin{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println("El resultado es: " + (a + b));
    }
}