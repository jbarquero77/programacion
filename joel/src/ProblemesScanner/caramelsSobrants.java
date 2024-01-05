/*Entrada
Cada cas és de dues linies. La primera es el nombre de caramels i la segona el nombre de nens.
Sortida
Per cada cas es dira quants caramels sobren*/


package ProblemesScanner;

import java.util.Scanner;

public class caramelsSobrants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caramels = sc.nextInt();
		int nens = sc.nextInt();
		
		int sobren = caramels % nens;
		
		System.out.println(sobren);

	}

}
