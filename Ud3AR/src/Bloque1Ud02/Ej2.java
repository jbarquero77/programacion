/*
 * Crea un programa en Java que solicite al usuario 
 * ingresar información sobre un libro, incluyendo el título, el autor, el año de publicación y el precio. 
 * Luego, el programa debe mostrar los datos ingresados de manera formateada y alineada en una salida de estilo tabular.  
 * Aquí tienes un ejemplo de cómo debería verse la salida:
 *  ---------------------------------- 
 *  Información del Libro 
 *  ---------------------------------- 
 *  Título:              El Gran Gatsby 
 *  Año de Publicación:  1925 
 *  Autor:               F. Scott Fitzgerald 
 *  Precio:              12,99€ 
 *  Instrucciones: • Utiliza la clase Scanner para solicitar al usuario que ingrese el título, el autor, el año de publicación y el precio del libro.
 *  • Utiliza el método printf para mostrar la información del libro en una salida tabular. 
 * Alinea los títulos (por ejemplo, "Título:") a la izquierda y los valores a la derecha. 
 */


package Bloque1Ud02;

import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String titulo = "El Gran Gatsby";
		int anio = 1975;
		String autor ="F. Scott Fitzgerald";
		float precio = 12.99f;
		
		
		/*
		System.out.println("Introduce el Título del Libro: ");
		titulo = sc.nextLine();
		System.out.println("Introduce el Año de Publicación: ");
		anio = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el Autor: ");
		autor = sc.nextLine();
		System.out.println("Introduce el Precio: ");
		precio = sc.nextFloat();  //Acordarse de escribir el numero separado con ,
		*/
		
				
		System.out.println("--------------------------");
		System.out.println("Información del Libro");
		System.out.println("---------------------------");
		
		System.out.printf("Título: %20s%n", titulo);
		
		System.out.printf("Año de publicación: %8d%n",anio); 
		System.out.print("Autor:");
		System.out.printf(" %21s%n", autor);
		System.out.printf("Precio:              %5.2f €%n ", precio); // A partir de aquí, todo un error
		
		
		
		
	}
}
