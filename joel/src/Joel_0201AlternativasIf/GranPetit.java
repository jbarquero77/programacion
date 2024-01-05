package Joel_0201AlternativasIf;

import java.util.Scanner;
public class GranPetit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int resultado = 0;
		
		if ( A>= B) {
			System.out.println(A-B);
		}else {
			System.out.println(B - A);
		}
	
		
	}

}
