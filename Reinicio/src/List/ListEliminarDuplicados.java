package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEliminarDuplicados {

	public static void main(String[] args) {
		Integer[]array = {1,2,3,4,2,5,6,1,3};
		List<Integer> listaConDuplicados = Arrays.asList(array);
		List<Integer> listaSinDuplicados = new ArrayList<>(listaConDuplicados);
		
		listaSinDuplicados.removeIf(i -> listaConDuplicados.indexOf(i) != listaConDuplicados.lastIndexOf(i));
		
		System.out.println("Array original: "+Arrays.toString(array));
		System.out.println("Array sin duplicados: "+ listaSinDuplicados);
	}

}
