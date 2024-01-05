/* Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. 
 * El usuario debe introducir la altura de la figura.
*/


package DibujaFiguras;

import java.util.Scanner;


public class TrianguloRelleno {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce la altura del triángulo");
		int altura = sc.nextInt();
		
		for (int fila =0; fila < altura; fila++) {
			for (int columna =0; columna < altura -1-fila; columna++) {
				System.out.print("*");
			}
			System.out.println("*");
			
		}
			
		
	}

}
