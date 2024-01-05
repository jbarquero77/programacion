/*Fes un programa per ajudar-lo a calcular l'àrea de quadrats
Entrada
Cada cas és d'una sola línia que contindrá un número que representa la longitud del costat d'un quadrat
Sortida
Per cada cas es dira l'àrea d'un quadrat que tingui els costats d'aquesta longitud */

package ProblemesScanner;

import java.util.Scanner;

public class Quadrat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado = sc.nextInt();
		int cuadrado = lado*lado;
		System.out.println(cuadrado);

	}

}
