package OtraVez;

import java.util.Scanner;

public class SimulacionCajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double saldo =0;
		char opcion;
		
		do {
			System.out.println("El saldo actual es de: "+saldo+ " euros.");
			System.out.print("¿Qué opción quieres elegir? (D: deposito, R: retirada, S: salir");
			opcion = sc.next().charAt(0);
			
			switch(opcion) {
				case 'D':
				case 'd':
					  	System.out.print("Introduce la cantidad a ingresar: ");
					double deposito = sc.nextDouble();
					saldo+= deposito;
					break;
					
				case 'R':
				case 'r':
						System.out.print("Introduce la cantidad a retirar: ");
					double retiro=sc.nextDouble();
					if(retiro<=saldo) {
						saldo-=retiro;
					}else {
						System.out.println("Saldo insuficiente");
					}
					break;
				
				case 'S':
				case 's':
					System.out.println("Gracias por usar el cajero");
					break;
				default:
					System.out.println("Opción no válida, inténtalo de nuevo");
					break;
			}
						
		}while(opcion!= 'S' && opcion != 's');
		
	}

}
