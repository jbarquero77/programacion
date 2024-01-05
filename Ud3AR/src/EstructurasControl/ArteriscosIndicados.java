/* Escribe un programa que muestre tantos asteriscos (*) en la misma línea, como indique el usuario */

package EstructurasControl;

import java.util.Scanner;

public class ArteriscosIndicados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numart = sc.nextInt();
		int i = 0;
		
		while (i < numart) {
			System.out.print("*");
			i++;
			
		}

	}

}
