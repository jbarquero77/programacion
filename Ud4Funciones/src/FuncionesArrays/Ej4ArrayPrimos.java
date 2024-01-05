/*
 * Crea un array de números de un tamaño pasado por teclado, 
 * el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual es el mayor de todos.
 */

package FuncionesArrays;

import java.util.Random;
import java.util.Scanner;

public class Ej4ArrayPrimos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Obtener el tamaño del array desde el usuario
		System.out.print("Ingrese el tamaño del array: ");
		int tamano = scanner.nextInt();

		// Crear el array de números primos aleatorios
		int[] arrayPrimos = generarNumerosPrimosAleatorios(tamano);

		// Imprimir el array
		System.out.println("Array de números primos:");
		for (int numero : arrayPrimos) {
			System.out.print(numero + " ");
		}
		System.out.println();

		// Encontrar el número primo más grande
		int maximo = encontrarMaximo(arrayPrimos);
		System.out.println("El número primo más grande es: " + maximo);
	}

	// Método para generar números primos aleatorios
	public static int[] generarNumerosPrimosAleatorios(int tamano) {
		int[] arrayPrimos = new int[tamano];
		int indice = 0;
		int numero = 2; // Comenzamos con el primer número primo

		while (indice < tamano) {
			if (esPrimo(numero)) {
				arrayPrimos[indice] = numero;
				indice++;
			}
			numero++;
		}

		return arrayPrimos;
	}

	// Método para verificar si un número es primo
	public static boolean esPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Método para encontrar el número máximo en un array
	public static int encontrarMaximo(int[] array) {
		int maximo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}
}