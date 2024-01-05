/* Entrada
Cada cas és d'una línea, i conté un número enter, N
, del 0 al 10.

Sortida
Per cada cas es dira el següent:

0-4: "Suspes"
5-6: "Aprovat"
7-8: "Notable"
9-10: "Excelent"  */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class ButlletiNotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = sc.nextInt();
		if ((nota == 0) || (nota <= 4)) {
			System.out.println("Suspes");
			
		}else if ((nota ==5) || (nota == 6)) {
			System.out.println("Aprovat");
		}else if ((nota == 7) || (nota == 8)) {
			System.out.println("Notable"
					+ "");
		}else if ((nota == 9) || (nota == 10)) {
			System.out.println("Excelent");
		}else {
			System.out.println("Introduce una nota entre 0 y 10");
		}

	}

}
