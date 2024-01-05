package Ud5EstructurasEstaticasDeDatos;


import java.util.Scanner;


public class LetraDni {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa tu número de DNI (sin la letra): ");
		int numeroDNI = scanner.nextInt();

		char letra = calcularLetraDNI(numeroDNI);
		System.out.println("La letra del DNI " + numeroDNI + " es: " + letra);

		scanner.close();
	}

	public static char calcularLetraDNI(int dni) {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = dni % 23;
		return caracteres.charAt(modulo);
	}
		
}
