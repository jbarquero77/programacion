/*
 *  Dado el siguiente código de ejemplo: 
 *  public class Ejemplo01 {
 *       public static void main(String[] args)     { 
 *               System.out.println(“Ejemplo de precedencia de operadores”);
 *               System.out.println(“3+4*5= ”);
 *               System.out.println(3+4*5);
 * 	} 
 * } 
 *  a) Amplía el programa Ejemplo01 para que se muestre el resultado de la operación usando variables n1+n2*n3. 
 */

package Ud1AR;

public class Ej2 {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		int n3 = 5;
		
		System.out.println("Ejemplo de precedencia de operadores");
		System.out.println("3 + (4*5) = ");
		System.out.println(n1+(n2*n3));
	}

}
