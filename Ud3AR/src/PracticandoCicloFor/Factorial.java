// Muestra el factorial del numero introducido

package PracticandoCicloFor;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Introduce un número: ");
		int factorial = sc.nextInt();
		
		int resul=1;
		
		for (int i=1; i<=factorial;i++) {
			resul =resul*i;
		}
		System.out.println(resul);
	}

}
