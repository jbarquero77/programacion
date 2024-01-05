package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidacionClaves {

	public static void main(String[] args) {
		Map<String,String>credenciales = new HashMap<>();
		credenciales.put("usuario","contraseña123");
		credenciales.put("usuario2","clave456");
		credenciales.put("usuario3","secreto789");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el nombre de usuario");
		String usuario = sc.nextLine();
		
		System.out.print("Introduce la contraseña");
		String contrasenia = sc.nextLine();
		
		if(credenciales.containsKey(usuario) && credenciales.get(usuario).equals(contrasenia)) {
			System.out.println("Inicio de sesión exitoso");
		}else {
			System.out.println("Credenciales incorrectas");
		}
	}

}
