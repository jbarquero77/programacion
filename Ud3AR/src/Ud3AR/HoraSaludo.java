/*  Escribe un programa que pida una hora por teclado y que 
 * muestre luego buenos días, buenas tardes o buenas noches, según la hora. 
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. 
 * Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado. */


package Ud3AR;

import java.util.Scanner;

public class HoraSaludo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hora = sc.nextInt();
		
		switch (hora) {
			case 6,7,8,9,10,11,12: System.out.println("Buenos días"); break;
			case 13, 14, 15, 16,17, 18, 19, 20: System.out.println("Buenas tardes"); break;
			case 1, 2, 3, 4, 5, 21, 22, 23, 24: System.out.println("Buenas noches"); break;
			default: System.out.println("Introduce una hora válida");
		}
		
	}

}
