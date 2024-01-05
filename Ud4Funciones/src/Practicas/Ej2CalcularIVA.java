/* Programa que calcule el IVA en una compra, siendo el IVA del 21% sobre el valor total de la compra.
 */

package Practicas;

import java.util.Scanner;

public class Ej2CalcularIVA {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double compra, IVA;
		
		System.out.println("Ingresa el precio total de la compra: ");
		compra  = sc.nextDouble();
		
		IVA = calcularIVA(compra);
		System.out.println("El precio de la compra es: "+compra);
		System.out.println("El precio total de la compra con el IVA es de: "+ (compra+IVA));
	}
	
	public static double calcularIVA(double p) {
		double IVA;
		IVA = p*0.21;
		return IVA;
		
	}
	

}
