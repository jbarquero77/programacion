/*
 * Contar las cifras de un número positivo
 */

package Numeros;

import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		do {
			System.out.printf("%nIntroduce un número positivo");
			num = sc.nextInt();
		}while (num<0);
		
		int cifras = contarCifras(num);
		
		System.out.printf("El número %d, contiene %d cifras", num, cifras);

	}
	
	public static int contarCifras (int num) {
		
		int cifras =1;
		int contador =0;
		
		for (int i =num; i>=10;i/=10) {			//Dividir el número entre 10, mientras se pueda
			cifras++;
		}
		return cifras;
	}

}
