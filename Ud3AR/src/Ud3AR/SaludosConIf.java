/* Escribe un programa que pida una hora por teclado y que 
 * muestre luego buenos días, buenas tardes o buenas noches, según la hora. 
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. 
 * Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado. */


package Ud3AR;

import java.util.Scanner;

public class SaludosConIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hora = sc.nextInt();
		
		if (hora >= 0 || hora <= 24) {
			if (hora == 6 || hora < 12) {
				System.out.println("Buenos días");
			}else if (hora == 12 || hora < 21){
				System.out.println("Buenas tardes");
				
			}else if (hora >=21 || hora < 6) {
				System.out.println("Buenas noches");
			}
		}

	}

}
