/* Programa que valide si una contraseña es segura
 * es segura si:
 * 
 * - tiene más de 8 caracteres
 * - tiene al menos dos letras mayúsculas
 * - tiene al menos 3 letras minúsculas
 * - tiene al menos 1 número
 * - tiene al menos uno de estos carácteres !"$%&/()
 * - no debe tener el carácter @
 * 
 * El programa se ejecutará en bucle hasta que se introduzca una contraseña válida.
 * cada vez que se intruduzca una contraseña no válidad, se mostrarán todos los errores detectados en la contraseña
 * 
 */

package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class Ej2ContraseñaValida {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String contrasenia;
		System.out.println("Introduzca su contraseña: ");
		contrasenia = sc.next();
		
		while (!esSegura (contrasenia)) {
			System.out.println("La contraseña no es segura");
			
			mostrarErrores(contrasenia);

			System.out.println("Introduzca una nueva contraseña");
			contrasenia = sc.next();
		}
		
		if (esSegura(contrasenia)) {
			System.out.println("La contraseña es segura");
		}
		
		
	}
	public static boolean esSegura(String password) {
		
		if (password.length() > 8) {
			
			boolean minuscula = false;
			boolean mayuscula = false;
			boolean numero = false;
			boolean caracterEspecial = false;
			char caracter;
			int contadorMayusculas =0;
			int contadorMinusculas =0;
			
			// Recorrer cadena
			for (int i=0; i<password.length();i++) {
				caracter = password.charAt(i);
				
				
				if (Character.isDigit(caracter)) {
					numero = true;
				}
				if (Character.isUpperCase(caracter)) {
					contadorMayusculas++;
					
				}
				if (Character.isLowerCase(caracter)) {
					
					contadorMinusculas++;
				}
				
				// caracter.indexOf  // caracter.contains ("$%")
				
				switch (caracter) {
					case '!':
					case '"':
					case '$':
					case '%': 
					case'&':
					case '/':
					case '(':
					case ')':
						caracterEspecial = true;
						break;
					case '@':
						caracterEspecial = false;
				}
			}
			if (contadorMayusculas >= 2) {
					mayuscula = true;
			}
			if (contadorMinusculas >= 3) {
					minuscula = true;
			}
				
			if (numero && mayuscula && minuscula && caracterEspecial) {
				return true;
				
			} else {
			return false;
			}
		
		}
		return false;
			
	
	}
	
	public static void mostrarErrores (String password) {
		
		if (password.length()<8) {
			System.out.println("La contraseña debe tener al menos 8 carácteres");
		}
		
		int contadorNum =0;
		int contadorMayusculas =0;
		int contadorMinusculas =0;
		boolean caracterEspecial = false;
		
		for (int i =0; i < password.length();i++) {
			char caracter = password.charAt(i);
			
			if (Character.isUpperCase(caracter)) {
	            contadorMayusculas++;
	        } else if (Character.isLowerCase(caracter)) {
	            contadorMinusculas++;
	        } else if (Character.isDigit(caracter)) {
	            contadorNum++;
	        } else if ("!\"$%&/()".indexOf(caracter) != -1) {
	            caracterEspecial = true;
	        } 
		}
		
		if (contadorMayusculas < 2) {
			System.out.println("La contraseña debe tener al menos 2 Mayúsculas");
		}
		if (contadorMinusculas < 3) {
			System.out.println("La contraseña debe tener al menos 3 Minúsculas");
		}
		if (contadorNum <1) {
			System.out.println("La contraseña debe tener al menos 1 número");
		}
		if (!caracterEspecial) {
			System.out.println("La contraseña debe tener uno de estos carácteres especiales: ! \" $ % & / ( )");
		}
		if (password.contains("@")) {
			System.out.println("La contraseña no puede contener el carácter \"@\" ");
		}
		
		
		
	}

}
