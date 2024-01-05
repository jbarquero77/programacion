/*
 * Pide al usuario una cantidad de "millas náuticas" y
 *  muestra la equivalencia en metros, usando: 1 milla náutica = 1852 metros.  
 */

package Ud1AR;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de millas que quieres convertir a metros: ");
		int millas = sc.nextInt();
		int metros = millas * 1852;
		
		System.out.println(millas + " millas, equivalen a: "+metros+" metros.");

	}

}
