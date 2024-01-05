package Matrices;

import java.util.Arrays;

public class MatricesSuma {

	public static void main(String[] args) {
		int [][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matriz2 = {{9,8,7},{6,5,4},{3,2,1}};
		
		int[][] matrizResultado = sumaMatrices(matriz1, matriz2);
		
		System.out.println("Matriz 1: ");
		imprimirMatriz(matriz1);
		System.out.println("Matriz 2: ");
		imprimirMatriz(matriz2);
		System.out.println("Matrices sumandas: ");
		imprimirMatriz(matrizResultado);
		imprimirMatriz2(matrizResultado);
		imprimirMatriz3(matrizResultado);
	}
	
	public static int[][] sumaMatrices(int[][] matrizA, int[][]matrizB){
		int filas = matrizA.length;
		int columnas = matrizA[0].length;
		int[][] resultado = new int[filas][columnas];
		
		for(int i=0; i<filas;i++) {
			for(int j=0; j<columnas; j++) {
				resultado[i][j]= matrizA[i][j]+matrizB[i][j];
			}
		}
		return resultado;
	}
	
	public static void imprimirMatriz(int[][]matriz) {
		for(int[]filas:matriz) {
			System.out.println(Arrays.toString(filas));
		}
		System.out.println();
	}
	
	// No era tan dificil como pensabas, respira hondo
	public static void imprimirMatriz2(int [][] matriz){
		for (int []fila : matriz) {
			for (int num : fila) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// hacer otro imprimir con un bucle anidado
	public static void imprimirMatriz3(int [][] matriz) {
		for (int i =0; i<matriz.length; i++) {
			for(int j =0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
