/* Escribe un programa que calcule cuantas cifras tiene un número entero positivo.
(pista: se puede hacer dividiendo varias veces entre 10) */

package EstructurasControl;

import java.util.Scanner;

public class CifrasNumPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escribe un número positivo");
		
		int num = sc.nextInt();
		int cifras =0;
		
		while (cifras > 0) {
			num = num % 10;
			cifras++;
			
		}
		System.out.println("El número tiene "+cifras+ " cifras");
	}

}
