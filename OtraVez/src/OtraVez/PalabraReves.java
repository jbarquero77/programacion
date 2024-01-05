package OtraVez;

public class PalabraReves {

	public static void main(String[] args) {
		
		String palabra = "Barquero";
		
		int longitud = palabra.length();
		
		for (int i = longitud-1;i>=0;i--) {
			System.out.print(palabra.charAt(i));
		}
		System.out.println();

	}

}
