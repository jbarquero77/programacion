/* Entrada
Cada cas és una linea amb 1
 número, la quantitat de diners que té
Sortida
Per cada cas de prova caldrà respondre: Comptar milió a milió els diners que té harrison for() */


package IniciacioBucles;

import java.util.Scanner;

public class HarrisonFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		long num = sc.nextInt();
				
		for (long i= 1000000; i <= num;i= i+1000000) {
			System.out.println(i);
		
		}
		
		
	}
}