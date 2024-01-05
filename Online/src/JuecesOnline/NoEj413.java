package JuecesOnline;

import java.util.Scanner;

public class NoEj413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		for (int i=0; i<casos;i++) {
			int ancho =sc.nextInt();
			int alto = sc.nextInt();
			
			int metros2= ancho*alto;
			
			// 
			double x= Math.ceil(metros2/2);
			
			int blancas = (int)Math.abs(x);
			int negras = (int)metros2-blancas;
			
			System.out.println(blancas+ " "+negras);
		
		}
	}
}
