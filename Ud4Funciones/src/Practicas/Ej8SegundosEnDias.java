/*
 * Programa que convierta una cantidad de días, horas, minutos y segundos a segundos
 */

package Practicas;

import java.util.Scanner;

public class Ej8SegundosEnDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int dias, horas, minutos, segundos, segundosTotales;
		
		System.out.println("Introduzca la cantidad de días: ");
		dias = sc.nextInt();
		System.out.println("Introduzca la cantidad de horas: ");
		horas = sc.nextInt();
		System.out.println("Introduzca la cantidad de minutos: ");
		minutos = sc.nextInt();
		System.out.println("Introduzca la cantidad de segundos: ");
		segundos = sc.nextInt();
		
		segundosTotales = calcularSegundos (dias, horas, minutos, segundos);
		System.out.println("La cantidad de segundos son: "+segundosTotales+ "seg");
	}
	
	public static int calcularSegundos (int dias, int horas, int minutos, int segundos) {
		
		int segundosTotales =0;
		
		segundosTotales += segundos;
		segundosTotales += minutos *60;
		segundosTotales += horas * minutos * segundos;
		segundosTotales += dias *24 * 60 * segundos;
		
		return segundosTotales;
				
	}

}
