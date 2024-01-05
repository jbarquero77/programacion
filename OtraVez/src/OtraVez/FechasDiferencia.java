package OtraVez;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FechasDiferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la primera fecha y hora (YYYY-MM-DDTHH:mm:ss)");
		String fechaHora1Str = sc.next();
		LocalDateTime fechaHora1LDT = LocalDateTime.parse(fechaHora1Str);
		
		System.out.println("Introduce la segunda fecha y hora (YYYY-MM-DDTHH:mm:ss)");
		String fechaHora2Str = sc.next();
		LocalDateTime fechaHora2LDT = LocalDateTime.parse(fechaHora2Str);
		
		Duration diferencia =Duration.between(fechaHora1LDT, fechaHora2LDT);
		System.out.println("Diferencia: "+diferencia.toDays()+ " días, "+ diferencia.toHours()%24+
				" horas."+diferencia.toMinutes()%60+ " minutos.");
		
	}

}
