/*
 * En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. cada fila corresponde a las notas y
 * al promedio de cada alumno. 
 * se requiere un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las notas del alumno y
 * que en la última posición se calculen los promedios. una vez realizados los cálculos, se desea mostrar las 3 notas de cada
 * alumno y el promedio corresponiente recorriendo la matriz
 */


package Arrays;

import java.util.Scanner;

public class NotasYMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double [][] notas = new double [4][4];
		double suma = 0.0;
		
		
		for (int f=0; f<4; f++) {
			for(int c =0; c<3; c++) {
				System.out.println("Introduce número del alumno " + f);
				notas[f][c]= sc.nextDouble();
				suma = Math.abs(suma) + notas[f][c];
			}
			notas[f][3] = Math.abs(suma) / 3;
			suma =0;										// cuando terminamos con un alumno, volvemos las notas a 0
		}
		
		
		for (int f=0; f<4; f++) {
			System.out.println("Las notas del alumno "+f+ " son: ");
			for(int c =0; c<3; c++) {
				System.out.println("Nota nº "+c+" "+ notas[f][c]);
			}
			System.out.println("El promedio de las notas es: "+ notas[f][3]);
		}
		
		
	}

}
