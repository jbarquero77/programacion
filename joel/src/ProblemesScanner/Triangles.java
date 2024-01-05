/*Entrada
Cada cas és de dues línies. Cada linea tindrà un número, l'altura i la base d'un triangle.
Sortida
Per cada cas cal dir quina és l'àrea del triangle */


package ProblemesScanner;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int altura = sc.nextInt();
		
		// Casteamos el numero base
		double area = (double) (base*altura)/2;
		
		System.out.println(area);
	}

}
