/*
 * Introduce por teclado las notas de 5 alumnos, y después muestra si está aprovado o suspenso
 */


package Arrays;

import java.util.Scanner;

public class EjNotasAprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] notas = new int [5]; 
		
		for (int i =0; i < 5; i++) {
			notas [i] = sc.nextInt(); // Designara a cada posición la nota introducida por el usuario
					
		}
		
	
			for (int notaAlumno : notas) {
				if (notaAlumno >= 5) {
					System.out.println("Aprovado");
				}else  {
					System.out.println("Suspenso");
				}
			}

	}

}
