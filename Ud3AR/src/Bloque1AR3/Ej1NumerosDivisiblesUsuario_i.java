package Bloque1AR3;

import java.util.Scanner;

public class Ej1NumerosDivisiblesUsuario_i {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for (int i =1; i<= num; i++) {
			if(i%9==0) {
				System.out.println(i);
			}
		}

	}

}
