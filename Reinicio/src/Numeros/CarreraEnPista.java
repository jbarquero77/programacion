/*
 * Pide al usuario el número de participantes
 * Pide el nombre de la ganadora y desde que línea de salida empieza la carrera
 * pinta tantos guiones en la salida como corredores hayan
 * nombre de ganadora junto a su linea
 * 
 * 
 */

package Numeros;

import java.util.Scanner;

public class CarreraEnPista {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime el número de participantes en la carrera: ");
		int participantes = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime el nombre de la ganadora: ");
		String ganadora = sc.nextLine();
		System.out.println("Dime la línea de salida de la ganadora: ");
		int posicionGanadora = sc.nextInt();
		
		System.out.println("SALIDA");
		for (int i=0; i<participantes; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (int fila =0; fila<participantes;fila++) {
			
			for (int columna =0; columna<fila; columna++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			if (fila+1 ==posicionGanadora) {
				System.out.print(" "+ganadora);
			}
			System.out.println();
		}
	}
}
