/*
 * 4. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 *  El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante)
 *   y todos los números impares a las celdas restantes.
 *  Utiliza arrays auxiliares si es necesario. 
 */

package EjerAmpliacion;


import java.util.Arrays;
import java.util.Random;

public class Ej4ArrayAleatoriosParesDelante {

	public static void main(String[] args) {
		
		int numeros [] = new int [20];
		
		Random ran = new Random();
		for (int i =0; i<20; i++) {
			numeros[i] = ran.nextInt(101);
		}
		
		int []numerosOrganizados = new int[20];
		int indicePar = 0;
		
		int indiceImpar = numeros.length / 2; // Inicia después de la mitad del array

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosOrganizados[indicePar] = numeros[i];
                indicePar++;
            } else {
                numerosOrganizados[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }

        // Mostrar el array después de la organización
        System.out.println("\nArray después de la organización:");
        System.out.println(Arrays.toString(numerosOrganizados));
	}

}
