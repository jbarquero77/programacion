package Matrices;

import java.util.Random;
import java.util.Scanner;

public class NoMatrizAleatorios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = sc.nextInt();
		
		System.out.println("Introduce el número de columnas: ");
		int columnas = sc.nextInt();
		
		int [][] matrizAleatorios = generarMatrizAleatorios(filas, columnas);
		
		System.out.println("Matriz con números Aleatorios: ");
		imprimirMatriz(matrizAleatorios);
	}
	
	public static int [][] generarMatrizAleatorios (int filas, int columnas){
		int [][] matriz = new int[filas][columnas];
		Random ran = new Random();
		
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				matriz[i][j] = ran.nextInt(100);
			}
		}
		return matriz;
	}
	
	public static void imprimirMatriz (int [][] matriz) {
		for(int[] fila : matriz) {
			for(int num : fila) {
				System.out.println(num + " ");
			}
			System.out.println();
		}
		
	}

}

