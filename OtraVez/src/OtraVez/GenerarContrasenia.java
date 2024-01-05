package OtraVez;

import java.security.SecureRandom;

public class GenerarContrasenia {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		
		final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
		
		int longitud;
		do {
			System.out.println("Introduce la longitud de la contraseña: ");
			longitud = random.nextInt(16)+8;
			
		}while (longitud<=0);
		
		StringBuilder contrasena = new StringBuilder();
		int i =0;
		
		do {
			int indice = random.nextInt(CARACTERES.length());
			contrasena.append(CARACTERES.charAt(indice));
			i++;
		}while(i<longitud);
		
		System.out.println("Contraseña generada es: "+contrasena.toString());
			
	}

}
