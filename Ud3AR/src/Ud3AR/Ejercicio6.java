/* Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero,
uno, dos, tres... Utilizando estructura switch */

package Ud3AR;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		switch (num) {
			case 0:
				System.out.println ("cero"); break;
			case 1:
				System.out.println ("uno"); break;
			case 2:
				System.out.println ("dos"); break;
			case 3:
				System.out.println ("tres"); break;
			case 4:
				System.out.println ("cuatro"); break;
			case 5:
				System.out.println ("cinco"); break;
			case 6:
				System.out.println ("seis"); break;
			case 7:
				System.out.println ("siete"); break;
			case 8:
				System.out.println ("ocho"); break;
			case 9:
				System.out.println ("nueve"); break;
			case 10:
				System.out.println ("diez"); break;	
			default:
				System.out.println ("introduce un numero entre 1 y 10"); break;	
		}

	}

}
