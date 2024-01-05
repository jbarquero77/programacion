/*
 * Hacer un programa que contenga un menú con las siguientes operaciones con Fechas: 
 * 1.-Obtener fecha actual 
 * 2.-Obtener hora actual 
 * 3.-Sumar días 
 * 4.-Diferencia en días 
 * 5.-Anterior o Posterior 
 * 9.-Salir 
 * donde: 
 * 1.-Función que imprimirá por pantalla la fecha actual del Sistema. 
 * 2.-Función que imprimirá por pantalla la hora actual del Sistema. 
 * 3.-El usuario indicará el número de días a sumar a la fecha actual, se realizará el cálculo y se mostrará la fecha resultado. 
 * 4.-El usuario introducirá dos fechas y el algoritmo calculará la diferencia en días y las mostrará el resultado por pantalla
 *  en 3 columnas (fecha 1, fecha 2 y diferencia en días). 
 * 5.-El usuario indicará una fecha y se le informará si la fecha introducida es anterior o posterior a la fecha actual. 
 * 9.-Salir: Terminará el programa con un mensaje de despedida.
 */



package Ud5EstructurasEstaticasDeDatos;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class Ej5Fechas {
	
	public static void menu() {
		
		int menu;
		
		System.out.println(" Aplicación Fechas "); 
		System.out.println("--------------------------"); 
		System.out.println("1.-Obtener fecha actual"); 
		System.out.println("2.-Obtener hora actual"); 
		System.out.println("3.-Sumar días"); 
		System.out.println("4.-Diferencia días"); 
		System.out.println("5.-Fecha anterior o posterior"); 
		System.out.println("0.-Salir");
		
		System.out.print("Elige una opción: ");
		System.out.println();
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		LocalDate fechaActual = LocalDate.now();
		int option =0;
		
		do {	
			menu();

			option = sc.nextInt();

			switch (option) {
				case 0: System.out.println("ADIOS");
				break;
	
				case 1:
					fechaActual();
					System.out.println();
					break;
	
				case 2:
					horaActual();
					System.out.println();
					break;
	
				case 3:
					System.out.println("Cuántos días quieres añadir a la fecha actual?");
					int anyadirDias = sc.nextInt();
					sc.nextLine(); // Limpiar el Scanner
					
					LocalDate nuevaFechaSuma = sumarDias(anyadirDias);
					
					System.out.println(nuevaFechaSuma);
					break;
					/*
					 * case 4: System.out.println("Cuántos días quieres restar a la fecha actual?");
					 * int diasMenos =0; diasMenos = sc.nextInt(); LocalDate nuevaFechaRestar =
					 * restarDias(fechaActual, diasMenos); System.out.println(nuevaFechaRestar);
					 */
				case 4:
					sc.nextLine();
					System.out.print("Introduce la primera fecha (formato dd/MM/yyyy): ");

					String fecha1 = sc.nextLine();
					LocalDate primeraFecha = parseFecha(fecha1);
					
					
					System.out.print("Introduce la segunda fecha (formato dd/MM/yyyy): ");

					String fecha2 = sc.nextLine();
					LocalDate segundaFecha = parseFecha (fecha2);
					
					long diferencia = calcularDiferenciaDias(primeraFecha, segundaFecha);
					System.out.printf("Fecha 1: %s\n", primeraFecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				    System.out.printf("Fecha 2: %s\n", segundaFecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				    System.out.printf("Diferencia en días: %d días\n", diferencia);
					break;
	
				case 5:
					System.out.print("Introduce una fecha");
					String fechaUsuario = sc.nextLine();
					LocalDate comparaFecha = LocalDate.parse(fechaUsuario, DateTimeFormatter.ISO_LOCAL_DATE);
	
					System.out.println("La fecha introducida es :");
					break;
	
				default:
					System.out.println("Opción incorrecta, elige una opción entre 1-5, 0 para salir");
			}
		}
		while (option !=0);

			

}
	
	private static LocalDate parseFecha(String fecha2) {
		// TODO Auto-generated method stub
		return null;
	}

	// Funcion para mostrar la fecha actual 1
	public static void fechaActual () {
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy);
	}
	
	// Funcion para mostrar la hora y minutos actual 2
	public static void horaActual () {
		LocalTime horaActual = LocalTime.now();
		System.out.println("\n La hora actual es: " +horaActual.getHour() +":" + horaActual.getMinute() );
	}
	
	//Función para sumar a la fecha actual, los días indicados por el usuario 3
	public static LocalDate sumarDias (int diasASumar) {
		return LocalDate.now().plusDays(diasASumar);
		
	}
	
	/*Función para restar días a la fecha actual4
	 * 
	public static LocalDate restarDias (LocalDate fecha, int dias) {
		return fecha.minusDays(dias);
	}
	*/
	
	// Función para calcular la diferencia en días entre dos fechas 4
	public static long calcularDiferenciaDias(LocalDate fecha1, LocalDate fecha2) {
	    return Math.abs(ChronoUnit.DAYS.between(fecha1, fecha2));
	}
	
	
	 
	 
	 
	 
	 
	 
	
	 
	 
	
}
