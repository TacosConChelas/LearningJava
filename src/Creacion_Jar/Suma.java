package Creacion_Jar;

/**
Ejercicio 2 — Suma desde stdin

Objetivo: práctica con E/S estándar y BufferedReader.
Enunciado: Lee dos enteros a y b en una sola línea y escribe a + b.
Entrada ejemplo: 3 5 → salida 8
Criterios: correcto para valores grandes dentro de int, uso de BufferedReader y StringTokenizer.

/////////
para crear el jar:
jar cvfm MyApp.jar manifest.txt Creacion_Jar

    componentes del comando:
    - c (crear), v (verbose, mostrar archivos), f (salida en archivo), m (usar manifest personalizado)
    - MyApp.jar (nombre del nuevo archivo.jar que deceo crear)
    - manifest.txt (nombre del archivo manifest, este debe estar en texto plano -- por ejemplo .txt -- en mi caso
        estaba al apar de la package donde se encontraban los .class)
    - Creacion_Jar (package donde se encuentran los .class que se empaquetarán en el .jar)
  
para ejecutarlo :
java -jar archivo.jar

antes debes de crear un archivio manifest.txt, en mi caso puse:
Manifest-Version: 1.0
Main-Class: Creacion_Jar.Suma
**/
import java.io.*;
import java.util.*;

public class Suma{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println("El resultado es: " + (a + b));
    }
}
