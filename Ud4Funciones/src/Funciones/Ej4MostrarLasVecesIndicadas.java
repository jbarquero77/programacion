/*  Escribe un programa donde el usuario introduce una letra y un número, y 
 * el programa debe mostrar esa letra tantas veces como indique ese número (en la misma línea). 
 * Implementa y utiliza la función: void escribirRepetido(char letra, int nrepeticiones) 
 * utiliza la función charAt(0) para obtener el carácter introducido por el usuario (ej. sc.next().charAt(0)); 
 * */
 

package Funciones;

import java.util.Scanner;

public class Ej4MostrarLasVecesIndicadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una letra: ");
		char letra = sc.next().charAt(0);
		System.out.println("Introduce el número de repeticiones: ");
		int nRepeticiones = sc.nextInt();
		
		escribirRepetido(letra, nRepeticiones);
		
	}
	public static void escribirRepetido(char letra, int nRepeticiones) {
				
		for (int i=0; i<=nRepeticiones;i++) {
			System.out.println(letra);
		}
		
		
	}

}
