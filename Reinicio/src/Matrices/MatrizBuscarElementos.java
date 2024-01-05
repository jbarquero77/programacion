package Matrices;

import java.util.Scanner;

public class MatrizBuscarElementos {

	public static void main(String[] args) {
		int[][] matriz = {{5,2,8,4},{3,9,1,7},{6,3,2,5}};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el número que quieres buscar: ");
		int numeroBuscado = sc.nextInt();
		
		boolean encontrado = buscarEnMatriz(matriz, numeroBuscado);
		
		if(encontrado) {
			System.out.println("El número está en la matriz");
		}else {
			System.out.println("El número no está en la matriz");
		}

	}
	
	public static boolean buscarEnMatriz(int[][] matriz, int numero) {
		for(int[]fila : matriz) {
			for(int elemento : fila) {
				if(elemento == numero) {
					return true;
				}
			}
		}
		return false;
	}

}
