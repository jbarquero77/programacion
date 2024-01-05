/*Implementa un programa que llegeix un número per teclat, el multiplica per 3 i mostra el resultat
Entrada
Un número enter
Sortida
Un número enter amb el resultat de multiplicar el número llegit per 3*/

package ProblemesScanner;

import java.util.Scanner;

public class multiplicaX3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numUsu = sc.nextInt();
		
		int result = numUsu*3;
		System.out.println(result);
		
		

	}

}
