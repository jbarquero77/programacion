package JuecesOnline;

import java.util.Scanner;

public class Ej362EsNavidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		for (int i=0; i<casos; i++) {
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			
			if (dia == 25 && mes == 12) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
	}
}
