package OtraVez;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalculosFechasHoras {
	
	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println("Hoy es: "+hoy);
		
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Ahora es: "+ahora);
	}

}
