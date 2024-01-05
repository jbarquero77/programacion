package OtraVez;

import java.util.HashMap;

public class HashMapAgenda {

	public static void main(String[] args) {
		
		HashMap<String, String> agenda = new HashMap<>();
		
		agenda.put("Jose", "123445");
		agenda.put("Barquero", "5443567");
		
		for(String nombre : agenda.keySet()) {
			System.out.println(nombre+ ": "+agenda.get(nombre));
		}

	}

}
