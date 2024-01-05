/* Realiza  un programa que presente por pantalla una figura de asteriscos como la siguiente:

Introduce la altura de la figura: 5

*
**
***
****
*****
*/


package DibujaFiguras;

import java.util.Scanner;


public class TrianguloCreciente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce la altura del triángulo");
		int altura = sc.nextInt();
		
		for (int fila =0; fila<altura; fila++) {
			//System.out.print("*");
			for(int columna =0; columna < fila+1; columna++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
