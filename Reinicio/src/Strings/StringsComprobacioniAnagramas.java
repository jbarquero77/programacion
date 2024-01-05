package Strings;

import java.util.Arrays;

public class StringsComprobacioniAnagramas {

	public static void main(String[] args) {
		String palabra1 = "listen";
		String palabra2= "silent";
		
		if(esAnagrama(palabra1, palabra2)) {
			System.out.println(palabra1 +" y "+palabra2+" son anagramas");
		}else {
			System.out.println(palabra1 +" y "+palabra2+" no son anagramas");
		}

	}
	
	public static boolean esAnagrama(String texto1, String texto2) {
		char[] char1 = texto1.toCharArray();
		char[] char2 = texto2.toCharArray();
				
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1, char2);
	}

}
