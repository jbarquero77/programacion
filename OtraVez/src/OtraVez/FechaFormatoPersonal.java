package OtraVez;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaFormatoPersonal {

	public static void main(String[] args) {
		LocalDateTime fechaActual = LocalDateTime.now();
		DateTimeFormatter formatoPersonal = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		String fechaFormateada = fechaActual.format(formatoPersonal);
		System.out.println(fechaFormateada);

	}

}
