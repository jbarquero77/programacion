/* Se't donen 5 numeros i has de dir si son muntanyes.

Els nombres fan muntanyes si el segon és més gran que el primer, 
el tercer més petit que el segon, 
el quart més gran que el tercer, etc. 
També al revès, si el segón es més petit que el primer, el tercer més gran que el segon, etc.

Entrada
Cada cas té 5 línies, una per cada nombre.

Sortida
Per cada cas es dira "SI" si els nombres fan muntanyes i "NO" en cas contrari */

package Joel_0201AlternativasIf;

import java.util.Scanner;

public class Muntanyes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		
		if (B > A && C < B &&  D > C && E < D) {
			System.out.println("SI");
		}else if (B < A && C > B && D < C && E > D) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
	}

}
