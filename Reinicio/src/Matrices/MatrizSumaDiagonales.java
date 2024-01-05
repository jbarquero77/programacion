package Matrices;

import java.util.Scanner;

public class MatrizSumaDiagonales {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce las dimensiones de la matriz cuadrada: ");
		int tamanio = sc.nextInt();
		
		int [][] matriz = leerMatrizCuadrada(tamanio);
		
		int diagonalPrincipal = sumaDiagonalPrincipal (matriz);
		int diagonalSecundaria = sumaDiagonalSecundaria(matriz);
		
		System.out.println("La suma de la diagonal Principal es: "+diagonalPrincipal);
		System.out.println("La suma de la diagonal Secundaria es: "+diagonalSecundaria);
	}
	
	public static int [][] leerMatrizCuadrada (int tamanio){
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la matriz cuadrada de dimensión: "+tamanio+ " x "+tamanio+" :");
		
		int[][]matriz = new int [tamanio][tamanio];
		
		for (int i=0; i<tamanio; i++) {
			for (int j=0; j<tamanio; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		return matriz;
	}
	
	public static int sumaDiagonalPrincipal (int[][]matriz) {
		int suma =0;
		for(int i =0; i< matriz.length; i++) {
			suma += matriz[i][i];
		}
		return suma;
	}
	
	public static int sumaDiagonalSecundaria (int[][]matriz) {
		int suma =0;
		for (int i=0; i<matriz.length;i++) {
			suma += matriz[i][matriz.length-i-1];
		}
		return suma;
	}

}
