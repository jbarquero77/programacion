/*
 * 
 */


package MatricesBidimensionales;

import java.util.Scanner;
import java.util.Arrays;

public class LlenarEstiloCaracol {
	
	public static int [][] realizarRecorrido (int filas, int columnas){
		int [][] matriz = new int[filas][columnas];
		int numeroInicial =1;
		
		int inicioFila =0;
		int finalFila = filas-1;
		int inicioColumna =0;
		int finalColumna = columnas-1;
		
		while (inicioFila <= finalFila || inicioColumna <= finalColumna) {
			// izquierda a derecha
			for (int i = inicioColumna; i <= finalColumna; i++) {
				matriz[inicioFila][i] = numeroInicial;
				numeroInicial++;
			}
			
			// recorrer la última columna de arriba a abajo
			for (int i = inicioFila+1; i <= finalFila; i++) {
				matriz[i][finalColumna] = numeroInicial++;
			}
			
			// derecha a izquierda última fila
			for (int i = finalColumna -1; i >= inicioColumna; i--) {
				matriz[finalFila][i] = numeroInicial++;
			}
			
			// recorrer primera columna de abajo a arriba
			for(int i = finalFila-1; i >= inicioFila+1; i--) {
				matriz[i][inicioColumna] = numeroInicial++;
			}
			
			inicioFila++;
			finalFila--;
			inicioColumna++;
			finalColumna--;
		}
		
		return matriz;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int filas;
		int columnas;
		
		System.out.print("Introduce las filas: ");
		filas = sc.nextInt();
		System.out.print("Introduce las columnas: ");
		columnas = sc.nextInt();
				
		int matriz[][] = realizarRecorrido(filas, columnas);
		
		// Mostrar la matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
