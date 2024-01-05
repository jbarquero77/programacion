/*  Pedir dos números y decir cuál es el mayor */


package Ud3AR;

import java.util.Scanner;

public class MayorDeDos {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int primernum = sc.nextInt();
	int segundnum = sc.nextInt();
	
	if (primernum > segundnum) {
		System.out.println("El mayor es "+ primernum);
	}else if (primernum < segundnum) {
		System.out.println("El mayor es "+ segundnum);
	}else {
		System.out.println("Los números son iguales");
	}
	

	}

}
