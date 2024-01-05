package ud02Test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DecimalForm {

	public static void main(String[] args) {
	
			DecimalFormat formateador = new DecimalFormat("####.####");
			//Imprime el número pasado como parámetro con 4 decimales
			System.out.println(formateador.format(7.1232383));
			
			formateador = new DecimalFormat("0000.0000");
			//Imprime 4 cifras enteras y 4 decimales
			System.out.println(formateador.format(1.82));
			
			//Redondeo
			double aa = 1.2345;
			double bb = 1.2356;
			
			formateador = new DecimalFormat("#.##");
			
			System.out.println(formateador.format (aa));
			System.out.println(formateador.format (bb));
			
			//Porcentajes
			formateador = new DecimalFormat ("###.##%");
			//Imprime: 68,44%
			System.out.println(formateador.format (0.6844));
			
			//Símbolos
			DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
			simbolos.setDecimalSeparator('.');
			
			formateador = new DecimalFormat("####.####", simbolos);
			//Imprime:3.4324
			System.out.println("\n"+formateador.format(3.432423));
			
			//Para escapar % en printf: %%
			float cc = 0.6844f;
			System.out.printf("%4.2f%%", cc*100);
			
		
			
			
			
			
			

	}

}
