/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos.
 *  El usuario debe introducir la altura de la figura.

*****
*  *
* *
**
*

*/

package DibujaFiguras;

import java.util.Scanner;

public class TrianguloHuecoDecreciente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// Entrada de altura
		System.out.print("Introduce la altura");
		int altura = sc.nextInt(); 
		
		// Pinto la primera fila porque está fuera del patrón
		for (int fila = 0; fila < altura; fila++) {
			System.out.print("*");
		}
		//Pasar a la siguiente fila
		System.out.println();
		
		//Buscamos el patrón
		for (int fila =0; fila <altura-2; fila++) {
			System.out.print("*");
			for(int columna =0; columna<altura-fila-3; columna++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		//Pintamos el último arterisco
		System.out.println("*");
		
	}

}
