/*
 * En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades. En el primer vector se guardan
 * los nombres de las ciudades, en els egundo las temperaturas mínimas alcanzadas, y enel tercero las temperaturas máximas alcanzadas
 * en la última semana.
 * se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; 
 * además deberá poder informar por pantalla de cual fue la ciudad con la temperatura más baja y cual con la temperatura más alta, y los grados
 *  
 */


package Arrays;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String []ciudades = new String [5];
		double []minimas = new double[5];
		double []maximas = new double [5];
		
		for (int f =0; f<5; f++) {
			System.out.println("Introduce el nombre de la ciudad: "+f);				// Cargamos las ciudades
			ciudades[f]= sc.nextLine();
		}
		for (int f = 0; f <5; f++) {
			System.out.println("Introduce la temperatura mínima de la ciudad: "+f); 	// Cargamos las temp minimas
			minimas[f]= sc.nextDouble();
		}
		
		for (int f = 0; f <5; f++) {
			System.out.println("Introduce la temperatura máxima de la ciudad: "+f);	// Cargamos las temp máximas
			maximas[f]= sc.nextDouble();
		}
		
		// Buscamos la temperatura mínima
		double minima =1000;
		int posMin = -1;
		
		for (int i =0; i<minimas.length; i++) {
			
			if (minimas[i] < minima) {
				minima = minimas[i];
				posMin =i;										//Guardamos la posición de la temp minima para compararla con las ciudades
			}
		}
		// Buscamos la temperatura maxima
		double maxima = -1000;
		int posMax = -1;
		for (int i =0; i<maximas.length; i++) {		
			if (maximas[i] > maxima) {							//Guardamos la posición de la temp maxima para compararla con las ciudades
				maxima = maximas[i];
				posMax=i;
			}
		}
		
		
		System.out.println("La temperatura mínima es de: "+ minima);
		System.out.println("Se registró en la ciudad de: " + ciudades[posMin]);
		System.out.println("La temperatura máxima es de: "+maxima);
		System.out.println("Se registró en la ciudad de: "+ ciudades[posMax]);
		
		
	}

}
