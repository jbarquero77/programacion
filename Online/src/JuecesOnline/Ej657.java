package JuecesOnline;

import java.util.Scanner;

public class Ej657 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		
		for (int i=0; i<casos;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if(A-B <B-C) {
				System.out.println(B);
			}else if(A-B == C-B) {
				System.out.println("EMPATE");
			}else {
				System.out.println(A);
			}
		}

	}

}
