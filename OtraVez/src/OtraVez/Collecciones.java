package OtraVez;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Collecciones {

	public static void main(String[] args) {
		//ArrayList
		
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Jose");
		listaNombres.add("Barquero");
		
		//HashSet
		HashSet<Integer> conjuntoNumeros = new HashSet<>();
		conjuntoNumeros.add(5);
		conjuntoNumeros.add(10);
		
		//HashMap
		HashMap<String, Integer> mapaEdades = new HashMap<>();
		mapaEdades.put ("Jose", 46);
		mapaEdades.put("Gato", 48);
	}

}
