// José Manuel Barquero Mars




package examen1JMBM;

import java.util.Scanner;

public class Ejercicio1JMBM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Pedimos los datos al usuario
		System.out.println("Dime el número de participantes de la carrera: ");
		int numParticipantes = sc.nextInt(); // Esto será la altura de la columna
		
		
		sc.nextLine();
		System.out.println("Dime el nombre de la ganadora: ");
		String nombre = sc.nextLine(); // Nombre a mostrar
		
		System.out.println("Dime su posición de salida: ");//Cuando llegue a esta fila es cuando ha de mostrar el nombre
		int posicionGanadora = sc.nextInt();
		
		// Mostramos datos
		
		System.out.println("SALIDA");
		// Debajo de SALIDA debe mostrar tantos guiones como corredores
		// necesitaremos un bucle que recorra la cantidad de participantes y muestre un guión ("-");
		
		//Pintamos los carriles debajo de la salida
		
		for (int carril=0; carril < numParticipantes;carril++) {
			System.out.print("-");
		}
		//Realizamos el salto de línea para que no se junte con el siguente mensaje
		System.out.println();
		
		//Controlamos el número de filas o número de participantes
		for (int fila =0; fila < numParticipantes;fila++) {
			// Dibujamos en cada fila, tantos espacios como filas haya
			for(int colum =0;colum < fila; colum++) { // la primera pasada, como fila = 0 y columna = 0, no dibuja espacios
				System.out.print(" ");				   // la segunda pasada fila = 1, columna si cumple la condición, y dibuja el espacio
			}
			// Dibujamos el arterisco al final de los espacios 
			
			System.out.print("*");
			
			if (fila+1== posicionGanadora) {  // porque para nosotros la primera fila = 0, pero para el usuario es 1
				System.out.print(" "+nombre);
			}
			// Una vez "pinte" toda la línea, con los espacios, los arteriscos y el nombre, es cuando hago el salto de línea
			System.out.println();
			
		}
		
	}		
}