/*   Cada cas és d'una línea, i conté una string, la teva resposta.

Sortida
Depenent de la resposta el barret dirà una cosa o una altra

Si es diu "Coratge", dirà "Gryffindor"
Si es diu "Coneixement", dirà "Ravenclaw"
Si es diu "Ambicio", dirà "Slytherin"
Si es diu qualsevol altra cosa, dirà "Hufflepuff"  */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class BarretHogwarts {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String barret = sc.nextLine();
		
		switch (barret) {
			case "Coratge":
				System.out.println("Gryffindor");
				break;
			case "Coneixement":
				System.out.println("Ravenclaw");
				break;
			case "Ambicio":
				System.out.println("Slytherin");
				break;	
			default:
				System.out.println("Hufflepuff");
				
				
				
			
		}

	}

}
