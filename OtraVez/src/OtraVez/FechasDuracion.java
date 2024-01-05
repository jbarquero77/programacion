package OtraVez;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FechasDuracion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la fecha e inicio (YYYY-MM-DDTHH:mm:ss)");
		LocalDateTime inicio = LocalDateTime.parse(sc.next());
		
		System.out.println("Introduce la fehca y hora de fin: (YYYY-MM-DDTHH:mm:ss)");
		LocalDateTime fin = LocalDateTime.parse(sc.next());
		
		Duration duracion = Duration.between(inicio, fin);
		System.out.println("La duración del evento fue de: "+duracion.toHours()+ " horas, "+duracion.toMinutes());

	}

}
