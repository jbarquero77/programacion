/*
 * Pide al usuario un número y muestra su tabla de multiplicar, usando la concatenación ‘+’. 
 * Por ejemplo, si el número es el 3, debería escribirse algo como  
 * 3 x 0=0  
 * 3 x 1=3  
 * 3 x 2=6  ...  
 * 3 x 10 = 30
 */

package Ud1AR;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num=0;
		System.out.println("Introduce el número que quieres multiplicar: ");
		num = sc.nextInt();
		
		for (int i = 0; i<=10;i++) {
			System.out.println(num +" x "+ i + " = "+ (num * i));
		}
	}

}
