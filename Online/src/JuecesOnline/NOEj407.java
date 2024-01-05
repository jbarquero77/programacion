package JuecesOnline;

import java.util.Scanner;

public class NOEj407 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int casillasTablero=0;
		int posicion=0;
		int ultimaTirada=0;
		
		int posicionFinal;
		int resto;
		
		do {
			for(int i =0; i<3;i++) {
				casillasTablero=sc.nextInt();
				posicion=sc.nextInt();
				ultimaTirada = sc.nextInt();
				
				if((posicion+ultimaTirada)== casillasTablero) {
					System.out.println(casillasTablero);
					
				}else if((posicion+ultimaTirada)<casillasTablero) {
					System.out.println(posicion+ultimaTirada);
					
				}else if((posicion+ultimaTirada)>casillasTablero){
					resto= (posicion+ultimaTirada)-casillasTablero;
					System.out.println(casillasTablero-resto);
				}
			}
			
		}while(casillasTablero==0 && posicion==0 && ultimaTirada==0);		
	}
}
