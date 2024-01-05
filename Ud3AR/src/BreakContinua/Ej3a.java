/*
 * Pedir al usuario dos números y que escriba su máximo común divisor. 
 * Pista: una solución lenta pero sencilla es probar con un for todos los números descendiendo a partir del menor de ambos, 
 * hasta llegar a 1;
 *  cuando encuentres un número que sea divisor de ambos, interrumpe la búsqueda con break. 
 */


package BreakContinua;

import java.util.Scanner;

public class Ej3a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int mcd = 1;
		
		for (int i = min; i >=1; i--) {
			if (num1%i == 0 && num2%i ==0) {
				mcd =i;
				break;
			}
		}
		System.out.println("El máximo común divisor de "+num1+ " y " + num2 + " es: "+mcd);
	}

}
