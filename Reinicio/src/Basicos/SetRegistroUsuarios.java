/*
 * Haz un programa que pida al usuario registrar el nick de un usuario. Cada usuario tiene un nick único. 
 * En caso de registar un nick ya existente, se le mostrará el mensaje "Este usuario ya existe."; en caso contrario "Usuario registrado con éxito!"
 */


package Basicos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetRegistroUsuarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombre = "";
		
		Set<String> nicks = new HashSet<String>();	
		
		while(true){
			System.out.println("Introduce tu nombre de usuario: ");
			nombre = sc.nextLine();
						
			if (nombre.equals("exit")) {
				break;
			}else if (!nicks.add(nombre)) {
				System.out.println("No se ha podido introducir");
			}else {
				System.out.println("Usuario añadido");
			}
		
		}
		System.out.println("Usuarios Registrados: ");
		for (String nom : nicks) {
			System.out.println(nom);
		}

	}

}
