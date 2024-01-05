package Strings;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StringsContadorCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una cadena de texto: ");
		String cadenaUsuario = sc.nextLine();
		
		Map<Character, Integer> contadorCaracteres = contCaracteres (cadenaUsuario);
		
		System.out.println("Contateo de caracteres: ");
		for (Map.Entry<Character, Integer> entrada : contadorCaracteres.entrySet()) {
			System.out.println(entrada.getKey()+ " : "+ entrada.getValue());
		}

	}
	public static Map<Character,Integer> contCaracteres (String entrada){
		Map<Character, Integer>contCaracteres = new HashMap<>();
		
		for (char c: entrada.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				contCaracteres.put(c, contCaracteres.getOrDefault(c, 0)+1);
			}
		}
		return contCaracteres;
	}

}
