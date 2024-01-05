package HashSet;

import java.util.HashSet;
import java.util.Set;

public class OperacionesDeConjuntos {

	public static void main(String[] args) {
		
		Set<Integer> conjuntoA = new HashSet<>(Set.of(1,2,3,4));
		Set<Integer> conjuntoB = new HashSet<>(Set.of(3,4,5,6));
		
		Set<Integer> union = new HashSet<>(conjuntoA);
		union.addAll(conjuntoB);
		
		Set<Integer> interseccion = new HashSet<>(conjuntoA);
		interseccion.retainAll(conjuntoB);
		
		System.out.println("Unión de conjuntos: "+ union);
		System.out.println("Interseccion de conjuntos: "+ interseccion);
	}

}
