/*
 * Escribe un programa que lea por teclado una serie de 10 números enteros. 
 * La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados.  
 */


package EjerAmpliacion;

import java.util.Scanner;

public class E1Arrays {
	
	
	// funcion boolean para ver si estan ordenados de forma creciente, recibe como parámetro un array de números
	public static boolean estanOrdenadosCreciente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {			// recorremos el array
            if (numeros[i] > numeros[i + 1]) {					// comparamos cada posición con la posición siguiente y vemos si es mayor
                return false;									// si una posición es mayor que la siguiente, devolvemos falso
            }
        }
        return true;
    }

    // funcion para verificar si los números están ordenados de forma decreciente
    public static boolean estanOrdenadosDecreciente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {				//Ahora vemos si el número que ocupa la posición que recorre es menor que el siguiente
                return false;									
            }
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] numeros = new int[10];
				
		System.out.println("Introduce 10 números enteros: ");
		for (int i =0; i <  10; i++) {
			numeros[i] = sc.nextInt();
		}
		
		if (estanOrdenadosCreciente (numeros)) {
			System.out.println("Los números estan ordenados de forma creciente");
		}else if (estanOrdenadosDecreciente (numeros)) {
			System.out.println("Los números están ordenados de forma decreciente");
		}else {
			System.out.println("Los números están desordenados");
		}
		

	}

}
