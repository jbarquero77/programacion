/* calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada.
la nota del primer examen cuenta el 40% y la del segundo examen un 60%. */


package ud1Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la nota del primer examen
		System.out.println("Introduce la nota del primer examen");
		double notaPrimerExamen = sc.nextDouble();
		
		//Pedimos la nota que quiere sacar en el trimestre
		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		double notaDeseadaTrimestre = sc.nextDouble();
		
		//Realizamos las operaciones
		double notaNecesaria = ((notaDeseadaTrimestre - (notaPrimerExamen * 0.4))/0.6);
		
		//Indicamos al usuario la nota que necesita sacar en el segundo trimestre
		System.out.println("Para tener un "+notaDeseadaTrimestre+" necesitas sacar un "+notaNecesaria+
				" en el segundo examen");
		
		sc.close();
		

	}

}
