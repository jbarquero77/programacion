package OtraVez;

import java.util.Scanner;

public class MatrizBuscarElementos {

	public static void main(String[] args) {
		int[][] matriz = {{5,2,8,4},{3,9,1,7},{6,3,2,5}};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el número que quieres buscar: ");
		int numeroBuscado = sc.nextInt();
		
		boolean encontrado = buscarElemento(matriz, numeroBuscado);
		if (encontrado) {
			System.out.println("El número se encuentra en la matriz");
		}else {
			System.out.println("no se encuentra en la matriz");
		}

	}
	
	public static boolean buscarElemento (int [][] matriz, int numeroBuscado) {
		for (int [] num : matriz) {
			for (int elem : num) {
				if (elem == numeroBuscado) {
					return true;
				}
			}
		}
		return false;
	}

}
