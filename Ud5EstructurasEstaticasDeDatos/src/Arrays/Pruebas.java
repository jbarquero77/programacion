/*
 * Pedir notas, decir si está aprovado o suspendido o si la nota no es válida
 */

package Arrays;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] notas = new int [5];  //Declaramos un array para "notas" con los 5 elementos 
		
		// int primeraNota = notas [0]; // La primera nota está en el índice 0
		
		// notas [3] = 5; // Modifica a 5 el elemento que se encuentre en la posición 3 del array
		
		// int [] alumnos = new int [] {4, 5, 7}; // si introducimos los datos que va a contener el array, no le indicamos el tamaño
		
		
		// Introducir los datos y guardarlos en el array
		for (int i =0; i < 5; i++) {
			notas [i] = sc.nextInt(); // Designara a cada posición la nota introducida por el usuario
					
		}
		
		// Ejemplo for each  para las NOTAS DEL ARRAY, asignales una NOTAALUMNO, después suma cada nota
		int suma =0;
		for (int notaAlumno : notas) {
			suma += notaAlumno;
		}
		
		// usamos una constante con el número de BARCOS, para que nos ayude a simplificar la nomenclatura del array
		/*final int BARCOS= 5; 
		int [] barcos = new int [BARCOS];
		for (int i =0; i < BARCOS; i++) {
			
		}
		*/
		
		
		// Imprime las notas que hay dentro del array
	//	for (int i =0; i<5; i++) {
	//		System.out.print(notas[i]+ " ");
	//	}
	
		
		int [] array1 = {5,2,3,4,8};
		int numAux =0;
		
		for (int i=0;i< array1.length/2;i++){   //Recorremos el array hasta la mitad
	
			numAux = array1[array1.length-1-i]; // numAux = 8;
			
			array1 [array1.length-1-i] = array1[i];  
			array1 [i] = numAux;
			
			System.out.println(array1[i]+ " ");
		}
		
		
		
	}		
}