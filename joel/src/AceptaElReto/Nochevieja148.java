/*
 * Entrada
La entrada consiste en una serie de horas, cada una en una línea. 
Cada hora está formada por las horas y los minutos separados por : y utilizando siempre dos dígitos. 
Se utiliza una representación en formato 24 horas (es decir, desde 00:00 a 23:59).

La entrada termina cuando la hora es la medianoche (00:00), que no debe procesarse.

Salida
Para cada caso de prueba se mostrará una línea con el número de minutos que faltan para medianoche.
 */


package AceptaElReto;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Nochevieja148 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String horaIntroducida = sc.nextLine();
		
		while (!horaIntroducida.equals("00:00")) {
			
			LocalTime hora = LocalTime.parse(horaIntroducida);
			
			 long minutosFaltan = ChronoUnit.MINUTES.between(hora, LocalTime.MIDNIGHT);

	            // Asegurarse de que el resultado sea no negativo
	            minutosFaltan = (minutosFaltan + 24 * 60) % (24 * 60);

	            System.out.println(minutosFaltan);           
	            horaIntroducida = sc.nextLine();
	        }
		

	}

}
