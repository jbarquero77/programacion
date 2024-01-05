package OtraVez;

import java.util.Scanner;

public class StringSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un día de la semana: ");
		String diaSemana = sc.nextLine();
		
		switch(diaSemana) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("Es laborable");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Es fin de semana");
				break;
			default:
				System.out.println("No es un día válido");
				
		}

	}

}
