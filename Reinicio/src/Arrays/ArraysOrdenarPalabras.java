package Arrays;

import java.util.Arrays;

public class ArraysOrdenarPalabras {

	public static void main(String[] args) {
		String [] palabras = {"pera", "platano", "manzana", "uva"};
		
		System.out.println("Palabras sin ordenar: ");
		System.out.println(Arrays.toString(palabras));
		
		Arrays.sort(palabras);
		
		System.out.println("Palabras ordenadas: ");
		System.out.println(Arrays.toString(palabras));

	}

}
