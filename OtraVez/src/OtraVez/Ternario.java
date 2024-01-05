package OtraVez;

public class Ternario {

	public static void main(String[] args) {
		int a = 20;
		int b= 20;
		
		String mensaje = (a>b) ? "El primer número es mayor" : (a<b) ? "El segundo número es mayor" :
			"Ambos números son iguales";
		
		System.out.println(mensaje);
	}

}
