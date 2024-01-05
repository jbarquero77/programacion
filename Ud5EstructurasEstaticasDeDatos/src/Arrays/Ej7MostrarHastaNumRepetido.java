/*
 * Sea a un arrayde int, a.length>0, 
 * cuyas componentes tienen valores comprendidos entre 0 y 9 inclusive. 
 * Se debe escribir un método de clase con el siguiente perfil: 
 * publics tatic void cifras(int[] a)
 * que escriba en la salida estándar los primeros componentes del array en las que no hay elementos consecutivos repetidos. 
 * Por ejemplo:
 * Si a es {8,8,4,3}, se escribe 8. 
 * Si a es {4,0,5,9,9}, se escribe 4059. 
 * Si a es {0,9,4,5,9}, se escribe 09459. 
 * Si a es {1,7,1,0,0,8,7}, se escribe 1710.
 */

package Arrays;

import java.util.Scanner;

public class Ej7MostrarHastaNumRepetido {
	
	public static void cifras (int[] a) {
		
		for (int i =1; i<a.length;i++) {
			if(a[i] !=a[i-1]) {
				System.out.print(a[i]);
			}
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el tamaño de la cadena: ");
		int tamanio = sc.nextInt();
		
		int [] cifras = new int[tamanio];
		System.out.print("Introduce los elementos del array: ");
		for(int i=0; i<tamanio; i++) {
			cifras[i]= sc.nextInt();
		}
		
		System.out.println("Cifras sin consecutivos: ");
		cifras(cifras);
	}

}
