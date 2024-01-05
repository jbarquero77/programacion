/*
 * Cuenta las vocales que hay en una cadena
 */


package Strings;

import java.util.Scanner;

public class StringsContarVocales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String cadena = sc.nextLine();
		
		int vocales = contarVocales(cadena.toLowerCase());
		
		System.out.printf("Hay %d vocales", vocales);

	}
	public static int contarVocales (String texto) {
		
		char vocales[] = {'a', 'e', 'i', 'o', 'u'};
		int numVocales =0;
		char caracter =' ';
		
		boolean vocal = false;		
		
		for (int i =0; i<texto.length(); i++) {
			caracter = texto.charAt(i);
			
			vocal = false;
			
			for (int j=0; j<vocales.length && !vocal; j++) {
				
				if(caracter ==vocales[j]) {
					vocal=true;				
				}				
			}
			
			if (vocal) {
				numVocales++;
			}
			
		}
		return numVocales;
	}
		
}	


