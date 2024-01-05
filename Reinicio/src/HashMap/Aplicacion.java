package HashMap;

import java.util.HashMap;

public class Aplicacion {

	public static void main(String[] args) {
		
		HashMap<String, Integer> calificaciones = new HashMap<>();
		
		calificaciones.put("Juan", 90);
		calificaciones.put("María", 85);
		calificaciones.put("Pedro", 95);
		
		System.out.println("Calificaciones: "+calificaciones);
		
		//Agregar un nuevo estudinate
		calificaciones.put("Ana", 88);
		
		//Mostrar calificaciones promedio
		int sumaNotas=0;
		for(int calificacion:calificaciones.values()) {
			sumaNotas+=calificacion;
		}
		
		double promedio =(double)sumaNotas/calificaciones.size();
		System.out.println("La nota media es: "+promedio);

	}

}
