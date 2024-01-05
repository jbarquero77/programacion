package JuecesOnline;

import java.util.Scanner;

public class Ej368CociendoHuevos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int huevos= sc.nextInt(); 
		int olla = sc.nextInt();
		int minutos =10;
				
		do {
			huevos = sc.nextInt();
			olla = sc.nextInt();
			if (huevos != 0 && olla != 0){
				//Realizar operaciones
				
			
			//Mostrar resultado
			System.out.println(minutos);
			}
			} while (huevos != 0 && olla != 0);
		
	}
}
