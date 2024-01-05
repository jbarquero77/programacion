




package Ud5EstructurasEstaticasDeDatos;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
public class EjemploFechas {

	public static void main(String[] args) {
		
		// Importar la fecha actual
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha actual "+fechaActual);
		
		//Obtener la hora actual
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual "+horaActual);
		
		//Crear una fecha y hora específicas
		LocalDateTime fechaActualPersonalizada = LocalDateTime.of(2003, 11, 5, 15, 30);
		System.out.println("Fecha y hora personalizada "+fechaActualPersonalizada);
		
		//Operaciones con LocalDate
		//Sumar dias
		
		LocalDate sumarDias = fechaActual.plus(4, ChronoUnit.DAYS);
		//Restar semana
		LocalDate semanaPasada = fechaActual.minus(1, ChronoUnit.WEEKS);
		
		System.out.println("Dentro de 4 días sera "+sumarDias);
		System.out.println("La semana pasada fue: "+semanaPasada);
		
		//Operaciones con LocalTime
		//Sumar hora
		LocalTime unaHoraDespues = horaActual.plus(1,ChronoUnit.HOURS);
		//Restar 2 horas
		LocalTime dosHorasAntes = horaActual.minus(2, ChronoUnit.HOURS);
		
		System.out.println("Dentro de una horas será "+unaHoraDespues);
		System.out.println("Hace dos horas eran: "+dosHorasAntes);
		
		//Combinar LocalDate y LocalTime en LocalDateTime
		
		LocalDateTime combinarFechaHora = fechaActual.atTime(horaActual);
		System.out.println("Fecha y hora combinadas: "+combinarFechaHora);
		
		//Uso de Period para representar un intervalo de días
		LocalDate fechaFutura = fechaActual.plus(Period.ofDays(30));
		
		//Uso de Duration para representar una duración de tiempo en segundo
		LocalTime horaFutura = horaActual.plus(Duration.ofSeconds (3600));
		System.out.println("Hora dentro de una hora: "+horaFutura);
	}

}
