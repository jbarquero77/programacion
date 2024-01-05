/* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. 
 * Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, 
en caso contrario se debe mostrar un mensaje de error. */


package DibujaFiguras;

import java.util.Scanner;

public class RectanguloConEspacios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce la altura: ");
		int altura = sc.nextInt();
		
		System.out.print("Introduce la anchura: ");
		int anchura = sc.nextInt();
		
		//pinto la primera línea
		for (int columna = 0;columna < anchura; columna++) {
			System.out.print("*");
		}
		System.out.println();
		
		// Pinto los muros
		for (int fila =0; fila < altura-2; fila++){
				System.out.print("*");
				
				for (int columna =0; columna < anchura-2; columna++) {
					System.out.print(" ");
				}
				System.out.println("*");
		}
		//pinto la última línea
		for (int columna = 0;columna < anchura; columna++) {
					System.out.print("*");
				}
		
	}

}
