package JuecesOnline;

import java.util.Scanner;

public class Ej380 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gastos = sc.nextInt();
		int suma=0;
		
		while(true) {
			if (gastos ==0) {
				break;
			}
		
			for (int i =0; i<gastos;i++) {
				int dinero = sc.nextInt();
				suma += dinero;
			}
			System.out.println(suma);
			suma=0;
			gastos=sc.nextInt();
		}
	}

}
