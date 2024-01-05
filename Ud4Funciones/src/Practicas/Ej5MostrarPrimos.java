/*Programa que valide si un número es primo
 */

package Practicas;

import java.util.Scanner;

public class Ej5MostrarPrimos {

	public static void main(String[] args) {
				
		for (int i =2;i<=1000;i++) {
			System.out.println(i +" es primo " +esPrimo(i));
		}
		
	}
	public static boolean esPrimo(int n) {
		
		if (n<=1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		else {
			for (int i=2;i<n;i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
	}
	

}
