/*Pedir un número y decir cuantas cifras tiene
 * 
 */

package Numeros;

import java.util.Scanner;

public class CifrasNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int numUsu = sc.nextInt();
		int contador=0;
		
		while (numUsu>0) {
			numUsu = numUsu/10;
			contador++;
			
		}
		System.out.println(contador);

	}

}
