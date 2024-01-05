/* Entrada
Cada cas és de tres línies, i conté tres números F1,F2,F3, la quantitat de felicitat d'aquell dia

Sortida
Per cada cas es dira "SI" si la felicitat és ascendent dia a dia i "NO" en cas contrari    */

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class FelicitatAscendent {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		int F1 = sc.nextInt();
		int F2 = sc.nextInt();
		int F3 = sc.nextInt();
		
		if ((F3 > F2) && (F2 > F1)) {
			System.out.println("SI");
		}else {
			System.out.println ("NO");
		}
	}

}
