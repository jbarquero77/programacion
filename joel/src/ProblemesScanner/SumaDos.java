/*Suma Dos
Hi ha gent que li agrada sumar. Hi ha gent per tot en aquest món

Entrada
Cada cas és de dues línies, on cada una conté un número

Sortida
Per cada cas es dirà els dos números sumats*/

package ProblemesScanner;

import java.util.Scanner;

public class SumaDos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primerNumero = sc.nextInt();
		int segundNumero = sc.nextInt();
		
		System.out.println(primerNumero+segundNumero);
		
	}

}
