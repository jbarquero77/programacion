/*  Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.  */

package Ud3AR;

import java.util.Scanner;

public class NotasConIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota = sc.nextInt();
		
		if (nota >= 0 || nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota == 5) {
			System.out.println("Suficiente");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Escribe una nota entre 0 y 10");
		}
	}

}
