/* Incrementa en 1 el número entero introducido por el usuario  */

package ProblemesScanner;

import java.util.Scanner;

public class Incrementa1 {

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca un número
		Scanner sc = new Scanner (System.in);
		
		//Guardamos el número introducido por el usuario en una variable
		int numUsu = sc.nextInt();
		//Incrementamos el valor de la variable en 1
		numUsu++;
		//Mostramos el resultado
		System.out.println(numUsu);

	}

}
