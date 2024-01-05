/*
 * Aceptar un vector de 10 enteros. pedir un entero y una posición del vector, sustituir el número situado en esa posición
 * por el nuevo entero introducido, mostrar el vector resultante
 */


package Arrays;

import java.util.Scanner;

public class SustituirEnVector {
	
	public static void llenarVector (int[]vector) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese 10 enteros para llenar el vector");
		
		for(int i =0; i<vector.length;i++) {
			System.out.print("Posición "+ i + " :");
			vector[i] = sc.nextInt();
		}
		
	}
	
	
	public static void mostrarVector (int []vector) {
		for (int elemento : vector) {
			System.out.print(elemento + " ");
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		int []vector = new int [10];
		
		llenarVector(vector);
		
		System.out.println("Vector original");
		mostrarVector(vector);
		
		//Pedir nuevo entero y posición
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce el número que quieras introducir: ");
		int nuevoNumero = sc.nextInt();
		
		System.out.print("Introduce la posición (0-9) que quieras que ocupe: ");
		int posicion = sc.nextInt();
		
		//Verificar posición válida
		if (posicion > 0 && posicion <vector.length) {
			vector[posicion] = nuevoNumero;
			
			System.out.println("Vector resultado: ");
			mostrarVector(vector);
		}else {
			System.out.println("La posición no es válida");
		}
		
	}

}
