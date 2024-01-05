/* Entrada
Cada cas compta amb 2 nombres. El primer és el nombre que vols replicar i el segon quantes vegades

Sortida
Per cada cas de prova caldrà respondre: El primer nombre replicat de la forma esmentada */


package IniciacioBucles;

import java.util.Scanner;

public class TresPerCinc {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int veces = sc.nextInt();
		
		for (int i = 1; i <= veces; i++) {
			for (int j=1; j <=i; j++) {
				
			}
			System.out.print(num);
		}

	}

}
