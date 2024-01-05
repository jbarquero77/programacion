/*
 * LLenar una matriz de tipo char de tamaño nxm, donde n y m son ingresados por el usuario y deben ser impares
 * al imprimr a, se visualice por la pantalla una cruz
 * 
 * 
 */

package MatricesBidimensionales;

import java.util.Scanner;

public class DibujarCruz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int filas;
		int columnas;
		
		boolean impar = false;
		
		
		// Solicitamos los dos números y evaluamos si son pares o impares
		do {
			System.out.print("ingresa las filas (número impar): ");
			filas = sc.nextInt();
			System.out.print("ingresa las columnas (número impar): ");
			columnas = sc.nextInt();
			
			if ( filas % 2 != 0 && columnas %2 != 0) {
				impar = true;
			}else {
				System.out.println("Datos incorrectos. Intruduce dos valores impares");
			}
			System.out.println();
			
		}while(!impar);
			
			char [][] matriz = new char [filas][columnas];
			int mitadFilas = matriz.length/2;
			int mitadColumnas = matriz[0].length/2;
			
			for (int i =0; i<matriz.length; i++) {
				for (int j =0; j < matriz[0].length; j++) {
					
					if (i == mitadFilas || j == mitadColumnas) {
						matriz[i][j] = '*';
					}else {
						matriz[i][j] = ' ';
					}
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}

	}

}
