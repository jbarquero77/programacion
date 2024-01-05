package AceptaElReto;

import java.util.Scanner;

public class ContandoEnLaArena {

	public static void imprimirNumero(int numero) {
		for (int i =0;i<numero;i++) {
			System.out.print("1");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			int numero = sc.nextInt();
			
			if (numero ==0) {
				break;
			}
			imprimirNumero(numero);
		}
	}

}
