/*  Pedir un número entre 0 y 9.999, decir si es capicúa.  */

package Ud3AR;

import java.util.Scanner;

public class NumeroCapicua {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int temp = num;
		int capicua = 0;
		
		while (temp >0) {
			capicua = capicua * 10;
			capicua = capicua + temp % 10;
			temp /= 10;
			
		}	
		if (num == capicua) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
		
	}
}
