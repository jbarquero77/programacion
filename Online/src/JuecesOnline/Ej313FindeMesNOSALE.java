package JuecesOnline;

import java.util.Scanner;

public class Ej313FindeMesNOSALE {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos, num1, num2;
		casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 > num2) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}

	}

}
