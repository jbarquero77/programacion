import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


/****************************************************************
 * 
 * Manejo de Fechas
 * 
 * Uso LocalTime
 *  
 ****************************************************************/
public class TestLocalTime01 {
    public static void main(String[] args) {
    	
    	/*
    	 *  Creo hora con valores numéricos enteros
    	 */
    	LocalTime hora1 = LocalTime.of(15, 15);
     	hora1 = LocalTime.of(15, 15, 34); // También podemos indicar los segundos
    	System.out.println(hora1);
    	
     	hora1 = LocalTime.of(15, 15, 34);
    	System.out.println(hora1);

    	/*
    	 *  Creo hora como String (formato ISO 8601)
    	 */
    	LocalTime hora2 = LocalTime.parse("14:30");
    	hora2 = LocalTime.parse("14:30:12");  // También podemos indicar los segundos
    	System.out.println(hora2);
        	
    	/*
    	 * Tiempo entre horas
    	 */
    	long horas = ChronoUnit.HOURS.between(hora1, hora2);
    	System.out.println(horas);
    	long minutos = ChronoUnit.MINUTES.between(hora1, hora2);
    	System.out.println(minutos);
    	long segundos = ChronoUnit.SECONDS.between(hora1, hora2);
    	System.out.println(segundos);
    	
       	/*
    	 *  Formato de hora personalizado
    	 */
    	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");  // Si aquí le digo que lo separe por :
    	LocalTime hora3 = LocalTime.parse("17:45:34", formatoHora);					// En el parse también lo tengo que poner con los :
    	System.out.println(hora3.format(formatoHora)); // Lo muestro con el formato personalizado

    	/*
    	 *  Incremento/decremento en días, meses o años
    	 */
    	LocalTime ahora = LocalTime.now();
    	System.out.println(ahora);

    	LocalTime otraHora;
    	
    	otraHora = ahora.plusHours(8); // 8 horas después de ahora
    	System.out.println(otraHora);
    	
    	// Lo mismo que antes pero usando ChronoUnit
        otraHora = ahora.plus(8, ChronoUnit.HOURS); 
    	System.out.println(otraHora);
    	
    	otraHora = ahora.plusMinutes(30); // 30 minutos después
    	System.out.println(otraHora);

    	otraHora = ahora.plusSeconds(50); // 50 segundos más tarde
    	System.out.println(otraHora);

    	otraHora = otraHora.minusHours(12); // viajamos 12 horas al pasado
    	System.out.println(otraHora);
    	
    	System.out.println(otraHora.format(formatoHora));
    
    }
}

