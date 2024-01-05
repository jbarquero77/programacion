package Strings;

import java.util.Scanner;

public class StringPalabraInvertida {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		String fraseInvertida = revertirPalabras(frase);
		
		System.out.println("Frase invertida: ");
		System.out.println(fraseInvertida);

	}
	
	public static String revertirPalabras (String frase) {
		String []palabras = frase.split(" ");
		StringBuilder revertirFrase = new StringBuilder();
		for (int i = palabras.length-1; i>=0; i--) {
			revertirFrase.append(palabras[i]).append(" ");
		}
		return revertirFrase.toString().trim();
	}

}
