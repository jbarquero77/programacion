/*
 * Vector de 20 carácteres, contar cuantos son numéricos
 */


package Arrays;

import java.util.Random;

public class ArrayConsonantes {
	
	//Crea vector de caracteres aleatorios (letras o números)
	public static char []caracteresAleatorios (int longitud){
		char []vector = new char [longitud];
		
		Random ran = new Random ();
		
		for (int i =0; i< longitud; i++) {
			if (ran.nextBoolean()) {
				vector[i] = (char) (ran.nextInt(26) + 'a');
            } else {
                // Generar un dígito aleatorio entre '0' y '9'
                vector[i] = (char) (ran.nextInt(10) + '0');
            }
		}
		
		return vector;
	}
	
	//Muestra vector
	public static void mostrarVector (char[]vector) {
		for (char elemento: vector) {
			System.out.print(elemento + " ");
		}
		System.out.println();
		
	}
	
	//Contar números entre los caracteres
	public static int contarNumeros (char[]vector) {
		
		int contadorNumeros =0;
		for (char elemento : vector){
			if (Character.isDigit(elemento)) {
			contadorNumeros++;
			}
		}
		return contadorNumeros;
	}
	
	public static void main(String[] args) {
		//Crea el vector
		char []vectorCaracteres = caracteresAleatorios(20);
		
		// Muestra el vector
		System.out.print("vector: ");
		mostrarVector(vectorCaracteres);
		
		//Contar cuantos caracteres son números
		int cantidadNumeros = contarNumeros(vectorCaracteres);
		
		//Mostrar el resultado
		System.out.printf("Cantidad números en el vector %d", cantidadNumeros);
	}

}
