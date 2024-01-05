package OtraVez;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ListaCompras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashSet<String> listaCompra = new HashSet<>();
		
		char opcion;
		
		do {
			System.out.println("Lista de la compra: "+ listaCompra);
			System.out.println("Qué deseas hacer? (A: agregar, E:eliminar, S: salir)");
			opcion = sc.next().charAt(0);
			
			switch (opcion) {
				case 'A':
				case 'a':
					System.out.println("Introduce el artículo: ");
					String articuloAgregar = sc.next();
					listaCompra.add(articuloAgregar);
					break;
				case 'E':
				case 'e':
					System.out.println("Introduce el artículo que quieres eliminar: ");
					String articuloEliminar = sc.next();
					listaCompra.remove(articuloEliminar);
					break;
				case 'S':
				case 's':
					System.out.println("Gracias por su visita");
				default:
					System.out.println("Opción no válida, inténtalo de nuevo");
					break;
			}	
		}while(opcion != 'S' && opcion != 's');
	}

}
