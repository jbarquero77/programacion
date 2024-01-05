package EstructurasControl;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while (num1 !=0 || num2 !=0) {
			if (num1 % num2 ==0) {
				System.out.println("Es divisible");
			}else {
				System.out.println("No es divisible");
				
			}
			break;
		}

	}

}
