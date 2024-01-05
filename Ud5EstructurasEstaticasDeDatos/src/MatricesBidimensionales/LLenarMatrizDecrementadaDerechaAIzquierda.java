/*
 * Llenar una matriz de enteros de tamaño n x m, donde n y m son ingresados por el usuario con números desde n x m al 1;
 * hasta completar todas las posicones de a [][].
 * La matriz se recorre de derecha a izquierda y de arriba a abajo
 */


package MatricesBidimensionales;

import java.util.Scanner;

public class LLenarMatrizDecrementadaDerechaAIzquierda {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int filas;
		int columnas;
		
		
		System.out.print("Introduzca la cantidad de filas: ");
		filas = sc.nextInt();
		System.out.print("Introduzca la cantidad de columnas: ");
		columnas = sc.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		
		//LLenar array
		int datoInicial = filas * columnas;
		
		for (int i =0; i < matriz.length; i++) {
			for (int j = matriz[0].length-1; j >=0; j--) {
				matriz[i][j] = datoInicial;
				datoInicial--;
				
			}
		}
		
		// Mostrar matriz
		for (int i = 0; i < matriz.length; i++) {
			for ( int j =0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
