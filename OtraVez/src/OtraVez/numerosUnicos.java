package OtraVez;

import java.util.HashSet;
import java.util.Scanner;

public class numerosUnicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashSet<Integer>numerosUnicos = new HashSet<>();
		
		int numero;
		
		do {
			System.out.println("Introduce un número (0 para salir: )");
			numero = sc.nextInt();
			numerosUnicos.add(numero);
		}while(numero !=0);
		
		for(int num : numerosUnicos) {
			System.out.print(num+ " ");
		}
	}

}
