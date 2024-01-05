package JuecesOnline;

import java.util.Scanner;

public class NOEj374 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int casos = sc.nextInt();
		int tempMax=Integer.MIN_VALUE;
		int tempMin=Integer.MAX_VALUE;
		int contadorMin=0;
		int contadorMax=0;
		int temp;
				
		
			for (int i=0;i<casos; i++) {
				
				do {	
					temp= sc.nextInt();
					
					if(temp>tempMax) {
						tempMax=temp;
					}else if(temp== tempMax) {
						contadorMax++;
					}
					
					if(temp<tempMin) {
						tempMin=temp;
					}else if(temp==tempMin) {
						contadorMin++;	
					}
				}while(temp!=0);
					System.out.println(tempMax+" "+contadorMax+" "+tempMin+" "+contadorMin);
		}
		
	}
}
