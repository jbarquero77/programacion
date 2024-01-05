/* 1. Pedir dos números y decir si son iguales o no. */

package Ud3AR;

import java.util.Scanner;


public class NumerosIguales {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int primernum = sc.nextInt();
		int segundnum = sc.nextInt();
		
		if (primernum == segundnum) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		

	}

}
