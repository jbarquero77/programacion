package OtraVez;

import java.util.Random;
import java.util.Scanner;

public class NoAdivinaPalabra {

	public static void main(String[] args) {
		String[]palabras = {"programacion", "java", "desarrollo", "componentes"};
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String palabraAdivinanza = palabras[rand.nextInt(palabras.length)];
		String usuario;
		
		do {
			System.out.println("Adivina la palabra: ");
			usuario= sc.nextLine().toLowerCase();
			
			if(usuario.equals(palabraAdivinanza)) {
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto, inténtalo de nuevo");
			}
		}while(!usuario.equals(palabraAdivinanza));
	}

}
