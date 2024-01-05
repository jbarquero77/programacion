/*
 * Una compañia de vu7elos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodía y otro por la noche.
 * para administrar esos datos, utiliza una matriz, donde cada fila es un destino y enc ada columna se guarda la cantidad de asientos disponibles.
 * 
 * Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.
 * al mismo tiempo, el progrma debe permitir al usuario ingresar el número de destino al que quiere dirigirse, el número de vuelo (dependiendo de si quiere
 * viajar por la mañana, por la tarde o por la noche) y la cantidad de pasajes que necesita.
 * A partir de la solicutid del usuario, el programa debe controlar si hay la cantidad suficiente de asientos para la cantidad de pasajes que se requiere.
 * en caso de que así sea, se debe mostrar un cartel por la pantalla que diga "su reserva fue realizada con éxito" y se debe descontar del
 * total de asientos los solicitados por el usuario. en caso de no haber más asientos disponibles, se debe informar otro cartel que diga 
 * "disculpe, no se pudo completar su operación dado que no hay asientos disponibles".
 * Desde la compañía de vuelos, manifiestan que no conocen cuantas ventas/reservas se hacen por día. por lo cual, para finalizar las ventas se 
 * ingresa la palabra "finish".
 * 
 */


package MatricesBidimensionales;

import java.util.Scanner;

public class CompanyiaVuelos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vuelos [][] = new int [6][3];
		
		//Introducir los asientos para cada destino
		for(int i=0; i<6;i++) {
			for (int j=0; j<3;j++) {
				System.out.println("Introduce la cantidad de asientos para el destino: "+ i + " horario: "+j);
				vuelos[i][j] = sc.nextInt();
			}
		}
		String bandera = "";
		int destino, horario, asientos;
		
		while (!bandera.equalsIgnoreCase("finish")) {
			System.out.println("Introducir el número de destino: ");
			destino = sc.nextInt();
			System.out.println("Introducir el horario de vuelo: ");
			horario = sc.nextInt();
			System.out.println("Introducir la cantidad de asientos: ");
			asientos = sc.nextInt();
			
			if (destino >= 0 && destino <= 5) {

				if (horario >= 0 && horario <= 2) {
					if (vuelos[destino][horario] >= asientos) {
						System.out.println("Su reserva fue realizada con éxito");
						vuelos[destino][horario] = vuelos[destino][horario] - asientos;
					} else {
						System.out.println("No hay asientos disponibles");
					}
				} else {
					System.out.println("Horario no existente. Introduce entre 0 y 2");
				}

			} else {
				System.out.println("El destino no existe. Introduce entre 0 y 5");
			}
			
			
			System.out.println("¿Desea continuar reservando asientos?. Introducir FINISH para terminar.");
			bandera = sc.next();
			
			
		}
		
		
	}

}
