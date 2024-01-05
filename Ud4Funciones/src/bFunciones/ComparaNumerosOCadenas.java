package bFunciones;

public class ComparaNumerosOCadenas {

	public static void main(String[] args) {
        // Ejemplos de uso de las funciones
        System.out.println("El mayor entre 5 y 10 es: " + mayor(5, 10));
        System.out.println("El mayor entre 8, 15, y 3 es: " + mayor(8, 15, 3));
        System.out.println("El mayor entre 12, 7, 20, y 15 es: " + mayor(12, 7, 20, 15));
        
        System.out.println("La cadena mayor entre 'Hola' y 'Mundo' es: " + mayor("Hola", "Mundo"));
    }

    // Función para calcular el mayor entre dos enteros
    public static int mayor(int a, int b) {
        return (a > b) ? a : b;
    }

    // Función para calcular el mayor entre tres enteros
    public static int mayor(int a, int b, int c) {
        return mayor(mayor(a, b), c);
    }

    // Función para calcular el mayor entre cuatro enteros
    public static int mayor(int a, int b, int c, int d) {
        return mayor(mayor(a, b), mayor(c, d));
    }

    // Función para comparar dos cadenas de texto
    public static int mayor(String a, String b) {
        return a.compareTo(b);
        // Devuelve un valor negativo si a es menor que b,
        // un valor positivo si a es mayor que b,
        // y cero si son iguales.
    }


}
