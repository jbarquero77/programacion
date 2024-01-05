package AlgoritmosOrdenacion;

public class MergeSortPorMezcla {

	public static void main(String[] args) {
		int[] array = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Array sin ordenar:");
		imprimirArray(array);

		mergeSort(array, 0, array.length - 1);

		System.out.println("\nArray ordenado:");
		imprimirArray(array);
	}

	static void mergeSort(int[] arr, int izquierda, int derecha) {
		if (izquierda < derecha) {
			// Encontrar el punto medio
			int medio = izquierda + (derecha - izquierda) / 2;

			// Ordenar la primera mitad y la segunda mitad
			mergeSort(arr, izquierda, medio);
			mergeSort(arr, medio + 1, derecha);

			// Combinar las mitades ordenadas
			merge(arr, izquierda, medio, derecha);
		}
	}

	static void merge(int[] arr, int izquierda, int medio, int derecha) {
		int n1 = medio - izquierda + 1;
		int n2 = derecha - medio;

		// Crear arrays temporales
		int[] izquierdaArray = new int[n1];
		int[] derechaArray = new int[n2];

		// Copiar datos a los arrays temporales
		System.arraycopy(arr, izquierda, izquierdaArray, 0, n1);
		System.arraycopy(arr, medio + 1, derechaArray, 0, n2);

		// Combinar los arrays temporales
		int i = 0, j = 0, k = izquierda;
		while (i < n1 && j < n2) {
			if (izquierdaArray[i] <= derechaArray[j]) {
				arr[k] = izquierdaArray[i];
				i++;
			} else {
				arr[k] = derechaArray[j];
				j++;
			}
			k++;
		}

		// Copiar los elementos restantes de izquierdaArray (si los hay)
		while (i < n1) {
			arr[k] = izquierdaArray[i];
			i++;
			k++;
		}

		// Copiar los elementos restantes de derechaArray (si los hay)
		while (j < n2) {
			arr[k] = derechaArray[j];
			j++;
			k++;
		}
	}

	static void imprimirArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
