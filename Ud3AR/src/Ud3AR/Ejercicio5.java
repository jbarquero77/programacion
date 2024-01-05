/* Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene. */


package Ud3AR;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int num = sc.nextInt();
		int sumaDigito =0;
		int nDigitos = 0;		
		
		
		while (num > 0) {
			
			// obtenemos el último dígito y lo sumamos al resto de dígitos
			sumaDigito += num % 10;
			
			// quitamos el último dígito
			num /= 10;
			
			// Contamos el número de dígitos
			nDigitos++;
		}
		System.out.println(nDigitos);
		System.out.println(sumaDigito);
	}

}
