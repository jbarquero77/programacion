// Ciclo pares hasta número

package PracticandoCicloFor;

import java.util.Scanner;

public class MostrarPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero = 0;
		int contador = 1;
		int producto =0;
		
			System.out.println("introduzca un número");
			numero = sc.nextInt();
			for (contador=1; contador<=numero;contador++) {
				producto = 2 * contador-2;
				System.out.println("número = "+ producto); 
			}

	}

}
