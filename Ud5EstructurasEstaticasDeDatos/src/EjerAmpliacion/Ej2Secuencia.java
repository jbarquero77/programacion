/*
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
 *  1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
 * hasta introducir 10 diez veces, y luego la muestre por pantalla. 
 * En esta ocasión has de utilizar Arrays.fill(). 
 */

package EjerAmpliacion;

import java.util.Arrays;

public class Ej2Secuencia {

	public static void main(String[] args) {
		
		int tamanio =10;
		
		int []array = new int [tamanio *(tamanio +1)/2];
		
		int indice =0;
		for( int i = 1; i <= tamanio; i++) {
			Arrays.fill (array, indice, indice+i, i);
			indice +=i;
		}
		
		
		System.out.println("El array creado es: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
