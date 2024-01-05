// Pedir 5 números y escribir la suma total

package PracticandoCicloFor;

import java.util.Scanner;

public class sumaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		int suma =0;
		
		
		// Hacemos que nos pida el número 5 veces
		for (int i=1;i<=5; i++) {
			System.out.println("ingresa un número");  
			num = sc.nextInt();
			// suma el número que tenemos y el próximo que nos da
			suma +=num;
			}
		System.out.println("la suma total es : "+ suma);

	}

}
