package Strings;

import java.util.Scanner;

public class StringsPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		
		if(esPalindromo(palabra)) {
			System.out.println("Es palíndroma");
		}else {
			System.out.println("No es palíndroma");
		}

	}
	
	public static boolean esPalindromo (String texto) {
		String limpia = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int tamanio = limpia.length();
		
		for (int i=0; i<tamanio/2;i++) {
			if(limpia.charAt(i) != limpia.charAt(tamanio-i-1)) {
			return false;
			}
		}
		return true;
		
	}

}
