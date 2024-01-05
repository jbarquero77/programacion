package OtraVez;

public class ArraySumaAcceso {

	public static void main(String[] args) {
		
		int []num = {1,2,3,4,5};
		
		System.out.println("La longitud del array es de "+num.length);
		
		for(int numero : num) {
			System.out.println("La el elemento que se encuentra en la posición "+(numero-1)+" es: "+numero);
		}
		

	}

}
