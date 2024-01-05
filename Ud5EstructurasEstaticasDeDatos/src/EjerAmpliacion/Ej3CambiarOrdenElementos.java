/*
 * 3. Escribe un programa que lea 15 números por teclado y que los almacene en un array. 
 * Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. 
 * El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array
 */


package EjerAmpliacion;

import java.util.Scanner;

public class Ej3CambiarOrdenElementos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Crear un array para almacenar 15 números
        int[] numeros = new int[15];

        // Leer 15 números por teclado y almacenarlos en el array
        Scanner scanner = new Scanner(System.in);
        int numerosIngresados = 0;

        while (numerosIngresados < 15) {
            System.out.print("Número " + (numerosIngresados + 1) + ": ");
            numeros[numerosIngresados] = scanner.nextInt();
            numerosIngresados++;
        }

        // Realizar la rotación de elementos en el array
        int ultimoElemento = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimoElemento;

        // Mostrar el contenido del array después de la rotación
        System.out.println("\nArray después de la rotación:");
        for (int i = 0; i < 15; i++) {
            System.out.print(numeros[i] + " ");
        }
	}

}
