/*  Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés. */

package Ud3AR;

import java.util.Scanner;

public class NumAlReves {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int numAlReves = 0;
		
		while (num > 0) {
			int digito = num % 10;
			numAlReves = numAlReves * 10 + digito;
			num /= 10;
			
		}
		
		System.out.println(numAlReves);
	}

}
