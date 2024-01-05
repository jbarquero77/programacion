package OtraVez;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoMemoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random ();
		List<Integer> secuencia = new ArrayList<>();
		List<Integer> usuario = new ArrayList<>();
		int longitud =5;
		
		for(int i=0; i<longitud;i++) {
			secuencia.add(rand.nextInt(10));
		}
		System.out.println("Juego de la memoria");
		System.out.println("observa estos números y después repítelos: ");
		
		for(int num : secuencia) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("Introduce los números: ");
		for(int i=0; i<longitud;i++) {
			usuario.add(sc.nextInt());
		}
		
		if(secuencia.equals(usuario)) {
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Sigue intentándolo");
		}
		
	}

}
