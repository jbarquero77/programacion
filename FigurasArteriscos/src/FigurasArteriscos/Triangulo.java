package FigurasArteriscos;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		int filas = sc.nextInt();
		
		for(int i=0; i<filas;i++) {
			for(int columnas =0; columnas <=i;columnas++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
