package Numeros;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce un el número que quieras saber si es primo: ");
		int num = sc.nextInt();
		
		if(esPrimo(num)) {
			System.out.println(num+" Es primo");
		}else {
			System.out.println(num+" No es primo");
		}
	}
	
	public static boolean esPrimo(int num) {
		if(num<=1) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
