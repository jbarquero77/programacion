package OtraVez;

import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int suma =0;
		
		do {
			suma +=num%10;
			num/=10;
		}while(num!=0);
		System.out.println(suma);

	}

}
