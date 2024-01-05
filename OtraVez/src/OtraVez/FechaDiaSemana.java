package OtraVez;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FechaDiaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una fecha: (YYYY-MM-DD)");
		String fechaString = sc.next();
		LocalDate fecha = LocalDate.parse(fechaString);
		
		String diaSemana = fecha.format(DateTimeFormatter.ofPattern("EEEE"));
		System.out.println("El día de la semana es: "+diaSemana);
		

	}

}
