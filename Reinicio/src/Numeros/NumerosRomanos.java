package Numeros;

import java.util.HashMap;
import java.util.Map;

public class NumerosRomanos {

	public static void main(String[] args) {
		String numRomano = "IX";
		int result = numeroRomano(numRomano);
		System.out.println("El número romano es "+numRomano);
		System.out.println("El número árabe es: "+result);
	}
	
	public static int numeroRomano(String num) {
		Map<Character, Integer> romanMap = new HashMap<>();
		 romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);
	        
	        int resultado =0;
	        int valor =0;
	        
	        for(int i = num.length()-1; i>=0;i--) {
	        	int valorActual = romanMap.get(num.charAt(i));
	        	
	        	if(valorActual < valor) {
	        		resultado -=valorActual;
	        	}else {
	        		resultado +=valorActual;
	        	}
	        	valor=valorActual;
	        }
	        return resultado;
	}
}
