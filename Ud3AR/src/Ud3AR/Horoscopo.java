/*  Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento. Podéis consultar las fechas del horóspoco en “Tabla de fechas” de
https://es.wikipedia.org/wiki/Zodiaco */

package Ud3AR;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int dia = sc.nextInt();
		int mes= sc.nextInt();
		
		if ((dia > 20 && mes == 3) || (dia < 21) && (mes == 4)){
			System.out.println("aries");
		} else if ((dia > 20 && mes == 4) ||(dia < 21) && (mes == 5)) {
			System.out.println("tauro");
		}else if ((dia > 20 && mes == 5) ||(dia < 21) && (mes == 6))  {
			System.out.println("geminis");
		}else if ((dia > 20 && mes == 6) ||(dia < 21) && (mes == 7)) {
			System.out.println("cancer");
		}else if ((dia > 20 && mes == 7) ||(dia < 21) && (mes == 8)) {
			System.out.println("leo");
		}else if ((dia > 20 && mes == 8) ||(dia < 21) && (mes == 9)) {
			System.out.println("virgo");
		}else if ((dia > 20 && mes == 9) ||(dia < 21) && (mes == 10))  {
			System.out.println("libra");
		}else if ((dia > 20 && mes == 10) ||(dia < 21) && (mes == 11)) {
			System.out.println("escorpio");
		}else if ((dia > 20 && mes == 11) ||(dia < 21) && (mes == 12)) {
			System.out.println("sagitario");
		}else if ((dia > 20 && mes == 12) ||(dia < 21) && (mes == 1)) {
			System.out.println("capricornio");
		}else if ((dia > 20 && mes == 1) ||(dia < 21) && (mes == 2)) {
			System.out.println("acuario");
		}else if ((dia > 20 && mes == 2) ||(dia < 21) && (mes == 3)) {
			System.out.println("piscis");
		}else {
			System.out.println("Muestra una fecha correcta");
		}
		
	}

}
