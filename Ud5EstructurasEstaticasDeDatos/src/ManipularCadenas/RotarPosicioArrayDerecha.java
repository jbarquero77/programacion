/*
 * escribe un programa que lea 8 números por teclado y que los almacene en un array
 * rota los elementos de ese array, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2...
 * el número que se encuentra en la última posición debe pasar a la posición 0
 * finalmente, muestra el contenido del array
 */

package ManipularCadenas;

import java.util.Scanner;

public class RotarPosicioArrayDerecha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] numero = new int [8];
		
		int contador;
		System.out.println("Introduzca 8 números: ");
		
		for (contador =0; contador<8; contador++) {
			numero[contador] = sc.nextInt();
		}
		
		for (contador =0; contador<8; contador++) {
			System.out.print(" | "+contador);
		}
		System.out.println();
		
		for (contador =0; contador<8; contador++) {
			System.out.print(" | " +numero[contador]);
		}
		
		// Rotar la posicion
		
		int aux = numero[7];
		for (contador = 7; contador > 0; contador--) {
			numero[contador] = numero[contador-1];
		}
		numero[0] = aux;
		
		// array recorrido
		System.out.println();
		
		for (contador =0; contador < 8; contador++) {
			System.out.printf(" | "+contador);
		}
		
		System.out.println();
		for (contador =0; contador < 8; contador++) {
			System.out.printf(" | "+numero[contador]);
		}
	}

}
