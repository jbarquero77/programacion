/* Les eleccions a Estats Units en 2020 depenen del decisiu estat de Wisconsin. 
 * Els tres candidats, Boe Jiden, Tonald Drump, i Sernie Banders estan esperant els resultats
 *  que tu, com a Secretari d'Estat, donaràs.

Entrada
Cada cas és de tres línies. 
La primera és el nombre de vots de Jiden, la segona el nombre de vots de Drump i la tercera els de Banders.

Sortida
Per cada cas es dirà el candidat guanyador. Sempre hi ha un guanyador */



package Joel_0201AlternativasIf;


import java.util.Scanner;

public class Eleccionesc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int votosJiden = sc.nextInt();
		int votosDrump = sc.nextInt();
		int votosBanders = sc.nextInt();
		
		
		/* if (votosJiden > (votosDrump && votosBanders)) {
			System.out.println("Jiden");
		}else if (votosDrump > (votosJiden && votosBanders)) {
			System.out.println("Drump");
			
		}else {
			System.out.println("Banders");
		} */
	}

}
