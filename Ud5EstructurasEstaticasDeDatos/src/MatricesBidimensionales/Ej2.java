/*
 * Crear un programa que le pida al usuario un rango de números para crear una matriz de10x10 de números aleatorios entre ese rango.
 * Se imprime la matriz por pantalla.A continuación, y hasta que el usuario quiera, 
 * el programa le preguntará al usuario un número para decirle si la matriz contiene ese número o no. 
 * Antes de empezar la búsqueda en la matriz, 
 * se deberá comprobar que el número indicado está en el rango en el qué se han generado los números aleatorios.
 * Si se encuentra el número se debe indicar cuántas veces aparece dicho número en la matriz. 
 * Crear una función que cree una matriz de 10x10 con números aleatorios entre dos números introducidos por el usuario. 
 * Crear una función para comprobar si existe un número en la matriz. 
 * Crear una función para saber cuántas veces está repetido un número en una matriz.
 */


package MatricesBidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner (System.in);
		
		int rangoInicio =0;
		int rangoFinal =0;
		
		// Pide al usuario los rangos para generar al matriz
		System.out.println("Introduce el número inicial");
		rangoInicio = sc.nextInt();
		System.out.println("Introduce el número final");
		rangoFinal = sc.nextInt();
		
		//Crea la matriz
		int [][] matriz = crearMatriz (10,10, rangoInicio, rangoFinal);
		
		// Imprimir la matriz
		System.out.println("\nMatriz generada:");
        imprimirMatriz(matriz);
		
		while (true) {
			try {
				System.out.println("\nIntroduce un número para buscar en la matriz (o 0 para salir)");
				int numeroBuscado = sc.nextInt();
				
				if (numeroBuscado == 0) {
					break;
				}
				
				//Comprobar si el número está en el rango
				if (numeroBuscado < rangoInicio || numeroBuscado >rangoFinal) {
					System.out.println("El número no está en el rango permitido");
					continue;
				}
				
				//Comprobar si el número está en la matriz
				
				boolean encontrado = buscarNumero (matriz, numeroBuscado);
				
				if (encontrado) {
					int repeticiones = contarRepetidos (matriz, numeroBuscado);
					System.out.println("El número "+ numeroBuscado + " está en la matriz");
					
				} else {
					System.out.println("El número " + numeroBuscado + " no está en la matriz");
				}
			}catch (java.util.InputMismatchException e) {
				System.out.println("Ingrese un número válido");
				sc.nextLine();
			}
		}
        
	}
	
	
	public static int[][] crearMatriz (int filas, int columnas, int rangoInicio, int rangoFin){
		
		int [][] matriz = new int [filas][columnas];
		Random ran = new Random();
		
		for (int i =0; i<filas; i++) {
			for (int j =0; j<columnas; j++) {
				matriz [i][j] = ran.nextInt(rangoFin - rangoInicio +1) + rangoInicio;
			}
		}
		
		return matriz;
	}
	
	public static void imprimirMatriz (int[][] matriz) {
		for (int i =0; i<matriz.length; i++) {
			for (int j =0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean buscarNumero (int[][]matriz, int numero) {
		for (int i =0; i<matriz.length; i++) {
			for (int j=0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					return true;
				}
			}
		}
		return false;
		
		
	}
	
	public static int contarRepetidos (int [][] matriz, int numero) {
		int contador =0;
		
		for (int i =0; i<matriz.length; i++) {
			for (int j=0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					contador++;
				}
			}
		}
		return contador;
	}

}
