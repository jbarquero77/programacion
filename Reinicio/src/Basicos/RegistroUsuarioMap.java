package Basicos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroUsuarioMap {

	public static void main(String[] args) {
		Map<String, String> nicks = new HashMap<String, String>();
		Scanner sc = new Scanner (System.in);
		String usuario ="";
		String password ="";
		
		
		while(true) {
			System.out.println("Introduce el nombre de usuario: ");
			usuario = sc.nextLine();

			if (usuario.equals("exit")) {
				break;	
			}
			System.out.println("Introduce el número: ");
			password = sc.nextLine();	
			
			nicks.put(usuario,password);
			
			if (!nicks.containsKey(usuario)) {
				System.out.println("El nombre de usuario ya existe, introduce otro.");
			}else {
				System.out.println("Usuario añadido");
			}
		}
		
		for (String clave : nicks.keySet()) {
			String contrasenia = nicks.get(clave);
			System.out.println("Usuario: "+clave+"\nContraseña: "+contrasenia);
		}

	}

}
