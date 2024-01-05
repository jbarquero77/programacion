package BuclesAcumulador;

import java.util.Scanner;

public class ParesImpares {

	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el número de casos");
		int casos = sc.nextInt();
		int numero;
		int sumaPar =0;
		int sumaImpar =0;	
			
		for (int i = 0; i<casos; i++) {
			numero = sc.nextInt();
			
			for (int j = numero; j>0;j--) {
			
				if (j%2 ==0) {
					sumaPar += numero;
				}else {
					sumaImpar += numero;
				}
			}
		}
		System.out.printf("PARELLS %d SENARS %d", sumaPar, sumaImpar);

	}

}
