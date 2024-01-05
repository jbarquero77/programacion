import java.util.Scanner;

public class P710 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int suma=0;
		int equipos=0;
		int repesca=0;
		
		for (int i=0;i<num;i++) {
			equipos = sc.nextInt();
			
			for(int j=0;j<6;j++) {
				int plazas = sc.nextInt();
				suma+=plazas;
				repesca = equipos - suma;
				
			}
			System.out.println(repesca);
			suma=0;
		}

	}

}
