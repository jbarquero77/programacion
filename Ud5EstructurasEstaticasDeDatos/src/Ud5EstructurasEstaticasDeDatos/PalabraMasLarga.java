/*
 * Crea un programa que reciba 5 palabras y luego nos muestre la que tiene mayor longitud.
 * si hay más de una palabra con la máxima longitud, se deberá mostrar la primera que aparezca
 */


package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class PalabraMasLarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String palabra ="";
		String palabraLarga = "";
		
		for (int i =0; i<5;i++) {
			System.out.println("Dime una palabra: "+ (i+1) + " de "+5);		// pedimos las palabras.. 1 de 5, 2 de 5...
			palabra = sc.nextLine();
			
			if (palabra.length() > palabraLarga.length()) {					// si la nueva palabra es mayor que la palabra mas larga
				palabraLarga = palabra;
			}
		}
		System.out.println("La palabra más larga es "+ palabraLarga);

	}

}
