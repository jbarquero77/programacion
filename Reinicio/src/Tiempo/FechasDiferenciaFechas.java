package Tiempo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class FechasDiferenciaFechas {

	public static void main(String[] args){
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Inroduce la primera fecha: (año-mes-día): ");
		LocalDate fecha1 = LocalDate.parse(sc.next(), formateo);
		
		System.out.println("Inroduce la segunda fecha: (año-mes-día): ");
		LocalDate fecha2 = LocalDate.parse(sc.next(), formateo);
		
		long diasDiferencia = diferenciaEnDias(fecha1, fecha2);
		System.out.println("La diferencia en días es de: "+diasDiferencia);
	}

	
	
	
	public static long diferenciaEnDias(LocalDate fecha1, LocalDate fecha2) {
		return Math.abs(fecha2.toEpochDay()-fecha1.toEpochDay());
		}
}
