/*
 * Realiza una función en java que me diga, si le indico mi fecha de nacimiento, qué día cumpliré 8.000 días.
 */

package Ud5EstructurasEstaticasDeDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.DayOfWeek;

public class Ej6bCalcularDias {

	public static LocalDate obtenerDia (int anio, int mes, int dia, int diasTranscurridos) {
		
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
		
		LocalDate fechaResultado = fechaNacimiento.plusDays(diasTranscurridos);
		
		//Día de la semana
		//DayOfWeek diaSemanaResultado = fechaResultado.getDayOfWeek();
		
		//return diaSemanaResultado.toString();
		
		return fechaResultado;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int anioNacimiento, mes, dia; 
		int diasCumplimiento = 8000;
		
		System.out.println("Introduce el año: ");
		anioNacimiento = sc.nextInt();
		System.out.println("Introduce el mes: ");
		mes = sc.nextInt();
		System.out.println("Introduce el día: ");
		dia = sc.nextInt();
		
		
		LocalDate diaResultado = obtenerDia(anioNacimiento, mes, dia, diasCumplimiento);
		System.out.println("Cumplirás 8000 días el día: "+ diaResultado);
		
		
	}

}
