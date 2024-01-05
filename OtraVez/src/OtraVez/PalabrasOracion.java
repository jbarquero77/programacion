package OtraVez;

public class PalabrasOracion {

	public static void main(String[] args) {
		
		String oracion = "Barquero, el mejor";
		
		int contador =1;
		
		for(int i =0; i<oracion.length();i++) {
			if(oracion.charAt(i)== ' ' || oracion.charAt(i)== '\t' || oracion.charAt(i)== '\n') {
				contador++;
			}
		}
		System.out.println("la oracion tiene: "+contador+" palabras");

	}

}
