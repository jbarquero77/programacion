package List;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ConversionesListyArrays {

	public static void main(String[] args) {
		String[]array = {"Rojo","Verde","Azul"};
		
		List<String> lista = Arrays.asList(array);
		
		System.out.println("Lista desde Array: "+ lista);
		
		String[] nuevoArray = lista.toArray(new String[0]);
		
		System.out.println("Array desde lista: "+ Arrays.toString(nuevoArray));
	}

}
