package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapListas {

	public static void main(String[] args) {
		Map<String, List<Integer>> grupos = new HashMap<>();
		
		grupos.put("Grupo A", Arrays.asList(1,2,3));
		grupos.put("Grupo B", Arrays.asList(4,5,6));
		grupos.put("Grupo C", Arrays.asList(7,8,9));
		
		List<Integer> grupoB = grupos.get("Grupo B");
		System.out.println("Elementos del Grupo B: "+ grupoB);
		
	}

}
