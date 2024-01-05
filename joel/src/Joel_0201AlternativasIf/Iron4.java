/* Demana amb Scanner una tecla i fes un switch 
 * a on cada opció representi una acció, segons aquesta taula. 
 * Torna l’opció escollida per pantalla. */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class Iron4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String letra = sc.next();

		switch (letra){
			case ("Q"):
				System.out.println("Skill 1");
				break;
			case ("W"):
				System.out.println("Skill 2");
				break;
			case ("E"):
				System.out.println("Skill 3");
				break;
			case ("R"):
				System.out.println("Ultimate");
				break;
			case ("B"):
				System.out.println("Recall");
				break;
			case ("D"):
			case ("F"):
				System.out.println("Bronzes never use summoners");
				break;
			default:
				System.out.println("Error");
		}
	}
}
