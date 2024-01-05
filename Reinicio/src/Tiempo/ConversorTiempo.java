package Tiempo;

import java.util.Scanner;

public class ConversorTiempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce la cantidad de segundos");
		int segundos = sc.nextInt();
		
		convertirSegundos(segundos);
	}
	
	public static void convertirSegundos(int seg) {
		int horas = seg/3600;
		int minutos =(seg %3600)/60;
		int restoSegundos = seg %60;
		int dias =horas/24;
		
		System.out.println("Tiempo convertido: "+dias+ " dias "+ horas+ 
				" horas "+minutos+" minutos "+restoSegundos+" segundos");
	}

}
