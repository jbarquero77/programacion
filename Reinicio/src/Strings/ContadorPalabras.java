package Strings;

import java.util.Scanner;

public class ContadorPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		int contador = contadorPalabras(frase);
		System.out.printf("La frase tiene %d palabras", contador);

	}
	
	public static int contadorPalabras (String frase) {
		String [] palabras =frase.split(" ");
		return palabras.length;
	}

}
