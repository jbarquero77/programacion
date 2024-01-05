package Numeros;

import java.util.Scanner;

public class InvertirNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int numUsu = sc.nextInt();
		//System.out.println();
		int numReves = invertirNumeros (numUsu);
		System.out.printf("El número invertido es %d", numReves);

	}
	
	public static int invertirNumeros (int numero) {
		
		int invertido =0;
		while (numero!=0) {
			invertido = invertido*10+numero%10;
			numero/=10;
		}
		return invertido;
	}

}
