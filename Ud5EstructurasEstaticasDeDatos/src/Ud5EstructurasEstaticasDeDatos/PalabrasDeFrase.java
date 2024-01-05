/*
 * Crea un progrma que lea por teclado una cadena de texto e indique la cantidad de palabras que tiene.
 * de la clase String, únicamente se pueden utilizar los métodos charAt(), trim() y length()
 * 
 */


package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class PalabrasDeFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una frase: ");
		
		String frase = sc.nextLine().trim();				// con el trim quitamos los espacios del principio y del final
		int palabras =1;									// al menos la frase tendrá 1 palabra
		
		
		for (int i =0; i<frase.length()-1;i++) {				// ponemos el -1 para no pasarnos de rango en la última pasada
			if(frase.charAt(i) == ' ' && frase.charAt(i+1) != ' ') {
				palabras++;
			}
		}
		if(frase.equals("")) {
			System.out.println("La frase no tiene ninguna palabra");
		}else {
			System.out.println("La frase tiene "+ palabras + " palabra" +(palabras > 1 ? "s" : ""));
		}
		
		
	}

}
