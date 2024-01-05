import java.util.Scanner;

public class Envoltorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int max = Integer.MAX_VALUE;  
		int min = Integer.MIN_VALUE; 
		
		
		String cadena = "",
		cadena1 = sc.next(); // Lee la siguiente cadena: “13-14”   
		String[] separada = cadena1.split("-");     
		int a = Integer.parseInt( separada[0] ); // Pasar el 13 de texto a número 
		int b = Integer.parseInt( separada[1] ); // Pasar el 14 de texto a número
		

	}

}
