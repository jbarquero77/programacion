package OtraVez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int num;
		
		do {
			System.out.println("Introduce un número (0 para salir)");
			num = sc.nextInt();
			if(num!=0) {
				numeros.add(num);
			}
			
		}while(num!=0);
		
		Collections.sort(numeros);
		
		System.out.print("Numeros ordenados: ");
		for(int nume: numeros) {
			System.out.print(" "+nume);
		}

	}

}
