/* Dependiendo de los días de la semana, aplicar un tipo de descuento u otro.
 * Lunes y Miércoles: "Descuento del 10%"
 * Martes y Jueves: "Descuento del 50%"
 * Domingo: "Descuento del 75%"
 * Resto de días: "No hay descuento"
 */

package Ud3Test;

import java.util.Scanner;

public class EjemploProfe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Introduce el día de la semana");

		int diaSemana = sc.nextInt();
		
		/* if (diaSemana <1 || diaSemana > 7) {
			System.out.println ("Introduce un número entre 1 y 7");
	
		}else if (diaSemana == 1 || diaSemana == 3) {
			System.out.println ("Descuento del 10%");
			
		}else if (diaSemana == 2 || diaSemana == 4) {
			System.out.println ("Descuento del 50%");
			
		}else if (diaSemana == 7) {
			System.out.println ("Descuento del 75%");
		
		}else {
			System.out.println ("No hay descuento");
		}
		
		sc.close(); */
		
		switch (diaSemana) {
			case 1:
			case 3:
				System.out.println ("Descuento del 10%");
				break;
			case 2:
			case 4:
				System.out.println ("Descuento del 50%");
				break;
			case 7:
				System.out.println ("Descuento del 75%");
				break;
			case 5:
			case 6:
				System.out.println ("No hay descuento");
				break;
			default:
				System.out.println ("Introduce un número entre 1 y 7");
				
		}
		sc.close();
	}

}
