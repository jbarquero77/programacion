/*
 * Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros
 */


package Numeros;

import java.util.Scanner;

public class medias {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		int positivos =0;
		int negativos =0;
		int sumaPositivos =0;
		int sumaNegativos =0;
		double mediaPositivos =0;
		double mediaNegativos =0;
		int ceros =0;
		
		for (int i =0; i <10; i++) {
			num = sc.nextInt();
			
			if (num > 0) {
				positivos++;
				sumaPositivos+=num;
			}else if (num <0) {
				negativos++;
				sumaNegativos+=num;
			}else {
				ceros++;
			}
		}
		if(positivos ==0) {
			System.out.println("No se puede hacer la media de positivos");
				
		}else {
			mediaPositivos = (double) sumaPositivos/positivos;
			System.out.println("La media de los números positivos es "+mediaPositivos);
		}
		if(negativos==0) {
			System.out.println("No se puede hacer la media de negativos");
		}else {
			mediaNegativos = (double) sumaNegativos/negativos;
			System.out.println("La media de los números negativos es: "+ mediaNegativos);
		}
		
		
		
		System.out.printf("La cantidad de ceros es: %d", ceros);
		
	}
}
