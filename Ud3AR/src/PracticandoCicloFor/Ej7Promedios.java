/*El programa pedirá 10 números enteros.
 * mostrará el promedio de los negativos
 * el promedio de los positivos
 * contará los 0 ingresados
 * 
 */

package PracticandoCicloFor;

import java.util.Scanner;

public class Ej7Promedios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int contPosit =0;
		int sumaPost=0;
		int contNeg =0;
		int sumaNeg =0;
		int contCeros =0;
		
		
		
		for (int i = 0; i<10; i++) {
			int num = sc.nextInt();
			
			if (num < 0) {
				contNeg++;
				sumaNeg += num;
			}else if (num > 0) {
				contPosit++;
				sumaPost += num;
			}else {
				contCeros++;
			}
		}
		
		if (contPosit == 0) {
			System.out.println("No se puede calcular el promedio");
		}else {
			double mediaPos = (double) (sumaPost / contPosit);
			System.out.println("El promedio de los positivos es: "+mediaPos);
		}
		
		if (contNeg == 0) {
			System.out.println("No se puede calcular el promedio");
		}else {
			double mediaNeg = (double) (sumaNeg / contNeg);
			System.out.println("El promedio de los negativos es: "+mediaNeg);
		}
				
		System.out.println("Has escrito "+ contCeros + " ceros");
	}

}
