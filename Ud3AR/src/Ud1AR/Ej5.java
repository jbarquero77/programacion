/*
 *   Haz un programa con introducción de datos de usuario: 
 *   a) Que calcule el producto de dos números introducidos por el usuario. 
 *   b) Que calcule la división de dos números introducidos por el usuario, 
 *   así como el resto de esa división. 
 *   c) Suma tres números tecleados por usuario. 
 */

package Ud1AR;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int producto = a*b;
		int division = a/b;
		int resto = a%b;
		
		System.out.println("El producto de "+ a + " y "+ b + " es: "+ producto);
		System.out.println("La división de "+ a + " y "+ b + " da: "+ division);
		System.out.println("El resto de "+ a + " y "+ b + " es: "+ resto);
		System.out.println("La suma de "+ a + ", "+ b + " y "+c+ " es: "+ (a+b+c));

	}

}
