/*  Pedir dos números y mostrarlos ordenados de mayor a menor */

package Ud3AR;

import java.util.Scanner;

public class OrdenaDosNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int primernum = sc.nextInt();
		int segundnum = sc.nextInt();
		
		int mayor = 0;
		int menor = 0;
		
		if (primernum > segundnum) {
			mayor = primernum;
			menor = segundnum;
			
		}else {
			mayor = segundnum;
			menor = primernum;
		}
		System.out.println(mayor+" "+menor);
	}

}
