package Strings;

import java.util.Scanner;

public class RepetirLetra {
	
	public static String convierteEnPalotes (int n) {
		
		String palotes ="";
		
		int cifra;
		
		
		while (n>0) {
			cifra = n%10;
			
			for (int i =0; i<cifra; i++){
				palotes ="|" + palotes;
			}
			if (n>9) {
				palotes = "-"+palotes;
			}
			n/=10;		
		}
		
		return palotes;	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		
		String palotes = convierteEnPalotes(num);
		System.out.println(palotes);
		
	}

}
