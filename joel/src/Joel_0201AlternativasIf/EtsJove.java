/* Avuí han dit que el Covid es contagia poc entre joves. 
 * Jo estava tranquil perquè tinc 28 anys, pero han dit que jove es fins a 18. Com que 18? 
 * Es fins a 32! de tota la vida! Sóc jove!

Entrada
Cada cas és de una línea, i conté un número, l'edat.

Sortida
Per cada cas es dira "SI" si l'edat es menys de 32 i "NO" en cas contrari */

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class EtsJove {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int edad = sc.nextInt();
		
		//String joven = (edad < 32) ? "SI":"NO";
		//System.out.println(joven);
		
		if (edad<32) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}

	}

}
