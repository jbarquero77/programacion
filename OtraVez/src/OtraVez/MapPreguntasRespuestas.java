package OtraVez;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPreguntasRespuestas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashMap<String, String> preguntasRespuestas = new HashMap<>();
		
		preguntasRespuestas.put("Capital de Francia", "París");
		preguntasRespuestas.put("¿En qué año se fundó Google?", "1998");
        preguntasRespuestas.put("¿Cuál es el símbolo químico del oro?", "Au");
        
        char jugar;
        
        do {
        	int puntos =0;
        	
        	for(Map.Entry<String, String> entry : preguntasRespuestas.entrySet()) {
        		System.out.println(entry.getKey());
        		System.out.print("Tú respuesta: ");
        		String respuesta = sc.nextLine();
        		
        		if (respuesta.equalsIgnoreCase(entry.getValue())) {
                    System.out.println("¡Correcto!");
                    puntos++;
                } else {
                    System.out.println("Incorrecto. La respuesta correcta es: " + entry.getValue());
                }
        	}
        	System.out.println("Puntos: "+puntos);
        	
        	System.out.println("Quieres jugar de nuevo(S/N)");
        	jugar=sc.next().charAt(0);
        	sc.nextLine();
        	
        }while(jugar == 'S' || jugar == 's');
	}

}
