package Tiempo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FechasDiaDeSemana {

	public static void main(String[] args) {
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una fecha (yyyy-MM-dd");
		LocalDate fecha = LocalDate.parse(sc.next(),formateo);
		
		String diaSemana = diaSemana(fecha);
		System.out.println("Día de la semana: "+diaSemana);
	}
	
	public static String diaSemana(LocalDate fecha) {
		return fecha.getDayOfWeek().toString();
	}

}
