// Arrays

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ResumenArrays {
	
	public static void main(String[] args) {
		
		// Declaración de arrays
		
		int[] notas = new int[5]; // Arrays de números enteros, llamada nota, igual a nuevo array de enteros de 5 notas
		
		// Asignar notas manualmente dentro del array
		notas [0] = 9;
		notas [1] = 7;
		notas [2] = 8;  // en cada posición, guardamos el valor asignado
		notas [3] = 5;
		notas [4] = 3;
		
		// Recuperar valores almacenados en array
		
		int notaAlumno1 = notas[0];  // la variable int notaAlumno que guarda el valor de la nota que se encuentra en la posición 0
		
		int suma =0;
		 for (int i = 0; i < notas.length; i++) {
			 suma += notas[i];
		 }
		 
		double media = suma/notas.length;
		 
		System.out.println(suma);
		System.out.println(media);
		
		// Asignar valores iniciales al declarar un Array
		int [] numeros = new int [] {9,7,8,5,3};
		
	//	int [] numeros = {9,7,8,5,3};
		
		// Bucle for each
		
		for (int numeroAlumno : numeros) {  //Declaramos dentro del bucle la variable int, p
			suma += numeroAlumno;
		}
		
		
		
		final int MAX_ALUMNOS = 5;					// guardamos el tamaño máximo en una variable llamada MAX_ALUNNOS
		int [] platos = new int [MAX_ALUMNOS];		// el tamaño del array será el que ponga en MAX_ALUMNOS
		Scanner sc = new Scanner (System.in);		// 
		for (int i =0; i<platos.length; i++) {		// Recorre el bucle hasta que tenga el tamaño del array para cada pasada 
			platos[i] = sc.nextInt();				// Guarda en cada posición del array lo que introduzca el usuario
		
		}
		
		// Buscar elementos dentro de un array
		//Buscar el máximo o mínimo
		
		int notaMax = notas [0]; 					 // tomamos el 1 elemento del array como la nota máxima
		for (int i=1; i<notas.length;i++) {			// recorremos el array
			if (notas[i] > notaMax) {				// si la nota que se encuentra en la posición "i" es > que la nota Maxima
				notaMax = notas[i];					// la nota Maxima será el elemento que se encuentra en la posición "i"
			}
				
		}
		
		
		//Copiar elementos de un array
		
		// Debemos guardar el resultado en otro array
		int notas1[] = new int [5];
		int notas2[] = new int [5];
		
		for (int i=0; i < notas1.length; i++) {
			notas2[i] = notas1[i];
		}
		
		//metodo arraycopy
		System.arraycopy(notas1,0, notas2, 0, notas1.length); // copia desde el array notas1 posición 0, al array notas2 posición 0, el número de elementos indicado
		
		
		//Insertar elementos al final de un Array
		int cantidadInsertar =2;
		int capacidadDelArray = 5;
		int contador =0;
		
		if (cantidadInsertar < capacidadDelArray) {
			notas[cantidadInsertar] = 2;
			cantidadInsertar++;
		}
		
		
		
		
		//Insertar elementos en posiciones intermedias de un array
		
		int cantidad = 7;
		int posicionInsertar =2;
		
		for (int i = cantidad; i > posicionInsertar; i--)     //Desplazamos el bucle a la derecha para que no queden huecos
			notas[i] = notas[i-1]; 
		notas[posicionInsertar] = 9; 
		cantidad++;											// incrementamos la cantidad hasta que sea igual a las posiciones a insertar
		
		//Borrar elementos del array
		
		int posicionBorrar = 3;
		for (int i = posicionBorrar; i < cantidad-1; i++)     //En este caso desplazamos hacia la izquierda
			notas[i] = notas[i+1]; 							
			cantidad--;
			
		//Busqueda de elementos en un array
		
			//Busqueda secuencia o lineal  Poco eficiente "lenta", hay que recorrer todos los elementos del Array
			
			int elementoBuscado =8;
			int posicionBuscado =-1;
			
			for (int i =0; i<notas.length; i++) {
				if (notas[i] == elementoBuscado) {        // si la nota que se encuentra en la posición "i" es igual a la que buscamos
					posicionBuscado =i;					// la notaBuscada es la "i"
				}
			}
			
		//Búsqueda binaria
			
			int inferior =0;
			int superior = notas.length-1;				// -1 porque el array empieza en la posición 0
			int centro;									// no sabemos donde esta el centro
			
			int posicion = -1; // De momento no hemos encontrado nada
			
			elementoBuscado = 8;
			while (inferior <= superior && posicion == -1) {  // mientras que la posición inferior sera menos que la superior y la posicion sea igual a -1
				centro = (inferior+superior)/2;	              // buscamos el centro
				
				if (elementoBuscado == notas [centro]) {		// Partimos en 2 el array y buscamos el elemento entre las mitades	
					posicion = centro;
				}else if (elementoBuscado < notas[centro]) {	// Si esta por debajo
					superior = centro -1;						
				}else if (elementoBuscado > notas[centro]) {	// Si esta por encima
					inferior = centro +1;
				}
																
			}
			
			//metodos arrays
			
			// Ordenar numeros o letras
			//Arrays.sort (notas);   						// Debemos importar el metodo
			
			System.out.print("Notas antes de ordenar: ");
			for (int i = 0; i < notas.length; i++) {
				System.out.print(notas[i]+ " ");
			}
			System.out.println();
			Arrays.sort(notas);
			System.out.println("Notas después de ordenar: ");
			for (int i =0; i<notas.length; i++) {
				System.out.print(notas[i]+ " ");
			}
			
			// Método fill   para introducir dentro del array el mismo valor
			
			// Arrays.fill (notas, -1);			// Todos los elementos del Array notas tendrán el valor de -1
			// Arrays.fill (notas, 5, 8, -1);   // Todos los elementos del Array notas que se encuentren entre la posción 5 y la 8 tendrán el valor -1
	
			// Método equals
			//Compara los elementos de un array y nos devuelve un boolean
			// Arrays.equal(notas1, notas2);
			
			// binarySearch // permite buscar un elemento de un array ORDENADO
			
			/* int notas[] = {9,5,7,4,8}
			 * Arrays.sort (notas)					//Primero ordenamos el array
			 * Arrays.binarySearch (notas, 5)       // Devuelve el INDICE donde se encuentra la nota 5 (indice 1)
			 */
			
			
			
			
			
	
	}
}
