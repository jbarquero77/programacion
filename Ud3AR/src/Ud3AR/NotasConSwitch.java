package Ud3AR;

import java.util.Scanner;

public class NotasConSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota = sc.nextInt();
		
		switch (nota) {
			case 0,1,2,3,4: System.out.println("Insuficiente"); break;
			case 5: System.out.println("Suficiente"); break;
			case 6: System.out.println("Bien"); break;
			case 7,8: System.out.println("Notable"); break;
			case 9,10: System.out.println("Sobresaliente"); break;
			default: System.out.println("Escribe una nota entre 0 y 10");
		}

	}

}
