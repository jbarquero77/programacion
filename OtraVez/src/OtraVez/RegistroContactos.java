package OtraVez;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroContactos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Map<String, String> contactos = new HashMap<>();
		
		char opcion;
		
		do {
			System.out.println("Registro de Contactos"+ contactos);
			System.out.print("Elige una opción: (A: Agregar, B: Buscar, E: Eliminar, S: Salir)");
			opcion=sc.next().toLowerCase().charAt(0);
			
			switch(opcion) {
				case 'a':
					System.out.println("introduce el nombre del contacto: ");
					String nombreContacto = sc.next();
					System.out.println("introduce el número de teléfono: ");
					String telefonoContacto = sc.next();
					contactos.put(nombreContacto, telefonoContacto);
					break;
					
				case 'b':
					System.out.println("Introduce el nombre que quieres buscar: ");
					String nombreBuscar = sc.next();
					if(contactos.containsKey(nombreBuscar)) {
						String numeroEncontrado = contactos.get(nombreBuscar);
						System.out.println("Su número de teléfono es: "+ nombreBuscar);
					}else {
						System.out.println("El contacto "+nombreBuscar+ " no se encuentra en la agenda");
					}
					break;
				case 'e':
					System.out.println("Qué contacto quieres eliminar?");
					String contactoEliminar = sc.next();
					if(contactos.containsKey(contactoEliminar)) {
						String contactoEliminado = contactos.remove(contactoEliminar);
						System.out.println("El contacto "+contactoEliminar+" ha sido eliminado");
					}else {
						System.out.println("no se ha encontrado en la agenda");	
					}
					break;
				case 's':
					System.out.println("Gracias por usar nuestra agenda");
					break;
					
				default:
					System.out.println("Introduce una opción válida");
					break;
			}
					
		}while(opcion != 's');
	}

}
