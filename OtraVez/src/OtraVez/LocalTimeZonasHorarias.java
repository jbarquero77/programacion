package OtraVez;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeZonasHorarias {

	public static void main(String[] args) {
		
		LocalDateTime ahora = LocalDateTime.now();
		
		ZoneId zonaNY = ZoneId.of("America/New_York");
		ZoneId zonaTokio = ZoneId.of("Asia/Tokyo");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("La hora actual en Nueva York es: "+ahora.atZone(zonaNY).format(formato));
		System.out.println("La hora actual en Tokio es: "+ahora.atZone(zonaTokio).format(formato));
		
	}

}
