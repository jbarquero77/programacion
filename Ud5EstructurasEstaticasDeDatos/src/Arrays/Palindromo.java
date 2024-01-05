/*
 * Comprobar si una palabra o una frase es palíndroma.
 * Ten en cuenta que no se tienen en cuenta ni los espacios ni las mayúsculas ni las tildes
 */


package Arrays;

import java.util.Scanner;

public class Palindromo {
	
	public static boolean esPalindromo (String palabra){
		//Hay que evaluarla sin mayusculas, sin espacios, sin tildes
		
		palabra = palabra.toLowerCase();			// Pasamos la palabra a minúsculas
		palabra = palabra.replace(" ", "");			// Quitamos los espacios
		palabra = palabra.replace("á","a");
		palabra = palabra.replace("é","e");
		palabra = palabra.replace("í","i");			// Reemplazamos las vocales con tilde por vocales sin tilde
		palabra = palabra.replace("ó","o");
		palabra = palabra.replace("ú","u");
		
		// Ya tenemos la palabra en minúsculas, sin espacios, y sin tildes
		int primeraLetra =0;
		int ultimaLetra = palabra.length() -1;
		
		for (int i =0; i< palabra.length(); i++) {
			if ( palabra.charAt(primeraLetra) == palabra.charAt(ultimaLetra)) {
				primeraLetra++;
				ultimaLetra--;
			}else {
				return false;						// si no son iguales
			}
		}
		return true;								// si es verdadero (son iguales)
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String palabra;
		
		System.out.print("Escribe una palabra o frase: ");
		palabra = sc.nextLine();
		
		if (esPalindromo(palabra)) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}

	}
	
	

}
