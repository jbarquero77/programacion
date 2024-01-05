//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso actual.
//El usuario introducirá el número de niños y de niñas. Diseñar un algoritmo para este propósito.


package ud1Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que ingrese el número de niños y de niñas
		
		System.out.println("Introduce el número de niños");
		int numNinyos = sc.nextInt();
		System.out.println("Introduce el número de niñas");
		int numNinyas = sc.nextInt();
		
		//Calculamos el número total y los porcentajes
		
		double totalAlumnos = numNinyos+numNinyas;
		double porcNinyos = ((double)numNinyos/totalAlumnos)*100;
		double porcNinyas = ((double)numNinyas/totalAlumnos)*100;
		
		//Mostramos el resultado
		
		System.out.println("El porcentaje de niños es "+porcNinyos+"%, y el porcentaje de niñas es "+porcNinyas+"%");
		
		
		sc.close();

	}

}
