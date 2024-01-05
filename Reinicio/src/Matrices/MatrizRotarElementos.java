package Matrices;

public class MatrizRotarElementos {

	public static void main(String[] args) {
		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		matrizRodada (matriz);
		
		System.out.println("Matriz después de la rotación");
		imprimirMatriz(matriz);
	}
	
	public static void matrizRodada(int[][] matriz) {
		int tamanio = matriz.length;
		
		for (int i =0; i<tamanio; i++) {
			for(int j=0; j<tamanio/2; j++) {
				int temp = matriz[i][j];
				matriz[i][j] = matriz[i][tamanio-1-j];
				matriz[i][tamanio-1-j]= temp;
			}
		}
	}
	
	public static void imprimirMatriz(int[][]matriz) {
		for(int[]fila : matriz) {
			for(int num : fila) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	

}
