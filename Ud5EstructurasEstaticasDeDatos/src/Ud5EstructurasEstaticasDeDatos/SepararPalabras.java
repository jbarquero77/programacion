/*
 * Crea un programa que te pida una palabra y escriba las letras separadas por espacios
 */


package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class SepararPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		for (int i =0; i<palabra.length(); i++) {
			System.out.print(palabra.charAt(i)+ " ");
		}
		System.out.println();

	}

}
