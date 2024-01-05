package List;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumerosPares {

	public static void main(String[] args) {
		List<Integer> numerosPares = IntStream.rangeClosed(1,10)
				.filter(n -> n%2==0)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("Numeros pares: "+ numerosPares);
	}

}
