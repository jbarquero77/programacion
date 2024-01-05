/*
 * Entrada
La entrada estará compuesta de un primer número indicando cuántos casos de prueba vendrán a continuación.

Cada caso de prueba será un número mayor que cero con el número de gotas que entran en el cubo.

Salida
Para cada caso de prueba, el programa escribirá en una línea
 el tiempo máximo que puedes estar sin cambiar el cubo en el formato HH:MM:SS, 
 donde HH indica el número de horas, MM el número de minutos y SS el número de segundos.

Ningún cubo es tan grande como para poder estar más de un día completo sin cambiarse.
 */



package AceptaElReto;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Goteras216 {
	
	public static void calcularTiempo (int gotas) {
		
		int segundos = gotas;
		
		int horas = segundos/3600;
		int minutos = (segundos%3600)/60;
		int segundosRestantes = segundos %60;
		
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		for(int i=0; i < casos; i++) {
			int gotas = sc.nextInt();
			
			calcularTiempo(gotas);
		}
	}

}
