package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListOperaciones {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		
		//Agregar elementos
		numeros.add(5);
		numeros.add(2);
		numeros.add(8);
		numeros.add(5); // duplicado
		
		//Mostrar lista original
		System.out.println("Lista original: "+numeros);
		
		//Eliminar duplicados con HashSet
		HashSet<Integer> unicos = new HashSet<>(numeros);
		numeros.clear();
		numeros.addAll(unicos);
		
		System.out.println("Lista sin duplicados: "+ numeros);
		
		//Calcular la suma de los elementos
		int suma =0;
		for (int num:numeros) {
			suma += num;
		}
		
		
		System.out.println("La suma de los elementos es: "+ suma);
		
		
	}

}
