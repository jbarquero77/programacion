package Strings;

import java.security.SecureRandom;
import java.util.Scanner;

public class StringsGeneradorContrasenyaSegura {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la longitud de la contraseña: ");
		int tamanioContrasenia = sc.nextInt();
		System.out.println("Quieres introducir letras? (s/n)");
		boolean letras = sc.next().equalsIgnoreCase("s");
		System.out.println("Quieres introducir números? (s/n)");
		boolean numeros = sc.next().equalsIgnoreCase("s");
		System.out.println("Quieres introducir simbolos? (s/n)");
		boolean simbolos = sc.next().equalsIgnoreCase("s");
		
		String contrasenia = generarContrasenia (tamanioContrasenia, letras, numeros, simbolos);
		System.out.println("La nueva contraseña es: " + contrasenia);
			
		}
	
	public static String generarContrasenia (int tamanio, boolean letras, boolean numeros, boolean simbolos) {
		String todasLetras ="abcdefghaijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String todosNumeros = "1234567890";
		String simbols = "!@#$%^&*()-_=+[]{};:'\",.<>/?";
		
		StringBuilder validarCaracteres = new StringBuilder();
		
		if(letras) {
			validarCaracteres.append(letras);
		}
		if (numeros) {
			validarCaracteres.append(numeros);
		}
		if(simbolos) {
			validarCaracteres.append(simbolos);
		}
		
		SecureRandom rand = new SecureRandom();
		StringBuilder contrasenia = new StringBuilder();
		
		for(int i=0; i<tamanio;i++) {
			int indiceAleatorio = rand.nextInt(validarCaracteres.length());
			contrasenia.append(validarCaracteres.charAt(indiceAleatorio));
		}
		return contrasenia.toString();
	}

}
