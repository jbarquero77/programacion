

package Numeros;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int precioHoraNormal = 12;
		int precioHoraExtra = 16;
		int jornadaNormal = 40;
		System.out.println("cuantas horas has trabajado esta semana?");
		int jornadaTotal = sc.nextInt();
		int salarioTotal=0;
		int salarioExtras = (jornadaTotal -40)*16;
		
		if (jornadaTotal <=40) {
			salarioTotal = precioHoraNormal * jornadaNormal;
		}else if(jornadaTotal >40) {
			salarioTotal = (precioHoraNormal * jornadaNormal) + salarioExtras;
		}
		System.out.println(salarioTotal);
	}

}
