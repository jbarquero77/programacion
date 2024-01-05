package OtraVez;

import java.util.Scanner;

public class DoWhileSumaHasta {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		int suma =0;
		
		do {
			System.out.println("Introduce un número (0 para salir): ");
			num = sc.nextInt();
			suma += num;
		}while(num!=0);
		
		System.out.println("El resultado es: "+suma);

	}

}
