package Funciones;

import java.util.Scanner;

public class Ej2Cuadrado {

	public static void main(String[] args) {
		dibujarCuadrado(3,3);

	}
	
	 public static void dibujarCuadrado(int filas, int columnas) {
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // Salto de línea después de cada fila
	        }
	    }

}
