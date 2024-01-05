/* Furancescu era Top50 d'Espanya del Smash Bros, i després d'un torneig va conseguir ser top 25.
 *  D'aquí es pot deduïr que al següent torneig serà top 12, després top 6, després top 3, 
 *  i per últim el Millor Jugador de Smash d'Espanya.

Entrada
Cada cas és de dues línees, amb dos números, N
, la posició inicial al top d'Espanya de Furancescu i K
, la quantitat de tornejos que ha jugat.

Sortida
La posició de Furancescu després de jugar K
 tornejos
 */

package IniciacioBucles;

import java.util.Scanner;

public class Top50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
				
		for (int k =sc.nextInt(); k > 0; k--) {
			n = n/2; 
			
		}
		
		System.out.println(n);

	}

}
