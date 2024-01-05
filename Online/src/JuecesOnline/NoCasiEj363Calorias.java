package JuecesOnline;

import java.util.Scanner;

public class NoCasiEj363Calorias {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int consumidas = sc.nextInt();
		sc.nextLine();
		int comidas= sc.nextInt();
		int suma=0;
		
		
		while (true) {
			if (consumidas == 0) {
				break;
			}
			
			for(int i =0; i<comidas; i++) {
				int comilonas = sc.nextInt();
				suma += comilonas;	
				
			}	
/* Si las suma%consumidas = 0, la división corresponderá a los entrenamientos. 
* pero si no da 0, 
* deberá hacer un entrenamiento más para consumir esas calorías
*  
*/
			
			int entrenamientos=suma/consumidas;
			
			System.out.println(entrenamientos);
			suma =0;
			consumidas = sc.nextInt();
		}
	}
}

