/* Fes un programa que donat un nombre n, repeteixi d’aquesta forma: un uns, dos dosos, tres tresos, etc.
Entrada
L’entrada és un sol nombre.
Sortida
la sortida es comptar d'1 fins el nombre repetint el nombre, imprés com una sola string. */


package IniciacioBucles;

import java.util.Scanner;

public class DobleBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j=1; j <=i; j++) {
				System.out.print(i);
			}
		}
		
	}

}
