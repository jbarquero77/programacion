package Matrices;

import java.util.Scanner;

public class MatricesProducto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce las dimensione de la primera matriz: ");
		int filas1 = sc.nextInt();
		int columnas1 = sc.nextInt();
		
		System.out.println("Introduce las dimensione de la segunda matriz: ");
		int filas2 = sc.nextInt();
		int columnas2 = sc.nextInt();
		
		if(columnas1 != columnas2) {
			System.out.println("No se puede realizar la multiplicación");
			return;
		}
		
		int [][] matriz1 = leerMatriz (filas1, columnas1, "primera");
		int[][] matriz2 = leerMatriz (filas2, columnas2, "segunda");
		
		int [][]matrizProducto = matrizProducto(matriz1, matriz2);
		System.out.println("La matriz resultante es: ");
		imprimirMatriz (matrizProducto);
		
	}
	
	public static int [][] leerMatriz (int filas, int columnas, String ordinal){
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la "+ordinal+ " matriz de dimensiones "+filas+ " x " +columnas+" :");
		int [][] matriz = new int [filas][columnas];
		
		for(int i =0; i<filas;i++) {
			for(int j=0; j< columnas; j++) {
				matriz[i][j] = sc.nextInt();	
			}
		}
		return matriz;
	}
	
	public static int[][] matrizProducto (int [][] matrizA, int[][] matrizB){
		int filasA = matrizA.length;
		int columnasA = matrizA[0].length;
		int columnasB = matrizB[0].length;
		
		int [][] producto = new int [filasA][columnasB];
		
		for(int i=0; i<filasA; i++) {
			for(int j=0; j<columnasB;j++) {
				for(int k=0; k<columnasA; k++) {
					producto[i][j] += matrizA[i][k] * matrizB [k][j];
				}
			}
		}
		return producto;
	}
	
	public static void imprimirMatriz (int[][] matriz) {
		for(int[] fila: matriz) {
			for(int num: fila) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
