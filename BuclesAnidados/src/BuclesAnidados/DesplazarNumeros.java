package BuclesAnidados;

import java.util.Scanner;

public class DesplazarNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tabla[] = new int[10];
		int elemento, posicion;
		
		System.out.println("Leer datos");
		for (int i=0;i<8;i++) {
			System.out.print("introduzca número");
			tabla[i]= sc.nextInt();		
		}
		
		System.out.print("Nuevo elemento: ");
		elemento = sc.nextInt();
		
		System.out.print("Posicion: ");
		posicion = sc.nextInt();
		
		for(int i=7; i>=posicion;i--) {
			tabla[i+1] = tabla[i];
			tabla[posicion] = elemento;
		}
		
		System.out.println("La tabla queda: ");
		for (int i=0;i<9;i++)
			System.out.print(tabla[i]+ " ");

	}

}
