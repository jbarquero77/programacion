package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DesdeArrays {

	public static void main(String[] args) {
		String[] arrayPalabras = {"Rojo", "Verde", "Azul", "Rojo"};
		
		Set<String> setPalabras = new HashSet<>(Arrays.asList(arrayPalabras));
		
		System.out.println("Palabras únicas: "+ setPalabras);
		
	}

}
