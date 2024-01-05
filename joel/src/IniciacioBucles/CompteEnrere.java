/* Entrada
Cada cas és una línia amb 1 número positiu.

Sortida
El compte enrere del nombre mostrat fins a 0, incloent els dos. */

package IniciacioBucles;

import java.util.Scanner;

public class CompteEnrere {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for (int i = num; i >= 0; i--) {
			System.out.println(i);
			
		}
		

	}

}
