/*
 * Crea una función con la siguiente cabecera:
 *  public String convierteEnPalabras(int n) { ...} 
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres.
 *  Por ejemplo, el 470213 convertido a palabras sería: 
 *  cuatro, siete, cero, dos, uno, tres Utiliza esta función en un programa para comprobar que funciona bien.
 *   Desde la función no se debe mostrar nada por pantalla, solo se debe usar println desde el programa principal.
 *  Fíjate que hay una coma detrás de cada palabra salvo al final.
 */


package bFunciones;

import java.util.Scanner;

public class Ej5 {
	
	
	public static String convierteEnPalabras(int n) {

		String numeroTexto = String.valueOf(n);
		String[] digitosEnLetras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
		String resultado = "";
		
		
		for (int i =0; i < numeroTexto.length(); i++) {
			
			// guardamos como char cada número que recorremos
			char digito = numeroTexto.charAt(i);
			
			// cogemos cada caracter digito y le damos el valor numérico y lo guardamos como int
			int valorDigito = Character.getNumericValue(digito);
			// Tenemos que poner una coma después de cada resultado, menos en el último
			// ¿Cómo cojones hago esto?
			// el resultado será igual a un array que iguala cada valor int transformado en char que ocupe esa posicon en la cadena, y le añadimos una coma
			
			
			resultado += digitosEnLetras[valorDigito] + ", ";
			
		}
						
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introcude el número: ");
		int numeroUsuario = sc.nextInt();
		
		String resultado = convierteEnPalabras(numeroUsuario);
		
		System.out.println(resultado);
	}

}
