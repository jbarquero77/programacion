/* Entrada
Cada cas és de tres línies, i conté un número en cada línia,
C1,C2,C3, entre 1 i 13
 
Sortida
Per cada cas es dira "SI" si hi ha dues cartes iguals entre les tres
 (com a mínim) i "NO" en cas contrari  */

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class CercarParelles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		
		if ((c1 == c2) || (c1 == c3)){
			System.out.println ("SI");
		
		}else if (c2 == c3) {
			System.out.println ("SI");
			
		}else {
			System.out.println ("NO");
		}

	}

}
