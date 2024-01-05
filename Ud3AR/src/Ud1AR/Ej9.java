/*
 *  Crea una variante del programa anterior, que pide al usuario un número y muestra su tabla de multiplicar. 
 *  Esta vez no deberás utilizar la concatenación ‘+’, sino ‘print’.  
 */

package Ud1AR;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num =0;
		System.out.println("Introduce el número que quieres multiplicar: ");
		num = sc.nextInt();
		
		for (int i =0; i<=10; i++) {
			
			System.out.print(num + " * " + i + " = " + (num * i));
			System.out.println();
		}
		
		

	}

}
