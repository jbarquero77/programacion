/*
 * Palabras referencia en codigo Morse
 */

package Examenes281121;

import java.util.Scanner;

public class Ej1Morse {

	public static boolean esReferencia(String palabraReferencia, char referencia) {
		if(palabraReferencia.length()>0) {
			char primeraLetra =palabraReferencia.charAt(0);
			return primeraLetra == referencia;
		}else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String []letras = {"A","B","C","D","E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String []morse = {".-", "-...", "-.-.", "-..",".","..-.","--.","....","..",".---","-.-", ".-..", "--", "-.", "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
		
		String palabraReferencia;
		System.out.println("Introduce una palabra. ");
		palabraReferencia =sc.next().toUpperCase();
		char letra = palabraReferencia.charAt(0);
		
		int indice =-1;
		
		for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(Character.toString(letra))) {
                indice = i;
                break;
            }
        }
		
		boolean resultado = esReferencia(palabraReferencia, letra);
		
		if (resultado && indice !=-1) {
			System.out.println("La palabra "+ palabraReferencia + " tiene como letra de referencia la letra: " +letras[indice]
					+ " y le corresponde el carácter en Morse "+ morse[indice]);
		}else {
			System.out.println("La palabra introducida no sirve como referencia.");
		}
		
		
		
		sc.close();
		
	}

}
