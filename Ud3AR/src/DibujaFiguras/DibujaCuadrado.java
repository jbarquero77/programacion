/*  Realiza un programa que permita el ingreso de un valor y muestre dibujado con * un rectángulo.

Introduce la anchura del rectángulo: 4
Introduce la altura del rectángulo: 3 */


package DibujaFiguras;
import java.util.Scanner;

public class DibujaCuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Introduce la anchura: ");
		int anchura = sc.nextInt();
		System.out.print("Introduce la altura: ");
		int altura = sc.nextInt();
		
		// Entrada de la altura
		for (int fila =0; fila < altura; fila++) {
			//Entrada de la anchura
			for (int columna=0; columna < anchura;columna++) {
				// pinta cada columna de la fila
				System.out.print("*");
			}
			//Salta de fila cuando termina de pintar toda la fila
			System.out.println();
		}

	}

}
