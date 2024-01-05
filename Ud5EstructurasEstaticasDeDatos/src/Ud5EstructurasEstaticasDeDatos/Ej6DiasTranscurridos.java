/*
 * Realiza una función en java que calcule cuántos días ha vivido una persona, si ésta le indica su día de nacimiento
 */


package Ud5EstructurasEstaticasDeDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Ej6DiasTranscurridos {

	 public static long calcularDias(int year, int month, int day) {
		 
		 LocalDate fechaNacimiento = LocalDate.of(year, month, day);
		 
		 LocalDate fechaActual = LocalDate.now();
		 
		 long diasVividos = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);
		 
		 return diasVividos;
	 }
	 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int anioNacimiento, mes, dia;
		
		System.out.println("Introduce el año: ");
		anioNacimiento = sc.nextInt();
		System.out.println("Introduce el mes: ");
	 	mes = sc.nextInt();
	 	System.out.println("Introduce el día: ");
	 	dia = sc.nextInt();
	 	
	 	long diferencia = calcularDias(anioNacimiento, mes, dia);
	 	
	 	System.out.println("Has vivido: "+diferencia+ " días");
		
		

	}

}
