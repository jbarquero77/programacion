package JuecesOnline;

import java.util.Scanner;

public class Ej293Atropodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casos =sc.nextInt();
		
		int insectos;
		int aracnidos;
		int crustaceos;
		int escolopendras;
		int patasEscolopendras;
		int sumaPatas=0;
		
		for(int i =0; i<casos; i++) {
			insectos= sc.nextInt();
			aracnidos = sc.nextInt();
			crustaceos = sc.nextInt();
			escolopendras = sc.nextInt();
			patasEscolopendras = sc.nextInt();
			
			sumaPatas = (insectos * 6)+ (aracnidos *8)+(crustaceos*10)+(escolopendras*2*patasEscolopendras);
			System.out.println(sumaPatas);
		}

	}

}
