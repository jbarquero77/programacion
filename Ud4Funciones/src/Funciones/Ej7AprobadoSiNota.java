/*  Escribe un programa indique si un estudiante está aprobado 
 * a partir de la nota que ha sacado en la evaluación y la nota mínima para aprobar.
 *  El programa pedirá la nota mínima para aprobar, 
 *  luego irá pidiendo notas de cada estudiante 
 *  y según el resultado de la función que se utilizará mostrará si está aprobado o no. 
 *  El programa finaliza cuando se introduce de nota un -1. 
 *  Implementa y utiliza la función: boolean estaAprobado(int nota, int notaMinima)  
 *  */



package Funciones;

import java.util.Scanner;

public class Ej7AprobadoSiNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
         // Pedir la nota mínima para aprobar.
        System.out.print("Ingrese la nota mínima para aprobar: ");
        int notaMinima = sc.nextInt();
        
        // Continuar pidiendo notas hasta que se ingrese -1.
        while (true) {
            System.out.print("Ingrese la nota del estudiante (o -1 para salir): ");
            int nota = sc.nextInt();
            
            if (nota == -1) {
            	System.out.println("Fin");
                break; // Salir del bucle si se ingresa -1.
            }
            
            // Llamar a la función estaAprobado y mostrar el resultado.
            boolean aprobado = estaAprobado(nota, notaMinima);
            if (aprobado) {
                System.out.println("El estudiante está aprobado.");
            } else {
                System.out.println("El estudiante no está aprobado.");
            }
        }
        
        sc.close();
    }

    // Función para determinar si un estudiante está aprobado.
    public static boolean estaAprobado(int nota, int notaMinima) {
        return nota >= notaMinima;
    }

	
}
