/*
 * Llenar una matriz a[] [] de tipo char del tamaño n x m, donde n y m son ingresados por el usuario y deben ser impares
 * al imprimir, se debe ver la pirámide rellena
 */


package MatricesBidimensionales;

import java.util.Scanner;

public class PiramideArteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int filas; 
		int columnas;
		boolean numeroCorrecto = false;
		
		do {
			System.out.print("Ingresa las filas: (número impar)");
			filas = sc.nextInt();
			System.out.print("Ingresa las columnas: (número impar) ");
			columnas = sc.nextInt();
			
			// Evaluamos si son impares
			if ( filas %2 !=0 && columnas % 2 !=0) {
				numeroCorrecto = true;
			}else {
				System.out.println("Error. Debe ingresar números impares");
			}
			System.out.println();
			
		}while (!numeroCorrecto);
		
		char [][] matriz = new char [filas][columnas];
		
		//Calculamos la mitad de la matriz
		int mitad = matriz[0].length/2;
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[0].length;j++) {
				if ((i+j) >=mitad && (j-i) <= mitad){
					matriz[i][j] = '*';
				}else {
					matriz[i][j]= ' ';
				}
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
	}

}
