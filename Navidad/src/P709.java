
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class P709 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
				int n = sc.nextInt();
				if(n==0) {
					break;
				}
				
				Map<String, Integer>votos = new HashMap<>();
				
				for (int i=0;i<n;i++) {
					String voto = sc.next();
					if(votos.containsKey(voto)) {
						votos.put(voto,votos.get(voto)+1);
					}else {
						votos.put(voto,1);
					}
				}
				
				String ganador = encontrarGanador(votos);
				System.out.println(ganador);
			
			sc.close();
		}
	}
		
		public static String encontrarGanador (Map<String,Integer>votos) {
		
			int maxVotos =0;
			String ganador ="EMPATE";
			
			for(Map.Entry<String, Integer> entry : votos.entrySet()) {
				if(entry.getValue()> maxVotos) {
					maxVotos = entry.getValue();
					ganador = entry.getKey();
				}else if(entry.getValue()== maxVotos) {
					ganador="EMPATE";
				}
			}
			return ganador;
		}
}
