package JuecesOnline;

import java.util.Arrays;
import java.util.Scanner;

public class Triángulos180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos = sc.nextInt();
		int []lados = new int [casos];
		
		
		for (int i=0; i<casos; i++) {
			lados[i]= sc.nextInt();
			
			Arrays.sort(lados);
			
			System.out.println(lados);
		}

	}

}
