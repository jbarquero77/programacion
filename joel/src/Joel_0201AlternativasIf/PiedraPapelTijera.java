/* Implementa un programa en Java que simuli el joc del pedra-paper-tisora:

    Demana al jugador1, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
    Demana al jugador2, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).

Entrada

Cada cas és de dues línies, la primera amb la tria del jugador 1 i la segona amb la tria del jugador 2. 
Els dos números son enters de 0 a 9.
Sortida

Escriurà el jugador que guanya (“Jugador1”, o “Jugador2”) 
Recordem que pedra guanya a tisora, paper guanya a pedra, tisora guanya a paper. 
En cas d’empat, escriurà EMPAT. En cas de que un dels jugadors posi un número diferent a 1,2,3, escriurà ERROR.
  */

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int jugador1 = sc.nextInt();
		
		System.out.println("Introduce un número");
		int jugador2 = sc.nextInt();
		
		if (jugador1 < 1 || jugador1 >3 || jugador2 < 1 || jugador2 >3) {
			System.out.println("ERROR");
		}else if (jugador1 == 1 && jugador2 == 3 || (jugador1 == 3 && jugador2 == 2) || (jugador1 == 2 && jugador2 == 1) ) {
			System.out.println ("Jugador1");
		
			
		}else if (jugador2 == 1 && jugador1 == 3 || (jugador2 == 3 && jugador1 == 2) || (jugador2 == 2 && jugador1 == 1)) {
			System.out.println ("Jugador2");
		
		}else {
			System.out.println("EMPAT");
		}
	}	
}
