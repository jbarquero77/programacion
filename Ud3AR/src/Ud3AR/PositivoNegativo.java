package Ud3AR;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int primernum = sc.nextInt();
		
		if (primernum > 0) {
			System.out.println("Es positivo");
		}else if (primernum < 0) {
			System.out.println("Es negativo");
		}else{
			System.out.println("El 0 es neutro");
		}

	}

}
