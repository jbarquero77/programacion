package Matrices;

import java.util.Arrays;

public class MatricesOrdenamiento {

	public static void main(String[] args) {
		int[][] matriz = {{5,2,8,4},{3,9,1,7},{6,0,2,5}};
		
		System.out.println("Matriz original");
		imprimirMatriz(matriz);
		
		matrizOrdenada(matriz);
		
		System.out.println("\nMatriz con filas ordenadas: ");
		imprimirMatriz(matriz);
	}
	
	public static void matrizOrdenada(int[][]matriz) {
		for(int[]fila : matriz) {
			Arrays.sort(fila);
		}
	}
	
	public static void imprimirMatriz (int[][] matriz) {
		for(int[]filas : matriz) {
			System.out.println(Arrays.toString(filas));
		}
	}

}
