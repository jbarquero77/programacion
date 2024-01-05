package Joel_0201AlternativasIf;

import java.util.Scanner;
public class DiferenciaEntreTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mayor, menor;
		
		
		// int  mayor = Math.max(A, Math.max(B, C));
		// int menor = Math.min(A, Math.min(B, C));
		
		if (A >= B && A >=C) {
			mayor = A;
		}else if (B >= A  && B >= C){
			mayor = B;
		}else {
			mayor = C;
		}
		
		if (A <= B && A <=C) {
			menor = A;
		}else if (B <= A  && B <= C){
			menor = B;
		}else {
			menor = C;
		}
		
		int resta = mayor - menor;
		System.out.println(resta);
		
		
	}

}
