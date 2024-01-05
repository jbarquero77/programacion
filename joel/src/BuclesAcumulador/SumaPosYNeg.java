/*Et donen una seqüència de números enters que s'acaba amb un zero. Volem saber si tenim més números positius que negatius o al inrevés.

Entrada
L'entrada consta d'una seqüencia de números enters que s'acaba en un zero.

Sortida
Indicarà POSITIUS si hi ha més positius que negatius, NEGATIUS si hi ha més valors negatius i IGUALS en cas d'empat.*/


package BuclesAcumulador;

import java.util.Scanner;

public class SumaPosYNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num =1;
		int pos =0;
		int neg =0;
		
		while (num !=0) {
			num = sc.nextInt();
			
			if (num > 0) {
				pos++;
			}else if (num<0){
				neg++;
			}
		}
		if (pos > neg) {
			System.out.println("POSITIUS");
		}else if (neg > pos) {
			System.out.println("NEGATIUS");
		}else {
			System.out.println("IGUALS");
		}
		
		
	}

}
