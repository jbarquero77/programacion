package Numeros;

import java.util.Scanner;

public class EstructurasControl1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		double media;
		int suma=0;
		int num;
		int contador=0;
		
		while (casos !=-1) {
			for (int i =0; i<casos;i++) {
				num = sc.nextInt();
				
				if(num> maximo) {
					maximo = num;
				}
					
				if (num <minimo) {
					minimo = num;
				}
				suma +=num;
				contador++;
			}
			media = (double)suma/contador;
		
		System.out.println(contador);
		System.out.println(maximo);
		System.out.println(minimo);
		System.out.println(media);
		
		}
	}

}
