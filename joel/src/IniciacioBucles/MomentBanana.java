/* Entrada
La primera línia indica els casos de prova a considerar. 
Cada cas de prova seran 2 nombres. 
El primer serà la vida que té el personatge i el segon el dany rebut. 
Tingues en compte que el dany no pot ser superior a la vida, ja que els morts no mengen bananes.
Sortida
Si el dany és més gran que el 20% de la vida del jugador, i el jugador per tant es pot menjar una Banana, es respondrà "Momento Banana".
 En cas contrari, i el jugador no vulgui o no pugui menjar-se una Banana es respondrà "Nope". */

package IniciacioBucles;

import java.util.Scanner;

public class MomentBanana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numCasos = sc.nextInt();
		
		for (int i =0; i < numCasos; i++) {
			int vida = sc.nextInt();
			int danyo = sc.nextInt();
			
			 if (danyo >= vida) {
	                System.out.println("Nope");
	            } else if (danyo > (vida * 0.2)) {
	                System.out.println("Momento Banana");
	            } else {
	                System.out.println("Nope");
	            }
		}
		

	}

}
