/*
 * Haz un programa que pida al usuario registrar el nick de un usuario. Cada usuario tiene un nick único. 
 * En caso de registar un nick ya existente, se le mostrará el mensaje "Este usuario ya existe."; en caso contrario "Usuario registrado con éxito!"
 */

package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej20231211 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> nicks = new ArrayList<String>();
	String nombre ="";
	
	do{
		System.out.println("Introduce un nick");
		nombre = sc.nextLine();
		
		if (nombre.equals("exit")) {
			break;
		}else if(nicks.contains(nombre)) {
			System.out.println("Este usuario ya existe");
		}else {
			nicks.add(nombre);
			System.out.println("Usuario registrado con éxito!");
		}
	}while(nombre != "exit");
	
	for (String nick : nicks) {
		System.out.println(nick);
	}
	
	
	}
	
}
