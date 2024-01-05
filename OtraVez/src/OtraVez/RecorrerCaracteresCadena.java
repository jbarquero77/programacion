package OtraVez;

public class RecorrerCaracteresCadena {

	public static void main(String[] args) {
		
		String palabra = "Barquero";
		int contarVocales =0;
		
		for(char letra : palabra.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(letra)!=-1) {
				contarVocales++;
			}
		}
		System.out.println("Hay "+ contarVocales + " vocales");

	}

}
