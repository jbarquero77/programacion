package Strings;

import java.util.Scanner;

public class ValidacionContrasenya {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu contraseña: ");
		String contrasena = sc.nextLine();
		
		if(esValida(contrasena)) {
			System.out.println("La contraseña es segura");
		}else {
			System.out.println("La contraseña no es segura");
		}

	}

	public static boolean esValida(String contrasena){
		
		return contrasena.length() >=8 && contrasena.matches(".*[A-Z].*");  //Debe contener al menos 8 carácteres, 1 mayúscula y 1 número
	}
}
