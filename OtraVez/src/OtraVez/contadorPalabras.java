package OtraVez;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class contadorPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Map<String, Integer> contadorPalabras = new HashMap<>();
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		String[]palabras = frase.split(" ");
		
		for (String palabra : palabras) {
			contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0)+1);
		}
		System.out.println("Palabras: ");
		for(Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
			System.out.println(entry.getKey()+ ": " +entry.getValue()+" veces" );
		}
	}

}
