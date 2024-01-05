package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterseccionListas {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		
		lista2.add(3);
		lista2.add(4);
		lista2.add(5);
		
		List<Integer>interseccion = lista1.stream()
				.filter(lista2::contains)
				.collect(Collectors.toList());
		System.out.println("Interseccion de listas: "+interseccion);
	}

}
