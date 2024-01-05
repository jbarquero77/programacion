/* Tindrem 4 daus. Hem de comparar si hi ha alguna parella, algun trio o algún poker (els 4 iguals)

Pista: Les combinacions possibles si tens 4 daus a,b,c i d són: 
Parelles: ab, ac, ad, bc, bd, cd 
Trios: abc, abd, acd, bcd Poker: abcd

Entrada
Cada cas és d'una línea, i conté 4 números, els 4 daus, entre 1 i 6. 
No és necessari mostrar per exemple “PARELLA de 4s”, només “PARELLA” No consideris dobles parelles ni escales.

Sortida
Mostrarem per pantalla “RES”, “PARELLA”, “TRIO” o “POKER” depenent del que hagi passat. */

package AlternativesPreparacionExamen;

import java.util.Scanner;

public class PokerDadosTemeria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (a == b && b == c && c == d) {
			System.out.println("POKER");
		
		}else if (a == b && b == c || a == b && b == d || a == c && c == d || b == c && c == d) {
			System.out.println("TRIO");
		
		
		}else if (a == b ||a == c || a == d || b == c || b == d ||  c == d) {
			System.out.println("PARELLA");
		
		}else 
			System.out.println("RES");
		
	}

}
