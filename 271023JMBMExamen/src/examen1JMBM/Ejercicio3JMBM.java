// // José Manuel Barquero Mars


package examen1JMBM;

import java.util.Scanner;

public class Ejercicio3JMBM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame el número de estudiantes: ");
		int estudiantes = sc.nextInt();
		
		// Si el número de jugadores es impar, no hay partido
		
		if (estudiantes %2 !=0  || estudiantes < 0) {
			System.out.println("No hay partido");
		}else {
			// si el número es positivo, vamos pidiendo los colores de los petos
			
			System.out.println("Dame el color de peto de cada estudiante: ");
			
			// declaro aqui los contadores para que no se reinicien cada vez que entra en el bucle
			int contadorRojos =0;
			int contadorAzul =0;
			
			while (estudiantes >0) {
				String peto = sc.next(); // A, R, C,
				
				switch(peto) {
					case "R":
						contadorRojos++; // 1,
						// Si asignamos un peto correcto, decrementamos el número de estudiantes
						estudiantes--; // 5, 4
						break;
					case "A":
						contadorAzul++; //1, 
						// Si asignamos un peto correcto, decrementamos el número de estudiantes
						estudiantes--; // 5,4
						break;
					// en el caso de pusiéramos un peto de color inválido, no decrementaríamos el valor de estudiantes
					default:
						System.out.println("Color inválido. Introduce otro.");
					
				}
				
			}
			if (contadorRojos == contadorAzul) {
				System.out.println("Hay partido");
			}else {
				System.out.println("No hay partido");
			}
		}
				
	}

}
