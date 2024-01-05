/*  Entrada
Cada cas és d'una sola línia que contindrá un número.
Sortida
Per cada cas es dirà el número invertit de forma fraccionària. Per exemple, 2
serà 1/2
Per simplicitat no hi haurà casos amb decimals periòdics.*/

package ProblemesScanner;

import java.util.Scanner;

public class dimensionInversa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		double resul = 1/num;
		
		System.out.println(resul);

	}

}
