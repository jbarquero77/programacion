// contrenya.indexOf


package Ud5EstructurasEstaticasDeDatos;

import java.util.Scanner;

public class Contrasenya {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String caracteresEspeciales ="!\"$%&/()";
		
		String contrasenya = "abcd!";
		
		boolean encontrado = false;
		
		char caracter;
		
		for(int i = 0; i<contrasenya.length();i++) {
			caracter = contrasenya.charAt(i);					// para cada pasada, guardo en caracter el valor de i
			
			if (caracteresEspeciales.indexOf(caracter) != -1) {			// indexOf devuelve 0 si es verdad y -1 si no esta
				encontrado = true;
			}
			
		}
		System.out.println(encontrado);
	}

}
