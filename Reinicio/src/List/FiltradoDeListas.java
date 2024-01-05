package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltradoDeListas {

	public static void main(String[] args) {
		
		List<Object>elementos = new ArrayList<>();
		elementos.add("Hola");
		elementos.add(42);
		elementos.add("Java");
		elementos.add(3.14);
		elementos.add("Mundo");
		
		//Filtrar elementos tipo String
		List<String> soloStrings =elementos.stream()
			.filter(String.class::isInstance)
			.map(String.class::cast)
			.collect(Collectors.toList());
		
		System.out.println("Elementos tipo String: "+soloStrings);
			
	}

}
