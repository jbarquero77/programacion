package OtraVez;

public class StringMetodos {

	public static void main(String[] args) {
		
		String texto ="Barquero";
		
		System.out.println("La longitud de la cadena es "+longitudCadena(texto));

	}
	
	public static int longitudCadena(String texto) {
		return texto.length();
	}

}
