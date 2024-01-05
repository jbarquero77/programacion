package OtraVez;

public class ContadorVocales {

	public static void main(String[] args) {
		String nombre = "Barquero";
		int vocales =0;
		
		for(int i=0; i<nombre.length();i++) {
			char letra = nombre.charAt(i);
			if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
				vocales++;
			}
		}
		System.out.println(vocales);
	}

}
