package AlgoritmosOrdenacion;

public class PorCuenta {

	public static void main(String[] args) {
		int[] array = { 4, 2, 1, 0, 3, 4, 6, 5, 8, 7, 9 };

		System.out.println("Array sin ordenar:");
		imprimirArray(array);

		countingSort(array);

		System.out.println("\nArray ordenado:");
		imprimirArray(array);
	}

	static void countingSort(int[] arr) {
		int n = arr.length;

		// Encontrar el valor máximo para determinar el tamaño del array de conteo
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// Crear un array de conteo y un array de salida
		int[] conteo = new int[max + 1];
		int[] salida = new int[n];

		// Contar la frecuencia de cada elemento
		for (int i = 0; i < n; i++) {
			conteo[arr[i]]++;
		}

		// Actualizar el array de conteo para indicar la posición real de cada elemento
		// en el array ordenado
		for (int i = 1; i <= max; i++) {
			conteo[i] += conteo[i - 1];
		}

		// Construir el array de salida
		for (int i = n - 1; i >= 0; i--) {
			salida[conteo[arr[i]] - 1] = arr[i];
			conteo[arr[i]]--;
		}

		// Copiar el array ordenado de salida al array original
		System.arraycopy(salida, 0, arr, 0, n);
	}

	static void imprimirArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
