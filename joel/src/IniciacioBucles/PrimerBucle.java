/* La primera línia indica els casos de prova a considerar. Cada cas és una línia amb un nombre.
Sortida
Per cada cas de prova caldrà respondre: El nombre introduït més un. */

package IniciacioBucles;

import java.util.Scanner;

public class PrimerBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numcasos = sc.nextInt();
		
		for (int i=0; i < numcasos; i++) {
			int num = sc.nextInt();
			int res = num +1;
			
			System.out.println(res);
		}
		
	}

}
