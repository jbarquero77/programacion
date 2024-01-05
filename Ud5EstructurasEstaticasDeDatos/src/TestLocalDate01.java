import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


/****************************************************************
 * 
 * Manejo de fechas
 * 
 * Uso LocalDate
 *  
 ****************************************************************/
public class TestLocalDate01 {
    public static void main(String[] args) {
    	
    	/*
    	 *  Creo fecha con valores numéricos enteros
    	 */
    	LocalDate fecha1 = LocalDate.of(2022,12,25);
    	System.out.println(fecha1);

    	/*
    	 *  Creo fecha como String (formato ISO 8601)
    	 */
    	LocalDate fecha2 = LocalDate.parse("2025-03-19");
    	System.out.println(fecha2);
    	
    	
    	/*
    	 * Tiempo entre fechas
    	 */
    	long anyos = ChronoUnit.YEARS.between(fecha1, fecha2);
    	System.out.println(anyos);
    	long meses = ChronoUnit.MONTHS.between(fecha1, fecha2);
    	System.out.println(meses);									// para ajustar los meses modulo meses ( meses % 12)
    	long dias = ChronoUnit.DAYS.between(fecha1, fecha2);   	// 
    	System.out.println(dias);									// para ajustar los días se sacaría el modulo (dias % 30)
    	
      	/*
    	 *  Formato de fecha personalizado
    	 */
    	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/yyyy");
    	LocalDate fecha4 = LocalDate.parse("11/12/2023", formatoFecha);							//El formato del parse tiene que ser el mismo que el del Formatter
    	System.out.println(fecha4.format(formatoFecha)); // Lo muestro con el formato personalizado

    	/*
    	 *  Incremento/decremento en días, meses o años
    	 */
    	LocalDate hoy = LocalDate.now(); // Obtenemos la fecha actual del sistema
    	System.out.println(hoy);

    	LocalDate otraFecha;
    	
    	otraFecha = hoy.plusDays(7); // una semana después (7 días después)
    	System.out.println(otraFecha);
    	
    	// Lo mismo que antes pero usando ChronoUnit
        otraFecha = hoy.plus(7, ChronoUnit.DAYS); 
    	System.out.println(otraFecha);
    	
    	otraFecha = hoy.plusMonths(6); // seis meses más tarde
    	System.out.println(otraFecha);

    	otraFecha = hoy.plusYears(3); // tres años más tarde
    	System.out.println(otraFecha);

    	otraFecha = otraFecha.minusYears(10); // viajamos 10 años al pasado
    	System.out.println(otraFecha);
    	
    	boolean esAntes = fecha1.isBefore(fecha2);
    	boolean esDespues = fecha1.isAfter(fecha2);
    	
    	// Scanner sc = ....
    	
    	
    	/*int anyo = sc.nextInt
    	 * int mes = sc.
    	 * int dia = sc
    	 * 
    	 * LocalDate fecha1 = LocalDate.of(anyo, mes, dia);
    	 * 
    	 * 
    	 * Sysout introduce una fecha como dia/mes/año
    	 * 
    	 * String  fechaCadena = sc.nextLine;
    	 * 
    	 * localDate fechaCadena = localDate.parse(fechaCadena);
    	 * 
    	 * 
    	 * quiero el formato de otra forma
    	 * 
    	 * 	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/yyyy");
    	LocalDate fechaUsuario = LocalDate.parse(fechaCadena, formatoFecha);	
    							
    	 * 
    	 * sysout (fechaUsuario.format(formatoFecha);
    	 * 
    	 * 
    	 * 
    	 * 
    	 */
    	

    }
}

