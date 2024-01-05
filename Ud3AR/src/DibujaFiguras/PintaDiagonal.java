/* Realiza un programa que pinte una diagonal de esta forma.

Introduce la altura de la figura: 5

    *
   *
  *
 *
* 

*/

package DibujaFiguras;

import java.util.Scanner;

public class PintaDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime la altura de la diagonal: ");
		int altura = sc.nextInt();
		
		
		int espacios = altura-1;
		
		for (int fila =0; fila < altura; fila++) {
			for (int columna =0; columna < altura -1-fila; columna++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
			
			
	}
}
