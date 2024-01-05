/* Entrada
La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea
Sortida
Per cada cas de prova caldrà respondre: La linea que s’ha entrat */

package IniciacioBucles;

import java.util.Scanner;

public class DiguesPatata {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		while (n > 0) {
			String cadena = sc.next();
			System.out.println(cadena);
			n--;
		}

	}

}
