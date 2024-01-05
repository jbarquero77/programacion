package Arrays;

import java.util.Arrays;

public class ArraysRotacion {

	public static void main(String[] args) {
		int []array = {1,2,3,4,5};
		int rotacion =2;					//Rotamos 2 números a la derecha
		
		System.out.println("Array original: ");
		System.out.println(Arrays.toString(array));
		
		rotacion(array, rotacion);
		
		System.out.println("Array rotando a la derecha: ");
		System.out.println(Arrays.toString(array));
	}
	
	public static void rotacion (int[]arr, int rotacion) {
		int n= arr.length;
		rotacion %= n;
		
		reverseArray(arr,0,n-1);
		reverseArray(arr,0,rotacion -1);
		reverseArray(arr, rotacion, n-1);
	}
	
	public static void reverseArray(int[]arr, int principio, int ultimo) {
		while(principio<ultimo) {
			int temp = arr[principio];
			arr[principio]= arr[ultimo];
			arr[ultimo]= temp;
			principio++;
			ultimo--;
		}
	}

}
