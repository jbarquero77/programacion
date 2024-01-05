package AlgoritmosOrdenacion;

public class PorArbolBinario {
	
	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6 };

		System.out.println("Array sin ordenar:");
		imprimirArray(array);

		ordenarPorInsercion(array);

		System.out.println("\nArray ordenado:");
		imprimirArray(array);
	}

	static void ordenarPorInsercion(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; ++i) {
			int clave = arr[i];
			int j = i - 1;

			// Mover los elementos del array[0..i-1] que son mayores que la clave
			// a una posición adelante de su posición actual
			while (j >= 0 && arr[j] > clave) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = clave;
		}
	}

	static void imprimirArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
}