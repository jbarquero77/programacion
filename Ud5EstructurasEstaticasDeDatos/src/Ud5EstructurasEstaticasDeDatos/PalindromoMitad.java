package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class PalindromoMitad {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine().toLowerCase();
		String palabraInvertida = "";
		boolean palindromo = true;
		double mitad = palabra.length()/2;
		
		for (int i=0; i<mitad;i++) {
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
				palindromo = false;
				break;
			}
		}
		
		if (palindromo) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
		
	}

}
