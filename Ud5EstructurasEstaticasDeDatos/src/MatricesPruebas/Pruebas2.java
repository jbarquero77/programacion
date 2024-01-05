package MatricesPruebas;

import java.util.Random;
import java.util.Scanner;

public class Pruebas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Para que el usuario introduzca el numero de filas o columnas y guardarlo en una variable
		int filas = sc.nextInt();
		int columnas = sc.nextInt();		
		
		int n = 4;
		int [][] matriz = new int [n][n];
		
		// para controlar el tamaño de las filas o columnas
		// int numFilas = matriz.length;
		// int numColumnas = matriz[0].length;
		
		// System.out.println("filas: " + matriz.length);				// Nos da el número de filas
		// System.out.println("columnas: " + matriz[0].length);		// Nos da el número de columnas
		
		
		// Recorrer filas y columnas
		for (int i =0; i < n; i++) {
			for (int j =0; j<0; j++) {
				System.out.println(matriz[i][j] + " ");
			}
		}
		
		
		// Rellenarlo con aleatorios
		Random r = new Random();
		
		for (int i =0; i < n; i++) {
			for (int j =0; j<n; j++) {
				matriz[i][j] = r.nextInt(11);   // Rellena la matriz entre números del 0 al 100 (el número es exclusivo)
			}
		}
		
		// Recorrer matriz y mostrar
		for (int i =0; i < n; i++) {
			for (int j =0; j<n; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
		
		// Recorrer una diagonal mayor y sumarla
		int totalSuma = 0;
		
		for (int i =0; i < n; i++) {
			totalSuma  += matriz[i][i];
		}
		System.out.println(totalSuma);
		
		
		// Recorrer diagoal menor y sumarla
		totalSuma = 0;				// inicializo la Suma otra vez a 0
		for (int i=0; i<n; i++) {
			totalSuma += matriz[i][matriz[0].length-1-i];			// la columna menor es el valor máximo del array menos i
		}
		System.out.println(totalSuma);
		
		
		// 
		
		
	}

	
}
