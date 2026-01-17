/*
programar una calculadora simple que sume, reste, multiplique y divida dos numeros
*/
public class prueba {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    
    }
    public static int sumar(int x, int y) {
        return x + y;
    }
    public static int restar(int x, int y) {
        return x - y;
    }
    public static int multiplicar(int x, int y) {
        return x * y;
    }
    public static int dividir(int x, int y) {
        return x / y;
    }
}