package Arrays;

import java.util.Random;

public class EjercicioVectores {

	public static void main(String[] args) {
        // Crear 3 vectores de tamaño aleatorio con valores primos aleatorios
        int[] v1 = generarVectorPrimosRandom();
        int[] v2 = generarVectorPrimosRandom();
        int[] v3 = generarVectorPrimosRandom();

        // Imprimir vectores
        System.out.println("Vector 1:");
        imprimirVector(v1);
        System.out.println("Vector 2:");
        imprimirVector(v2);
        System.out.println("Vector 3:");
        imprimirVector(v3);

        // Sumar los 3 vectores
        int[] r = sumar(v1, v2, v3);

        // Imprimir resultado
        System.out.println("Resultado de la suma:");
        imprimirVector(r);
    }

    // Función para imprimir un vector con índice y valor
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Índice " + i + ": " + vector[i]+ " ");
        }
        System.out.println();
    }

    // Función para generar un vector de tamaño aleatorio con números primos aleatorios entre 0 y 101
    public static int[] generarVectorPrimosRandom() {
        Random random = new Random();
        int tamaño = random.nextInt(16); // Tamaño aleatorio entre 0 y 15
        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = generarNumeroPrimoRandom();
        }

        return vector;
    }

    // Función para generar un número primo aleatorio entre 0 y 101
    public static int generarNumeroPrimoRandom() {
        Random random = new Random();
        int numero = random.nextInt(102); // Números aleatorios entre 0 y 101

        while (!esPrimo(numero)) {
            numero = random.nextInt(102);
        }

        return numero;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Función para sumar tres vectores
    public static int[] sumar(int[] v1, int[] v2, int[] v3) {
        int tamañoMaximo = Math.max(Math.max(v1.length, v2.length), v3.length);
        int[] resultado = new int[tamañoMaximo];

        for (int i = 0; i < tamañoMaximo; i++) {
            resultado[i] = obtenerElementoEnIndice(v1, i) + obtenerElementoEnIndice(v2, i) + obtenerElementoEnIndice(v3, i);
        }

        return resultado;
    }

    // Función para obtener el elemento en un índice específico o devolver 0 si el índice está fuera de rango
    public static int obtenerElementoEnIndice(int[] vector, int indice) {
        if (indice >= 0 && indice < vector.length) {
            return vector[indice];
        } else {
            return 0;
        }
    }
}
