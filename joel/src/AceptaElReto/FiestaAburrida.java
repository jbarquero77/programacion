package AceptaElReto;

import java.util.Scanner;

public class FiestaAburrida {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número de casos");
		int numCasos = sc.nextInt();
		
		for (int i = 0; i < numCasos; i++) {
            // Paso 2: Leer el nombre de la persona
            System.out.print("Ingrese el nombre de la persona: ");
            sc.nextLine();
            String nombre = sc.next();

            // Paso 3: Imprimir el saludo usando printf
            System.out.printf("Hola, %s.%n", nombre);
        }

	}

}
