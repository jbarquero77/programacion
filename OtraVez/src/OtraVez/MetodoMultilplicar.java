package OtraVez;

public class MetodoMultilplicar {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 5;
		
		int multiplicacion = multiplicar(num1,num2);
		
		System.out.println(multiplicacion);

	}
	
	public static int multiplicar(int a, int b) {
		return a*b;
	}

}
