/*
 * Cuenta las vocales que hay en una palabra, ten en cuenta que pueden estar acentuadas o en mayúsculas
 */


package Ud5EstructurasEstaticasDeDatos;

import java.text.Normalizer;
import java.util.Scanner;

public class ContarVocales {
	
	public static boolean esVocal(char c) {
		return "aeiou".indexOf(c) != -1;
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la palabra que quieres comprobar: ");
		String palabra = sc.nextLine();

		String palabraNormalizada = Normalizer.normalize(palabra, Normalizer.Form.NFD) // Con esto quitamos los acentos
				.replaceAll("\\p{M}", "");

		palabraNormalizada = palabraNormalizada.toLowerCase();
		int contadorVocales = 0;
		char caracter;

		for (int i = 0; i < palabraNormalizada.length(); i++) {
			caracter = palabraNormalizada.charAt(i);
			if (esVocal(caracter)) {
				contadorVocales++;
			}

		}
		System.out.println("La palabra " + palabra + " tiene " +contadorVocales+ " vocales.");

	}

}
