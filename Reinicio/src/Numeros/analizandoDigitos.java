/*
 * Escribe un programa que vaya pidiendo al usuario números enteros y muestre, 
 * en cada caso, el total de dígitos
PARES o MÚLTIPLOS DE TRES que hay en ese número, así como la media aritmética de estos dígitos
encontrados
 */


package Numeros;

import java.util.Scanner;

public class analizandoDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numUsuario=0;
		int multiplo =0;
		int suma=0;
		
		while (numUsuario !=-1) {
			System.out.println("Introduce un número: ");
			numUsuario = sc.nextInt();
			
			if (numUsuario == -1) {
				break;
			}
			
			int aux = numUsuario;
			while (numUsuario >0) {
				int cifra = aux%10;
				multiplo =0;
				suma =0;
				int sumaMultiplos =0;
				
				if (cifra%2 ==0 || cifra%3==0) {
					multiplo++;
					suma+=cifra;
				}
				aux /=10;		
			}
			double media = (double)suma/multiplo;
			
			System.out.println("Dígitos encontrados                    Media");
			System.out.println("--------------------------------------------");
			System.out.println("    "+multiplo+ "           "+media);
		}
	}

}
