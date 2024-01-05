// // José Manuel Barquero Mars
/* Escribe un programa que vaya pidiendo al usuario números enteros y muestre, en cada caso, el total de dígitos PARES o MÚLTIPLOS DE TRES que hay 
 * en ese número, así como la media aritmética de estos dígitos encontrados.
 * El programa termina cuando usuario escribe -1.
 */


package examen1JMBM;

import java.util.Scanner;

public class Ejercicio2JMBM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int num = 0;
		int multiplo = 0;
		int suma = 0;
		
		// Mientras que el usuario no escriba el número -1 efectuaremos
		while(num != -1) {
			System.out.println("Ingresa un número positivo");
			num = sc.nextInt();
			
			if (num == -1) {
				break;
			}
			
			int numAux = num; // creamos un variable que almacene el número de forma temporal sin machacar la variable num
			while(num >0) {
				int cifra = numAux %10; // 4,3,2,1
				multiplo =0; // reseteo el contador cada vez que entro al bucle
				suma =0;  // reseteo la suma cada vez que entro al bucle
				int sumaMultiplos = 0;
			
				// comprobamos si la cifra es múltiplo de 2 o de 3	
					if (cifra %2 ==0 || cifra %3 ==0) {
						multiplo++; // 1,2,3,3
						
						// En esta parte, es donde queremos sumar los digitos que cumplan la condicion
						
						suma = suma + cifra;
					}
					numAux /=10;  // 123, 12, 1, 0
					
				}
				//suma = 9
				double media = (double)suma/multiplo;
				
				System.out.println("Dígitos encontrados             Media");
				System.out.println("----------------------------------------------------");
				System.out.println(multiplo + "                     "+media);
				
			}
		

	}

}