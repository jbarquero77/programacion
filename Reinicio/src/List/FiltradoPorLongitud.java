package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltradoPorLongitud {

	public static void main(String[] args) {
		List<String> palabras = Arrays.asList("Java", "Python", "C", "JavaScript", "Swift");
		
		List<String> palabrasFiltradas = palabras.stream()
				.filter(s -> s.length()>4)
				.collect(Collectors.toList());
		
		System.out.println("Palabras con longitud mayor a 4: "+ palabrasFiltradas);
		
	}

}
