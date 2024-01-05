/*
 * Ejercicio1. java
 * 
 * JOSÉ MANUEL BARQUERO MARS
 * 
 * 

El número 0 representa que no hay huevo, el número 1 representa a los huevos marrones y el número 2
representa los huevos blancos.
Prueba en la función principal (main) las tres funciones anteriores
 */

package Examen;

import java.util.Random;
import java.util.Arrays;

public class Ejercicio3 {
	// dado un vector, imprima por pantalla el 	contenido junto a los índices (0 – 9) utilizando para ello una tabla.
	public static void mostrarEstadoGallineros(int[] huevos) {
	        
	    for (int i = 0; i < 10; i++) {
	         System.out.print(i  + " | ");
	       }
	       System.out.println();
	      
	}
	
		
	// función en Java que devuelva un vector que contenga 10 números enteros aleatorios entre 0 y 2.
	public static int[] inicializarHuevosAleatorios() {
        Random random = new Random();
        int[] huevos = new int[10];

        for (int i = 0; i < 10; i++) {
            huevos[i] = random.nextInt(2 + 1);
        }

        return huevos;
    }
		
	//encuentre un huevo marrón entre dos huevos blancos. //Devuelve true si lo encuentra, false 	en caso contrario.
	public static boolean estaAlMedio (int [] valor) {
		
		boolean estaAlMedio = false;
		
		for (int i =1; i<valor.length-1;i++) {
			if(valor[i]== 1) {
				if(valor[i-1] == 2 && valor[i+1]==2) {
					estaAlMedio = true;
					break;
				}
			}
		}
		
		return estaAlMedio;
	}
	
	
	
	public static void main(String[] args) {
		int [] posicion = new int[10];
		int [] huevos = inicializarHuevosAleatorios();
		
		mostrarEstadoGallineros(posicion);
		
		boolean encontrado = estaAlMedio(huevos);
		
		if(encontrado) {
			System.out.println("SI se ha encontrado un huevo marron entre los dos blancos");
		}else {
			System.out.println("NO se ha encontrado un huevo marron entre los dos blancos");
		}

	}

}
