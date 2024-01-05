// Muestra diferentes mensajes según la edad introducida


package Ud3Test;

public class ComprovarEdad {

	public static void main(String[] args) {
		
		int edad = 47;
				
		if (edad < 0) {
			System.out.println("No introduzcas una edad negativa");
		
		}else if ((edad >= 0) && (edad <= 14)) {
			System.out.println ("Eres un crío");
		
		}else if ((edad >= 15) && (edad <= 20)){
			System.out.println ("Eres un adolescente");
		
		}else if (edad >= 21 && edad <= 50) {
				System.out.println ("Eres joven");
		
		}else {
			System.out.println ("Eres viejo");
		}

	}

}
