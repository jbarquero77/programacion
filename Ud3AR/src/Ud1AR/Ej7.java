/*
 *  El usuario tecleará dos números (a y b), y 
 *  el programa mostrará el resultado de la operación (a+b)*(a-b) y
 *   el resultado de la operación a2-b2. 
 *  Ambos resultados se deben mostrar en la misma línea.  
 */

package Ud1AR;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res1 = ((a+b)*(a-b));
		int res2 = ((a*a) - (b*b));
		
		
		System.out.print("El resultado de la primera operación es: "+ res1+ " y el de la segunda operación es: "+res2);

	}

}
