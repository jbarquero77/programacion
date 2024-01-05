/* Entrada
Cada cas és d'una línea, i conté un número N de l'1 al 7, els dos inclosos.

Sortida
Per cada cas es dira "Monday", "Tuesday", etc. fins a "Sunday" 
Sí, els anglesos comencen la setmana per Sunday, pero també van amb sandàlies i mitjons, per tant la seva opinió no compta   */

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int DiaSemana = sc.nextInt();
		
		switch (DiaSemana){
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Introduce un número entre 1 y 7");
				
		}

	}

}
