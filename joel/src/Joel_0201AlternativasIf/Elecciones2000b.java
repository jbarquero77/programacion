/* Les eleccions a Estats Units en 2020 depenen del decisiu estat de Wisconsin. 
 * Els dos candidats, Boe Jiden i Tonald Drump, estan esperant els resultats que tu, com a Secretari d'Estat, donaràs.

Entrada
Cada cas és de dues línies. 
La primera és el nombre de vots de Jiden i la segona el nombre de vots de Drump.

Sortida
Per cada cas es dirà el candidat guanyador. Si hi ha empat es dirà "No"  */



package Joel_0201AlternativasIf;

import java.util.Scanner;

public class Elecciones2000b {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//System.out.println("Introduce los votos de Jiden");
		int jiden = sc.nextInt();
		//System.out.println("Introduce los votos de Drump");
		int drump = sc.nextInt();
		//System.out.println("Introduce los votos de Banders");
		int banders = sc.nextInt();
		
		if ((jiden > drump) && (jiden > banders)) {
			System.out.println("Jiden");
			
		} else if ((drump > jiden) && (drump > banders)){
			System.out.println("Drump");
			
		} else if (((banders > jiden) && (drump < banders))){
			System.out.println("Banders");
			
		}else {
			System.out.println("Tiene que haber un ganador");
			
		}
		sc.close();
	}

}
