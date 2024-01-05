


package ud02Test;

public class Test1 {

	public static void main(String[] args) {
		
		
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		
		System.out.println("\033[31m" + "hola");
		System.out.print(rojo + " rojo " + verde + " verde");
		System.out.print(naranja + " naranja " + azul + " azul");
		
	}

}
