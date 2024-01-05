package Arrays;

import java.util.Scanner;

public class Ej3ArrayDeAleatorios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Declaramos el array que contendrá 10 números
		
		 // Solicitar al usuario el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamanioArray = sc.nextInt();
		
		int ini, fin;
		
		System.out.println("Introduce el valor mínimo: ");
		ini = sc.nextInt();
		System.out.println("Introduce el valor máximo: ");
		fin = sc.nextInt();
		
		int[] numeros = null;
		int suma = 0;
		
		// Crear el array y llenarlo con números aleatorios
        numeros = generarArrayAleatorio(tamanioArray, ini, fin);
        
     // Mostrar el contenido del array y la suma
        mostrarArrayYSuma(numeros);

	}
	// Método para generar un array con números aleatorios
    public static int[] generarArrayAleatorio(int tamano, int minimo, int maximo) {
        int[] array = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            array[i] = generarNumeroAleatorio(minimo, maximo);
        }
        return array;
    }

    // Método para generar un número aleatorio en el rango [minimo, maximo]
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }

    // Método para mostrar el contenido del array y la suma
    public static void mostrarArrayYSuma(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

        // Calcular la suma
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }

        System.out.println("Suma de todos los valores: " + suma);
    }

}
