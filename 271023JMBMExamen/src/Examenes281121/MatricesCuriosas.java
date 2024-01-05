package Examenes281121;

import java.util.Scanner;

public class MatricesCuriosas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamanio;
		System.out.print("Introduce el tamaño de la matriz (número impar y mayor que 3: )");
		
		tamanio = sc.nextInt();
		
		if (tamanio <3 || tamanio%2== 0) {
			System.out.print("El tamaño no es correcto, introduce un número impar");
		}else {
		
			int[][] matriz = llenarMatriz(tamanio);
			
			
	        // Imprimir la matriz resultante
	        imprimirMatriz(matriz);
		}
	}
		
	public static int [][] llenarMatriz (int n){
		
		int [][] matriz = new int[n][n];
		 int num = 1;
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                matriz[i][j] = num;
	                num++;
	            }
	        }

		return matriz;
			
	}
	
	public static void imprimirMatriz(int[][]matriz) {
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
	}
	
}
