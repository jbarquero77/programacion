/*
 * Una función que nos muestre un array, otra que nos de la suma y otra que nos devuelva la media
 */


package Arrays;

public class SumaArray {

	public static void main(String[] args) {
		
		int numeros [] = {1,2,3,4,5};
		
		mostrarArray(numeros);
		
		System.out.println(sumaArray(numeros));
		System.out.println(media(numeros));
		

	}
	
	public static void mostrarArray (int [] array) {
		
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int sumaArray (int []array) {
		int suma =0;
		
		for (int i=0; i<array.length;i++) {
			suma += array[i];
		}
		return suma;
	}
	
	public static double media (int []array) {
		int suma = sumaArray(array);
		
		return suma/array.length;
		
		
		
	}

}
