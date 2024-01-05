package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoListas {

	public static void main(String[] args) {
		
		List<String>palabras = new ArrayList<>();
		palabras.add("zorro");
		palabras.add("perro");
		palabras.add("gato");
		palabras.add("elefante");
		palabras.add("Zorro");
				
		System.out.println("Lista original: "+palabras);
		
		Collections.sort(palabras);
		
		System.out.println("Lista ordenada: "+palabras);
	}

}
