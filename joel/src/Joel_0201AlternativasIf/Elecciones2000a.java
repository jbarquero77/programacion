/*   Cada cas és de dues línies. 
 * La primera és el nombre de vots de Jiden i la segona el nombre de vots de Drump.

Sortida
Per cada cas es dira el candidat guanyador. Sempre hi ha un guanyador  */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class Elecciones2000a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int votosJiden = sc.nextInt();
		int votosDrump = sc.nextInt();
		
		if (votosJiden > votosDrump) {
			System.out.println("Jiden");
		
		} else if (votosJiden== votosDrump) {
			System.out.println("No puede haber empate");
		
		} else {
			System.out.println("Drump");
		}
		/* usando operador ternario
		String ganador = (votosJiden > votosDrump) ? "Jiden":"Drump";
		System.out.println("ganador"); */
	}

}
