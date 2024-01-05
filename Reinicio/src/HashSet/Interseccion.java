package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Interseccion {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		//Encontrar e imprimir los valores comunes en los dos sets
		Set<Integer>interseccion = new HashSet<>(set1);
		interseccion.retainAll(set2);
		
		System.out.println("Interseccion de HashSets: "+interseccion);
		
	}

}
