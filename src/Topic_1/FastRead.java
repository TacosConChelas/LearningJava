package Topic_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

/**
Ejercicio 4 — Lectura rápida: sumatoria de N números

Objetivo: implementar lectura eficiente y evitar TLE/Memory issues.
Enunciado: Primera línea N (1 ≤ N ≤ 2·10^6). Siguiente línea con N enteros. Imprimir la suma (usar long).
Recomendación: usa un FastScanner o BufferedReader con parseo manual; medición mental de complejidad O(N).
Criterios: correcto y razonable en velocidad/uso de memoria.
 */
public class FastRead {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1 << 10);
        StringTokenizer st = new StringTokenizer(br.readLine());
        long total = 0;
        while (true) {
            try {
                int number = Integer.parseInt(st.nextToken());
                total += number;
            } catch (Exception e) {
                break;// TODO: handle exception
            }
        }
        System.out.println("el resultado es: " + total);
        
    }
}
