package Ud5EstructurasEstaticasDeDatos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PracticaFechas {

	public static void main(String[] args) {
		
		//Saber la fecha actual (del sistema)
		LocalDate fecha = LocalDate.now();
		
		LocalDate.of(1977, 07, 01);
		LocalDate.parse ("1977-07-01");
		
		int d;
		int M;
		int yyyy;
		
		// Añadir días a una fecha
		LocalDate manyana = LocalDate.now().plusDays(1); 
		
		
		// Obtener la fecha actual y restarle un mes (fíjate cómo acepta un enum como unidad de tiempo): 
		LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		
		// Obtener la fecha actual y restarle un año (fíjate cómo acepta un enum como unidad de tiempo): 
		LocalDate anioAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.YEARS);
		
		//Me da problemas al parsear una fecha
		// DayOfWeek viernes = LocalDate.parse(“2023-05-04”).getDayOfWeek(); 
		// int cuatro = LocalDate.parse(“2023-05-04”).getDayOfMonth();
		
		//Saber si un año es bisiesto o no (boolean)
		boolean esBisiesto = LocalDate.now().isLeapYear();
		
		// 2023-05-04 no va antes que 2023-05-01 
		//boolean esAntes = LocalDate.parse(2023-05-04).isBefore(LocalDate.parse(“2023-05-01”);  
		// 2023-05-10 va después que 2023-05-04 
		//boolean esDespues = LocalDate.of(2023,05,04).isAfter(LocalDate.of("2023,05,04");
		
		
		//Obtener la hora actual
		LocalTime horaActual = LocalTime.now(); 
		
		
		//Hora formato personalizado
		//LocalTime horaPersonalizada1 = LocalTime.parse(“12:34”); 
		LocalTime horaPersonalizada2 = LocalTime.of(12,34);
		
		//Crear una hora y sumarle otra otra
		LocalTime hora = LocalTime.of(12,30).plus(1, ChronoUnit.HOURS);  //13,30
		
		
		System.out.println(hora);
	}
	
	
	
	

}
