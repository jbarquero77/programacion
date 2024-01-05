package OtraVez;

public class MetodoCalculo {

	public static void main(String[] args) {
		
		int base = 5;
		int altura =10;
		
		int resultado = calcularArea(base,altura);
		
		System.out.println(resultado);
				

	}
	
	public static int calcularArea(int a, int b) {
		return a*b;
	}

}
