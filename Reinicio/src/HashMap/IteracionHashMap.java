package HashMap;

import java.util.Map;
import java.util.LinkedHashMap;

public class IteracionHashMap {

	public static void main(String[] args) {
		Map<String, String>diccionario = new LinkedHashMap<>();
		
		diccionario.put("Hola", "Saludo");
		diccionario.put("Perro","animal");
		diccionario.put("Java","Lenguaje de Programacion");
		
		System.out.println("Diccionario: ");
		for(Map.Entry<String, String> entry: diccionario.entrySet()) {
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}

	}

}
