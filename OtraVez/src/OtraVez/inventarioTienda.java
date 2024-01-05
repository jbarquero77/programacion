package OtraVez;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class inventarioTienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Map<String,Integer> inventarioTienda = new HashMap<>();
		
		inventarioTienda.put("balon", 65);
		inventarioTienda.put("camiseta", 125);
		inventarioTienda.put("botas", 115);
		
		char consultar;
		
		do {
			System.out.println("inventario de la tienda: "+inventarioTienda);
			System.out.print("Qué artículo quieres consultar: (Escribe el nombre)");
			String articuloConsulta = sc.nextLine().toLowerCase();
			
			if(inventarioTienda.containsKey(articuloConsulta)) {
				int precio = inventarioTienda.get(articuloConsulta);
				System.out.println("El artículo "+articuloConsulta+ " cuesta: "+ precio);
			}else {
				System.out.println("El artículo "+articuloConsulta+ " no está en el inventario.");
				
			}
			
			System.out.println("Quieres consultar otra cosa?(S/N)");
			consultar =sc.next().toLowerCase().charAt(0);
			sc.nextLine();
		}while (consultar == 's');

	}

}
