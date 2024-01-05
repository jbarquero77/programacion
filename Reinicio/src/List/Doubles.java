package List;

import java.util.ArrayList;
import java.util.List;

public class Doubles {

	public static void main(String[] args) {
		List<Double> numeros = new ArrayList<>();
		numeros.add(3.14);
		numeros.add(2.5);
		numeros.add(1.0);
		
		double suma = numeros.stream().mapToDouble(Double::doubleValue).sum();
		
		System.out.println("Suma de elementos: "+suma);
	}

}
