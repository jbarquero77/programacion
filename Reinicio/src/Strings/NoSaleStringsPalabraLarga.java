package Strings;
import java.util.Scanner;

public class NoSaleStringsPalabraLarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		String [] palabraLarga = encontrarPalabra (frase);
		
		System.out.println("Las palabras mas largas son: ");
		for(String palabra: palabraLarga) {
			System.out.println(palabra);
		}

	}
	
	public static String []encontrarPalabra (String frase){
		String []palabras = frase.split(" ");
		int numLetras =0;
		
		for (String palabra : palabras) {
			if(palabra.length()== numLetras) {
				numLetras = palabra.length();
			}
		}
		int contador =0;
		for (String palabra: palabras) {
			if(palabra.length() == numLetras) {
				contador++;
			}
		}
		
		String []palabrasLargas = new String[contador];
		int indice =0;
		for(String palabra: palabras) {
			if(palabra.length() == numLetras) {
				palabrasLargas[indice++] = palabra;
			}
		}
		return palabrasLargas;
	}

}
