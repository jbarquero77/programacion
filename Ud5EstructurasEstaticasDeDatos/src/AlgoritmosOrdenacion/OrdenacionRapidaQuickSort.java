package AlgoritmosOrdenacion;

public class OrdenacionRapidaQuickSort {

	public class QuickSort {
		public static void main(String[] args) {
			int[] array = { 64, 25, 12, 22, 11 };

			System.out.println("Array sin ordenar:");
			imprimirArray(array);

			quickSort(array, 0, array.length - 1);

			System.out.println("\nArray ordenado:");
			imprimirArray(array);
		}

		static void quickSort(int[] arr, int bajo, int alto) {
			if (bajo < alto) {
				int indiceParticion = particion(arr, bajo, alto);

				// Ordenar los elementos antes y después de la partición
				quickSort(arr, bajo, indiceParticion - 1);
				quickSort(arr, indiceParticion + 1, alto);
			}
		}

		static int particion(int[] arr, int bajo, int alto) {
	        int pivote = arr[alto];
	        int i = bajo - 1;

	        for (int j = bajo; j < alto; j++) {
	            if (arr[j] <= pivote) {
	                i++;

	                // Intercambiar arr[i] y arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Intercambiar arr[i+1] y arr[alto] (pivote)
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[alto];
	        arr[alto] = temp;

	        return i + 1;
	    }

		static void imprimirArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
		}
	}
}