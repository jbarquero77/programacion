package OtraVez;

import java.time.LocalDate;
import java.util.Scanner;

public class FechaSumarDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una fecha (YYYY-MM-DD)");
		String fechaString = sc.next();
		LocalDate fecha = LocalDate.parse(fechaString);
		
		System.out.println("Introduce el número de días a sumar: ");
		int diasSumar = sc.nextInt();
		
		LocalDate fechaSumada = fecha.plusDays(diasSumar);
		System.out.println(fechaSumada);

	}

}
