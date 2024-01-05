/* Escribe un programa que muestre la división de dos variables enteras cuyo
valor son 8 y 3, respectivamente.  */


package Ud2EjerciciosFormatearSalida;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 3;
		float resDiv = (float)num1/num2;
		
		//Resultado completo	1
		System.out.printf("%nEl resultado de la división es %f", resDiv);
		
		//Formato con 2 decimales es	2
		System.out.printf("%nEl resultado con 2 decimales es %.2f", resDiv);
		
		//Formato con 1X primer lugar	3
		System.out.printf("%nEl resultado con x es %5.2f", resDiv);
		
		//Formato con 3 decimales	4
		System.out.printf("%nEl resultado con 3 decimales es % 7.3f", resDiv);
		
		//Formato con 7 caracteres, 3 de ellos decimales	5
		System.out.printf("%nEl formato con 7 caracteres, 3 de ellos decimales es %07.3f", resDiv);
		
		//Formato con 10 caracteres, 4 espacios en blando delante, y 4 decimales
		System.out.printf("%nEl formato con 10 caracteres, 4 espacios en blanco delante y 4 decimales, es % 10.4f", resDiv);
		
		//Formato con 5 caracteres, 3 de ellos decimales
		System.out.printf("%nEl formato con 1 entero y 3 decimales es %5.3f",resDiv);
		
		//Formato con 10 caracteres, 3 espacios vacios delante y 5 decimales
		System.out.printf("%nEl formato con 10 caracteres, solo 5 decimales es % 10.5f", resDiv);
		
		//Formato 10 caracteres sin decimales
		System.out.printf("%nEl formato de 10 caracteres sin decimales es %010.0f", resDiv);
		
		
	}

}
