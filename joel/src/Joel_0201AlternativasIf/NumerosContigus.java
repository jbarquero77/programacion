/* Dos números enters A,B són contigus si 
 * A+1=B o B+1=A
Entrada
Cada cas és de dues línees. Cada línea conté un nombre, A i B.

Sortida
Per cada cas es dira "SI" si A i B són contigus i "NO" en cas contrari */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class NumerosContigus {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if ((A+1 == B) ||(B+1 == A)) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		/* String continuo = ((A+1 == B) ||(B+1 == A)) ? "SI" : "NO";
		System.out.println(continuo); */
	}

}
