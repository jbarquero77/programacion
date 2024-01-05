package OtraVez;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechasCalcularEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce la fecha de nacimiento: (YYYY-MM-DD)");
		String fechaNacimientoSr = sc.next();
		LocalDate fechaNacimientoLD = LocalDate.parse(fechaNacimientoSr);
		LocalDate fechaActual = LocalDate.now();
		
		Period edad = Period.between(fechaNacimientoLD, fechaActual);
		System.out.println("Edad: "+edad.getYears()+ " años, "+edad.getMonths()+" meses y "+ edad.getDays()+ " días.");
	}

}
