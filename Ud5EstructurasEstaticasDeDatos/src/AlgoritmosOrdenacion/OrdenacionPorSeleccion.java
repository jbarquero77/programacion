package AlgoritmosOrdenacion;

public class OrdenacionPorSeleccion {

	public static void main(String[] args) {

		int[] array = { 64, 25, 12, 22, 11 };

		System.out.println("Array sin ordenar:");
		imprimirArray(array);

		ordenarPorSeleccion(array);

		System.out.println("\nArray ordenado:");
		imprimirArray(array);
	}

	static void ordenarPorSeleccion(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int indiceMinimo = i;

			// Encontrar el índice del elemento más pequeño
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[indiceMinimo]) {
					indiceMinimo = j;
				}
			}

			// Intercambiar el elemento más pequeño con el primer elemento no ordenado
			int temp = arr[indiceMinimo];
			arr[indiceMinimo] = arr[i];
			arr[i] = temp;
		}
	}

	static void imprimirArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
