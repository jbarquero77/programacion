/* Cada cas de prova consisteix en 4 números, A,B,C,N
 , sent A,B,C l'edat dels exs de bambino, que sempre seran diferents i iguals o majors de 18, 
 i N l'edat del seu últim interés, també igual o major de 18.

Sortida
Per cada cas de prova s'ha de dir SI si l'interés no té l'edat dels exs de bambino i NO en cas contrari.  */


package Joel_0201AlternativasIf;

import java.util.Scanner;

public class ExBambino {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int A = sc.nextInt();
			int B= sc.nextInt();
			int C= sc.nextInt();
			int N=sc.nextInt();
			
			if ((N == A) || (N == B) || (N == C)) {
				System.out.println("NO");
			}else {
				System.out.println("SI");
			}
			
	}

}
