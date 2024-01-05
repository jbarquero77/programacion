/* Escribe un programa que pida al usuario su contraseña (numérica). 
 * Deberá terminar cuando introduzca como contraseña el número 1111, 
 * de lo contrario será solicitada tantas veces como sea necesario. */

package EstructurasControl;

import java.util.Scanner;

public class PideContrasenya {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tu conseña");
		int contrasenya = sc.nextInt();
		
		while (contrasenya != 1111) {
			System.out.println("Introduce tu conseña");
			contrasenya = sc.nextInt();
		}
	}

}
