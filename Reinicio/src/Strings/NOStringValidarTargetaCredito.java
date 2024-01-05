package Strings;

import java.util.Scanner;

public class NOStringValidarTargetaCredito {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce el número de targeta de crédito: ");
		String targeta = sc.nextLine();
		
		String mensaje = esValida(targeta) ? "La targeta es válida" : "La targeta no es válida";
	}
	
	public static boolean esValida(String targeta) {
		targeta = targeta.replaceAll(" ", "");
		
		if(targeta.length()<13 || targeta.length()>19) {
			return false;
		}
		
		int[]digitos = new int[targeta.length()];
		for(int i=0; i<targeta.length();i++) {
			digitos[i]=Character.getNumericValue(targeta.charAt(i));
		}
		
		//Algoritmo de Luhn
		for(int i=digitos.length-2; i>=0; i-=2) {
			int dobleDigito = digitos[i]*2;
			digitos[i]= (dobleDigito >9) ? dobleDigito -9 : dobleDigito;
		}
		int suma =0;
		for(int digito:digitos) {
			suma+=digito;
		}
		return suma%10==0;
	}

}
