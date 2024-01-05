package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContarPalabras {

	public static void main(String[] args) {
		String frase = "Hola mundo, hola Java. Hola todos.";
		
		String [] palabras = frase.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		
		Map<String, Integer> contarPalabras = new HashMap<>();
		for(String palabra: palabras) {
			contarPalabras.put(palabra, contarPalabras.getOrDefault(palabra, 0)+1);
		}
		
		System.out.println("Conteo de palabras: "+ contarPalabras);
	}

}
