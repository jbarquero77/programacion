/* Cada cas és d'una sola línia que contindrà dues paraules
Sortida
Per cada cas es dira primeraparaula amb segonaparaula

*/


package ProblemesScanner;

import java.util.Scanner;

public class paEnTomaca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String primeraparaula = sc.next();
		String segonaparaula = sc.next();
		
		System.out.println(primeraparaula+" amb "+segonaparaula);
	}

}
