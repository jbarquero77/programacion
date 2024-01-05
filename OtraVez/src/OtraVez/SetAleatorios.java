package OtraVez;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SetAleatorios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		Set<Integer> unicos = new HashSet<>();
		
		System.out.println("introduzca la cantidad de números");
		int cantidad = sc.nextInt();
		
		for(int i=0; i<cantidad;i++) {
			int aleatorio = rand.nextInt(100);
			unicos.add(aleatorio);
		}
		
		
		System.out.print("Numeros aleatorios generados: ");
		for (int num : unicos) {
			System.out.print(" "+num);
		}
	}

}
