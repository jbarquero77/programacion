//Escribe un programa en el que se declaren las variables enteras x e y.
//Asígnales los valores 144 y 999 respectivamente. 
// muestra por pantalla:
//el valor de cada variable, la suma, la resta, la división y la multiplicación

package ud1Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		// introduce las variables
		int x = 144;
		int y = 999;
		
		//Usamos un double para mostrar decimales
		
		double resulDivision = (double) x/y;
		
		System.out.println("El valor de la primera variable es "+x);
		System.out.println("El valor de la segunda variable es "+y);
		System.out.println("La suma de las dos variables es "+(x+y));
		System.out.println("La resta de las dos variables es "+(x-y));
		System.out.println("La multiplicación de las dos variables es "+(x*y));
		System.out.println("La división de las dos variables es "+resulDivision);
		

	}
	
	

}
