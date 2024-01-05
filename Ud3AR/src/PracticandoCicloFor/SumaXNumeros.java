/* Escribir un programa que obtenga la suma de los 35 primeros números. 
 * Es decir: 1+2+...+34+35 = 630*/


package PracticandoCicloFor;

import java.util.Scanner;

public class SumaXNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Muestrame hasta que número quieres sumar: ");
		int num = sc.nextInt();
		int resultado =0;
		
		for (int i=0; i<=num;i++) {
			resultado +=i;
		}
		System.out.println(resultado);
	}

}
