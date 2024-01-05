package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBuscarElemento {

	public static void main(String[] args) {
		Integer[]array ={1,5,7,9,2,4,6,8};
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce el número a buscar: ");
		int numeroBuscado = sc.nextInt();
		
		int indice = Arrays.asList(array).indexOf(numeroBuscado);
		
		if (indice != -1) {
			System.out.println(numeroBuscado+ " encontrado en la posición: "+ indice);
		}else {
			System.out.println(numeroBuscado + " no encontrado en el array");
		}

	}

}
