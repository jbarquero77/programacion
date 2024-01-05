package OtraVez;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Map<String, Double> alumnoNota = new HashMap<>();
		
		char repetir;
		
		do {
			System.out.print("introduce el nombre del estudiante: ");
			String nombre = sc.nextLine();
			System.out.print("introduce la nota: ");
			double nota = sc.nextDouble();
			
			alumnoNota.put(nombre, nota);
			
			System.out.println("Quieres introducir alguna otra nota? (S/N)");
			repetir = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
		}while(repetir == 's');
		
		double sumaNotas =0;
		int totalAlumnos = alumnoNota.size();
		
		for(double nota : alumnoNota.values()) {
			sumaNotas += nota;
		}
		
		double media = sumaNotas / totalAlumnos;
		System.out.println("La media de las notas es: "+media);
	}

}
