/*Programa que calcule la tabla de multiplicar de cualquier número entero que nos de el usuario.
 * debe calcular la tabla desde el 0 hasta el 10
 * 
 */
package Practicas;

import java.util.Scanner;

public class Ej3MultiplicarNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tablaDel;
		System.out.println("De qué número quieres calcular la tabla? ");
		tablaDel = sc.nextInt();
		
		for (int i =0; i<=10;i++) {
				System.out.println(tablaMultiplicar(tablaDel, i));	
				}

	}
	
	public static String tablaMultiplicar(int n1, int n2) {
		return n1 + "*" + n2 + " = " +(n1*n2);
		
	}

}
