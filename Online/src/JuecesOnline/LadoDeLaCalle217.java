package JuecesOnline;

import java.util.Scanner;

public class LadoDeLaCalle217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			int numero = sc.nextInt();
			if (numero == 0) {
				break;
			}
		
			if (esPar(numero)) {
				System.out.println("DERECHA");
			}else {
				System.out.println("IZQUIERDA");
			}
		}
		sc.close();
	}
	public static boolean esPar(int num) {
		return num %2 ==0;
		
	}

}
