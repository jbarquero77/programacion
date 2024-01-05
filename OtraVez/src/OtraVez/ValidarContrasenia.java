package OtraVez;

public class ValidarContrasenia {

	public static void main(String[] args) {
		
		String contrasenia = "Barquero";
		String contrasenia2 = "Barquero77";
		
		do {
			System.out.println("Ingresa una contraseña de al menos 8 carácteres con 1 número");
			break;
		}while(contrasenia2.length()<8 || contieneNumero(contrasenia2));
		
		System.out.println("Contraseña válida");

	}
	
	public static boolean contieneNumero(String clave) {
		
		for (char c: clave.toCharArray()) {
			if(Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
		

}
